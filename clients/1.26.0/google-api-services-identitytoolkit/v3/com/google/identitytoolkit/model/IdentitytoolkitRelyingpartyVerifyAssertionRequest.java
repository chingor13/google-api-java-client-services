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
 * Request to verify the IDP assertion.
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
public final class IdentitytoolkitRelyingpartyVerifyAssertionRequest extends com.google.api.client.json.GenericJson {

  /**
   * When it's true, automatically creates a new account if the user doesn't exist. When it's false,
   * allows existing user to sign in normally and throws exception if the user doesn't exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCreate;

  /**
   * GCP project number of the requesting delegated app. Currently only intended for Firebase V1
   * migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long delegatedProjectNumber;

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
   * The GITKit token for the non-trusted IDP pending to be confirmed by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pendingIdToken;

  /**
   * The post body if the request is a HTTP POST.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postBody;

  /**
   * The URI to which the IDP redirects the user back. It may contain federated login result params
   * added by the IDP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestUri;

  /**
   * Whether return 200 and IDP credential rather than throw exception when federated id is already
   * linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnIdpCredential;

  /**
   * Whether to return refresh tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnRefreshToken;

  /**
   * Whether return sts id token and refresh token instead of gitkit token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnSecureToken;

  /**
   * Session ID, which should match the one in previous createAuthUri request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionId;

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
   * When it's true, automatically creates a new account if the user doesn't exist. When it's false,
   * allows existing user to sign in normally and throws exception if the user doesn't exist.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCreate() {
    return autoCreate;
  }

  /**
   * When it's true, automatically creates a new account if the user doesn't exist. When it's false,
   * allows existing user to sign in normally and throws exception if the user doesn't exist.
   * @param autoCreate autoCreate or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setAutoCreate(java.lang.Boolean autoCreate) {
    this.autoCreate = autoCreate;
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setDelegatedProjectNumber(java.lang.Long delegatedProjectNumber) {
    this.delegatedProjectNumber = delegatedProjectNumber;
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setIdToken(java.lang.String idToken) {
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The GITKit token for the non-trusted IDP pending to be confirmed by the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getPendingIdToken() {
    return pendingIdToken;
  }

  /**
   * The GITKit token for the non-trusted IDP pending to be confirmed by the user.
   * @param pendingIdToken pendingIdToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setPendingIdToken(java.lang.String pendingIdToken) {
    this.pendingIdToken = pendingIdToken;
    return this;
  }

  /**
   * The post body if the request is a HTTP POST.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostBody() {
    return postBody;
  }

  /**
   * The post body if the request is a HTTP POST.
   * @param postBody postBody or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setPostBody(java.lang.String postBody) {
    this.postBody = postBody;
    return this;
  }

  /**
   * The URI to which the IDP redirects the user back. It may contain federated login result params
   * added by the IDP.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestUri() {
    return requestUri;
  }

  /**
   * The URI to which the IDP redirects the user back. It may contain federated login result params
   * added by the IDP.
   * @param requestUri requestUri or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setRequestUri(java.lang.String requestUri) {
    this.requestUri = requestUri;
    return this;
  }

  /**
   * Whether return 200 and IDP credential rather than throw exception when federated id is already
   * linked.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnIdpCredential() {
    return returnIdpCredential;
  }

  /**
   * Whether return 200 and IDP credential rather than throw exception when federated id is already
   * linked.
   * @param returnIdpCredential returnIdpCredential or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setReturnIdpCredential(java.lang.Boolean returnIdpCredential) {
    this.returnIdpCredential = returnIdpCredential;
    return this;
  }

  /**
   * Whether to return refresh tokens.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnRefreshToken() {
    return returnRefreshToken;
  }

  /**
   * Whether to return refresh tokens.
   * @param returnRefreshToken returnRefreshToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setReturnRefreshToken(java.lang.Boolean returnRefreshToken) {
    this.returnRefreshToken = returnRefreshToken;
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setReturnSecureToken(java.lang.Boolean returnSecureToken) {
    this.returnSecureToken = returnSecureToken;
    return this;
  }

  /**
   * Session ID, which should match the one in previous createAuthUri request.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Session ID, which should match the one in previous createAuthUri request.
   * @param sessionId sessionId or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setTenantId(java.lang.String tenantId) {
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
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest setTenantProjectNumber(java.math.BigInteger tenantProjectNumber) {
    this.tenantProjectNumber = tenantProjectNumber;
    return this;
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest set(String fieldName, Object value) {
    return (IdentitytoolkitRelyingpartyVerifyAssertionRequest) super.set(fieldName, value);
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyAssertionRequest clone() {
    return (IdentitytoolkitRelyingpartyVerifyAssertionRequest) super.clone();
  }

}