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

package com.google.logging.v2beta1.model;

/**
 * An individual entry in a log.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRequest httpRequest;

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which can be removed. If omitted in new log entries, then Logging assigns its own
   * unique identifier. The insert_id is also used to order log entries that have the same timestamp
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertId;

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> jsonPayload;

  /**
   * Optional. A set of user-defined (key, value) data that provides additional information about
   * the log entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may optionally be used in place of PROJECT_ID. The  project number is translated
   * to its corresponding PROJECT_ID internally  and the log_name field will contain PROJECT_ID in
   * queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". [LOG_ID] must
   * be less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logName;

  /**
   * Output only. Additional metadata about the monitored resource. Only k8s_container, k8s_pod, and
   * k8s_node MonitoredResources have this field populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResourceMetadata metadata;

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntryOperation operation;

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> protoPayload;

  /**
   * Output only. The time the log entry was received by Logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String receiveTimestamp;

  /**
   * Required. The primary monitored resource associated with this log entry. Example: a log entry
   * that reports a database error would be associated with the monitored resource designating the
   * particular database that reported the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource resource;

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntrySourceLocation sourceLocation;

  /**
   * Optional. The span ID within the trace associated with the log entry. For Trace spans, this is
   * the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an 8-byte
   * array, such as "000000000000004a".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spanId;

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textPayload;

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries should have timestamps that are no more than the logs retention
   * period in the past, and no more than 24 hours in the future. Log entries outside those time
   * boundaries will not be available when calling entries.list, but those log entries can still be
   * exported with LogSinks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If it contains a
   * relative resource name, the name is assumed to be relative to //tracing.googleapis.com.
   * Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trace;

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @return value or {@code null} for none
   */
  public HttpRequest getHttpRequest() {
    return httpRequest;
  }

  /**
   * Optional. Information about the HTTP request associated with this log entry, if applicable.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public LogEntry setHttpRequest(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which can be removed. If omitted in new log entries, then Logging assigns its own
   * unique identifier. The insert_id is also used to order log entries that have the same timestamp
   * value.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertId() {
    return insertId;
  }

  /**
   * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers
   * other log entries in the same project, with the same timestamp, and with the same insert_id to
   * be duplicates which can be removed. If omitted in new log entries, then Logging assigns its own
   * unique identifier. The insert_id is also used to order log entries that have the same timestamp
   * value.
   * @param insertId insertId or {@code null} for none
   */
  public LogEntry setInsertId(java.lang.String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getJsonPayload() {
    return jsonPayload;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @param jsonPayload jsonPayload or {@code null} for none
   */
  public LogEntry setJsonPayload(java.util.Map<String, java.lang.Object> jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

  /**
   * Optional. A set of user-defined (key, value) data that provides additional information about
   * the log entry.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. A set of user-defined (key, value) data that provides additional information about
   * the log entry.
   * @param labels labels or {@code null} for none
   */
  public LogEntry setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may optionally be used in place of PROJECT_ID. The  project number is translated
   * to its corresponding PROJECT_ID internally  and the log_name field will contain PROJECT_ID in
   * queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". [LOG_ID] must
   * be less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogName() {
    return logName;
  }

  /**
   * Required. The resource name of the log to which this log entry belongs:
   * "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A
   * project number may optionally be used in place of PROJECT_ID. The  project number is translated
   * to its corresponding PROJECT_ID internally  and the log_name field will contain PROJECT_ID in
   * queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
   * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". [LOG_ID] must
   * be less than 512 characters long and can only include the following characters: upper and lower
   * case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward
   * compatibility, if log_name begins with a forward-slash, such as /projects/..., then the log
   * entry is ingested as usual but the forward-slash is removed. Listing the log entry will not
   * show the leading slash and filtering for a log name with a leading slash will never return any
   * results.
   * @param logName logName or {@code null} for none
   */
  public LogEntry setLogName(java.lang.String logName) {
    this.logName = logName;
    return this;
  }

  /**
   * Output only. Additional metadata about the monitored resource. Only k8s_container, k8s_pod, and
   * k8s_node MonitoredResources have this field populated.
   * @return value or {@code null} for none
   */
  public MonitoredResourceMetadata getMetadata() {
    return metadata;
  }

  /**
   * Output only. Additional metadata about the monitored resource. Only k8s_container, k8s_pod, and
   * k8s_node MonitoredResources have this field populated.
   * @param metadata metadata or {@code null} for none
   */
  public LogEntry setMetadata(MonitoredResourceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @return value or {@code null} for none
   */
  public LogEntryOperation getOperation() {
    return operation;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @param operation operation or {@code null} for none
   */
  public LogEntry setOperation(LogEntryOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getProtoPayload() {
    return protoPayload;
  }

  /**
   * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services
   * use this field for their log entry payloads.
   * @param protoPayload protoPayload or {@code null} for none
   */
  public LogEntry setProtoPayload(java.util.Map<String, java.lang.Object> protoPayload) {
    this.protoPayload = protoPayload;
    return this;
  }

  /**
   * Output only. The time the log entry was received by Logging.
   * @return value or {@code null} for none
   */
  public String getReceiveTimestamp() {
    return receiveTimestamp;
  }

  /**
   * Output only. The time the log entry was received by Logging.
   * @param receiveTimestamp receiveTimestamp or {@code null} for none
   */
  public LogEntry setReceiveTimestamp(String receiveTimestamp) {
    this.receiveTimestamp = receiveTimestamp;
    return this;
  }

  /**
   * Required. The primary monitored resource associated with this log entry. Example: a log entry
   * that reports a database error would be associated with the monitored resource designating the
   * particular database that reported the error.
   * @return value or {@code null} for none
   */
  public MonitoredResource getResource() {
    return resource;
  }

  /**
   * Required. The primary monitored resource associated with this log entry. Example: a log entry
   * that reports a database error would be associated with the monitored resource designating the
   * particular database that reported the error.
   * @param resource resource or {@code null} for none
   */
  public LogEntry setResource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT.
   * @param severity severity or {@code null} for none
   */
  public LogEntry setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @return value or {@code null} for none
   */
  public LogEntrySourceLocation getSourceLocation() {
    return sourceLocation;
  }

  /**
   * Optional. Source code location information associated with the log entry, if any.
   * @param sourceLocation sourceLocation or {@code null} for none
   */
  public LogEntry setSourceLocation(LogEntrySourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * Optional. The span ID within the trace associated with the log entry. For Trace spans, this is
   * the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an 8-byte
   * array, such as "000000000000004a".
   * @return value or {@code null} for none
   */
  public java.lang.String getSpanId() {
    return spanId;
  }

  /**
   * Optional. The span ID within the trace associated with the log entry. For Trace spans, this is
   * the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an 8-byte
   * array, such as "000000000000004a".
   * @param spanId spanId or {@code null} for none
   */
  public LogEntry setSpanId(java.lang.String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @return value or {@code null} for none
   */
  public java.lang.String getTextPayload() {
    return textPayload;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @param textPayload textPayload or {@code null} for none
   */
  public LogEntry setTextPayload(java.lang.String textPayload) {
    this.textPayload = textPayload;
    return this;
  }

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries should have timestamps that are no more than the logs retention
   * period in the past, and no more than 24 hours in the future. Log entries outside those time
   * boundaries will not be available when calling entries.list, but those log entries can still be
   * exported with LogSinks.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Optional. The time the event described by the log entry occurred. This time is used to compute
   * the log entry's age and to enforce the logs retention period. If this field is omitted in a new
   * log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but
   * trailing zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.Incoming log entries should have timestamps that are no more than the logs retention
   * period in the past, and no more than 24 hours in the future. Log entries outside those time
   * boundaries will not be available when calling entries.list, but those log entries can still be
   * exported with LogSinks.
   * @param timestamp timestamp or {@code null} for none
   */
  public LogEntry setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If it contains a
   * relative resource name, the name is assumed to be relative to //tracing.googleapis.com.
   * Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
   * @return value or {@code null} for none
   */
  public java.lang.String getTrace() {
    return trace;
  }

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If it contains a
   * relative resource name, the name is assumed to be relative to //tracing.googleapis.com.
   * Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
   * @param trace trace or {@code null} for none
   */
  public LogEntry setTrace(java.lang.String trace) {
    this.trace = trace;
    return this;
  }

  @Override
  public LogEntry set(String fieldName, Object value) {
    return (LogEntry) super.set(fieldName, value);
  }

  @Override
  public LogEntry clone() {
    return (LogEntry) super.clone();
  }

}
