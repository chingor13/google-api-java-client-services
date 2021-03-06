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
 * Request to verify the password.
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
public final class IdentitytoolkitRelyingpartyVerifyPasswordRequest extends com.google.api.client.json.GenericJson {

  /**
   * The captcha challenge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String captchaChallenge;

  /**
   * Response to the captcha.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String captchaResponse;

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long delegatedProjectNumber;

  /**
   * The email of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The GITKit token of the authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * Instance id token of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * The password inputed by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The GITKit token for the non-trusted IDP, which is to be confirmed by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pendingIdToken;

  /**
   * Whether return sts id token and refresh token instead of gitkit token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnSecureToken;

  /**
   * For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters,
   * Firebear needs to know which Tenant to retrieve IDP configs from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * Tenant project number to be used for idp discovery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger tenantProjectNumber;

  /**
   * The captcha challenge.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaptchaChallenge() {
    return captchaChallenge;
  }

  /**
   * The captcha challenge.
   * @param captchaChallenge captchaChallenge or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setCaptchaChallenge(java.lang.String captchaChallenge) {
    this.captchaChallenge = captchaChallenge;
    return this;
  }

  /**
   * Response to the captcha.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaptchaResponse() {
    return captchaResponse;
  }

  /**
   * Response to the captcha.
   * @param captchaResponse captchaResponse or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setCaptchaResponse(java.lang.String captchaResponse) {
    this.captchaResponse = captchaResponse;
    return this;
  }

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDelegatedProjectNumber() {
    return delegatedProjectNumber;
  }

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * @param delegatedProjectNumber delegatedProjectNumber or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setDelegatedProjectNumber(java.lang.Long delegatedProjectNumber) {
    this.delegatedProjectNumber = delegatedProjectNumber;
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
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The GITKit token of the authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * The GITKit token of the authenticated user.
   * @param idToken idToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Instance id token of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * Instance id token of the app.
   * @param instanceId instanceId or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The password inputed by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password inputed by the user.
   * @param password password or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The GITKit token for the non-trusted IDP, which is to be confirmed by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getPendingIdToken() {
    return pendingIdToken;
  }

  /**
   * The GITKit token for the non-trusted IDP, which is to be confirmed by the user.
   * @param pendingIdToken pendingIdToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setPendingIdToken(java.lang.String pendingIdToken) {
    this.pendingIdToken = pendingIdToken;
    return this;
  }

  /**
   * Whether return sts id token and refresh token instead of gitkit token.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnSecureToken() {
    return returnSecureToken;
  }

  /**
   * Whether return sts id token and refresh token instead of gitkit token.
   * @param returnSecureToken returnSecureToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setReturnSecureToken(java.lang.Boolean returnSecureToken) {
    this.returnSecureToken = returnSecureToken;
    return this;
  }

  /**
   * For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters,
   * Firebear needs to know which Tenant to retrieve IDP configs from.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters,
   * Firebear needs to know which Tenant to retrieve IDP configs from.
   * @param tenantId tenantId or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant project number to be used for idp discovery.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTenantProjectNumber() {
    return tenantProjectNumber;
  }

  /**
   * Tenant project number to be used for idp discovery.
   * @param tenantProjectNumber tenantProjectNumber or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest setTenantProjectNumber(java.math.BigInteger tenantProjectNumber) {
    this.tenantProjectNumber = tenantProjectNumber;
    return this;
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest set(String fieldName, Object value) {
    return (IdentitytoolkitRelyingpartyVerifyPasswordRequest) super.set(fieldName, value);
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyPasswordRequest clone() {
    return (IdentitytoolkitRelyingpartyVerifyPasswordRequest) super.clone();
  }

}
