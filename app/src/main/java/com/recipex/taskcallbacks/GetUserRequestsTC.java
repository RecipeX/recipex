package com.recipex.taskcallbacks;


import com.appspot.recipex_1281.recipexServerApi.model.MainUserRequestsMessage;

public interface GetUserRequestsTC {
    void done(boolean res, MainUserRequestsMessage response);
}
