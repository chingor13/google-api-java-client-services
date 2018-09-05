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

package com.google.classroom.model;

/**
 * Details of the user's name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Name extends com.google.api.client.json.GenericJson {

  /**
   * The user's last name.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String familyName;

  /**
   * The user's full name formed by concatenating the first and last name values.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * The user's first name.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String givenName;

  /**
   * The user's last name.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamilyName() {
    return familyName;
  }

  /**
   * The user's last name.
   *
   * Read-only.
   * @param familyName familyName or {@code null} for none
   */
  public Name setFamilyName(java.lang.String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * The user's full name formed by concatenating the first and last name values.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * The user's full name formed by concatenating the first and last name values.
   *
   * Read-only.
   * @param fullName fullName or {@code null} for none
   */
  public Name setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The user's first name.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getGivenName() {
    return givenName;
  }

  /**
   * The user's first name.
   *
   * Read-only.
   * @param givenName givenName or {@code null} for none
   */
  public Name setGivenName(java.lang.String givenName) {
    this.givenName = givenName;
    return this;
  }

  @Override
  public Name set(String fieldName, Object value) {
    return (Name) super.set(fieldName, value);
  }

  @Override
  public Name clone() {
    return (Name) super.clone();
  }

}