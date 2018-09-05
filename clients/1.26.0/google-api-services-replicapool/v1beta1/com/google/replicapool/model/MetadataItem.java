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

package com.google.replicapool.model;

/**
 * A Compute Engine metadata item, defined as a key:value pair. Identical to the metadata on the
 * corresponding Compute Engine resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetadataItem extends com.google.api.client.json.GenericJson {

  /**
   * A metadata key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * A metadata value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * A metadata key.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * A metadata key.
   * @param key key or {@code null} for none
   */
  public MetadataItem setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * A metadata value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * A metadata value.
   * @param value value or {@code null} for none
   */
  public MetadataItem setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public MetadataItem set(String fieldName, Object value) {
    return (MetadataItem) super.set(fieldName, value);
  }

  @Override
  public MetadataItem clone() {
    return (MetadataItem) super.clone();
  }

}