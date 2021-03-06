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

package com.google.replicapoolupdater.model;

/**
 * Response returned by List method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Compute Engine Instance Group Updater API. For
 * a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RollingUpdateList extends com.google.api.client.json.GenericJson {

  /**
   * Collection of requested updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RollingUpdate> items;

  static {
    // hack to force ProGuard to consider RollingUpdate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RollingUpdate.class);
  }

  /**
   * [Output Only] Type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A token used to continue a truncated list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * [Output Only] The fully qualified URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Collection of requested updates.
   * @return value or {@code null} for none
   */
  public java.util.List<RollingUpdate> getItems() {
    return items;
  }

  /**
   * Collection of requested updates.
   * @param items items or {@code null} for none
   */
  public RollingUpdateList setItems(java.util.List<RollingUpdate> items) {
    this.items = items;
    return this;
  }

  /**
   * [Output Only] Type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource.
   * @param kind kind or {@code null} for none
   */
  public RollingUpdateList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A token used to continue a truncated list request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token used to continue a truncated list request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public RollingUpdateList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public RollingUpdateList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public RollingUpdateList set(String fieldName, Object value) {
    return (RollingUpdateList) super.set(fieldName, value);
  }

  @Override
  public RollingUpdateList clone() {
    return (RollingUpdateList) super.clone();
  }

}
