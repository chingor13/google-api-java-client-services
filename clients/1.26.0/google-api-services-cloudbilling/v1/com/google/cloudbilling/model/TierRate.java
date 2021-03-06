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
 * The price rate indicating starting usage and its corresponding price.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TierRate extends com.google.api.client.json.GenericJson {

  /**
   * Usage is priced at this rate only after this amount. Example: start_usage_amount of 10
   * indicates that the usage will be priced at the unit_price after the first 10 usage_units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double startUsageAmount;

  /**
   * The price per unit of usage. Example: unit_price of amount $10 indicates that each unit will
   * cost $10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money unitPrice;

  /**
   * Usage is priced at this rate only after this amount. Example: start_usage_amount of 10
   * indicates that the usage will be priced at the unit_price after the first 10 usage_units.
   * @return value or {@code null} for none
   */
  public java.lang.Double getStartUsageAmount() {
    return startUsageAmount;
  }

  /**
   * Usage is priced at this rate only after this amount. Example: start_usage_amount of 10
   * indicates that the usage will be priced at the unit_price after the first 10 usage_units.
   * @param startUsageAmount startUsageAmount or {@code null} for none
   */
  public TierRate setStartUsageAmount(java.lang.Double startUsageAmount) {
    this.startUsageAmount = startUsageAmount;
    return this;
  }

  /**
   * The price per unit of usage. Example: unit_price of amount $10 indicates that each unit will
   * cost $10.
   * @return value or {@code null} for none
   */
  public Money getUnitPrice() {
    return unitPrice;
  }

  /**
   * The price per unit of usage. Example: unit_price of amount $10 indicates that each unit will
   * cost $10.
   * @param unitPrice unitPrice or {@code null} for none
   */
  public TierRate setUnitPrice(Money unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  @Override
  public TierRate set(String fieldName, Object value) {
    return (TierRate) super.set(fieldName, value);
  }

  @Override
  public TierRate clone() {
    return (TierRate) super.clone();
  }

}
