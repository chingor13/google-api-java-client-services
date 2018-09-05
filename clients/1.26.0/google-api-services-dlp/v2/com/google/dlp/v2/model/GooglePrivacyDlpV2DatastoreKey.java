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

package com.google.dlp.v2.model;

/**
 * Record key for a finding in Cloud Datastore.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DatastoreKey extends com.google.api.client.json.GenericJson {

  /**
   * Datastore entity key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Key entityKey;

  /**
   * Datastore entity key.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Key getEntityKey() {
    return entityKey;
  }

  /**
   * Datastore entity key.
   * @param entityKey entityKey or {@code null} for none
   */
  public GooglePrivacyDlpV2DatastoreKey setEntityKey(GooglePrivacyDlpV2Key entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DatastoreKey set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DatastoreKey) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DatastoreKey clone() {
    return (GooglePrivacyDlpV2DatastoreKey) super.clone();
  }

}