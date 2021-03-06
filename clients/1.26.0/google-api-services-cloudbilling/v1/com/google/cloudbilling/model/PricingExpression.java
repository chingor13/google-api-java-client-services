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
 * Expresses a mathematical pricing formula. For Example:-
 *
 * `usage_unit: GBy` `tiered_rates:`    `[start_usage_amount: 20, unit_price: $10]`
 * `[start_usage_amount: 100, unit_price: $5]`
 *
 * The above expresses a pricing formula where the first 20GB is free, the next 80GB is priced at
 * $10 per GB followed by $5 per GB for additional usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PricingExpression extends com.google.api.client.json.GenericJson {

  /**
   * The base unit for the SKU which is the unit used in usage exports. Example: "By"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseUnit;

  /**
   * Conversion factor for converting from price per usage_unit to price per base_unit, and
   * start_usage_amount to start_usage_amount in base_unit. unit_price / base_unit_conversion_factor
   * = price per base_unit. start_usage_amount * base_unit_conversion_factor = start_usage_amount in
   * base_unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double baseUnitConversionFactor;

  /**
   * The base unit in human readable form. Example: "byte".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseUnitDescription;

  /**
   * The recommended quantity of units for displaying pricing info. When displaying pricing info it
   * is recommended to display: (unit_price * display_quantity) per display_quantity usage_unit.
   * This field does not affect the pricing formula and is for display purposes only. Example: If
   * the unit_price is "0.0001 USD", the usage_unit is "GB" and the display_quantity is "1000" then
   * the recommended way of displaying the pricing info is "0.10 USD per 1000 GB"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double displayQuantity;

  /**
   * The list of tiered rates for this pricing. The total cost is computed by applying each of the
   * tiered rates on usage. This repeated list is sorted by ascending order of start_usage_amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TierRate> tieredRates;

  /**
   * The short hand for unit of usage this pricing is specified in. Example: usage_unit of "GiBy"
   * means that usage is specified in "Gibi Byte".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usageUnit;

  /**
   * The unit of usage in human readable form. Example: "gibi byte".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usageUnitDescription;

  /**
   * The base unit for the SKU which is the unit used in usage exports. Example: "By"
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseUnit() {
    return baseUnit;
  }

  /**
   * The base unit for the SKU which is the unit used in usage exports. Example: "By"
   * @param baseUnit baseUnit or {@code null} for none
   */
  public PricingExpression setBaseUnit(java.lang.String baseUnit) {
    this.baseUnit = baseUnit;
    return this;
  }

  /**
   * Conversion factor for converting from price per usage_unit to price per base_unit, and
   * start_usage_amount to start_usage_amount in base_unit. unit_price / base_unit_conversion_factor
   * = price per base_unit. start_usage_amount * base_unit_conversion_factor = start_usage_amount in
   * base_unit.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBaseUnitConversionFactor() {
    return baseUnitConversionFactor;
  }

  /**
   * Conversion factor for converting from price per usage_unit to price per base_unit, and
   * start_usage_amount to start_usage_amount in base_unit. unit_price / base_unit_conversion_factor
   * = price per base_unit. start_usage_amount * base_unit_conversion_factor = start_usage_amount in
   * base_unit.
   * @param baseUnitConversionFactor baseUnitConversionFactor or {@code null} for none
   */
  public PricingExpression setBaseUnitConversionFactor(java.lang.Double baseUnitConversionFactor) {
    this.baseUnitConversionFactor = baseUnitConversionFactor;
    return this;
  }

  /**
   * The base unit in human readable form. Example: "byte".
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseUnitDescription() {
    return baseUnitDescription;
  }

  /**
   * The base unit in human readable form. Example: "byte".
   * @param baseUnitDescription baseUnitDescription or {@code null} for none
   */
  public PricingExpression setBaseUnitDescription(java.lang.String baseUnitDescription) {
    this.baseUnitDescription = baseUnitDescription;
    return this;
  }

  /**
   * The recommended quantity of units for displaying pricing info. When displaying pricing info it
   * is recommended to display: (unit_price * display_quantity) per display_quantity usage_unit.
   * This field does not affect the pricing formula and is for display purposes only. Example: If
   * the unit_price is "0.0001 USD", the usage_unit is "GB" and the display_quantity is "1000" then
   * the recommended way of displaying the pricing info is "0.10 USD per 1000 GB"
   * @return value or {@code null} for none
   */
  public java.lang.Double getDisplayQuantity() {
    return displayQuantity;
  }

  /**
   * The recommended quantity of units for displaying pricing info. When displaying pricing info it
   * is recommended to display: (unit_price * display_quantity) per display_quantity usage_unit.
   * This field does not affect the pricing formula and is for display purposes only. Example: If
   * the unit_price is "0.0001 USD", the usage_unit is "GB" and the display_quantity is "1000" then
   * the recommended way of displaying the pricing info is "0.10 USD per 1000 GB"
   * @param displayQuantity displayQuantity or {@code null} for none
   */
  public PricingExpression setDisplayQuantity(java.lang.Double displayQuantity) {
    this.displayQuantity = displayQuantity;
    return this;
  }

  /**
   * The list of tiered rates for this pricing. The total cost is computed by applying each of the
   * tiered rates on usage. This repeated list is sorted by ascending order of start_usage_amount.
   * @return value or {@code null} for none
   */
  public java.util.List<TierRate> getTieredRates() {
    return tieredRates;
  }

  /**
   * The list of tiered rates for this pricing. The total cost is computed by applying each of the
   * tiered rates on usage. This repeated list is sorted by ascending order of start_usage_amount.
   * @param tieredRates tieredRates or {@code null} for none
   */
  public PricingExpression setTieredRates(java.util.List<TierRate> tieredRates) {
    this.tieredRates = tieredRates;
    return this;
  }

  /**
   * The short hand for unit of usage this pricing is specified in. Example: usage_unit of "GiBy"
   * means that usage is specified in "Gibi Byte".
   * @return value or {@code null} for none
   */
  public java.lang.String getUsageUnit() {
    return usageUnit;
  }

  /**
   * The short hand for unit of usage this pricing is specified in. Example: usage_unit of "GiBy"
   * means that usage is specified in "Gibi Byte".
   * @param usageUnit usageUnit or {@code null} for none
   */
  public PricingExpression setUsageUnit(java.lang.String usageUnit) {
    this.usageUnit = usageUnit;
    return this;
  }

  /**
   * The unit of usage in human readable form. Example: "gibi byte".
   * @return value or {@code null} for none
   */
  public java.lang.String getUsageUnitDescription() {
    return usageUnitDescription;
  }

  /**
   * The unit of usage in human readable form. Example: "gibi byte".
   * @param usageUnitDescription usageUnitDescription or {@code null} for none
   */
  public PricingExpression setUsageUnitDescription(java.lang.String usageUnitDescription) {
    this.usageUnitDescription = usageUnitDescription;
    return this;
  }

  @Override
  public PricingExpression set(String fieldName, Object value) {
    return (PricingExpression) super.set(fieldName, value);
  }

  @Override
  public PricingExpression clone() {
    return (PricingExpression) super.clone();
  }

}
