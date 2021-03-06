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

package com.google.slides.v1.model;

/**
 * The placeholder information that uniquely identifies a placeholder shape.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Placeholder extends com.google.api.client.json.GenericJson {

  /**
   * The index of the placeholder. If the same placeholder types are present in the same page, they
   * would have different index values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * The object ID of this shape's parent placeholder. If unset, the parent placeholder shape does
   * not exist, so the shape does not inherit properties from any other shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentObjectId;

  /**
   * The type of the placeholder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The index of the placeholder. If the same placeholder types are present in the same page, they
   * would have different index values.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The index of the placeholder. If the same placeholder types are present in the same page, they
   * would have different index values.
   * @param index index or {@code null} for none
   */
  public Placeholder setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The object ID of this shape's parent placeholder. If unset, the parent placeholder shape does
   * not exist, so the shape does not inherit properties from any other shape.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentObjectId() {
    return parentObjectId;
  }

  /**
   * The object ID of this shape's parent placeholder. If unset, the parent placeholder shape does
   * not exist, so the shape does not inherit properties from any other shape.
   * @param parentObjectId parentObjectId or {@code null} for none
   */
  public Placeholder setParentObjectId(java.lang.String parentObjectId) {
    this.parentObjectId = parentObjectId;
    return this;
  }

  /**
   * The type of the placeholder.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the placeholder.
   * @param type type or {@code null} for none
   */
  public Placeholder setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Placeholder set(String fieldName, Object value) {
    return (Placeholder) super.set(fieldName, value);
  }

  @Override
  public Placeholder clone() {
    return (Placeholder) super.clone();
  }

}
