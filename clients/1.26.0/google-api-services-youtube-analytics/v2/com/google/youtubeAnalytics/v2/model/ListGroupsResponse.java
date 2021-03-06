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

package com.google.youtubeAnalytics.v2.model;

/**
 * Response message for GroupsService.ListGroups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListGroupsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Apiary error details
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * The Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * A list of groups that match the API request parameters. Each item in the list represents a
   * `group` resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Group> items;

  static {
    // hack to force ProGuard to consider Group used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Group.class);
  }

  /**
   * Identifies the API resource's type. The value will be `youtube#groupListResponse`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The token that can be used as the value of the `pageToken` parameter to retrieve the next page
   * in the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Apiary error details
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * Apiary error details
   * @param errors errors or {@code null} for none
   */
  public ListGroupsResponse setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public ListGroupsResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A list of groups that match the API request parameters. Each item in the list represents a
   * `group` resource.
   * @return value or {@code null} for none
   */
  public java.util.List<Group> getItems() {
    return items;
  }

  /**
   * A list of groups that match the API request parameters. Each item in the list represents a
   * `group` resource.
   * @param items items or {@code null} for none
   */
  public ListGroupsResponse setItems(java.util.List<Group> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies the API resource's type. The value will be `youtube#groupListResponse`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the API resource's type. The value will be `youtube#groupListResponse`.
   * @param kind kind or {@code null} for none
   */
  public ListGroupsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The token that can be used as the value of the `pageToken` parameter to retrieve the next page
   * in the result set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that can be used as the value of the `pageToken` parameter to retrieve the next page
   * in the result set.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListGroupsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListGroupsResponse set(String fieldName, Object value) {
    return (ListGroupsResponse) super.set(fieldName, value);
  }

  @Override
  public ListGroupsResponse clone() {
    return (ListGroupsResponse) super.clone();
  }

}
