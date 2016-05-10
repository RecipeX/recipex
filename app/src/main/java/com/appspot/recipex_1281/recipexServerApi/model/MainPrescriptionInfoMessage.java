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
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-08 at 10:33:10 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Model definition for MainPrescriptionInfoMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainPrescriptionInfoMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("active_ingr_key") @com.google.api.client.json.JsonString
  private java.lang.Long activeIngrKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("active_ingr_name")
  private java.lang.String activeIngrName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("caregiver_id") @com.google.api.client.json.JsonString
  private java.lang.Long caregiverId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("caregiver_job")
  private java.lang.String caregiverJob;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("caregiver_name")
  private java.lang.String caregiverName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("caregiver_surname")
  private java.lang.String caregiverSurname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("caregiver_user_id") @com.google.api.client.json.JsonString
  private java.lang.Long caregiverUserId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dose;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pil;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long quantity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recipe;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean seen;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String units;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getActiveIngrKey() {
    return activeIngrKey;
  }

  /**
   * @param activeIngrKey activeIngrKey or {@code null} for none
   */
  public MainPrescriptionInfoMessage setActiveIngrKey(java.lang.Long activeIngrKey) {
    this.activeIngrKey = activeIngrKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getActiveIngrName() {
    return activeIngrName;
  }

  /**
   * @param activeIngrName activeIngrName or {@code null} for none
   */
  public MainPrescriptionInfoMessage setActiveIngrName(java.lang.String activeIngrName) {
    this.activeIngrName = activeIngrName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCaregiverId() {
    return caregiverId;
  }

  /**
   * @param caregiverId caregiverId or {@code null} for none
   */
  public MainPrescriptionInfoMessage setCaregiverId(java.lang.Long caregiverId) {
    this.caregiverId = caregiverId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCaregiverJob() {
    return caregiverJob;
  }

  /**
   * @param caregiverJob caregiverJob or {@code null} for none
   */
  public MainPrescriptionInfoMessage setCaregiverJob(java.lang.String caregiverJob) {
    this.caregiverJob = caregiverJob;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCaregiverName() {
    return caregiverName;
  }

  /**
   * @param caregiverName caregiverName or {@code null} for none
   */
  public MainPrescriptionInfoMessage setCaregiverName(java.lang.String caregiverName) {
    this.caregiverName = caregiverName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCaregiverSurname() {
    return caregiverSurname;
  }

  /**
   * @param caregiverSurname caregiverSurname or {@code null} for none
   */
  public MainPrescriptionInfoMessage setCaregiverSurname(java.lang.String caregiverSurname) {
    this.caregiverSurname = caregiverSurname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCaregiverUserId() {
    return caregiverUserId;
  }

  /**
   * @param caregiverUserId caregiverUserId or {@code null} for none
   */
  public MainPrescriptionInfoMessage setCaregiverUserId(java.lang.Long caregiverUserId) {
    this.caregiverUserId = caregiverUserId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDose() {
    return dose;
  }

  /**
   * @param dose dose or {@code null} for none
   */
  public MainPrescriptionInfoMessage setDose(java.lang.Long dose) {
    this.dose = dose;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public MainPrescriptionInfoMessage setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public MainPrescriptionInfoMessage setKind(java.lang.String kind) {
    this.kind = kind;
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
  public MainPrescriptionInfoMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPil() {
    return pil;
  }

  /**
   * @param pil pil or {@code null} for none
   */
  public MainPrescriptionInfoMessage setPil(java.lang.String pil) {
    this.pil = pil;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * @param quantity quantity or {@code null} for none
   */
  public MainPrescriptionInfoMessage setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecipe() {
    return recipe;
  }

  /**
   * @param recipe recipe or {@code null} for none
   */
  public MainPrescriptionInfoMessage setRecipe(java.lang.Boolean recipe) {
    this.recipe = recipe;
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
  public MainPrescriptionInfoMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSeen() {
    return seen;
  }

  /**
   * @param seen seen or {@code null} for none
   */
  public MainPrescriptionInfoMessage setSeen(java.lang.Boolean seen) {
    this.seen = seen;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnits() {
    return units;
  }

  /**
   * @param units units or {@code null} for none
   */
  public MainPrescriptionInfoMessage setUnits(java.lang.String units) {
    this.units = units;
    return this;
  }

  @Override
  public MainPrescriptionInfoMessage set(String fieldName, Object value) {
    return (MainPrescriptionInfoMessage) super.set(fieldName, value);
  }

  @Override
  public MainPrescriptionInfoMessage clone() {
    return (MainPrescriptionInfoMessage) super.clone();
  }

}
