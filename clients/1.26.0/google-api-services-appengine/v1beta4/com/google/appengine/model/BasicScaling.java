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

package com.google.appengine.model;

/**
 * A module with basic scaling will create an instance when the application receives a request. The
 * instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is
 * intermittent or driven by user activity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicScaling extends com.google.api.client.json.GenericJson {

  /**
   * Duration of time after the last request that an instance must wait before the instance is shut
   * down.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String idleTimeout;

  /**
   * Maximum number of instances to create for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstances;

  /**
   * Duration of time after the last request that an instance must wait before the instance is shut
   * down.
   * @return value or {@code null} for none
   */
  public String getIdleTimeout() {
    return idleTimeout;
  }

  /**
   * Duration of time after the last request that an instance must wait before the instance is shut
   * down.
   * @param idleTimeout idleTimeout or {@code null} for none
   */
  public BasicScaling setIdleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
    return this;
  }

  /**
   * Maximum number of instances to create for this version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstances() {
    return maxInstances;
  }

  /**
   * Maximum number of instances to create for this version.
   * @param maxInstances maxInstances or {@code null} for none
   */
  public BasicScaling setMaxInstances(java.lang.Integer maxInstances) {
    this.maxInstances = maxInstances;
    return this;
  }

  @Override
  public BasicScaling set(String fieldName, Object value) {
    return (BasicScaling) super.set(fieldName, value);
  }

  @Override
  public BasicScaling clone() {
    return (BasicScaling) super.clone();
  }

}
