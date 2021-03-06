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

package com.google.sqladmin.model;

/**
 * IP Management configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IpConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In CIDR
   * notation, also known as 'slash' notation (e.g. 192.168.100.0/24).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> authorizedNetworks;

  /**
   * Whether the instance should be assigned an IP address or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * This is always sql#ipConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Whether SSL connections over IP should be enforced or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireSsl;

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In CIDR
   * notation, also known as 'slash' notation (e.g. 192.168.100.0/24).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAuthorizedNetworks() {
    return authorizedNetworks;
  }

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In CIDR
   * notation, also known as 'slash' notation (e.g. 192.168.100.0/24).
   * @param authorizedNetworks authorizedNetworks or {@code null} for none
   */
  public IpConfiguration setAuthorizedNetworks(java.util.List<java.lang.String> authorizedNetworks) {
    this.authorizedNetworks = authorizedNetworks;
    return this;
  }

  /**
   * Whether the instance should be assigned an IP address or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether the instance should be assigned an IP address or not.
   * @param enabled enabled or {@code null} for none
   */
  public IpConfiguration setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * This is always sql#ipConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#ipConfiguration.
   * @param kind kind or {@code null} for none
   */
  public IpConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Whether SSL connections over IP should be enforced or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireSsl() {
    return requireSsl;
  }

  /**
   * Whether SSL connections over IP should be enforced or not.
   * @param requireSsl requireSsl or {@code null} for none
   */
  public IpConfiguration setRequireSsl(java.lang.Boolean requireSsl) {
    this.requireSsl = requireSsl;
    return this;
  }

  @Override
  public IpConfiguration set(String fieldName, Object value) {
    return (IpConfiguration) super.set(fieldName, value);
  }

  @Override
  public IpConfiguration clone() {
    return (IpConfiguration) super.clone();
  }

}
