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

package com.google.cloudbilling.model;

/**
 * Represents the pricing information for a SKU at a single point of time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PricingInfo extends com.google.api.client.json.GenericJson {

  /**
   * Aggregation Info. This can be left unspecified if the pricing expression doesn't require
   * aggregation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AggregationInfo aggregationInfo;

  /**
   * Conversion rate used for currency conversion, from USD to the currency specified in the
   * request. This includes any surcharge collected for billing in non USD currency. If a currency
   * is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate =
   * JPY
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double currencyConversionRate;

  /**
   * The timestamp from which this pricing was effective within the requested time range. This is
   * guaranteed to be greater than or equal to the start_time field in the request and less than the
   * end_time field in the request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest pricing info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String effectiveTime;

  /**
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PricingExpression pricingExpression;

  /**
   * An optional human readable summary of the pricing information, has a maximum length of 256
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summary;

  /**
   * Aggregation Info. This can be left unspecified if the pricing expression doesn't require
   * aggregation.
   * @return value or {@code null} for none
   */
  public AggregationInfo getAggregationInfo() {
    return aggregationInfo;
  }

  /**
   * Aggregation Info. This can be left unspecified if the pricing expression doesn't require
   * aggregation.
   * @param aggregationInfo aggregationInfo or {@code null} for none
   */
  public PricingInfo setAggregationInfo(AggregationInfo aggregationInfo) {
    this.aggregationInfo = aggregationInfo;
    return this;
  }

  /**
   * Conversion rate used for currency conversion, from USD to the currency specified in the
   * request. This includes any surcharge collected for billing in non USD currency. If a currency
   * is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate =
   * JPY
   * @return value or {@code null} for none
   */
  public java.lang.Double getCurrencyConversionRate() {
    return currencyConversionRate;
  }

  /**
   * Conversion rate used for currency conversion, from USD to the currency specified in the
   * request. This includes any surcharge collected for billing in non USD currency. If a currency
   * is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate =
   * JPY
   * @param currencyConversionRate currencyConversionRate or {@code null} for none
   */
  public PricingInfo setCurrencyConversionRate(java.lang.Double currencyConversionRate) {
    this.currencyConversionRate = currencyConversionRate;
    return this;
  }

  /**
   * The timestamp from which this pricing was effective within the requested time range. This is
   * guaranteed to be greater than or equal to the start_time field in the request and less than the
   * end_time field in the request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest pricing info.
   * @return value or {@code null} for none
   */
  public String getEffectiveTime() {
    return effectiveTime;
  }

  /**
   * The timestamp from which this pricing was effective within the requested time range. This is
   * guaranteed to be greater than or equal to the start_time field in the request and less than the
   * end_time field in the request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest pricing info.
   * @param effectiveTime effectiveTime or {@code null} for none
   */
  public PricingInfo setEffectiveTime(String effectiveTime) {
    this.effectiveTime = effectiveTime;
    return this;
  }

  /**
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * @return value or {@code null} for none
   */
  public PricingExpression getPricingExpression() {
    return pricingExpression;
  }

  /**
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * @param pricingExpression pricingExpression or {@code null} for none
   */
  public PricingInfo setPricingExpression(PricingExpression pricingExpression) {
    this.pricingExpression = pricingExpression;
    return this;
  }

  /**
   * An optional human readable summary of the pricing information, has a maximum length of 256
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummary() {
    return summary;
  }

  /**
   * An optional human readable summary of the pricing information, has a maximum length of 256
   * characters.
   * @param summary summary or {@code null} for none
   */
  public PricingInfo setSummary(java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  @Override
  public PricingInfo set(String fieldName, Object value) {
    return (PricingInfo) super.set(fieldName, value);
  }

  @Override
  public PricingInfo clone() {
    return (PricingInfo) super.clone();
  }

}