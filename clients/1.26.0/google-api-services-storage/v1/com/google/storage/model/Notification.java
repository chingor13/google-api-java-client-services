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

package com.google.storage.model;

/**
 * A subscription to receive Google PubSub notifications.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Notification extends com.google.api.client.json.GenericJson {

  /**
   * An optional list of additional attributes to attach to each Cloud PubSub message published for
   * this notification subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("custom_attributes")
  private java.util.Map<String, java.lang.String> customAttributes;

  /**
   * HTTP 1.1 Entity tag for this subscription notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * If present, only send notifications about listed event types. If empty, sent notifications for
   * all event types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("event_types")
  private java.util.List<java.lang.String> eventTypes;

  /**
   * The ID of the notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The kind of item this is. For notifications, this is always storage#notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * If present, only apply this notification configuration to object names that begin with this
   * prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("object_name_prefix")
  private java.lang.String objectNamePrefix;

  /**
   * The desired content of the Payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("payload_format")
  private java.lang.String payloadFormat;

  /**
   * The canonical URL of this notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The Cloud PubSub topic to which this subscription publishes. Formatted as:
   * '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * An optional list of additional attributes to attach to each Cloud PubSub message published for
   * this notification subscription.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getCustomAttributes() {
    return customAttributes;
  }

  /**
   * An optional list of additional attributes to attach to each Cloud PubSub message published for
   * this notification subscription.
   * @param customAttributes customAttributes or {@code null} for none
   */
  public Notification setCustomAttributes(java.util.Map<String, java.lang.String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  /**
   * HTTP 1.1 Entity tag for this subscription notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * HTTP 1.1 Entity tag for this subscription notification.
   * @param etag etag or {@code null} for none
   */
  public Notification setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * If present, only send notifications about listed event types. If empty, sent notifications for
   * all event types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEventTypes() {
    return eventTypes;
  }

  /**
   * If present, only send notifications about listed event types. If empty, sent notifications for
   * all event types.
   * @param eventTypes eventTypes or {@code null} for none
   */
  public Notification setEventTypes(java.util.List<java.lang.String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  /**
   * The ID of the notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the notification.
   * @param id id or {@code null} for none
   */
  public Notification setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of item this is. For notifications, this is always storage#notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For notifications, this is always storage#notification.
   * @param kind kind or {@code null} for none
   */
  public Notification setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * If present, only apply this notification configuration to object names that begin with this
   * prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectNamePrefix() {
    return objectNamePrefix;
  }

  /**
   * If present, only apply this notification configuration to object names that begin with this
   * prefix.
   * @param objectNamePrefix objectNamePrefix or {@code null} for none
   */
  public Notification setObjectNamePrefix(java.lang.String objectNamePrefix) {
    this.objectNamePrefix = objectNamePrefix;
    return this;
  }

  /**
   * The desired content of the Payload.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayloadFormat() {
    return payloadFormat;
  }

  /**
   * The desired content of the Payload.
   * @param payloadFormat payloadFormat or {@code null} for none
   */
  public Notification setPayloadFormat(java.lang.String payloadFormat) {
    this.payloadFormat = payloadFormat;
    return this;
  }

  /**
   * The canonical URL of this notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The canonical URL of this notification.
   * @param selfLink selfLink or {@code null} for none
   */
  public Notification setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The Cloud PubSub topic to which this subscription publishes. Formatted as:
   * '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * The Cloud PubSub topic to which this subscription publishes. Formatted as:
   * '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}'
   * @param topic topic or {@code null} for none
   */
  public Notification setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public Notification set(String fieldName, Object value) {
    return (Notification) super.set(fieldName, value);
  }

  @Override
  public Notification clone() {
    return (Notification) super.clone();
  }

}