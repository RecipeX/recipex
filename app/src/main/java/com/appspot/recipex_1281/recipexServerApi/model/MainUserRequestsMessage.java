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
 * Model definition for MainUserRequestsMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserRequestsMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MainRequestInfoMessage> requests;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MainRequestInfoMessage> getRequests() {
    return requests;
  }

  /**
   * @param requests requests or {@code null} for none
   */
  public MainUserRequestsMessage setRequests(java.util.List<MainRequestInfoMessage> requests) {
    this.requests = requests;
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
  public MainUserRequestsMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  @Override
  public MainUserRequestsMessage set(String fieldName, Object value) {
    return (MainUserRequestsMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserRequestsMessage clone() {
    return (MainUserRequestsMessage) super.clone();
  }

}
