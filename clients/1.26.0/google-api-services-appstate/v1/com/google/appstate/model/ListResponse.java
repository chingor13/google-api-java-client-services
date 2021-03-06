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

package com.google.appstate.model;

/**
 * This is a JSON template to convert a list-response for app state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google App State API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The app state data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GetResponse> items;

  static {
    // hack to force ProGuard to consider GetResponse used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GetResponse.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * appstate#listResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The maximum number of keys allowed for this user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumKeyCount;

  /**
   * The app state data.
   * @return value or {@code null} for none
   */
  public java.util.List<GetResponse> getItems() {
    return items;
  }

  /**
   * The app state data.
   * @param items items or {@code null} for none
   */
  public ListResponse setItems(java.util.List<GetResponse> items) {
    this.items = items;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * appstate#listResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * appstate#listResponse.
   * @param kind kind or {@code null} for none
   */
  public ListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The maximum number of keys allowed for this user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumKeyCount() {
    return maximumKeyCount;
  }

  /**
   * The maximum number of keys allowed for this user.
   * @param maximumKeyCount maximumKeyCount or {@code null} for none
   */
  public ListResponse setMaximumKeyCount(java.lang.Integer maximumKeyCount) {
    this.maximumKeyCount = maximumKeyCount;
    return this;
  }

  @Override
  public ListResponse set(String fieldName, Object value) {
    return (ListResponse) super.set(fieldName, value);
  }

  @Override
  public ListResponse clone() {
    return (ListResponse) super.clone();
  }

}
