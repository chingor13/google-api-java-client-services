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

package com.google.jobs.v2.model;

/**
 * Output only.
 *
 * Response of auto-complete query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompleteQueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * Results of the matching job/company candidates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompletionResult> completionResults;

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * Results of the matching job/company candidates.
   * @return value or {@code null} for none
   */
  public java.util.List<CompletionResult> getCompletionResults() {
    return completionResults;
  }

  /**
   * Results of the matching job/company candidates.
   * @param completionResults completionResults or {@code null} for none
   */
  public CompleteQueryResponse setCompletionResults(java.util.List<CompletionResult> completionResults) {
    this.completionResults = completionResults;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public CompleteQueryResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public CompleteQueryResponse set(String fieldName, Object value) {
    return (CompleteQueryResponse) super.set(fieldName, value);
  }

  @Override
  public CompleteQueryResponse clone() {
    return (CompleteQueryResponse) super.clone();
  }

}
