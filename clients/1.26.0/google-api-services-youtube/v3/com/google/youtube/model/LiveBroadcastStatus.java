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
 * Model definition for LiveBroadcastStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveBroadcastStatus extends com.google.api.client.json.GenericJson {

  /**
   * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition
   * method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifeCycleStatus;

  /**
   * Priority of the live broadcast event (internal state).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liveBroadcastPriority;

  /**
   * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video,
   * so the privacy settings are identical to those supported for videos. In addition, you can set
   * this field by modifying the broadcast resource or by setting the privacyStatus field of the
   * corresponding video resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privacyStatus;

  /**
   * The broadcast's recording status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordingStatus;

  /**
   * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition
   * method.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  /**
   * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition
   * method.
   * @param lifeCycleStatus lifeCycleStatus or {@code null} for none
   */
  public LiveBroadcastStatus setLifeCycleStatus(java.lang.String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

  /**
   * Priority of the live broadcast event (internal state).
   * @return value or {@code null} for none
   */
  public java.lang.String getLiveBroadcastPriority() {
    return liveBroadcastPriority;
  }

  /**
   * Priority of the live broadcast event (internal state).
   * @param liveBroadcastPriority liveBroadcastPriority or {@code null} for none
   */
  public LiveBroadcastStatus setLiveBroadcastPriority(java.lang.String liveBroadcastPriority) {
    this.liveBroadcastPriority = liveBroadcastPriority;
    return this;
  }

  /**
   * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video,
   * so the privacy settings are identical to those supported for videos. In addition, you can set
   * this field by modifying the broadcast resource or by setting the privacyStatus field of the
   * corresponding video resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivacyStatus() {
    return privacyStatus;
  }

  /**
   * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video,
   * so the privacy settings are identical to those supported for videos. In addition, you can set
   * this field by modifying the broadcast resource or by setting the privacyStatus field of the
   * corresponding video resource.
   * @param privacyStatus privacyStatus or {@code null} for none
   */
  public LiveBroadcastStatus setPrivacyStatus(java.lang.String privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

  /**
   * The broadcast's recording status.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordingStatus() {
    return recordingStatus;
  }

  /**
   * The broadcast's recording status.
   * @param recordingStatus recordingStatus or {@code null} for none
   */
  public LiveBroadcastStatus setRecordingStatus(java.lang.String recordingStatus) {
    this.recordingStatus = recordingStatus;
    return this;
  }

  @Override
  public LiveBroadcastStatus set(String fieldName, Object value) {
    return (LiveBroadcastStatus) super.set(fieldName, value);
  }

  @Override
  public LiveBroadcastStatus clone() {
    return (LiveBroadcastStatus) super.clone();
  }

}