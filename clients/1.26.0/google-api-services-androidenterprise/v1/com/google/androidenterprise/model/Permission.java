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

package com.google.androidenterprise.model;

/**
 * A Permissions resource represents some extra capability, to be granted to an Android app, which
 * requires explicit consent. An enterprise admin must consent to these permissions on behalf of
 * their users before an entitlement for the app can be created.
 *
 * The permissions collection is read-only. The information provided for each permission (localized
 * name and description) is intended to be used in the MDM user interface when obtaining consent
 * from the enterprise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Permission extends com.google.api.client.json.GenericJson {

  /**
   * A longer description of the Permissions resource, giving more details of what it affects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#permission".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An opaque string uniquely identifying the permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissionId;

  /**
   * A longer description of the Permissions resource, giving more details of what it affects.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A longer description of the Permissions resource, giving more details of what it affects.
   * @param description description or {@code null} for none
   */
  public Permission setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#permission".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#permission".
   * @param kind kind or {@code null} for none
   */
  public Permission setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the permission.
   * @param name name or {@code null} for none
   */
  public Permission setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An opaque string uniquely identifying the permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissionId() {
    return permissionId;
  }

  /**
   * An opaque string uniquely identifying the permission.
   * @param permissionId permissionId or {@code null} for none
   */
  public Permission setPermissionId(java.lang.String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  @Override
  public Permission set(String fieldName, Object value) {
    return (Permission) super.set(fieldName, value);
  }

  @Override
  public Permission clone() {
    return (Permission) super.clone();
  }

}
