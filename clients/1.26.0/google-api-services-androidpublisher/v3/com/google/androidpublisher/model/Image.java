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

package com.google.androidpublisher.model;

/**
 * Model definition for Image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * A unique id representing this image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A sha1 hash of the image that was uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sha1;

  /**
   * A URL that will serve a preview of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * A unique id representing this image.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A unique id representing this image.
   * @param id id or {@code null} for none
   */
  public Image setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A sha1 hash of the image that was uploaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getSha1() {
    return sha1;
  }

  /**
   * A sha1 hash of the image that was uploaded.
   * @param sha1 sha1 or {@code null} for none
   */
  public Image setSha1(java.lang.String sha1) {
    this.sha1 = sha1;
    return this;
  }

  /**
   * A URL that will serve a preview of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * A URL that will serve a preview of the image.
   * @param url url or {@code null} for none
   */
  public Image setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

}