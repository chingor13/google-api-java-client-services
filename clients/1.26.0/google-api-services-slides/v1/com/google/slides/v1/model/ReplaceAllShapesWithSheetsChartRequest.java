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
 * Replaces all shapes that match the given criteria with the provided Google Sheets chart. The
 * chart will be scaled and centered to fit within the bounds of the original shape.
 *
 * NOTE: Replacing shapes with a chart requires at least one of the spreadsheets.readonly,
 * spreadsheets, drive.readonly, or drive OAuth scopes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceAllShapesWithSheetsChartRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer chartId;

  /**
   * The criteria that the shapes must match in order to be replaced. The request will replace all
   * of the shapes that contain the given text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubstringMatchCriteria containsText;

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkingMode;

  /**
   * If non-empty, limits the matches to page elements only on the given pages.
   *
   * Returns a 400 bad request error if given the page object ID of a notes page or a notes master,
   * or if a page with that object ID doesn't exist in the presentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pageObjectIds;

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChartId() {
    return chartId;
  }

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * @param chartId chartId or {@code null} for none
   */
  public ReplaceAllShapesWithSheetsChartRequest setChartId(java.lang.Integer chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * The criteria that the shapes must match in order to be replaced. The request will replace all
   * of the shapes that contain the given text.
   * @return value or {@code null} for none
   */
  public SubstringMatchCriteria getContainsText() {
    return containsText;
  }

  /**
   * The criteria that the shapes must match in order to be replaced. The request will replace all
   * of the shapes that contain the given text.
   * @param containsText containsText or {@code null} for none
   */
  public ReplaceAllShapesWithSheetsChartRequest setContainsText(SubstringMatchCriteria containsText) {
    this.containsText = containsText;
    return this;
  }

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkingMode() {
    return linkingMode;
  }

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * @param linkingMode linkingMode or {@code null} for none
   */
  public ReplaceAllShapesWithSheetsChartRequest setLinkingMode(java.lang.String linkingMode) {
    this.linkingMode = linkingMode;
    return this;
  }

  /**
   * If non-empty, limits the matches to page elements only on the given pages.
   *
   * Returns a 400 bad request error if given the page object ID of a notes page or a notes master,
   * or if a page with that object ID doesn't exist in the presentation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPageObjectIds() {
    return pageObjectIds;
  }

  /**
   * If non-empty, limits the matches to page elements only on the given pages.
   *
   * Returns a 400 bad request error if given the page object ID of a notes page or a notes master,
   * or if a page with that object ID doesn't exist in the presentation.
   * @param pageObjectIds pageObjectIds or {@code null} for none
   */
  public ReplaceAllShapesWithSheetsChartRequest setPageObjectIds(java.util.List<java.lang.String> pageObjectIds) {
    this.pageObjectIds = pageObjectIds;
    return this;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public ReplaceAllShapesWithSheetsChartRequest setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  @Override
  public ReplaceAllShapesWithSheetsChartRequest set(String fieldName, Object value) {
    return (ReplaceAllShapesWithSheetsChartRequest) super.set(fieldName, value);
  }

  @Override
  public ReplaceAllShapesWithSheetsChartRequest clone() {
    return (ReplaceAllShapesWithSheetsChartRequest) super.clone();
  }

}