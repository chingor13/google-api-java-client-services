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

package com.google.games.model;

/**
 * This is a JSON template for aggregate stats.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AggregateStats extends com.google.api.client.json.GenericJson {

  /**
   * The number of messages sent between a pair of peers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#aggregateStats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The maximum amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long max;

  /**
   * The minimum amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long min;

  /**
   * The total number of bytes sent for messages between a pair of peers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sum;

  /**
   * The number of messages sent between a pair of peers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * The number of messages sent between a pair of peers.
   * @param count count or {@code null} for none
   */
  public AggregateStats setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#aggregateStats.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#aggregateStats.
   * @param kind kind or {@code null} for none
   */
  public AggregateStats setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The maximum amount.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMax() {
    return max;
  }

  /**
   * The maximum amount.
   * @param max max or {@code null} for none
   */
  public AggregateStats setMax(java.lang.Long max) {
    this.max = max;
    return this;
  }

  /**
   * The minimum amount.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMin() {
    return min;
  }

  /**
   * The minimum amount.
   * @param min min or {@code null} for none
   */
  public AggregateStats setMin(java.lang.Long min) {
    this.min = min;
    return this;
  }

  /**
   * The total number of bytes sent for messages between a pair of peers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSum() {
    return sum;
  }

  /**
   * The total number of bytes sent for messages between a pair of peers.
   * @param sum sum or {@code null} for none
   */
  public AggregateStats setSum(java.lang.Long sum) {
    this.sum = sum;
    return this;
  }

  @Override
  public AggregateStats set(String fieldName, Object value) {
    return (AggregateStats) super.set(fieldName, value);
  }

  @Override
  public AggregateStats clone() {
    return (AggregateStats) super.clone();
  }

}
