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

package com.google.games.model;

/**
 * This is a JSON template for an image asset object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageAsset extends com.google.api.client.json.GenericJson {

  /**
   * The height of the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#imageAsset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The width of the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The height of the asset.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * The height of the asset.
   * @param height height or {@code null} for none
   */
  public ImageAsset setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#imageAsset.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#imageAsset.
   * @param kind kind or {@code null} for none
   */
  public ImageAsset setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the asset.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the asset.
   * @param name name or {@code null} for none
   */
  public ImageAsset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the asset.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of the asset.
   * @param url url or {@code null} for none
   */
  public ImageAsset setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * The width of the asset.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The width of the asset.
   * @param width width or {@code null} for none
   */
  public ImageAsset setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public ImageAsset set(String fieldName, Object value) {
    return (ImageAsset) super.set(fieldName, value);
  }

  @Override
  public ImageAsset clone() {
    return (ImageAsset) super.clone();
  }

}