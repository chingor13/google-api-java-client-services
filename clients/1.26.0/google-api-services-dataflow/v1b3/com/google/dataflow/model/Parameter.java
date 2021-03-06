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

package com.google.dataflow.model;

/**
 * Structured data associated with this message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Parameter extends com.google.api.client.json.GenericJson {

  /**
   * Key or name for this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Value for this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object value;

  /**
   * Key or name for this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key or name for this parameter.
   * @param key key or {@code null} for none
   */
  public Parameter setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Value for this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Value for this parameter.
   * @param value value or {@code null} for none
   */
  public Parameter setValue(java.lang.Object value) {
    this.value = value;
    return this;
  }

  @Override
  public Parameter set(String fieldName, Object value) {
    return (Parameter) super.set(fieldName, value);
  }

  @Override
  public Parameter clone() {
    return (Parameter) super.clone();
  }

}
