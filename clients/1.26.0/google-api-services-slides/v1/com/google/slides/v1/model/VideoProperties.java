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

package com.google.slides.v1.model;

/**
 * The properties of the Video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoProperties extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable video autoplay when the page is displayed in present mode. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoPlay;

  /**
   * The time at which to end playback, measured in seconds from the beginning of the video. If set,
   * the end time should be after the start time. If not set or if you set this to a value that
   * exceeds the video's length, the video will be played until its end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long end;

  /**
   * Whether to mute the audio during video playback. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mute;

  /**
   * The outline of the video. The default outline matches the defaults for new videos created in
   * the Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Outline outline;

  /**
   * The time at which to start playback, measured in seconds from the beginning of the video. If
   * set, the start time should be before the end time. If you set this to a value that exceeds the
   * video's length in seconds, the video will be played from the last second. If not set, the video
   * will be played from the beginning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long start;

  /**
   * Whether to enable video autoplay when the page is displayed in present mode. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoPlay() {
    return autoPlay;
  }

  /**
   * Whether to enable video autoplay when the page is displayed in present mode. Defaults to false.
   * @param autoPlay autoPlay or {@code null} for none
   */
  public VideoProperties setAutoPlay(java.lang.Boolean autoPlay) {
    this.autoPlay = autoPlay;
    return this;
  }

  /**
   * The time at which to end playback, measured in seconds from the beginning of the video. If set,
   * the end time should be after the start time. If not set or if you set this to a value that
   * exceeds the video's length, the video will be played until its end.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * The time at which to end playback, measured in seconds from the beginning of the video. If set,
   * the end time should be after the start time. If not set or if you set this to a value that
   * exceeds the video's length, the video will be played until its end.
   * @param end end or {@code null} for none
   */
  public VideoProperties setEnd(java.lang.Long end) {
    this.end = end;
    return this;
  }

  /**
   * Whether to mute the audio during video playback. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMute() {
    return mute;
  }

  /**
   * Whether to mute the audio during video playback. Defaults to false.
   * @param mute mute or {@code null} for none
   */
  public VideoProperties setMute(java.lang.Boolean mute) {
    this.mute = mute;
    return this;
  }

  /**
   * The outline of the video. The default outline matches the defaults for new videos created in
   * the Slides editor.
   * @return value or {@code null} for none
   */
  public Outline getOutline() {
    return outline;
  }

  /**
   * The outline of the video. The default outline matches the defaults for new videos created in
   * the Slides editor.
   * @param outline outline or {@code null} for none
   */
  public VideoProperties setOutline(Outline outline) {
    this.outline = outline;
    return this;
  }

  /**
   * The time at which to start playback, measured in seconds from the beginning of the video. If
   * set, the start time should be before the end time. If you set this to a value that exceeds the
   * video's length in seconds, the video will be played from the last second. If not set, the video
   * will be played from the beginning.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * The time at which to start playback, measured in seconds from the beginning of the video. If
   * set, the start time should be before the end time. If you set this to a value that exceeds the
   * video's length in seconds, the video will be played from the last second. If not set, the video
   * will be played from the beginning.
   * @param start start or {@code null} for none
   */
  public VideoProperties setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public VideoProperties set(String fieldName, Object value) {
    return (VideoProperties) super.set(fieldName, value);
  }

  @Override
  public VideoProperties clone() {
    return (VideoProperties) super.clone();
  }

}
