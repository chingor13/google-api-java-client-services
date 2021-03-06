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

package com.google.calendar.model;

/**
 * Model definition for Setting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Setting extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The id of the user setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Type of the resource ("calendar#setting").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Value of the user setting. The format of the value depends on the ID of the setting. It must
   * always be a UTF-8 string of length up to 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Setting setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The id of the user setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The id of the user setting.
   * @param id id or {@code null} for none
   */
  public Setting setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Type of the resource ("calendar#setting").
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of the resource ("calendar#setting").
   * @param kind kind or {@code null} for none
   */
  public Setting setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Value of the user setting. The format of the value depends on the ID of the setting. It must
   * always be a UTF-8 string of length up to 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Value of the user setting. The format of the value depends on the ID of the setting. It must
   * always be a UTF-8 string of length up to 1024 characters.
   * @param value value or {@code null} for none
   */
  public Setting setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Setting set(String fieldName, Object value) {
    return (Setting) super.set(fieldName, value);
  }

  @Override
  public Setting clone() {
    return (Setting) super.clone();
  }

}
