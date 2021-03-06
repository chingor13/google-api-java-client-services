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

package com.google.bigquerydatatransfer.v1.model;

/**
 * The returned list of pipelines in the project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTransferConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListTransferConfigsRequest.page_token` to request the next page of list results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. The stored pipeline transfer configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TransferConfig> transferConfigs;

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListTransferConfigsRequest.page_token` to request the next page of list results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. The next-pagination token. For multiple-page list results, this token can be used
   * as the `ListTransferConfigsRequest.page_token` to request the next page of list results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTransferConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. The stored pipeline transfer configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<TransferConfig> getTransferConfigs() {
    return transferConfigs;
  }

  /**
   * Output only. The stored pipeline transfer configurations.
   * @param transferConfigs transferConfigs or {@code null} for none
   */
  public ListTransferConfigsResponse setTransferConfigs(java.util.List<TransferConfig> transferConfigs) {
    this.transferConfigs = transferConfigs;
    return this;
  }

  @Override
  public ListTransferConfigsResponse set(String fieldName, Object value) {
    return (ListTransferConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListTransferConfigsResponse clone() {
    return (ListTransferConfigsResponse) super.clone();
  }

}
