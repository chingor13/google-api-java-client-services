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

package com.google.compute.model;

/**
 * A Subnetwork resource. (== resource_for beta.subnetworks ==) (== resource_for v1.subnetworks ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subnetwork extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Whether to enable flow logging for this subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableFlowLogs;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatewayAddress;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateIpGoogleAccess;

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SubnetworkSecondaryRange> secondaryIpRanges;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Subnetwork setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * @param description description or {@code null} for none
   */
  public Subnetwork setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Whether to enable flow logging for this subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableFlowLogs() {
    return enableFlowLogs;
  }

  /**
   * Whether to enable flow logging for this subnetwork.
   * @param enableFlowLogs enableFlowLogs or {@code null} for none
   */
  public Subnetwork setEnableFlowLogs(java.lang.Boolean enableFlowLogs) {
    this.enableFlowLogs = enableFlowLogs;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Subnetwork setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Subnetwork encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatewayAddress() {
    return gatewayAddress;
  }

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * @param gatewayAddress gatewayAddress or {@code null} for none
   */
  public Subnetwork setGatewayAddress(java.lang.String gatewayAddress) {
    this.gatewayAddress = gatewayAddress;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Subnetwork setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public Subnetwork setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * @param kind kind or {@code null} for none
   */
  public Subnetwork setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Subnetwork setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * @param network network or {@code null} for none
   */
  public Subnetwork setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateIpGoogleAccess() {
    return privateIpGoogleAccess;
  }

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * @param privateIpGoogleAccess privateIpGoogleAccess or {@code null} for none
   */
  public Subnetwork setPrivateIpGoogleAccess(java.lang.Boolean privateIpGoogleAccess) {
    this.privateIpGoogleAccess = privateIpGoogleAccess;
    return this;
  }

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * @param region region or {@code null} for none
   */
  public Subnetwork setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges.
   * @return value or {@code null} for none
   */
  public java.util.List<SubnetworkSecondaryRange> getSecondaryIpRanges() {
    return secondaryIpRanges;
  }

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges.
   * @param secondaryIpRanges secondaryIpRanges or {@code null} for none
   */
  public Subnetwork setSecondaryIpRanges(java.util.List<SubnetworkSecondaryRange> secondaryIpRanges) {
    this.secondaryIpRanges = secondaryIpRanges;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Subnetwork setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public Subnetwork set(String fieldName, Object value) {
    return (Subnetwork) super.set(fieldName, value);
  }

  @Override
  public Subnetwork clone() {
    return (Subnetwork) super.clone();
  }

}
