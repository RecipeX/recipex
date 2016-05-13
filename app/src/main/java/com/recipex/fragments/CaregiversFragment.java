package com.recipex.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.appspot.recipex_1281.recipexServerApi.RecipexServerApi;
import com.appspot.recipex_1281.recipexServerApi.model.MainMeasurementInfoMessage;
import com.appspot.recipex_1281.recipexServerApi.model.MainUserInfoMessage;
import com.appspot.recipex_1281.recipexServerApi.model.MainUserMainInfoMessage;
import com.appspot.recipex_1281.recipexServerApi.model.MainUserMeasurementsMessage;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.recipex.AppConstants;
import com.recipex.R;
import com.recipex.activities.AddMeasurement;
import com.recipex.activities.Home;
import com.recipex.adapters.CaregiverAdapter;
import com.recipex.adapters.RVAdapter;
import com.recipex.adapters.UsersAdapter;
import com.recipex.asynctasks.CheckUserRelationsAT;
import com.recipex.asynctasks.GetMeasurementsUser;
import com.recipex.asynctasks.GetUserAT;
import com.recipex.taskcallbacks.GetUserTC;
import com.recipex.utilities.Misurazione;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Sara on 12/05/2016.
 */
public class CaregiversFragment extends Fragment implements GetUserTC{
    static RecyclerView curRecView;

    private SharedPreferences settings;
    SharedPreferences pref;
    private GoogleAccountCredential credential;
    private String accountName;

    private static final int REQUEST_ACCOUNT_PICKER = 2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recyclerview, container, false);
        initUI(rootView);

        return rootView;
    }

    private void initUI(View rootView) {
        RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.my_recyclerview);
        curRecView=rv;
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        pref=getActivity().getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        long id=pref.getLong("userId", 0L);


        if(id!=0 && checkNetwork()){
            settings = getActivity().getSharedPreferences(AppConstants.PREFS_NAME, 0);
            credential = GoogleAccountCredential.usingAudience(getContext(), AppConstants.AUDIENCE);
            Log.d("Caregivers", "Credential: " + credential);
            setSelectedAccountName(settings.getString(AppConstants.DEFAULT_ACCOUNT, null));

            if (credential.getSelectedAccountName() == null) {
                Log.d("Caregivers", "AccountName == null: startActivityForResult.");
                startActivityForResult(credential.newChooseAccountIntent(), REQUEST_ACCOUNT_PICKER);
            } else {
                RecipexServerApi apiHandler = AppConstants.getApiServiceHandle(credential);
                if (checkNetwork()) {
                    new GetUserAT(this, getActivity(), id, apiHandler).execute();
                }
            }
        }
        else Toast.makeText(getActivity(), "Si è verificato un errore.", Toast.LENGTH_SHORT).show();
    }
    public boolean checkNetwork() {
        ConnectivityManager cm = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        boolean isOnline = (netInfo != null && netInfo.isConnectedOrConnecting());
        if(isOnline) {
            return true;
        }else{
            new AlertDialog.Builder(getActivity())
                    .setTitle("Ops..qualcosa è andato storto!")
                    .setMessage("Sembra che tu non sia collegato ad internet! ")
                    .setPositiveButton("Impostazioni", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                            Intent callGPSSettingIntent = new Intent(Settings.ACTION_SETTINGS);
                            startActivityForResult(callGPSSettingIntent,0);
                        }
                    }).show();
            return false;
        }
    }

    //callback from GetUser
    public void done(boolean res, final MainUserInfoMessage message) {
        if(res) {
            List<MainUserMainInfoMessage> m=message.getCaregivers();
            Set<String> emailcaregivers=new HashSet<>();

            Iterator<MainUserMainInfoMessage> i=m.iterator();
            while(i.hasNext()){
                MainUserMainInfoMessage cur=(MainUserMainInfoMessage) i.next();
                emailcaregivers.add(cur.getEmail());
            }
            SharedPreferences.Editor editor=pref.edit();
            editor.putStringSet("emailcaregivers", emailcaregivers);

            CaregiverAdapter adapter = new CaregiverAdapter(message.getCaregivers(), (Home)getActivity(), null);
            curRecView.setAdapter(adapter);
        }
        else {
            Toast.makeText(getActivity(), "You don't have caregivers.", Toast.LENGTH_LONG).show();
        }
    }
    // setSelectedAccountName definition
    private void setSelectedAccountName(String accountName) {
        settings = getActivity().getSharedPreferences(AppConstants.PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(AppConstants.DEFAULT_ACCOUNT, accountName);
        editor.apply();
        Log.d("Caregivers", "ACCOUNT NAME: " + accountName);
        credential.setSelectedAccountName(accountName);
        this.accountName = accountName;
    }
}
