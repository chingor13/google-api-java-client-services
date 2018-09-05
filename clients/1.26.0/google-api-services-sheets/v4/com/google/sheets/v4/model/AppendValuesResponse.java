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

package com.google.sheets.v4.model;

/**
 * The response when updating a range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppendValuesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The spreadsheet the updates were applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The range (in A1 notation) of the table that values are being appended to (before the values
   * were appended). Empty if no table was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableRange;

  /**
   * Information about the updates that were applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpdateValuesResponse updates;

  /**
   * The spreadsheet the updates were applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public AppendValuesResponse setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  /**
   * The range (in A1 notation) of the table that values are being appended to (before the values
   * were appended). Empty if no table was found.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableRange() {
    return tableRange;
  }

  /**
   * The range (in A1 notation) of the table that values are being appended to (before the values
   * were appended). Empty if no table was found.
   * @param tableRange tableRange or {@code null} for none
   */
  public AppendValuesResponse setTableRange(java.lang.String tableRange) {
    this.tableRange = tableRange;
    return this;
  }

  /**
   * Information about the updates that were applied.
   * @return value or {@code null} for none
   */
  public UpdateValuesResponse getUpdates() {
    return updates;
  }

  /**
   * Information about the updates that were applied.
   * @param updates updates or {@code null} for none
   */
  public AppendValuesResponse setUpdates(UpdateValuesResponse updates) {
    this.updates = updates;
    return this;
  }

  @Override
  public AppendValuesResponse set(String fieldName, Object value) {
    return (AppendValuesResponse) super.set(fieldName, value);
  }

  @Override
  public AppendValuesResponse clone() {
    return (AppendValuesResponse) super.clone();
  }

}