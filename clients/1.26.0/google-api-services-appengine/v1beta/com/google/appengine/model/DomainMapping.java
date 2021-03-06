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
 * A domain serving an App Engine application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainMapping extends com.google.api.client.json.GenericJson {

  /**
   * Relative name of the domain serving the application. Example: example.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Full path to the DomainMapping resource in the API. Example:
   * apps/myapp/domainMapping/example.com.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain
   * mapping.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceRecord> resourceRecords;

  /**
   * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslSettings sslSettings;

  /**
   * Relative name of the domain serving the application. Example: example.com.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Relative name of the domain serving the application. Example: example.com.
   * @param id id or {@code null} for none
   */
  public DomainMapping setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Full path to the DomainMapping resource in the API. Example:
   * apps/myapp/domainMapping/example.com.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full path to the DomainMapping resource in the API. Example:
   * apps/myapp/domainMapping/example.com.@OutputOnly
   * @param name name or {@code null} for none
   */
  public DomainMapping setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain
   * mapping.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceRecord> getResourceRecords() {
    return resourceRecords;
  }

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain
   * mapping.@OutputOnly
   * @param resourceRecords resourceRecords or {@code null} for none
   */
  public DomainMapping setResourceRecords(java.util.List<ResourceRecord> resourceRecords) {
    this.resourceRecords = resourceRecords;
    return this;
  }

  /**
   * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
   * @return value or {@code null} for none
   */
  public SslSettings getSslSettings() {
    return sslSettings;
  }

  /**
   * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
   * @param sslSettings sslSettings or {@code null} for none
   */
  public DomainMapping setSslSettings(SslSettings sslSettings) {
    this.sslSettings = sslSettings;
    return this;
  }

  @Override
  public DomainMapping set(String fieldName, Object value) {
    return (DomainMapping) super.set(fieldName, value);
  }

  @Override
  public DomainMapping clone() {
    return (DomainMapping) super.clone();
  }

}
