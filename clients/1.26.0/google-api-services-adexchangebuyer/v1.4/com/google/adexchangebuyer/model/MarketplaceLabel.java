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

package com.google.adexchangebuyer.model;

/**
 * Model definition for MarketplaceLabel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MarketplaceLabel extends com.google.api.client.json.GenericJson {

  /**
   * The accountId of the party that created the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * The creation time (in ms since epoch) for the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createTimeMs;

  /**
   * Information about the party that created the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MarketplaceDealParty deprecatedMarketplaceDealParty;

  /**
   * The label to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The accountId of the party that created the label.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * The accountId of the party that created the label.
   * @param accountId accountId or {@code null} for none
   */
  public MarketplaceLabel setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The creation time (in ms since epoch) for the label.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreateTimeMs() {
    return createTimeMs;
  }

  /**
   * The creation time (in ms since epoch) for the label.
   * @param createTimeMs createTimeMs or {@code null} for none
   */
  public MarketplaceLabel setCreateTimeMs(java.lang.Long createTimeMs) {
    this.createTimeMs = createTimeMs;
    return this;
  }

  /**
   * Information about the party that created the label.
   * @return value or {@code null} for none
   */
  public MarketplaceDealParty getDeprecatedMarketplaceDealParty() {
    return deprecatedMarketplaceDealParty;
  }

  /**
   * Information about the party that created the label.
   * @param deprecatedMarketplaceDealParty deprecatedMarketplaceDealParty or {@code null} for none
   */
  public MarketplaceLabel setDeprecatedMarketplaceDealParty(MarketplaceDealParty deprecatedMarketplaceDealParty) {
    this.deprecatedMarketplaceDealParty = deprecatedMarketplaceDealParty;
    return this;
  }

  /**
   * The label to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * The label to use.
   * @param label label or {@code null} for none
   */
  public MarketplaceLabel setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  @Override
  public MarketplaceLabel set(String fieldName, Object value) {
    return (MarketplaceLabel) super.set(fieldName, value);
  }

  @Override
  public MarketplaceLabel clone() {
    return (MarketplaceLabel) super.clone();
  }

}
