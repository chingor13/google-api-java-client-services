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

package com.google.youtube.model;

/**
 * Details about the live streaming metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoLiveStreamingDetails extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the currently active live chat attached to this video. This field is filled only if
   * the video is a currently live broadcast that has live chat. Once the broadcast transitions to
   * complete this field will be removed and the live chat closed down. For persistent broadcasts
   * that live chat id will no longer be tied to this video but rather to the new video being
   * displayed at the persistent page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activeLiveChatId;

  /**
   * The time that the broadcast actually ended. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast is over.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime actualEndTime;

  /**
   * The time that the broadcast actually started. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast begins.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime actualStartTime;

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger concurrentViewers;

  /**
   * The time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. If the value is empty or the property is not present, then the
   * broadcast is scheduled to continue indefinitely.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime scheduledEndTime;

  /**
   * The time that the broadcast is scheduled to begin. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime scheduledStartTime;

  /**
   * The ID of the currently active live chat attached to this video. This field is filled only if
   * the video is a currently live broadcast that has live chat. Once the broadcast transitions to
   * complete this field will be removed and the live chat closed down. For persistent broadcasts
   * that live chat id will no longer be tied to this video but rather to the new video being
   * displayed at the persistent page.
   * @return value or {@code null} for none
   */
  public java.lang.String getActiveLiveChatId() {
    return activeLiveChatId;
  }

  /**
   * The ID of the currently active live chat attached to this video. This field is filled only if
   * the video is a currently live broadcast that has live chat. Once the broadcast transitions to
   * complete this field will be removed and the live chat closed down. For persistent broadcasts
   * that live chat id will no longer be tied to this video but rather to the new video being
   * displayed at the persistent page.
   * @param activeLiveChatId activeLiveChatId or {@code null} for none
   */
  public VideoLiveStreamingDetails setActiveLiveChatId(java.lang.String activeLiveChatId) {
    this.activeLiveChatId = activeLiveChatId;
    return this;
  }

  /**
   * The time that the broadcast actually ended. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast is over.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getActualEndTime() {
    return actualEndTime;
  }

  /**
   * The time that the broadcast actually ended. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast is over.
   * @param actualEndTime actualEndTime or {@code null} for none
   */
  public VideoLiveStreamingDetails setActualEndTime(com.google.api.client.util.DateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
    return this;
  }

  /**
   * The time that the broadcast actually started. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast begins.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getActualStartTime() {
    return actualStartTime;
  }

  /**
   * The time that the broadcast actually started. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. This value will not be available until the broadcast begins.
   * @param actualStartTime actualStartTime or {@code null} for none
   */
  public VideoLiveStreamingDetails setActualStartTime(com.google.api.client.util.DateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getConcurrentViewers() {
    return concurrentViewers;
  }

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * @param concurrentViewers concurrentViewers or {@code null} for none
   */
  public VideoLiveStreamingDetails setConcurrentViewers(java.math.BigInteger concurrentViewers) {
    this.concurrentViewers = concurrentViewers;
    return this;
  }

  /**
   * The time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. If the value is empty or the property is not present, then the
   * broadcast is scheduled to continue indefinitely.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getScheduledEndTime() {
    return scheduledEndTime;
  }

  /**
   * The time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format. If the value is empty or the property is not present, then the
   * broadcast is scheduled to continue indefinitely.
   * @param scheduledEndTime scheduledEndTime or {@code null} for none
   */
  public VideoLiveStreamingDetails setScheduledEndTime(com.google.api.client.util.DateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

  /**
   * The time that the broadcast is scheduled to begin. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getScheduledStartTime() {
    return scheduledStartTime;
  }

  /**
   * The time that the broadcast is scheduled to begin. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @param scheduledStartTime scheduledStartTime or {@code null} for none
   */
  public VideoLiveStreamingDetails setScheduledStartTime(com.google.api.client.util.DateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

  @Override
  public VideoLiveStreamingDetails set(String fieldName, Object value) {
    return (VideoLiveStreamingDetails) super.set(fieldName, value);
  }

  @Override
  public VideoLiveStreamingDetails clone() {
    return (VideoLiveStreamingDetails) super.clone();
  }

}