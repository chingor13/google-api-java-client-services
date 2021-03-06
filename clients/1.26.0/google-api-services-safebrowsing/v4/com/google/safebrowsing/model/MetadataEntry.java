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

package com.google.safebrowsing.model;

/**
 * A single metadata entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetadataEntry extends com.google.api.client.json.GenericJson {

  /**
   * The metadata entry key. For JSON requests, the key is base64-encoded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The metadata entry value. For JSON requests, the value is base64-encoded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The metadata entry key. For JSON requests, the key is base64-encoded.
   * @see #decodeKey()
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The metadata entry key. For JSON requests, the key is base64-encoded.
   * @see #getKey()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeKey() {
    return com.google.api.client.util.Base64.decodeBase64(key);
  }

  /**
   * The metadata entry key. For JSON requests, the key is base64-encoded.
   * @see #encodeKey()
   * @param key key or {@code null} for none
   */
  public MetadataEntry setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The metadata entry key. For JSON requests, the key is base64-encoded.
   * @see #setKey()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MetadataEntry encodeKey(byte[] key) {
    this.key = com.google.api.client.util.Base64.encodeBase64URLSafeString(key);
    return this;
  }

  /**
   * The metadata entry value. For JSON requests, the value is base64-encoded.
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The metadata entry value. For JSON requests, the value is base64-encoded.
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * The metadata entry value. For JSON requests, the value is base64-encoded.
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public MetadataEntry setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * The metadata entry value. For JSON requests, the value is base64-encoded.
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MetadataEntry encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  @Override
  public MetadataEntry set(String fieldName, Object value) {
    return (MetadataEntry) super.set(fieldName, value);
  }

  @Override
  public MetadataEntry clone() {
    return (MetadataEntry) super.clone();
  }

}
