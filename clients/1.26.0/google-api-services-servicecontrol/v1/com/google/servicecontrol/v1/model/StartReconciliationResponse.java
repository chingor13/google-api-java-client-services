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

package com.google.servicecontrol.v1.model;

/**
 * Response message for QuotaController.StartReconciliation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartReconciliationResponse extends com.google.api.client.json.GenericJson {

  /**
   * The same operation_id value used in the StartReconciliationRequest. Used for logging and
   * diagnostics purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Metric values as tracked by One Platform before the start of reconciliation. The following
   * metrics will be included:
   *
   * 1. Per quota metric total usage will be specified using the following gauge metric:
   * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 2. Value for each quota limit associated with the metrics will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricValueSet> quotaMetrics;

  /**
   * Indicates the decision of the reconciliation start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuotaError> reconciliationErrors;

  /**
   * ID of the actual config used to process the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceConfigId;

  /**
   * The same operation_id value used in the StartReconciliationRequest. Used for logging and
   * diagnostics purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * The same operation_id value used in the StartReconciliationRequest. Used for logging and
   * diagnostics purposes.
   * @param operationId operationId or {@code null} for none
   */
  public StartReconciliationResponse setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Metric values as tracked by One Platform before the start of reconciliation. The following
   * metrics will be included:
   *
   * 1. Per quota metric total usage will be specified using the following gauge metric:
   * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 2. Value for each quota limit associated with the metrics will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * @return value or {@code null} for none
   */
  public java.util.List<MetricValueSet> getQuotaMetrics() {
    return quotaMetrics;
  }

  /**
   * Metric values as tracked by One Platform before the start of reconciliation. The following
   * metrics will be included:
   *
   * 1. Per quota metric total usage will be specified using the following gauge metric:
   * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 2. Value for each quota limit associated with the metrics will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * @param quotaMetrics quotaMetrics or {@code null} for none
   */
  public StartReconciliationResponse setQuotaMetrics(java.util.List<MetricValueSet> quotaMetrics) {
    this.quotaMetrics = quotaMetrics;
    return this;
  }

  /**
   * Indicates the decision of the reconciliation start.
   * @return value or {@code null} for none
   */
  public java.util.List<QuotaError> getReconciliationErrors() {
    return reconciliationErrors;
  }

  /**
   * Indicates the decision of the reconciliation start.
   * @param reconciliationErrors reconciliationErrors or {@code null} for none
   */
  public StartReconciliationResponse setReconciliationErrors(java.util.List<QuotaError> reconciliationErrors) {
    this.reconciliationErrors = reconciliationErrors;
    return this;
  }

  /**
   * ID of the actual config used to process the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * ID of the actual config used to process the request.
   * @param serviceConfigId serviceConfigId or {@code null} for none
   */
  public StartReconciliationResponse setServiceConfigId(java.lang.String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  @Override
  public StartReconciliationResponse set(String fieldName, Object value) {
    return (StartReconciliationResponse) super.set(fieldName, value);
  }

  @Override
  public StartReconciliationResponse clone() {
    return (StartReconciliationResponse) super.clone();
  }

}
