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

package com.google.dlp.v2.model;

/**
 * Shifts dates by random number of days, with option to be consistent for the same context. See
 * https://cloud.google.com/dlp/docs/concepts-date-shifting to learn more.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DateShiftConfig extends com.google.api.client.json.GenericJson {

  /**
   * Points to the field that contains the context, for example, an entity id. If set, must also set
   * method. If set, shift will be consistent for the given context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId context;

  /**
   * Causes the shift to be computed based on this key and the context. This results in the same
   * shift for the same context and crypto_key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoKey cryptoKey;

  /**
   * For example, -5 means shift date to at most 5 days back in the past. [Required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer lowerBoundDays;

  /**
   * Range of shift in days. Actual shift will be selected at random within this range (inclusive
   * ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years)
   * each direction.
   *
   * For example, 3 means shift date to at most 3 days into the future. [Required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer upperBoundDays;

  /**
   * Points to the field that contains the context, for example, an entity id. If set, must also set
   * method. If set, shift will be consistent for the given context.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getContext() {
    return context;
  }

  /**
   * Points to the field that contains the context, for example, an entity id. If set, must also set
   * method. If set, shift will be consistent for the given context.
   * @param context context or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig setContext(GooglePrivacyDlpV2FieldId context) {
    this.context = context;
    return this;
  }

  /**
   * Causes the shift to be computed based on this key and the context. This results in the same
   * shift for the same context and crypto_key.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoKey getCryptoKey() {
    return cryptoKey;
  }

  /**
   * Causes the shift to be computed based on this key and the context. This results in the same
   * shift for the same context and crypto_key.
   * @param cryptoKey cryptoKey or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig setCryptoKey(GooglePrivacyDlpV2CryptoKey cryptoKey) {
    this.cryptoKey = cryptoKey;
    return this;
  }

  /**
   * For example, -5 means shift date to at most 5 days back in the past. [Required]
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLowerBoundDays() {
    return lowerBoundDays;
  }

  /**
   * For example, -5 means shift date to at most 5 days back in the past. [Required]
   * @param lowerBoundDays lowerBoundDays or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig setLowerBoundDays(java.lang.Integer lowerBoundDays) {
    this.lowerBoundDays = lowerBoundDays;
    return this;
  }

  /**
   * Range of shift in days. Actual shift will be selected at random within this range (inclusive
   * ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years)
   * each direction.
   *
   * For example, 3 means shift date to at most 3 days into the future. [Required]
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUpperBoundDays() {
    return upperBoundDays;
  }

  /**
   * Range of shift in days. Actual shift will be selected at random within this range (inclusive
   * ends). Negative means shift to earlier in time. Must not be more than 365250 days (1000 years)
   * each direction.
   *
   * For example, 3 means shift date to at most 3 days into the future. [Required]
   * @param upperBoundDays upperBoundDays or {@code null} for none
   */
  public GooglePrivacyDlpV2DateShiftConfig setUpperBoundDays(java.lang.Integer upperBoundDays) {
    this.upperBoundDays = upperBoundDays;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DateShiftConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DateShiftConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DateShiftConfig clone() {
    return (GooglePrivacyDlpV2DateShiftConfig) super.clone();
  }

}