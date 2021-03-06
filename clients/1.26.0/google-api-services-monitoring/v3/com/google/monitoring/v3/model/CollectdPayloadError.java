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

package com.google.monitoring.v3.model;

/**
 * Describes the error status for payloads that were not written.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CollectdPayloadError extends com.google.api.client.json.GenericJson {

  /**
   * Records the error status for the payload. If this field is present, the partial errors for
   * nested values won't be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * The zero-based index in CreateCollectdTimeSeriesRequest.collectd_payloads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Records the error status for values that were not written due to an error.Failed payloads for
   * which nothing is written will not include partial value errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CollectdValueError> valueErrors;

  /**
   * Records the error status for the payload. If this field is present, the partial errors for
   * nested values won't be populated.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Records the error status for the payload. If this field is present, the partial errors for
   * nested values won't be populated.
   * @param error error or {@code null} for none
   */
  public CollectdPayloadError setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * The zero-based index in CreateCollectdTimeSeriesRequest.collectd_payloads.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The zero-based index in CreateCollectdTimeSeriesRequest.collectd_payloads.
   * @param index index or {@code null} for none
   */
  public CollectdPayloadError setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Records the error status for values that were not written due to an error.Failed payloads for
   * which nothing is written will not include partial value errors.
   * @return value or {@code null} for none
   */
  public java.util.List<CollectdValueError> getValueErrors() {
    return valueErrors;
  }

  /**
   * Records the error status for values that were not written due to an error.Failed payloads for
   * which nothing is written will not include partial value errors.
   * @param valueErrors valueErrors or {@code null} for none
   */
  public CollectdPayloadError setValueErrors(java.util.List<CollectdValueError> valueErrors) {
    this.valueErrors = valueErrors;
    return this;
  }

  @Override
  public CollectdPayloadError set(String fieldName, Object value) {
    return (CollectdPayloadError) super.set(fieldName, value);
  }

  @Override
  public CollectdPayloadError clone() {
    return (CollectdPayloadError) super.clone();
  }

}
