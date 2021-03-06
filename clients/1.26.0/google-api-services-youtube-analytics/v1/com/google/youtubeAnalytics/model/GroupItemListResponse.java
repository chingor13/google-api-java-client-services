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

package com.google.youtubeAnalytics.model;

/**
 * A paginated list of grouList resources returned in response to a youtubeAnalytics.groupApi.list
 * request.
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
public final class GroupItemListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GroupItem> items;

  static {
    // hack to force ProGuard to consider GroupItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GroupItem.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * @param etag etag or {@code null} for none
   */
  public GroupItemListResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GroupItem> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public GroupItemListResponse setItems(java.util.List<GroupItem> items) {
    this.items = items;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public GroupItemListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public GroupItemListResponse set(String fieldName, Object value) {
    return (GroupItemListResponse) super.set(fieldName, value);
  }

  @Override
  public GroupItemListResponse clone() {
    return (GroupItemListResponse) super.clone();
  }

}
