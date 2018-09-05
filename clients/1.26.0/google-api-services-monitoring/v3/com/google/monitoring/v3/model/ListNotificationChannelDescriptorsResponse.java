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

package com.google.monitoring.v3.model;

/**
 * The ListNotificationChannelDescriptors response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListNotificationChannelDescriptorsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The monitored resource descriptors supported for the specified project, optionally filtered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NotificationChannelDescriptor> channelDescriptors;

  static {
    // hack to force ProGuard to consider NotificationChannelDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NotificationChannelDescriptor.class);
  }

  /**
   * If not empty, indicates that there may be more results that match the request. Use the value in
   * the page_token field in a subsequent request to fetch the next set of results. If empty, all
   * results have been returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The monitored resource descriptors supported for the specified project, optionally filtered.
   * @return value or {@code null} for none
   */
  public java.util.List<NotificationChannelDescriptor> getChannelDescriptors() {
    return channelDescriptors;
  }

  /**
   * The monitored resource descriptors supported for the specified project, optionally filtered.
   * @param channelDescriptors channelDescriptors or {@code null} for none
   */
  public ListNotificationChannelDescriptorsResponse setChannelDescriptors(java.util.List<NotificationChannelDescriptor> channelDescriptors) {
    this.channelDescriptors = channelDescriptors;
    return this;
  }

  /**
   * If not empty, indicates that there may be more results that match the request. Use the value in
   * the page_token field in a subsequent request to fetch the next set of results. If empty, all
   * results have been returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If not empty, indicates that there may be more results that match the request. Use the value in
   * the page_token field in a subsequent request to fetch the next set of results. If empty, all
   * results have been returned.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListNotificationChannelDescriptorsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListNotificationChannelDescriptorsResponse set(String fieldName, Object value) {
    return (ListNotificationChannelDescriptorsResponse) super.set(fieldName, value);
  }

  @Override
  public ListNotificationChannelDescriptorsResponse clone() {
    return (ListNotificationChannelDescriptorsResponse) super.clone();
  }

}