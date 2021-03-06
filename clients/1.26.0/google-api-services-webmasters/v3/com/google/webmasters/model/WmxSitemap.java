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

package com.google.webmasters.model;

/**
 * Contains detailed information about a specific URL submitted as a sitemap.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Console API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WmxSitemap extends com.google.api.client.json.GenericJson {

  /**
   * The various content types in the sitemap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WmxSitemapContent> contents;

  /**
   * Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed
   * before it can be processed correctly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long errors;

  /**
   * If true, the sitemap has not been processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPending;

  /**
   * If true, the sitemap is a collection of sitemaps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSitemapsIndex;

  /**
   * Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-
   * mm-dd).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastDownloaded;

  /**
   * Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-
   * dd).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastSubmitted;

  /**
   * The url of the sitemap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The type of the sitemap. For example: rssFeed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Number of warnings for the sitemap. These are generally non-critical issues with URLs in the
   * sitemaps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long warnings;

  /**
   * The various content types in the sitemap.
   * @return value or {@code null} for none
   */
  public java.util.List<WmxSitemapContent> getContents() {
    return contents;
  }

  /**
   * The various content types in the sitemap.
   * @param contents contents or {@code null} for none
   */
  public WmxSitemap setContents(java.util.List<WmxSitemapContent> contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed
   * before it can be processed correctly.
   * @return value or {@code null} for none
   */
  public java.lang.Long getErrors() {
    return errors;
  }

  /**
   * Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed
   * before it can be processed correctly.
   * @param errors errors or {@code null} for none
   */
  public WmxSitemap setErrors(java.lang.Long errors) {
    this.errors = errors;
    return this;
  }

  /**
   * If true, the sitemap has not been processed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPending() {
    return isPending;
  }

  /**
   * If true, the sitemap has not been processed.
   * @param isPending isPending or {@code null} for none
   */
  public WmxSitemap setIsPending(java.lang.Boolean isPending) {
    this.isPending = isPending;
    return this;
  }

  /**
   * If true, the sitemap is a collection of sitemaps.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSitemapsIndex() {
    return isSitemapsIndex;
  }

  /**
   * If true, the sitemap is a collection of sitemaps.
   * @param isSitemapsIndex isSitemapsIndex or {@code null} for none
   */
  public WmxSitemap setIsSitemapsIndex(java.lang.Boolean isSitemapsIndex) {
    this.isSitemapsIndex = isSitemapsIndex;
    return this;
  }

  /**
   * Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-
   * mm-dd).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastDownloaded() {
    return lastDownloaded;
  }

  /**
   * Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-
   * mm-dd).
   * @param lastDownloaded lastDownloaded or {@code null} for none
   */
  public WmxSitemap setLastDownloaded(com.google.api.client.util.DateTime lastDownloaded) {
    this.lastDownloaded = lastDownloaded;
    return this;
  }

  /**
   * Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-
   * dd).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastSubmitted() {
    return lastSubmitted;
  }

  /**
   * Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-
   * dd).
   * @param lastSubmitted lastSubmitted or {@code null} for none
   */
  public WmxSitemap setLastSubmitted(com.google.api.client.util.DateTime lastSubmitted) {
    this.lastSubmitted = lastSubmitted;
    return this;
  }

  /**
   * The url of the sitemap.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The url of the sitemap.
   * @param path path or {@code null} for none
   */
  public WmxSitemap setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The type of the sitemap. For example: rssFeed.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the sitemap. For example: rssFeed.
   * @param type type or {@code null} for none
   */
  public WmxSitemap setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Number of warnings for the sitemap. These are generally non-critical issues with URLs in the
   * sitemaps.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWarnings() {
    return warnings;
  }

  /**
   * Number of warnings for the sitemap. These are generally non-critical issues with URLs in the
   * sitemaps.
   * @param warnings warnings or {@code null} for none
   */
  public WmxSitemap setWarnings(java.lang.Long warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public WmxSitemap set(String fieldName, Object value) {
    return (WmxSitemap) super.set(fieldName, value);
  }

  @Override
  public WmxSitemap clone() {
    return (WmxSitemap) super.clone();
  }

}
