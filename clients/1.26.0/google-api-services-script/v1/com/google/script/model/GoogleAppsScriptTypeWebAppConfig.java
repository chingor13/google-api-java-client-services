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
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.script.model;

/**
 * Web app entry point configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsScriptTypeWebAppConfig extends com.google.api.client.json.GenericJson {

  /**
   * Who has permission to run the web app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String access;

  /**
   * Who to execute the web app as.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executeAs;

  /**
   * Who has permission to run the web app.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccess() {
    return access;
  }

  /**
   * Who has permission to run the web app.
   * @param access access or {@code null} for none
   */
  public GoogleAppsScriptTypeWebAppConfig setAccess(java.lang.String access) {
    this.access = access;
    return this;
  }

  /**
   * Who to execute the web app as.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecuteAs() {
    return executeAs;
  }

  /**
   * Who to execute the web app as.
   * @param executeAs executeAs or {@code null} for none
   */
  public GoogleAppsScriptTypeWebAppConfig setExecuteAs(java.lang.String executeAs) {
    this.executeAs = executeAs;
    return this;
  }

  @Override
  public GoogleAppsScriptTypeWebAppConfig set(String fieldName, Object value) {
    return (GoogleAppsScriptTypeWebAppConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsScriptTypeWebAppConfig clone() {
    return (GoogleAppsScriptTypeWebAppConfig) super.clone();
  }

}