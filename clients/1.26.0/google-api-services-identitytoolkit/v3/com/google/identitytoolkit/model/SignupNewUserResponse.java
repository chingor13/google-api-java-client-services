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

package com.google.identitytoolkit.model;

/**
 * Response of signing up new user, creating anonymous user or anonymous user reauth.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Identity Toolkit API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignupNewUserResponse extends com.google.api.client.json.GenericJson {

  /**
   * The name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The email of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresIn;

  /**
   * The Gitkit id token to login the newly sign up user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * The fixed string "identitytoolkit#SignupNewUserResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The RP local ID of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localId;

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refreshToken;

  /**
   * The name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of the user.
   * @param displayName displayName or {@code null} for none
   */
  public SignupNewUserResponse setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The email of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email of the user.
   * @param email email or {@code null} for none
   */
  public SignupNewUserResponse setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresIn() {
    return expiresIn;
  }

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @param expiresIn expiresIn or {@code null} for none
   */
  public SignupNewUserResponse setExpiresIn(java.lang.Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The Gitkit id token to login the newly sign up user.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * The Gitkit id token to login the newly sign up user.
   * @param idToken idToken or {@code null} for none
   */
  public SignupNewUserResponse setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * The fixed string "identitytoolkit#SignupNewUserResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The fixed string "identitytoolkit#SignupNewUserResponse".
   * @param kind kind or {@code null} for none
   */
  public SignupNewUserResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The RP local ID of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalId() {
    return localId;
  }

  /**
   * The RP local ID of the user.
   * @param localId localId or {@code null} for none
   */
  public SignupNewUserResponse setLocalId(java.lang.String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefreshToken() {
    return refreshToken;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @param refreshToken refreshToken or {@code null} for none
   */
  public SignupNewUserResponse setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @Override
  public SignupNewUserResponse set(String fieldName, Object value) {
    return (SignupNewUserResponse) super.set(fieldName, value);
  }

  @Override
  public SignupNewUserResponse clone() {
    return (SignupNewUserResponse) super.clone();
  }

}
