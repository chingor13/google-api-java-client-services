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

package com.google.doubleclickbidmanager.model;

/**
 * Request to run a stored query to generate a report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Report data range used to generate the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataRange;

  /**
   * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required
   * if dataRange is CUSTOM_DATES and ignored otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportDataEndTimeMs;

  /**
   * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is
   * required if dataRange is CUSTOM_DATES and ignored otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportDataStartTimeMs;

  /**
   * Canonical timezone code for report data time. Defaults to America/New_York.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timezoneCode;

  /**
   * Report data range used to generate the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataRange() {
    return dataRange;
  }

  /**
   * Report data range used to generate the report.
   * @param dataRange dataRange or {@code null} for none
   */
  public RunQueryRequest setDataRange(java.lang.String dataRange) {
    this.dataRange = dataRange;
    return this;
  }

  /**
   * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required
   * if dataRange is CUSTOM_DATES and ignored otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportDataEndTimeMs() {
    return reportDataEndTimeMs;
  }

  /**
   * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required
   * if dataRange is CUSTOM_DATES and ignored otherwise.
   * @param reportDataEndTimeMs reportDataEndTimeMs or {@code null} for none
   */
  public RunQueryRequest setReportDataEndTimeMs(java.lang.Long reportDataEndTimeMs) {
    this.reportDataEndTimeMs = reportDataEndTimeMs;
    return this;
  }

  /**
   * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is
   * required if dataRange is CUSTOM_DATES and ignored otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportDataStartTimeMs() {
    return reportDataStartTimeMs;
  }

  /**
   * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is
   * required if dataRange is CUSTOM_DATES and ignored otherwise.
   * @param reportDataStartTimeMs reportDataStartTimeMs or {@code null} for none
   */
  public RunQueryRequest setReportDataStartTimeMs(java.lang.Long reportDataStartTimeMs) {
    this.reportDataStartTimeMs = reportDataStartTimeMs;
    return this;
  }

  /**
   * Canonical timezone code for report data time. Defaults to America/New_York.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimezoneCode() {
    return timezoneCode;
  }

  /**
   * Canonical timezone code for report data time. Defaults to America/New_York.
   * @param timezoneCode timezoneCode or {@code null} for none
   */
  public RunQueryRequest setTimezoneCode(java.lang.String timezoneCode) {
    this.timezoneCode = timezoneCode;
    return this;
  }

  @Override
  public RunQueryRequest set(String fieldName, Object value) {
    return (RunQueryRequest) super.set(fieldName, value);
  }

  @Override
  public RunQueryRequest clone() {
    return (RunQueryRequest) super.clone();
  }

}
