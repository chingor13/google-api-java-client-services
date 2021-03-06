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

package com.google.toolresults.model;

/**
 * Graphics statistics for the App. The information is collected from 'adb shell dumpsys
 * graphicsstats'. For more info see:
 * https://developer.android.com/training/testing/performance.html Statistics will only be present
 * for API 23+.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GraphicsStats extends com.google.api.client.json.GenericJson {

  /**
   * Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to
   * [4950ms, infinity)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GraphicsStatsBucket> buckets;

  /**
   * Total "high input latency" events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long highInputLatencyCount;

  /**
   * Total frames with slow render time. Should be <= total_frames.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long jankyFrames;

  /**
   * Total "missed vsync" events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long missedVsyncCount;

  /**
   * 50th percentile frame render time in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long p50Millis;

  /**
   * 90th percentile frame render time in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long p90Millis;

  /**
   * 95th percentile frame render time in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long p95Millis;

  /**
   * 99th percentile frame render time in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long p99Millis;

  /**
   * Total "slow bitmap upload" events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long slowBitmapUploadCount;

  /**
   * Total "slow draw" events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long slowDrawCount;

  /**
   * Total "slow UI thread" events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long slowUiThreadCount;

  /**
   * Total frames rendered by package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalFrames;

  /**
   * Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to
   * [4950ms, infinity)
   * @return value or {@code null} for none
   */
  public java.util.List<GraphicsStatsBucket> getBuckets() {
    return buckets;
  }

  /**
   * Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to
   * [4950ms, infinity)
   * @param buckets buckets or {@code null} for none
   */
  public GraphicsStats setBuckets(java.util.List<GraphicsStatsBucket> buckets) {
    this.buckets = buckets;
    return this;
  }

  /**
   * Total "high input latency" events.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHighInputLatencyCount() {
    return highInputLatencyCount;
  }

  /**
   * Total "high input latency" events.
   * @param highInputLatencyCount highInputLatencyCount or {@code null} for none
   */
  public GraphicsStats setHighInputLatencyCount(java.lang.Long highInputLatencyCount) {
    this.highInputLatencyCount = highInputLatencyCount;
    return this;
  }

  /**
   * Total frames with slow render time. Should be <= total_frames.
   * @return value or {@code null} for none
   */
  public java.lang.Long getJankyFrames() {
    return jankyFrames;
  }

  /**
   * Total frames with slow render time. Should be <= total_frames.
   * @param jankyFrames jankyFrames or {@code null} for none
   */
  public GraphicsStats setJankyFrames(java.lang.Long jankyFrames) {
    this.jankyFrames = jankyFrames;
    return this;
  }

  /**
   * Total "missed vsync" events.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMissedVsyncCount() {
    return missedVsyncCount;
  }

  /**
   * Total "missed vsync" events.
   * @param missedVsyncCount missedVsyncCount or {@code null} for none
   */
  public GraphicsStats setMissedVsyncCount(java.lang.Long missedVsyncCount) {
    this.missedVsyncCount = missedVsyncCount;
    return this;
  }

  /**
   * 50th percentile frame render time in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getP50Millis() {
    return p50Millis;
  }

  /**
   * 50th percentile frame render time in milliseconds.
   * @param p50Millis p50Millis or {@code null} for none
   */
  public GraphicsStats setP50Millis(java.lang.Long p50Millis) {
    this.p50Millis = p50Millis;
    return this;
  }

  /**
   * 90th percentile frame render time in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getP90Millis() {
    return p90Millis;
  }

  /**
   * 90th percentile frame render time in milliseconds.
   * @param p90Millis p90Millis or {@code null} for none
   */
  public GraphicsStats setP90Millis(java.lang.Long p90Millis) {
    this.p90Millis = p90Millis;
    return this;
  }

  /**
   * 95th percentile frame render time in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getP95Millis() {
    return p95Millis;
  }

  /**
   * 95th percentile frame render time in milliseconds.
   * @param p95Millis p95Millis or {@code null} for none
   */
  public GraphicsStats setP95Millis(java.lang.Long p95Millis) {
    this.p95Millis = p95Millis;
    return this;
  }

  /**
   * 99th percentile frame render time in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getP99Millis() {
    return p99Millis;
  }

  /**
   * 99th percentile frame render time in milliseconds.
   * @param p99Millis p99Millis or {@code null} for none
   */
  public GraphicsStats setP99Millis(java.lang.Long p99Millis) {
    this.p99Millis = p99Millis;
    return this;
  }

  /**
   * Total "slow bitmap upload" events.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSlowBitmapUploadCount() {
    return slowBitmapUploadCount;
  }

  /**
   * Total "slow bitmap upload" events.
   * @param slowBitmapUploadCount slowBitmapUploadCount or {@code null} for none
   */
  public GraphicsStats setSlowBitmapUploadCount(java.lang.Long slowBitmapUploadCount) {
    this.slowBitmapUploadCount = slowBitmapUploadCount;
    return this;
  }

  /**
   * Total "slow draw" events.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSlowDrawCount() {
    return slowDrawCount;
  }

  /**
   * Total "slow draw" events.
   * @param slowDrawCount slowDrawCount or {@code null} for none
   */
  public GraphicsStats setSlowDrawCount(java.lang.Long slowDrawCount) {
    this.slowDrawCount = slowDrawCount;
    return this;
  }

  /**
   * Total "slow UI thread" events.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSlowUiThreadCount() {
    return slowUiThreadCount;
  }

  /**
   * Total "slow UI thread" events.
   * @param slowUiThreadCount slowUiThreadCount or {@code null} for none
   */
  public GraphicsStats setSlowUiThreadCount(java.lang.Long slowUiThreadCount) {
    this.slowUiThreadCount = slowUiThreadCount;
    return this;
  }

  /**
   * Total frames rendered by package.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalFrames() {
    return totalFrames;
  }

  /**
   * Total frames rendered by package.
   * @param totalFrames totalFrames or {@code null} for none
   */
  public GraphicsStats setTotalFrames(java.lang.Long totalFrames) {
    this.totalFrames = totalFrames;
    return this;
  }

  @Override
  public GraphicsStats set(String fieldName, Object value) {
    return (GraphicsStats) super.set(fieldName, value);
  }

  @Override
  public GraphicsStats clone() {
    return (GraphicsStats) super.clone();
  }

}
