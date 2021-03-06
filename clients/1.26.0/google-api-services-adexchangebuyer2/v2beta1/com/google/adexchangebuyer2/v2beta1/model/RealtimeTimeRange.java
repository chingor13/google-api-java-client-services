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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * An open-ended realtime time range specified by the start timestamp. For filter sets that specify
 * a realtime time range RTB metrics continue to be aggregated throughout the lifetime of the filter
 * set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RealtimeTimeRange extends com.google.api.client.json.GenericJson {

  /**
   * The start timestamp of the real-time RTB metrics aggregation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTimestamp;

  /**
   * The start timestamp of the real-time RTB metrics aggregation.
   * @return value or {@code null} for none
   */
  public String getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * The start timestamp of the real-time RTB metrics aggregation.
   * @param startTimestamp startTimestamp or {@code null} for none
   */
  public RealtimeTimeRange setStartTimestamp(String startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  @Override
  public RealtimeTimeRange set(String fieldName, Object value) {
    return (RealtimeTimeRange) super.set(fieldName, value);
  }

  @Override
  public RealtimeTimeRange clone() {
    return (RealtimeTimeRange) super.clone();
  }

}
