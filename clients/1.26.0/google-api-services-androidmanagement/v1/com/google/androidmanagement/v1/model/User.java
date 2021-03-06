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

package com.google.androidmanagement.v1.model;

/**
 * A user belonging to an enterprise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * A unique identifier you create for this user, such as user342 or asset#44418. This field must
   * be set when the user is created and can't be updated. This field must not contain personally
   * identifiable information (PII). This identifier must be 1024 characters or less; otherwise, the
   * update policy request will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountIdentifier;

  /**
   * A unique identifier you create for this user, such as user342 or asset#44418. This field must
   * be set when the user is created and can't be updated. This field must not contain personally
   * identifiable information (PII). This identifier must be 1024 characters or less; otherwise, the
   * update policy request will fail.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountIdentifier() {
    return accountIdentifier;
  }

  /**
   * A unique identifier you create for this user, such as user342 or asset#44418. This field must
   * be set when the user is created and can't be updated. This field must not contain personally
   * identifiable information (PII). This identifier must be 1024 characters or less; otherwise, the
   * update policy request will fail.
   * @param accountIdentifier accountIdentifier or {@code null} for none
   */
  public User setAccountIdentifier(java.lang.String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
