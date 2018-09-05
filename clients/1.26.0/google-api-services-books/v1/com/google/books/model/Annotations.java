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

package com.google.books.model;

/**
 * Model definition for Annotations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Annotations extends com.google.api.client.json.GenericJson {

  /**
   * A list of annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Annotation> items;

  static {
    // hack to force ProGuard to consider Annotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Annotation.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Total number of annotations found. This may be greater than the number of notes returned in
   * this response if results have been paginated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * A list of annotations.
   * @return value or {@code null} for none
   */
  public java.util.List<Annotation> getItems() {
    return items;
  }

  /**
   * A list of annotations.
   * @param items items or {@code null} for none
   */
  public Annotations setItems(java.util.List<Annotation> items) {
    this.items = items;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Annotations setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to pass in for pagination for the next page. This will not be present if this request
   * does not have more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Annotations setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Total number of annotations found. This may be greater than the number of notes returned in
   * this response if results have been paginated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * Total number of annotations found. This may be greater than the number of notes returned in
   * this response if results have been paginated.
   * @param totalItems totalItems or {@code null} for none
   */
  public Annotations setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public Annotations set(String fieldName, Object value) {
    return (Annotations) super.set(fieldName, value);
  }

  @Override
  public Annotations clone() {
    return (Annotations) super.clone();
  }

}