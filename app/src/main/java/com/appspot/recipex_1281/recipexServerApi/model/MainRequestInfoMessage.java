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
 * on 2016-05-10 at 08:51:47 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Model definition for MainRequestInfoMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainRequestInfoMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long caregiver;

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
  private java.lang.String message;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pending;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long receiver;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sender;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("sender_name")
  private java.lang.String senderName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("sender_pic")
  private java.lang.String senderPic;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("sender_surname")
  private java.lang.String senderSurname;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCaregiver() {
    return caregiver;
  }

  /**
   * @param caregiver caregiver or {@code null} for none
   */
  public MainRequestInfoMessage setCaregiver(java.lang.Long caregiver) {
    this.caregiver = caregiver;
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
  public MainRequestInfoMessage setId(java.lang.Long id) {
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
  public MainRequestInfoMessage setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public MainRequestInfoMessage setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPending() {
    return pending;
  }

  /**
   * @param pending pending or {@code null} for none
   */
  public MainRequestInfoMessage setPending(java.lang.Boolean pending) {
    this.pending = pending;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getReceiver() {
    return receiver;
  }

  /**
   * @param receiver receiver or {@code null} for none
   */
  public MainRequestInfoMessage setReceiver(java.lang.Long receiver) {
    this.receiver = receiver;
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
  public MainRequestInfoMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * @param role role or {@code null} for none
   */
  public MainRequestInfoMessage setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getSender() {
    return sender;
  }

  /**
   * @param sender sender or {@code null} for none
   */
  public MainRequestInfoMessage setSender(java.lang.Long sender) {
    this.sender = sender;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSenderName() {
    return senderName;
  }

  /**
   * @param senderName senderName or {@code null} for none
   */
  public MainRequestInfoMessage setSenderName(java.lang.String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSenderPic() {
    return senderPic;
  }

  /**
   * @param senderPic senderPic or {@code null} for none
   */
  public MainRequestInfoMessage setSenderPic(java.lang.String senderPic) {
    this.senderPic = senderPic;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSenderSurname() {
    return senderSurname;
  }

  /**
   * @param senderSurname senderSurname or {@code null} for none
   */
  public MainRequestInfoMessage setSenderSurname(java.lang.String senderSurname) {
    this.senderSurname = senderSurname;
    return this;
  }

  @Override
  public MainRequestInfoMessage set(String fieldName, Object value) {
    return (MainRequestInfoMessage) super.set(fieldName, value);
  }

  @Override
  public MainRequestInfoMessage clone() {
    return (MainRequestInfoMessage) super.clone();
  }

}
