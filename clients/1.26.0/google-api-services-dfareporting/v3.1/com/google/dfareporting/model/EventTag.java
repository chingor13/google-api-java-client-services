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

package com.google.dfareporting.model;

/**
 * Contains properties of an event tag.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventTag extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this event tag. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Advertiser ID of this event tag. This field or the campaignId field is required on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue advertiserIdDimensionValue;

  /**
   * Campaign ID of this event tag. This field or the advertiserId field is required on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long campaignId;

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue campaignIdDimensionValue;

  /**
   * Whether this event tag should be automatically enabled for all of the advertiser's campaigns
   * and ads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabledByDefault;

  /**
   * Whether to remove this event tag from ads that are trafficked through Display & Video 360 to Ad
   * Exchange. This may be useful if the event tag uses a pixel that is unapproved for Ad Exchange
   * bids on one or more networks, such as the Google Display Network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean excludeFromAdxRequests;

  /**
   * ID of this event tag. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this event tag. This is a required field and must be less than 256 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Site filter type for this event tag. If no type is specified then the event tag will be applied
   * to all sites.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String siteFilterType;

  /**
   * Filter list of site IDs associated with this event tag. The siteFilterType determines whether
   * this is a whitelist or blacklist filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> siteIds;

  /**
   * Whether this tag is SSL-compliant or not. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sslCompliant;

  /**
   * Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Subaccount ID of this event tag. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party
   * JavaScript URL, or a third-party click-through URL for either impression or click tracking.
   * This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Payload URL for this event tag. The URL on a click-through event tag should have a landing page
   * URL appended to the end of it. This field is required on insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Number of times the landing page URL should be URL-escaped before being appended to the click-
   * through event tag URL. Only applies to click-through event tags as specified by the event tag
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer urlEscapeLevels;

  /**
   * Account ID of this event tag. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this event tag. This is a read-only field that can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public EventTag setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Advertiser ID of this event tag. This field or the campaignId field is required on insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this event tag. This field or the campaignId field is required on insertion.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public EventTag setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getAdvertiserIdDimensionValue() {
    return advertiserIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @param advertiserIdDimensionValue advertiserIdDimensionValue or {@code null} for none
   */
  public EventTag setAdvertiserIdDimensionValue(DimensionValue advertiserIdDimensionValue) {
    this.advertiserIdDimensionValue = advertiserIdDimensionValue;
    return this;
  }

  /**
   * Campaign ID of this event tag. This field or the advertiserId field is required on insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * Campaign ID of this event tag. This field or the advertiserId field is required on insertion.
   * @param campaignId campaignId or {@code null} for none
   */
  public EventTag setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getCampaignIdDimensionValue() {
    return campaignIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
   * @param campaignIdDimensionValue campaignIdDimensionValue or {@code null} for none
   */
  public EventTag setCampaignIdDimensionValue(DimensionValue campaignIdDimensionValue) {
    this.campaignIdDimensionValue = campaignIdDimensionValue;
    return this;
  }

  /**
   * Whether this event tag should be automatically enabled for all of the advertiser's campaigns
   * and ads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabledByDefault() {
    return enabledByDefault;
  }

  /**
   * Whether this event tag should be automatically enabled for all of the advertiser's campaigns
   * and ads.
   * @param enabledByDefault enabledByDefault or {@code null} for none
   */
  public EventTag setEnabledByDefault(java.lang.Boolean enabledByDefault) {
    this.enabledByDefault = enabledByDefault;
    return this;
  }

  /**
   * Whether to remove this event tag from ads that are trafficked through Display & Video 360 to Ad
   * Exchange. This may be useful if the event tag uses a pixel that is unapproved for Ad Exchange
   * bids on one or more networks, such as the Google Display Network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExcludeFromAdxRequests() {
    return excludeFromAdxRequests;
  }

  /**
   * Whether to remove this event tag from ads that are trafficked through Display & Video 360 to Ad
   * Exchange. This may be useful if the event tag uses a pixel that is unapproved for Ad Exchange
   * bids on one or more networks, such as the Google Display Network.
   * @param excludeFromAdxRequests excludeFromAdxRequests or {@code null} for none
   */
  public EventTag setExcludeFromAdxRequests(java.lang.Boolean excludeFromAdxRequests) {
    this.excludeFromAdxRequests = excludeFromAdxRequests;
    return this;
  }

  /**
   * ID of this event tag. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this event tag. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public EventTag setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag".
   * @param kind kind or {@code null} for none
   */
  public EventTag setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this event tag. This is a required field and must be less than 256 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this event tag. This is a required field and must be less than 256 characters long.
   * @param name name or {@code null} for none
   */
  public EventTag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Site filter type for this event tag. If no type is specified then the event tag will be applied
   * to all sites.
   * @return value or {@code null} for none
   */
  public java.lang.String getSiteFilterType() {
    return siteFilterType;
  }

  /**
   * Site filter type for this event tag. If no type is specified then the event tag will be applied
   * to all sites.
   * @param siteFilterType siteFilterType or {@code null} for none
   */
  public EventTag setSiteFilterType(java.lang.String siteFilterType) {
    this.siteFilterType = siteFilterType;
    return this;
  }

  /**
   * Filter list of site IDs associated with this event tag. The siteFilterType determines whether
   * this is a whitelist or blacklist filter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getSiteIds() {
    return siteIds;
  }

  /**
   * Filter list of site IDs associated with this event tag. The siteFilterType determines whether
   * this is a whitelist or blacklist filter.
   * @param siteIds siteIds or {@code null} for none
   */
  public EventTag setSiteIds(java.util.List<java.lang.Long> siteIds) {
    this.siteIds = siteIds;
    return this;
  }

  /**
   * Whether this tag is SSL-compliant or not. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSslCompliant() {
    return sslCompliant;
  }

  /**
   * Whether this tag is SSL-compliant or not. This is a read-only field.
   * @param sslCompliant sslCompliant or {@code null} for none
   */
  public EventTag setSslCompliant(java.lang.Boolean sslCompliant) {
    this.sslCompliant = sslCompliant;
    return this;
  }

  /**
   * Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field.
   * @param status status or {@code null} for none
   */
  public EventTag setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Subaccount ID of this event tag. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this event tag. This is a read-only field that can be left blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public EventTag setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party
   * JavaScript URL, or a third-party click-through URL for either impression or click tracking.
   * This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party
   * JavaScript URL, or a third-party click-through URL for either impression or click tracking.
   * This is a required field.
   * @param type type or {@code null} for none
   */
  public EventTag setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Payload URL for this event tag. The URL on a click-through event tag should have a landing page
   * URL appended to the end of it. This field is required on insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Payload URL for this event tag. The URL on a click-through event tag should have a landing page
   * URL appended to the end of it. This field is required on insertion.
   * @param url url or {@code null} for none
   */
  public EventTag setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * Number of times the landing page URL should be URL-escaped before being appended to the click-
   * through event tag URL. Only applies to click-through event tags as specified by the event tag
   * type.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUrlEscapeLevels() {
    return urlEscapeLevels;
  }

  /**
   * Number of times the landing page URL should be URL-escaped before being appended to the click-
   * through event tag URL. Only applies to click-through event tags as specified by the event tag
   * type.
   * @param urlEscapeLevels urlEscapeLevels or {@code null} for none
   */
  public EventTag setUrlEscapeLevels(java.lang.Integer urlEscapeLevels) {
    this.urlEscapeLevels = urlEscapeLevels;
    return this;
  }

  @Override
  public EventTag set(String fieldName, Object value) {
    return (EventTag) super.set(fieldName, value);
  }

  @Override
  public EventTag clone() {
    return (EventTag) super.clone();
  }

}
