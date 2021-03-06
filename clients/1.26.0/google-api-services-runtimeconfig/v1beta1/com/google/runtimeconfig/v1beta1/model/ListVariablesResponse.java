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
 * Response for the `ListVariables()` method.
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
public final class ListVariablesResponse extends com.google.api.client.json.GenericJson {

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
   * A list of variables and their values. The order of returned variable objects is arbitrary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Variable> variables;

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
  public ListVariablesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of variables and their values. The order of returned variable objects is arbitrary.
   * @return value or {@code null} for none
   */
  public java.util.List<Variable> getVariables() {
    return variables;
  }

  /**
   * A list of variables and their values. The order of returned variable objects is arbitrary.
   * @param variables variables or {@code null} for none
   */
  public ListVariablesResponse setVariables(java.util.List<Variable> variables) {
    this.variables = variables;
    return this;
  }

  @Override
  public ListVariablesResponse set(String fieldName, Object value) {
    return (ListVariablesResponse) super.set(fieldName, value);
  }

  @Override
  public ListVariablesResponse clone() {
    return (ListVariablesResponse) super.clone();
  }

}
