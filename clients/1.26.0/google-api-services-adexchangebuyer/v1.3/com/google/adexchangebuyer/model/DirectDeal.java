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
 * The configuration data for an Ad Exchange direct deal.
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
public final class DirectDeal extends com.google.api.client.json.GenericJson {

  /**
   * The account id of the buyer this deal is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer accountId;

  /**
   * The name of the advertiser this deal is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiser;

  /**
   * Whether the publisher for this deal is eligible for alcohol ads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowsAlcohol;

  /**
   * The account id that this deal was negotiated for. It is either the buyer or the client that
   * this deal was negotiated on behalf of.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long buyerAccountId;

  /**
   * The currency code that applies to the fixed_cpm value. If not set then assumed to be USD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * The deal type such as programmatic reservation or fixed price and so on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealTier;

  /**
   * End time for when this deal stops being active. If not set then this deal is valid until
   * manually disabled by the publisher. In seconds since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTime;

  /**
   * The fixed price for this direct deal. In cpm micros of currency according to currency_code. If
   * set, then this deal is eligible for the fixed price tier of buying (highest priority, pay
   * exactly the configured fixed price).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fixedCpm;

  /**
   * Deal id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Deal name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The minimum price for this direct deal. In cpm micros of currency according to currency_code.
   * If set, then this deal is eligible for the private exchange tier of buying (below fixed price
   * priority, run as a second price auction).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long privateExchangeMinCpm;

  /**
   * If true, the publisher has opted to have their blocks ignored when a creative is bid with for
   * this deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publisherBlocksOverriden;

  /**
   * The name of the publisher offering this direct deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerNetwork;

  /**
   * Start time for when this deal becomes active. If not set then this deal is active immediately
   * upon creation. In seconds since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTime;

  /**
   * The account id of the buyer this deal is for.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAccountId() {
    return accountId;
  }

  /**
   * The account id of the buyer this deal is for.
   * @param accountId accountId or {@code null} for none
   */
  public DirectDeal setAccountId(java.lang.Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The name of the advertiser this deal is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiser() {
    return advertiser;
  }

  /**
   * The name of the advertiser this deal is for.
   * @param advertiser advertiser or {@code null} for none
   */
  public DirectDeal setAdvertiser(java.lang.String advertiser) {
    this.advertiser = advertiser;
    return this;
  }

  /**
   * Whether the publisher for this deal is eligible for alcohol ads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowsAlcohol() {
    return allowsAlcohol;
  }

  /**
   * Whether the publisher for this deal is eligible for alcohol ads.
   * @param allowsAlcohol allowsAlcohol or {@code null} for none
   */
  public DirectDeal setAllowsAlcohol(java.lang.Boolean allowsAlcohol) {
    this.allowsAlcohol = allowsAlcohol;
    return this;
  }

  /**
   * The account id that this deal was negotiated for. It is either the buyer or the client that
   * this deal was negotiated on behalf of.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBuyerAccountId() {
    return buyerAccountId;
  }

  /**
   * The account id that this deal was negotiated for. It is either the buyer or the client that
   * this deal was negotiated on behalf of.
   * @param buyerAccountId buyerAccountId or {@code null} for none
   */
  public DirectDeal setBuyerAccountId(java.lang.Long buyerAccountId) {
    this.buyerAccountId = buyerAccountId;
    return this;
  }

  /**
   * The currency code that applies to the fixed_cpm value. If not set then assumed to be USD.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The currency code that applies to the fixed_cpm value. If not set then assumed to be USD.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public DirectDeal setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The deal type such as programmatic reservation or fixed price and so on.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealTier() {
    return dealTier;
  }

  /**
   * The deal type such as programmatic reservation or fixed price and so on.
   * @param dealTier dealTier or {@code null} for none
   */
  public DirectDeal setDealTier(java.lang.String dealTier) {
    this.dealTier = dealTier;
    return this;
  }

  /**
   * End time for when this deal stops being active. If not set then this deal is valid until
   * manually disabled by the publisher. In seconds since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTime() {
    return endTime;
  }

  /**
   * End time for when this deal stops being active. If not set then this deal is valid until
   * manually disabled by the publisher. In seconds since the epoch.
   * @param endTime endTime or {@code null} for none
   */
  public DirectDeal setEndTime(java.lang.Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The fixed price for this direct deal. In cpm micros of currency according to currency_code. If
   * set, then this deal is eligible for the fixed price tier of buying (highest priority, pay
   * exactly the configured fixed price).
   * @return value or {@code null} for none
   */
  public java.lang.Long getFixedCpm() {
    return fixedCpm;
  }

  /**
   * The fixed price for this direct deal. In cpm micros of currency according to currency_code. If
   * set, then this deal is eligible for the fixed price tier of buying (highest priority, pay
   * exactly the configured fixed price).
   * @param fixedCpm fixedCpm or {@code null} for none
   */
  public DirectDeal setFixedCpm(java.lang.Long fixedCpm) {
    this.fixedCpm = fixedCpm;
    return this;
  }

  /**
   * Deal id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Deal id.
   * @param id id or {@code null} for none
   */
  public DirectDeal setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public DirectDeal setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Deal name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Deal name.
   * @param name name or {@code null} for none
   */
  public DirectDeal setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The minimum price for this direct deal. In cpm micros of currency according to currency_code.
   * If set, then this deal is eligible for the private exchange tier of buying (below fixed price
   * priority, run as a second price auction).
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrivateExchangeMinCpm() {
    return privateExchangeMinCpm;
  }

  /**
   * The minimum price for this direct deal. In cpm micros of currency according to currency_code.
   * If set, then this deal is eligible for the private exchange tier of buying (below fixed price
   * priority, run as a second price auction).
   * @param privateExchangeMinCpm privateExchangeMinCpm or {@code null} for none
   */
  public DirectDeal setPrivateExchangeMinCpm(java.lang.Long privateExchangeMinCpm) {
    this.privateExchangeMinCpm = privateExchangeMinCpm;
    return this;
  }

  /**
   * If true, the publisher has opted to have their blocks ignored when a creative is bid with for
   * this deal.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublisherBlocksOverriden() {
    return publisherBlocksOverriden;
  }

  /**
   * If true, the publisher has opted to have their blocks ignored when a creative is bid with for
   * this deal.
   * @param publisherBlocksOverriden publisherBlocksOverriden or {@code null} for none
   */
  public DirectDeal setPublisherBlocksOverriden(java.lang.Boolean publisherBlocksOverriden) {
    this.publisherBlocksOverriden = publisherBlocksOverriden;
    return this;
  }

  /**
   * The name of the publisher offering this direct deal.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerNetwork() {
    return sellerNetwork;
  }

  /**
   * The name of the publisher offering this direct deal.
   * @param sellerNetwork sellerNetwork or {@code null} for none
   */
  public DirectDeal setSellerNetwork(java.lang.String sellerNetwork) {
    this.sellerNetwork = sellerNetwork;
    return this;
  }

  /**
   * Start time for when this deal becomes active. If not set then this deal is active immediately
   * upon creation. In seconds since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Start time for when this deal becomes active. If not set then this deal is active immediately
   * upon creation. In seconds since the epoch.
   * @param startTime startTime or {@code null} for none
   */
  public DirectDeal setStartTime(java.lang.Long startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public DirectDeal set(String fieldName, Object value) {
    return (DirectDeal) super.set(fieldName, value);
  }

  @Override
  public DirectDeal clone() {
    return (DirectDeal) super.clone();
  }

}
