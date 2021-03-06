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
 * Configuration data for an Ad Exchange buyer account.
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
public final class Account extends com.google.api.client.json.GenericJson {

  /**
   * When this is false, bid requests that include a deal ID for a private auction or preferred deal
   * are always sent to your bidder. When true, all active pretargeting configs will be applied to
   * private auctions and preferred deals. Programmatic Guaranteed deals (when enabled) are always
   * sent to your bidder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean applyPretargetingToNonGuaranteedDeals;

  /**
   * Your bidder locations that have distinct URLs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BidderLocation> bidderLocation;

  static {
    // hack to force ProGuard to consider BidderLocation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BidderLocation.class);
  }

  /**
   * The nid parameter value used in cookie match requests. Please contact your technical account
   * manager if you need to change this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cookieMatchingNid;

  /**
   * The base URL used in cookie match requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cookieMatchingUrl;

  /**
   * Account id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The maximum number of active creatives that an account can have, where a creative is active if
   * it was inserted or bid with in the last 30 days. Please contact your technical account manager
   * if you need to change this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumActiveCreatives;

  /**
   * The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your
   * technical account manager if you need to change this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumTotalQps;

  /**
   * The number of creatives that this account inserted or bid with in the last 30 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numberActiveCreatives;

  /**
   * When this is false, bid requests that include a deal ID for a private auction or preferred deal
   * are always sent to your bidder. When true, all active pretargeting configs will be applied to
   * private auctions and preferred deals. Programmatic Guaranteed deals (when enabled) are always
   * sent to your bidder.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApplyPretargetingToNonGuaranteedDeals() {
    return applyPretargetingToNonGuaranteedDeals;
  }

  /**
   * When this is false, bid requests that include a deal ID for a private auction or preferred deal
   * are always sent to your bidder. When true, all active pretargeting configs will be applied to
   * private auctions and preferred deals. Programmatic Guaranteed deals (when enabled) are always
   * sent to your bidder.
   * @param applyPretargetingToNonGuaranteedDeals applyPretargetingToNonGuaranteedDeals or {@code null} for none
   */
  public Account setApplyPretargetingToNonGuaranteedDeals(java.lang.Boolean applyPretargetingToNonGuaranteedDeals) {
    this.applyPretargetingToNonGuaranteedDeals = applyPretargetingToNonGuaranteedDeals;
    return this;
  }

  /**
   * Your bidder locations that have distinct URLs.
   * @return value or {@code null} for none
   */
  public java.util.List<BidderLocation> getBidderLocation() {
    return bidderLocation;
  }

  /**
   * Your bidder locations that have distinct URLs.
   * @param bidderLocation bidderLocation or {@code null} for none
   */
  public Account setBidderLocation(java.util.List<BidderLocation> bidderLocation) {
    this.bidderLocation = bidderLocation;
    return this;
  }

  /**
   * The nid parameter value used in cookie match requests. Please contact your technical account
   * manager if you need to change this.
   * @return value or {@code null} for none
   */
  public java.lang.String getCookieMatchingNid() {
    return cookieMatchingNid;
  }

  /**
   * The nid parameter value used in cookie match requests. Please contact your technical account
   * manager if you need to change this.
   * @param cookieMatchingNid cookieMatchingNid or {@code null} for none
   */
  public Account setCookieMatchingNid(java.lang.String cookieMatchingNid) {
    this.cookieMatchingNid = cookieMatchingNid;
    return this;
  }

  /**
   * The base URL used in cookie match requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getCookieMatchingUrl() {
    return cookieMatchingUrl;
  }

  /**
   * The base URL used in cookie match requests.
   * @param cookieMatchingUrl cookieMatchingUrl or {@code null} for none
   */
  public Account setCookieMatchingUrl(java.lang.String cookieMatchingUrl) {
    this.cookieMatchingUrl = cookieMatchingUrl;
    return this;
  }

