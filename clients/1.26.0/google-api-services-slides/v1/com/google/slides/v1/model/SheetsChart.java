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

package com.google.slides.v1.model;

/**
 * A PageElement kind representing a linked chart embedded from Google Sheets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SheetsChart extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet that is embedded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer chartId;

  /**
   * The URL of an image of the embedded chart, with a default lifetime of 30 minutes. This URL is
   * tagged with the account of the requester. Anyone with the URL effectively accesses the image as
   * the original requester. Access to the image may be lost if the presentation's sharing settings
   * change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentUrl;

  /**
   * The properties of the Sheets chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SheetsChartProperties sheetsChartProperties;

  /**
   * The ID of the Google Sheets spreadsheet that contains the source chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet that is embedded.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChartId() {
    return chartId;
  }

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet that is embedded.
   * @param chartId chartId or {@code null} for none
   */
  public SheetsChart setChartId(java.lang.Integer chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * The URL of an image of the embedded chart, with a default lifetime of 30 minutes. This URL is
   * tagged with the account of the requester. Anyone with the URL effectively accesses the image as
   * the original requester. Access to the image may be lost if the presentation's sharing settings
   * change.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentUrl() {
    return contentUrl;
  }

  /**
   * The URL of an image of the embedded chart, with a default lifetime of 30 minutes. This URL is
   * tagged with the account of the requester. Anyone with the URL effectively accesses the image as
   * the original requester. Access to the image may be lost if the presentation's sharing settings
   * change.
   * @param contentUrl contentUrl or {@code null} for none
   */
  public SheetsChart setContentUrl(java.lang.String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The properties of the Sheets chart.
   * @return value or {@code null} for none
   */
  public SheetsChartProperties getSheetsChartProperties() {
    return sheetsChartProperties;
  }

  /**
   * The properties of the Sheets chart.
   * @param sheetsChartProperties sheetsChartProperties or {@code null} for none
   */
  public SheetsChart setSheetsChartProperties(SheetsChartProperties sheetsChartProperties) {
    this.sheetsChartProperties = sheetsChartProperties;
    return this;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the source chart.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the source chart.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public SheetsChart setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  @Override
  public SheetsChart set(String fieldName, Object value) {
    return (SheetsChart) super.set(fieldName, value);
  }

  @Override
  public SheetsChart clone() {
    return (SheetsChart) super.clone();
  }

}
