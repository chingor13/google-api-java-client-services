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

package com.google.runtimeconfig.v1beta1.model;

/**
 * `ListConfigs()` returns the following response. The order of returned objects is arbitrary; that
 * is, it is not ordered in any particular way.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of the configurations in the project. The order of returned objects is arbitrary; that
   * is, it is not ordered in any particular way.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RuntimeConfig> configs;

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of the configurations in the project. The order of returned objects is arbitrary; that
   * is, it is not ordered in any particular way.
   * @return value or {@code null} for none
   */
  public java.util.List<RuntimeConfig> getConfigs() {
    return configs;
  }

  /**
   * A list of the configurations in the project. The order of returned objects is arbitrary; that
   * is, it is not ordered in any particular way.
   * @param configs configs or {@code null} for none
   */
  public ListConfigsResponse setConfigs(java.util.List<RuntimeConfig> configs) {
    this.configs = configs;
    return this;
  }

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListConfigsResponse set(String fieldName, Object value) {
    return (ListConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListConfigsResponse clone() {
    return (ListConfigsResponse) super.clone();
  }

}
