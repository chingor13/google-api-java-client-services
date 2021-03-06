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
 * Site Settings
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
public final class SiteSettings extends com.google.api.client.json.GenericJson {

  /**
   * Whether active view creatives are disabled for this site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean activeViewOptOut;

  /**
   * Whether this site opts out of ad blocking. When true, ad blocking is disabled for all
   * placements under the site, regardless of the individual placement settings. When false, the
   * campaign and placement settings take effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adBlockingOptOut;

  /**
   * Site-wide creative settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreativeSettings creativeSettings;

  /**
   * Whether new cookies are disabled for this site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableNewCookie;

  /**
   * Lookback window settings for this site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LookbackConfiguration lookbackConfiguration;

  /**
   * Configuration settings for dynamic and image floodlight tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TagSetting tagSetting;

  /**
   * Whether Verification and ActiveView for in-stream video creatives are disabled by default for
   * new placements created under this site. This value will be used to populate the
   * placement.videoActiveViewOptOut field, when no value is specified for the new placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean videoActiveViewOptOutTemplate;

  /**
   * Default VPAID adapter setting for new placements created under this site. This value will be
   * used to populate the placements.vpaidAdapterChoice field, when no value is specified for the
   * new placement. Controls which VPAID format the measurement adapter will use for in-stream video
   * creatives assigned to the placement. The publisher's specifications will typically determine
   * this setting. For VPAID creatives, the adapter format will match the VPAID format (HTML5 VPAID
   * creatives use the HTML5 adapter).
   *
   * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values
   * are provided: FLASH, BOTH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpaidAdapterChoiceTemplate;

  /**
   * Whether active view creatives are disabled for this site.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActiveViewOptOut() {
    return activeViewOptOut;
  }

  /**
   * Whether active view creatives are disabled for this site.
   * @param activeViewOptOut activeViewOptOut or {@code null} for none
   */
  public SiteSettings setActiveViewOptOut(java.lang.Boolean activeViewOptOut) {
    this.activeViewOptOut = activeViewOptOut;
    return this;
  }

  /**
   * Whether this site opts out of ad blocking. When true, ad blocking is disabled for all
   * placements under the site, regardless of the individual placement settings. When false, the
   * campaign and placement settings take effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdBlockingOptOut() {
    return adBlockingOptOut;
  }

  /**
   * Whether this site opts out of ad blocking. When true, ad blocking is disabled for all
   * placements under the site, regardless of the individual placement settings. When false, the
   * campaign and placement settings take effect.
   * @param adBlockingOptOut adBlockingOptOut or {@code null} for none
   */
  public SiteSettings setAdBlockingOptOut(java.lang.Boolean adBlockingOptOut) {
    this.adBlockingOptOut = adBlockingOptOut;
    return this;
  }

  /**
   * Site-wide creative settings.
   * @return value or {@code null} for none
   */
  public CreativeSettings getCreativeSettings() {
    return creativeSettings;
  }

  /**
   * Site-wide creative settings.
   * @param creativeSettings creativeSettings or {@code null} for none
   */
  public SiteSettings setCreativeSettings(CreativeSettings creativeSettings) {
    this.creativeSettings = creativeSettings;
    return this;
  }

  /**
   * Whether new cookies are disabled for this site.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableNewCookie() {
    return disableNewCookie;
  }

  /**
   * Whether new cookies are disabled for this site.
   * @param disableNewCookie disableNewCookie or {@code null} for none
   */
  public SiteSettings setDisableNewCookie(java.lang.Boolean disableNewCookie) {
    this.disableNewCookie = disableNewCookie;
    return this;
  }

  /**
   * Lookback window settings for this site.
   * @return value or {@code null} for none
   */
  public LookbackConfiguration getLookbackConfiguration() {
    return lookbackConfiguration;
  }

  /**
   * Lookback window settings for this site.
   * @param lookbackConfiguration lookbackConfiguration or {@code null} for none
   */
  public SiteSettings setLookbackConfiguration(LookbackConfiguration lookbackConfiguration) {
    this.lookbackConfiguration = lookbackConfiguration;
    return this;
  }

  /**
   * Configuration settings for dynamic and image floodlight tags.
   * @return value or {@code null} for none
   */
  public TagSetting getTagSetting() {
    return tagSetting;
  }

  /**
   * Configuration settings for dynamic and image floodlight tags.
   * @param tagSetting tagSetting or {@code null} for none
   */
  public SiteSettings setTagSetting(TagSetting tagSetting) {
    this.tagSetting = tagSetting;
    return this;
  }

  /**
   * Whether Verification and ActiveView for in-stream video creatives are disabled by default for
   * new placements created under this site. This value will be used to populate the
   * placement.videoActiveViewOptOut field, when no value is specified for the new placement.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVideoActiveViewOptOutTemplate() {
    return videoActiveViewOptOutTemplate;
  }

  /**
   * Whether Verification and ActiveView for in-stream video creatives are disabled by default for
   * new placements created under this site. This value will be used to populate the
   * placement.videoActiveViewOptOut field, when no value is specified for the new placement.
   * @param videoActiveViewOptOutTemplate videoActiveViewOptOutTemplate or {@code null} for none
   */
  public SiteSettings setVideoActiveViewOptOutTemplate(java.lang.Boolean videoActiveViewOptOutTemplate) {
    this.videoActiveViewOptOutTemplate = videoActiveViewOptOutTemplate;
    return this;
  }

  /**
   * Default VPAID adapter setting for new placements created under this site. This value will be
   * used to populate the placements.vpaidAdapterChoice field, when no value is specified for the
   * new placement. Controls which VPAID format the measurement adapter will use for in-stream video
   * creatives assigned to the placement. The publisher's specifications will typically determine
   * this setting. For VPAID creatives, the adapter format will match the VPAID format (HTML5 VPAID
   * creatives use the HTML5 adapter).
   *
   * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values
   * are provided: FLASH, BOTH.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpaidAdapterChoiceTemplate() {
    return vpaidAdapterChoiceTemplate;
  }

  /**
   * Default VPAID adapter setting for new placements created under this site. This value will be
   * used to populate the placements.vpaidAdapterChoice field, when no value is specified for the
   * new placement. Controls which VPAID format the measurement adapter will use for in-stream video
   * creatives assigned to the placement. The publisher's specifications will typically determine
   * this setting. For VPAID creatives, the adapter format will match the VPAID format (HTML5 VPAID
   * creatives use the HTML5 adapter).
   *
   * Note: Flash is no longer supported. This field now defaults to HTML5 when the following values
   * are provided: FLASH, BOTH.
   * @param vpaidAdapterChoiceTemplate vpaidAdapterChoiceTemplate or {@code null} for none
   */
  public SiteSettings setVpaidAdapterChoiceTemplate(java.lang.String vpaidAdapterChoiceTemplate) {
    this.vpaidAdapterChoiceTemplate = vpaidAdapterChoiceTemplate;
    return this;
  }

  @Override
  public SiteSettings set(String fieldName, Object value) {
    return (SiteSettings) super.set(fieldName, value);
  }

  @Override
  public SiteSettings clone() {
    return (SiteSettings) super.clone();
  }

}
