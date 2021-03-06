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
 * Represents the status of upload.
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
public final class UploadStatus extends com.google.api.client.json.GenericJson {

  /**
   * Reasons why upload can't be completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> errors;

  /**
   * Per-row upload status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RowStatus> rowStatus;

  static {
    // hack to force ProGuard to consider RowStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RowStatus.class);
  }

  /**
   * Reasons why upload can't be completed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getErrors() {
    return errors;
  }

  /**
   * Reasons why upload can't be completed.
   * @param errors errors or {@code null} for none
   */
  public UploadStatus setErrors(java.util.List<java.lang.String> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Per-row upload status.
   * @return value or {@code null} for none
   */
  public java.util.List<RowStatus> getRowStatus() {
    return rowStatus;
  }

  /**
   * Per-row upload status.
   * @param rowStatus rowStatus or {@code null} for none
   */
  public UploadStatus setRowStatus(java.util.List<RowStatus> rowStatus) {
    this.rowStatus = rowStatus;
    return this;
  }

  @Override
  public UploadStatus set(String fieldName, Object value) {
    return (UploadStatus) super.set(fieldName, value);
  }

  @Override
  public UploadStatus clone() {
    return (UploadStatus) super.clone();
  }

}
