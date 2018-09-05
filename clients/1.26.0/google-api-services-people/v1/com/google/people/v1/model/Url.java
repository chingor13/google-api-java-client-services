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

package com.google.people.v1.model;

/**
 * A person's associated URLs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Url extends com.google.api.client.json.GenericJson {

  /**
   * The read-only type of the URL translated and formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * Metadata about the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The type of the URL. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `blog` * `profile` * `homePage` * `ftp` * `reservations` *
   * `appInstallPage`: website for a Google+ application. * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The read-only type of the URL translated and formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * The read-only type of the URL translated and formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * @param formattedType formattedType or {@code null} for none
   */
  public Url setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * Metadata about the URL.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the URL.
   * @param metadata metadata or {@code null} for none
   */
  public Url setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The type of the URL. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `blog` * `profile` * `homePage` * `ftp` * `reservations` *
   * `appInstallPage`: website for a Google+ application. * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the URL. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `blog` * `profile` * `homePage` * `ftp` * `reservations` *
   * `appInstallPage`: website for a Google+ application. * `other`
   * @param type type or {@code null} for none
   */
  public Url setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The URL.
   * @param value value or {@code null} for none
   */
  public Url setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Url set(String fieldName, Object value) {
    return (Url) super.set(fieldName, value);
  }

  @Override
  public Url clone() {
    return (Url) super.clone();
  }

}