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

package com.google.dlp.v2.model;

/**
 * Bounding box encompassing detected text within an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2BoundingBox extends com.google.api.client.json.GenericJson {

  /**
   * Height of the bounding box in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Left coordinate of the bounding box. (0,0) is upper left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer left;

  /**
   * Top coordinate of the bounding box. (0,0) is upper left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer top;

  /**
   * Width of the bounding box in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Height of the bounding box in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Height of the bounding box in pixels.
   * @param height height or {@code null} for none
   */
  public GooglePrivacyDlpV2BoundingBox setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Left coordinate of the bounding box. (0,0) is upper left.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeft() {
    return left;
  }

  /**
   * Left coordinate of the bounding box. (0,0) is upper left.
   * @param left left or {@code null} for none
   */
  public GooglePrivacyDlpV2BoundingBox setLeft(java.lang.Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Top coordinate of the bounding box. (0,0) is upper left.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTop() {
    return top;
  }

  /**
   * Top coordinate of the bounding box. (0,0) is upper left.
   * @param top top or {@code null} for none
   */
  public GooglePrivacyDlpV2BoundingBox setTop(java.lang.Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Width of the bounding box in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Width of the bounding box in pixels.
   * @param width width or {@code null} for none
   */
  public GooglePrivacyDlpV2BoundingBox setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2BoundingBox set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2BoundingBox) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2BoundingBox clone() {
    return (GooglePrivacyDlpV2BoundingBox) super.clone();
  }

}