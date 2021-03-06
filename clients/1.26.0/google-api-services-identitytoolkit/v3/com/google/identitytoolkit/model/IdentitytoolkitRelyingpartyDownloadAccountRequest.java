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

package com.google.identitytoolkit.model;

/**
 * Request to download user account in batch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Identity Toolkit API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IdentitytoolkitRelyingpartyDownloadAccountRequest extends com.google.api.client.json.GenericJson {

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long delegatedProjectNumber;

  /**
   * The max number of results to return in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long maxResults;

  /**
   * The token for the next page. This should be taken from the previous response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Specify which project (field value is actually project id) to operate. Only used when provided
   * credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetProjectId;

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDelegatedProjectNumber() {
    return delegatedProjectNumber;
  }

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * @param delegatedProjectNumber delegatedProjectNumber or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyDownloadAccountRequest setDelegatedProjectNumber(java.lang.Long delegatedProjectNumber) {
    this.delegatedProjectNumber = delegatedProjectNumber;
    return this;
  }

  /**
   * The max number of results to return in the response.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxResults() {
    return maxResults;
  }

  /**
   * The max number of results to return in the response.
   * @param maxResults maxResults or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyDownloadAccountRequest setMaxResults(java.lang.Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The token for the next page. This should be taken from the previous response.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token for the next page. This should be taken from the previous response.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyDownloadAccountRequest setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Specify which project (field value is actually project id) to operate. Only used when provided
   * credential.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetProjectId() {
    return targetProjectId;
  }

  /**
   * Specify which project (field value is actually project id) to operate. Only used when provided
   * credential.
   * @param targetProjectId targetProjectId or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyDownloadAccountRequest setTargetProjectId(java.lang.String targetProjectId) {
    this.targetProjectId = targetProjectId;
    return this;
  }

  @Override
  public IdentitytoolkitRelyingpartyDownloadAccountRequest set(String fieldName, Object value) {
    return (IdentitytoolkitRelyingpartyDownloadAccountRequest) super.set(fieldName, value);
  }

  @Override
  public IdentitytoolkitRelyingpartyDownloadAccountRequest clone() {
    return (IdentitytoolkitRelyingpartyDownloadAccountRequest) super.clone();
  }

}
