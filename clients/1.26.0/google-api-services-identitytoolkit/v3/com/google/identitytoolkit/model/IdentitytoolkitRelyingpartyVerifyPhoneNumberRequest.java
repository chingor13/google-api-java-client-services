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
 * Request for Identitytoolkit-VerifyPhoneNumber
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
public final class IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The session info previously returned by IdentityToolkit-SendVerificationCode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String temporaryProof;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationProof;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * @param code code or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * @param idToken idToken or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOperation() {
    return operation;
  }

  /**
   * @param operation operation or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setOperation(java.lang.String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The session info previously returned by IdentityToolkit-SendVerificationCode.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionInfo() {
    return sessionInfo;
  }

  /**
   * The session info previously returned by IdentityToolkit-SendVerificationCode.
   * @param sessionInfo sessionInfo or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setSessionInfo(java.lang.String sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTemporaryProof() {
    return temporaryProof;
  }

  /**
   * @param temporaryProof temporaryProof or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setTemporaryProof(java.lang.String temporaryProof) {
    this.temporaryProof = temporaryProof;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationProof() {
    return verificationProof;
  }

  /**
   * @param verificationProof verificationProof or {@code null} for none
   */
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest setVerificationProof(java.lang.String verificationProof) {
    this.verificationProof = verificationProof;
    return this;
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest set(String fieldName, Object value) {
    return (IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest) super.set(fieldName, value);
  }

  @Override
  public IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest clone() {
    return (IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest) super.clone();
  }

}
