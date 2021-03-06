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

package com.google.pubsub.model;

/**
 * A subscription resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscription extends com.google.api.client.json.GenericJson {

  /**
   * This value is the maximum time after a subscriber receives a message before the subscriber
   * should acknowledge the message. After message delivery but before the ack deadline expires and
   * before the message is acknowledged, it is an outstanding message and will not be delivered
   * again during that time (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10
   * minutes).
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   *
   * If this parameter is 0, a default value of 10 seconds is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ackDeadlineSeconds;

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushConfig pushConfig;

  /**
   * The name of the topic from which this subscription is receiving messages. The value of this
   * field will be `_deleted-topic_` if the topic has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * This value is the maximum time after a subscriber receives a message before the subscriber
   * should acknowledge the message. After message delivery but before the ack deadline expires and
   * before the message is acknowledged, it is an outstanding message and will not be delivered
   * again during that time (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10
   * minutes).
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   *
   * If this parameter is 0, a default value of 10 seconds is used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAckDeadlineSeconds() {
    return ackDeadlineSeconds;
  }

  /**
   * This value is the maximum time after a subscriber receives a message before the subscriber
   * should acknowledge the message. After message delivery but before the ack deadline expires and
   * before the message is acknowledged, it is an outstanding message and will not be delivered
   * again during that time (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10
   * minutes).
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   *
   * If this parameter is 0, a default value of 10 seconds is used.
   * @param ackDeadlineSeconds ackDeadlineSeconds or {@code null} for none
   */
  public Subscription setAckDeadlineSeconds(java.lang.Integer ackDeadlineSeconds) {
    this.ackDeadlineSeconds = ackDeadlineSeconds;
    return this;
  }

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @param name name or {@code null} for none
   */
  public Subscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * @return value or {@code null} for none
   */
  public PushConfig getPushConfig() {
    return pushConfig;
  }

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * @param pushConfig pushConfig or {@code null} for none
   */
  public Subscription setPushConfig(PushConfig pushConfig) {
    this.pushConfig = pushConfig;
    return this;
  }

  /**
   * The name of the topic from which this subscription is receiving messages. The value of this
   * field will be `_deleted-topic_` if the topic has been deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * The name of the topic from which this subscription is receiving messages. The value of this
   * field will be `_deleted-topic_` if the topic has been deleted.
   * @param topic topic or {@code null} for none
   */
  public Subscription setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public Subscription set(String fieldName, Object value) {
    return (Subscription) super.set(fieldName, value);
  }

  @Override
  public Subscription clone() {
    return (Subscription) super.clone();
  }

}
