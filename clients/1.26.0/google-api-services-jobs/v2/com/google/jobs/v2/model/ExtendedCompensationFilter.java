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

package com.google.jobs.v2.model;

/**
 * Deprecated. Always use CompensationFilter.
 *
 * Input only.
 *
 * Filter on job compensation type and amount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExtendedCompensationFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Compensation range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedCompensationInfoCompensationRange compensationRange;

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` ExtendedCompensationInfo.CompensationUnit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> compensationUnits;

  /**
   * Optional.
   *
   * Specify currency in 3-letter [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html)
   * format. If unspecified, jobs are returned regardless of currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currency;

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeJobWithUnspecifiedCompensationRange;

  /**
   * Required.
   *
   * Type of filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional.
   *
   * Compensation range.
   * @return value or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationRange getCompensationRange() {
    return compensationRange;
  }

  /**
   * Optional.
   *
   * Compensation range.
   * @param compensationRange compensationRange or {@code null} for none
   */
  public ExtendedCompensationFilter setCompensationRange(ExtendedCompensationInfoCompensationRange compensationRange) {
    this.compensationRange = compensationRange;
    return this;
  }

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` ExtendedCompensationInfo.CompensationUnit.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompensationUnits() {
    return compensationUnits;
  }

  /**
   * Required.
   *
   * Specify desired `base compensation entry's` ExtendedCompensationInfo.CompensationUnit.
   * @param compensationUnits compensationUnits or {@code null} for none
   */
  public ExtendedCompensationFilter setCompensationUnits(java.util.List<java.lang.String> compensationUnits) {
    this.compensationUnits = compensationUnits;
    return this;
  }

  /**
   * Optional.
   *
   * Specify currency in 3-letter [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html)
   * format. If unspecified, jobs are returned regardless of currency.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrency() {
    return currency;
  }

  /**
   * Optional.
   *
   * Specify currency in 3-letter [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html)
   * format. If unspecified, jobs are returned regardless of currency.
   * @param currency currency or {@code null} for none
   */
  public ExtendedCompensationFilter setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeJobWithUnspecifiedCompensationRange() {
    return includeJobWithUnspecifiedCompensationRange;
  }

  /**
   * Optional.
   *
   * Whether to include jobs whose compensation range is unspecified.
   * @param includeJobWithUnspecifiedCompensationRange includeJobWithUnspecifiedCompensationRange or {@code null} for none
   */
  public ExtendedCompensationFilter setIncludeJobWithUnspecifiedCompensationRange(java.lang.Boolean includeJobWithUnspecifiedCompensationRange) {
    this.includeJobWithUnspecifiedCompensationRange = includeJobWithUnspecifiedCompensationRange;
    return this;
  }

  /**
   * Required.
   *
   * Type of filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required.
   *
   * Type of filter.
   * @param type type or {@code null} for none
   */
  public ExtendedCompensationFilter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ExtendedCompensationFilter set(String fieldName, Object value) {
    return (ExtendedCompensationFilter) super.set(fieldName, value);
  }

  @Override
  public ExtendedCompensationFilter clone() {
    return (ExtendedCompensationFilter) super.clone();
  }

}