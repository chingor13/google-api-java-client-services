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
 * Distribution represents a frequency distribution of double-valued sample points. It contains the
 * size of the population of sample points plus additional optional information:
 *
 *   - the arithmetic mean of the samples   - the minimum and maximum of the samples   - the sum-
 * squared-deviation of the samples, used to compute variance   - a histogram of the values of the
 * sample points
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Distribution extends com.google.api.client.json.GenericJson {

  /**
   * The number of samples in each histogram bucket. `bucket_counts` are optional. If present, they
   * must sum to the `count` value.
   *
   * The buckets are defined below in `bucket_option`. There are N buckets. `bucket_counts[0]` is
   * the number of samples in the underflow bucket. `bucket_counts[1]` to `bucket_counts[N-1]` are
   * the numbers of samples in each of the finite buckets. And `bucket_counts[N] is the number of
   * samples in the overflow bucket. See the comments of `bucket_option` below for more details.
   *
   * Any suffix of trailing zeros may be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> bucketCounts;

  /**
   * The total number of samples in the distribution. Must be >= 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Buckets with arbitrary user-provided width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExplicitBuckets explicitBuckets;

  /**
   * Buckets with exponentially growing width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExponentialBuckets exponentialBuckets;

  /**
   * Buckets with constant width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LinearBuckets linearBuckets;

  /**
   * The maximum of the population of values. Ignored if `count` is zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maximum;

  /**
   * The arithmetic mean of the samples in the distribution. If `count` is zero then this field must
   * be zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double mean;

  /**
   * The minimum of the population of values. Ignored if `count` is zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minimum;

  /**
   * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i - mean)^2) where each x_i
   * is a sample values. If `count` is zero then this field must be zero, otherwise validation of
   * the request fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double sumOfSquaredDeviation;

  /**
   * The number of samples in each histogram bucket. `bucket_counts` are optional. If present, they
   * must sum to the `count` value.
   *
   * The buckets are defined below in `bucket_option`. There are N buckets. `bucket_counts[0]` is
   * the number of samples in the underflow bucket. `bucket_counts[1]` to `bucket_counts[N-1]` are
   * the numbers of samples in each of the finite buckets. And `bucket_counts[N] is the number of
   * samples in the overflow bucket. See the comments of `bucket_option` below for more details.
   *
   * Any suffix of trailing zeros may be omitted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getBucketCounts() {
    return bucketCounts;
  }

  /**
   * The number of samples in each histogram bucket. `bucket_counts` are optional. If present, they
   * must sum to the `count` value.
   *
   * The buckets are defined below in `bucket_option`. There are N buckets. `bucket_counts[0]` is
   * the number of samples in the underflow bucket. `bucket_counts[1]` to `bucket_counts[N-1]` are
   * the numbers of samples in each of the finite buckets. And `bucket_counts[N] is the number of
   * samples in the overflow bucket. See the comments of `bucket_option` below for more details.
   *
   * Any suffix of trailing zeros may be omitted.
   * @param bucketCounts bucketCounts or {@code null} for none
   */
  public Distribution setBucketCounts(java.util.List<java.lang.Long> bucketCounts) {
    this.bucketCounts = bucketCounts;
    return this;
  }

  /**
   * The total number of samples in the distribution. Must be >= 0.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * The total number of samples in the distribution. Must be >= 0.
   * @param count count or {@code null} for none
   */
  public Distribution setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Buckets with arbitrary user-provided width.
   * @return value or {@code null} for none
   */
  public ExplicitBuckets getExplicitBuckets() {
    return explicitBuckets;
  }

  /**
   * Buckets with arbitrary user-provided width.
   * @param explicitBuckets explicitBuckets or {@code null} for none
   */
  public Distribution setExplicitBuckets(ExplicitBuckets explicitBuckets) {
    this.explicitBuckets = explicitBuckets;
    return this;
  }

  /**
   * Buckets with exponentially growing width.
   * @return value or {@code null} for none
   */
  public ExponentialBuckets getExponentialBuckets() {
    return exponentialBuckets;
  }

  /**
   * Buckets with exponentially growing width.
   * @param exponentialBuckets exponentialBuckets or {@code null} for none
   */
  public Distribution setExponentialBuckets(ExponentialBuckets exponentialBuckets) {
    this.exponentialBuckets = exponentialBuckets;
    return this;
  }

  /**
   * Buckets with constant width.
   * @return value or {@code null} for none
   */
  public LinearBuckets getLinearBuckets() {
    return linearBuckets;
  }

  /**
   * Buckets with constant width.
   * @param linearBuckets linearBuckets or {@code null} for none
   */
  public Distribution setLinearBuckets(LinearBuckets linearBuckets) {
    this.linearBuckets = linearBuckets;
    return this;
  }

  /**
   * The maximum of the population of values. Ignored if `count` is zero.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaximum() {
    return maximum;
  }

  /**
   * The maximum of the population of values. Ignored if `count` is zero.
   * @param maximum maximum or {@code null} for none
   */
  public Distribution setMaximum(java.lang.Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The arithmetic mean of the samples in the distribution. If `count` is zero then this field must
   * be zero.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMean() {
    return mean;
  }

  /**
   * The arithmetic mean of the samples in the distribution. If `count` is zero then this field must
   * be zero.
   * @param mean mean or {@code null} for none
   */
  public Distribution setMean(java.lang.Double mean) {
    this.mean = mean;
    return this;
  }

  /**
   * The minimum of the population of values. Ignored if `count` is zero.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinimum() {
    return minimum;
  }

  /**
   * The minimum of the population of values. Ignored if `count` is zero.
   * @param minimum minimum or {@code null} for none
   */
  public Distribution setMinimum(java.lang.Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i - mean)^2) where each x_i
   * is a sample values. If `count` is zero then this field must be zero, otherwise validation of
   * the request fails.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSumOfSquaredDeviation() {
    return sumOfSquaredDeviation;
  }

  /**
   * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i - mean)^2) where each x_i
   * is a sample values. If `count` is zero then this field must be zero, otherwise validation of
   * the request fails.
   * @param sumOfSquaredDeviation sumOfSquaredDeviation or {@code null} for none
   */
  public Distribution setSumOfSquaredDeviation(java.lang.Double sumOfSquaredDeviation) {
    this.sumOfSquaredDeviation = sumOfSquaredDeviation;
    return this;
  }

  @Override
  public Distribution set(String fieldName, Object value) {
    return (Distribution) super.set(fieldName, value);
  }

  @Override
  public Distribution clone() {
    return (Distribution) super.clone();
  }

}