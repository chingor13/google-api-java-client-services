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

package com.google.servicemanagement.model;

/**
 * Represents a diagnostic message (error or warning)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Diagnostic extends com.google.api.client.json.GenericJson {

  /**
   * The kind of diagnostic information provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * File name and line number of the error or warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Message describing the error or warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The kind of diagnostic information provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of diagnostic information provided.
   * @param kind kind or {@code null} for none
   */
  public Diagnostic setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * File name and line number of the error or warning.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * File name and line number of the error or warning.
   * @param location location or {@code null} for none
   */
  public Diagnostic setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Message describing the error or warning.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Message describing the error or warning.
   * @param message message or {@code null} for none
   */
  public Diagnostic setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public Diagnostic set(String fieldName, Object value) {
    return (Diagnostic) super.set(fieldName, value);
  }

  @Override
  public Diagnostic clone() {
    return (Diagnostic) super.clone();
  }

}