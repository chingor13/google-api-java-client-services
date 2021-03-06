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

package com.google.toolresults.model;

/**
 * Model definition for Screen.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Screen extends com.google.api.client.json.GenericJson {

  /**
   * File reference of the png file. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileReference;

  /**
   * Locale of the device that the screenshot was taken on. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * Model of the device that the screenshot was taken on. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * OS version of the device that the screenshot was taken on. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * File reference of the png file. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileReference() {
    return fileReference;
  }

  /**
   * File reference of the png file. Required.
   * @param fileReference fileReference or {@code null} for none
   */
  public Screen setFileReference(java.lang.String fileReference) {
    this.fileReference = fileReference;
    return this;
  }

  /**
   * Locale of the device that the screenshot was taken on. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * Locale of the device that the screenshot was taken on. Required.
   * @param locale locale or {@code null} for none
   */
  public Screen setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Model of the device that the screenshot was taken on. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Model of the device that the screenshot was taken on. Required.
   * @param model model or {@code null} for none
   */
  public Screen setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * OS version of the device that the screenshot was taken on. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * OS version of the device that the screenshot was taken on. Required.
   * @param version version or {@code null} for none
   */
  public Screen setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Screen set(String fieldName, Object value) {
    return (Screen) super.set(fieldName, value);
  }

  @Override
  public Screen clone() {
    return (Screen) super.clone();
  }

}
