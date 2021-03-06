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

package com.google.appengine.v1.model;

/**
 * Response message for AuthorizedDomains.ListAuthorizedDomains.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAuthorizedDomainsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The authorized domains belonging to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuthorizedDomain> domains;

  /**
   * Continuation token for fetching the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The authorized domains belonging to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<AuthorizedDomain> getDomains() {
    return domains;
  }

  /**
   * The authorized domains belonging to the user.
   * @param domains domains or {@code null} for none
   */
  public ListAuthorizedDomainsResponse setDomains(java.util.List<AuthorizedDomain> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAuthorizedDomainsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAuthorizedDomainsResponse set(String fieldName, Object value) {
    return (ListAuthorizedDomainsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAuthorizedDomainsResponse clone() {
    return (ListAuthorizedDomainsResponse) super.clone();
  }

}
