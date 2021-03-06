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

package com.google.dfareporting.model;

/**
 * Delivery Schedule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeliverySchedule extends com.google.api.client.json.GenericJson {

  /**
   * Limit on the number of times an individual user can be served the ad within a specified period
   * of time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FrequencyCap frequencyCap;

  /**
   * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and
   * time. Otherwise the ad will continue to be served until it has reached its delivery goals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hardCutoff;

  /**
   * Impression ratio for this ad. This ratio determines how often each ad is served relative to the
   * others. For example, if ad A has an impression ratio of 1 and ad B has an impression ratio of
   * 3, then Campaign Manager will serve ad B three times as often as ad A. Acceptable values are 1
   * to 10, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long impressionRatio;

  /**
   * Serving priority of an ad, with respect to other ads. The lower the priority number, the
   * greater the priority with which it is served.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priority;

  /**
   * Limit on the number of times an individual user can be served the ad within a specified period
   * of time.
   * @return value or {@code null} for none
   */
  public FrequencyCap getFrequencyCap() {
    return frequencyCap;
  }

  /**
   * Limit on the number of times an individual user can be served the ad within a specified period
   * of time.
   * @param frequencyCap frequencyCap or {@code null} for none
   */
  public DeliverySchedule setFrequencyCap(FrequencyCap frequencyCap) {
    this.frequencyCap = frequencyCap;
    return this;
  }

  /**
   * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and
   * time. Otherwise the ad will continue to be served until it has reached its delivery goals.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHardCutoff() {
    return hardCutoff;
  }

  /**
   * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and
   * time. Otherwise the ad will continue to be served until it has reached its delivery goals.
   * @param hardCutoff hardCutoff or {@code null} for none
   */
  public DeliverySchedule setHardCutoff(java.lang.Boolean hardCutoff) {
    this.hardCutoff = hardCutoff;
    return this;
  }

  /**
   * Impression ratio for this ad. This ratio determines how often each ad is served relative to the
   * others. For example, if ad A has an impression ratio of 1 and ad B has an impression ratio of
   * 3, then Campaign Manager will serve ad B three times as often as ad A. Acceptable values are 1
   * to 10, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getImpressionRatio() {
    return impressionRatio;
  }

  /**
   * Impression ratio for this ad. This ratio determines how often each ad is served relative to the
   * others. For example, if ad A has an impression ratio of 1 and ad B has an impression ratio of
   * 3, then Campaign Manager will serve ad B three times as often as ad A. Acceptable values are 1
   * to 10, inclusive.
   * @param impressionRatio impressionRatio or {@code null} for none
   */
  public DeliverySchedule setImpressionRatio(java.lang.Long impressionRatio) {
    this.impressionRatio = impressionRatio;
    return this;
  }

  /**
   * Serving priority of an ad, with respect to other ads. The lower the priority number, the
   * greater the priority with which it is served.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriority() {
    return priority;
  }

  /**
   * Serving priority of an ad, with respect to other ads. The lower the priority number, the
   * greater the priority with which it is served.
   * @param priority priority or {@code null} for none
   */
  public DeliverySchedule setPriority(java.lang.String priority) {
    this.priority = priority;
    return this;
  }

  @Override
  public DeliverySchedule set(String fieldName, Object value) {
    return (DeliverySchedule) super.set(fieldName, value);
  }

  @Override
  public DeliverySchedule clone() {
    return (DeliverySchedule) super.clone();
  }

}
