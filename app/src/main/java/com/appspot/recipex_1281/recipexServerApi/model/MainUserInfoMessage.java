/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-26 at 10:36:55 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Model definition for MainUserInfoMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserInfoMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String birth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> caregivers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> patients;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("pc_physician") @com.google.api.client.json.JsonString
  private java.lang.Long pcPhysician;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String place;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> relatives;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String surname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("visiting_nurse") @com.google.api.client.json.JsonString
  private java.lang.Long visitingNurse;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("years_exp") @com.google.api.client.json.JsonString
  private java.lang.Long yearsExp;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public MainUserInfoMessage setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBirth() {
    return birth;
  }

  /**
   * @param birth birth or {@code null} for none
   */
  public MainUserInfoMessage setBirth(java.lang.String birth) {
    this.birth = birth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getCaregivers() {
    return caregivers;
  }

  /**
   * @param caregivers caregivers or {@code null} for none
   */
  public MainUserInfoMessage setCaregivers(java.util.List<java.lang.Long> caregivers) {
    this.caregivers = caregivers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public MainUserInfoMessage setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public MainUserInfoMessage setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * @param field field or {@code null} for none
   */
  public MainUserInfoMessage setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public MainUserInfoMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getPatients() {
    return patients;
  }

  /**
   * @param patients patients or {@code null} for none
   */
  public MainUserInfoMessage setPatients(java.util.List<java.lang.Long> patients) {
    this.patients = patients;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPcPhysician() {
    return pcPhysician;
  }

  /**
   * @param pcPhysician pcPhysician or {@code null} for none
   */
  public MainUserInfoMessage setPcPhysician(java.lang.Long pcPhysician) {
    this.pcPhysician = pcPhysician;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPlace() {
    return place;
  }

  /**
   * @param place place or {@code null} for none
   */
  public MainUserInfoMessage setPlace(java.lang.String place) {
    this.place = place;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getRelatives() {
    return relatives;
  }

  /**
   * @param relatives relatives or {@code null} for none
   */
  public MainUserInfoMessage setRelatives(java.util.List<java.lang.Long> relatives) {
    this.relatives = relatives;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public MainDefaultResponseMessage getResponse() {
    return response;
  }

  /**
   * @param response response or {@code null} for none
   */
  public MainUserInfoMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSex() {
    return sex;
  }

  /**
   * @param sex sex or {@code null} for none
   */
  public MainUserInfoMessage setSex(java.lang.String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSurname() {
    return surname;
  }

  /**
   * @param surname surname or {@code null} for none
   */
  public MainUserInfoMessage setSurname(java.lang.String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getVisitingNurse() {
    return visitingNurse;
  }

  /**
   * @param visitingNurse visitingNurse or {@code null} for none
   */
  public MainUserInfoMessage setVisitingNurse(java.lang.Long visitingNurse) {
    this.visitingNurse = visitingNurse;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getYearsExp() {
    return yearsExp;
  }

  /**
   * @param yearsExp yearsExp or {@code null} for none
   */
  public MainUserInfoMessage setYearsExp(java.lang.Long yearsExp) {
    this.yearsExp = yearsExp;
    return this;
  }

  @Override
  public MainUserInfoMessage set(String fieldName, Object value) {
    return (MainUserInfoMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserInfoMessage clone() {
    return (MainUserInfoMessage) super.clone();
  }

}
