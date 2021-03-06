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

package com.google.androidpublisher.model;

/**
 * Model definition for ApkListing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApkListing extends com.google.api.client.json.GenericJson {

  /**
   * The language code, in BCP 47 format (eg "en-US").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Describe what's new in your APK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recentChanges;

  /**
   * The language code, in BCP 47 format (eg "en-US").
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language code, in BCP 47 format (eg "en-US").
   * @param language language or {@code null} for none
   */
  public ApkListing setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Describe what's new in your APK.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecentChanges() {
    return recentChanges;
  }

  /**
   * Describe what's new in your APK.
   * @param recentChanges recentChanges or {@code null} for none
   */
  public ApkListing setRecentChanges(java.lang.String recentChanges) {
    this.recentChanges = recentChanges;
    return this;
  }

  @Override
  public ApkListing set(String fieldName, Object value) {
    return (ApkListing) super.set(fieldName, value);
  }

  @Override
  public ApkListing clone() {
    return (ApkListing) super.clone();
  }

}
