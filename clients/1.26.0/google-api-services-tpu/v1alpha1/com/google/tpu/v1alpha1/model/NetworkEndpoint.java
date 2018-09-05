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

package com.google.tpu.v1alpha1.model;

/**
 * A network endpoint over which a TPU worker can be reached.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * The IP address of this network endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * The port of this network endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The IP address of this network endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * The IP address of this network endpoint.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public NetworkEndpoint setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The port of this network endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The port of this network endpoint.
   * @param port port or {@code null} for none
   */
  public NetworkEndpoint setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  @Override
  public NetworkEndpoint set(String fieldName, Object value) {
    return (NetworkEndpoint) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpoint clone() {
    return (NetworkEndpoint) super.clone();
  }

}