  /**
   * Account id.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Account id.
   * @param id id or {@code null} for none
   */
  public Account setId(java.lang.Integer id) {
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
  public Account setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The maximum number of active creatives that an account can have, where a creative is active if
   * it was inserted or bid with in the last 30 days. Please contact your technical account manager
   * if you need to change this.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumActiveCreatives() {
    return maximumActiveCreatives;
  }

  /**
   * The maximum number of active creatives that an account can have, where a creative is active if
   * it was inserted or bid with in the last 30 days. Please contact your technical account manager
   * if you need to change this.
   * @param maximumActiveCreatives maximumActiveCreatives or {@code null} for none
   */
  public Account setMaximumActiveCreatives(java.lang.Integer maximumActiveCreatives) {
    this.maximumActiveCreatives = maximumActiveCreatives;
    return this;
  }

  /**
   * The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your
   * technical account manager if you need to change this.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumTotalQps() {
    return maximumTotalQps;
  }

  /**
   * The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your
   * technical account manager if you need to change this.
   * @param maximumTotalQps maximumTotalQps or {@code null} for none
   */
  public Account setMaximumTotalQps(java.lang.Integer maximumTotalQps) {
    this.maximumTotalQps = maximumTotalQps;
    return this;
  }

  /**
   * The number of creatives that this account inserted or bid with in the last 30 days.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumberActiveCreatives() {
    return numberActiveCreatives;
  }

  /**
   * The number of creatives that this account inserted or bid with in the last 30 days.
   * @param numberActiveCreatives numberActiveCreatives or {@code null} for none
   */
  public Account setNumberActiveCreatives(java.lang.Integer numberActiveCreatives) {
    this.numberActiveCreatives = numberActiveCreatives;
    return this;
  }

  @Override
  public Account set(String fieldName, Object value) {
    return (Account) super.set(fieldName, value);
  }

  @Override
  public Account clone() {
    return (Account) super.clone();
  }

  /**
   * Model definition for AccountBidderLocation.
   */
  public static final class BidderLocation extends com.google.api.client.json.GenericJson {

    /**
     * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix
     * PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed values: - PROTOCOL_ADX
     * - PROTOCOL_OPENRTB_2_2  - PROTOCOL_OPENRTB_2_3  - PROTOCOL_OPENRTB_2_4  - PROTOCOL_OPENRTB_2_5
     * - PROTOCOL_OPENRTB_PROTOBUF_2_3  - PROTOCOL_OPENRTB_PROTOBUF_2_4  -
     * PROTOCOL_OPENRTB_PROTOBUF_2_5
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String bidProtocol;

    /**
     * The maximum queries per second the Ad Exchange will send.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer maximumQps;

    /**
     * The geographical region the Ad Exchange should send requests from. Only used by some quota
     * systems, but always setting the value is recommended. Allowed values: - ASIA  - EUROPE  -
     * US_EAST  - US_WEST
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String region;

    /**
     * The URL to which the Ad Exchange will send bid requests.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix
     * PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed values: - PROTOCOL_ADX
     * - PROTOCOL_OPENRTB_2_2  - PROTOCOL_OPENRTB_2_3  - PROTOCOL_OPENRTB_2_4  - PROTOCOL_OPENRTB_2_5
     * - PROTOCOL_OPENRTB_PROTOBUF_2_3  - PROTOCOL_OPENRTB_PROTOBUF_2_4  -
     * PROTOCOL_OPENRTB_PROTOBUF_2_5
     * @return value or {@code null} for none
     */
    public java.lang.String getBidProtocol() {
      return bidProtocol;
    }

    /**
     * The protocol that the bidder endpoint is using. OpenRTB protocols with prefix
     * PROTOCOL_OPENRTB_PROTOBUF use proto buffer, otherwise use JSON.  Allowed values: - PROTOCOL_ADX
     * - PROTOCOL_OPENRTB_2_2  - PROTOCOL_OPENRTB_2_3  - PROTOCOL_OPENRTB_2_4  - PROTOCOL_OPENRTB_2_5
     * - PROTOCOL_OPENRTB_PROTOBUF_2_3  - PROTOCOL_OPENRTB_PROTOBUF_2_4  -
     * PROTOCOL_OPENRTB_PROTOBUF_2_5
     * @param bidProtocol bidProtocol or {@code null} for none
     */
    public BidderLocation setBidProtocol(java.lang.String bidProtocol) {
      this.bidProtocol = bidProtocol;
      return this;
    }

    /**
     * The maximum queries per second the Ad Exchange will send.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMaximumQps() {
      return maximumQps;
    }

    /**
     * The maximum queries per second the Ad Exchange will send.
     * @param maximumQps maximumQps or {@code null} for none
     */
    public BidderLocation setMaximumQps(java.lang.Integer maximumQps) {
      this.maximumQps = maximumQps;
      return this;
    }

    /**
     * The geographical region the Ad Exchange should send requests from. Only used by some quota
     * systems, but always setting the value is recommended. Allowed values: - ASIA  - EUROPE  -
     * US_EAST  - US_WEST
     * @return value or {@code null} for none
     */
    public java.lang.String getRegion() {
      return region;
    }

    /**
     * The geographical region the Ad Exchange should send requests from. Only used by some quota
     * systems, but always setting the value is recommended. Allowed values: - ASIA  - EUROPE  -
     * US_EAST  - US_WEST
     * @param region region or {@code null} for none
     */
    public BidderLocation setRegion(java.lang.String region) {
      this.region = region;
      return this;
    }

    /**
     * The URL to which the Ad Exchange will send bid requests.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL to which the Ad Exchange will send bid requests.
     * @param url url or {@code null} for none
     */
    public BidderLocation setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public BidderLocation set(String fieldName, Object value) {
      return (BidderLocation) super.set(fieldName, value);
    }

    @Override
    public BidderLocation clone() {
      return (BidderLocation) super.clone();
    }

  }

}
