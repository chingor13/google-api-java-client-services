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
 * SSL configuration for a DomainMapping resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslSettings extends com.google.api.client.json.GenericJson {

  /**
   * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this
   * field will remove SSL support.By default, a managed certificate is automatically created for
   * every domain mapping. To omit SSL support or to configure SSL manually, specify
   * no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the
   * AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificateId;

  /**
   * Whether the mapped certificate is an App Engine managed certificate. Managed certificates are
   * created by default with a domain mapping. To opt out, specify no_managed_certificate on a
   * CREATE or UPDATE request.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isManagedCertificate;

  /**
   * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this
   * field will remove SSL support.By default, a managed certificate is automatically created for
   * every domain mapping. To omit SSL support or to configure SSL manually, specify
   * no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the
   * AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificateId() {
    return certificateId;
  }

  /**
   * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this
   * field will remove SSL support.By default, a managed certificate is automatically created for
   * every domain mapping. To omit SSL support or to configure SSL manually, specify
   * no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the
   * AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
   * @param certificateId certificateId or {@code null} for none
   */
  public SslSettings setCertificateId(java.lang.String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

  /**
   * Whether the mapped certificate is an App Engine managed certificate. Managed certificates are
   * created by default with a domain mapping. To opt out, specify no_managed_certificate on a
   * CREATE or UPDATE request.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsManagedCertificate() {
    return isManagedCertificate;
  }

  /**
   * Whether the mapped certificate is an App Engine managed certificate. Managed certificates are
   * created by default with a domain mapping. To opt out, specify no_managed_certificate on a
   * CREATE or UPDATE request.@OutputOnly
   * @param isManagedCertificate isManagedCertificate or {@code null} for none
   */
  public SslSettings setIsManagedCertificate(java.lang.Boolean isManagedCertificate) {
    this.isManagedCertificate = isManagedCertificate;
    return this;
  }

  @Override
  public SslSettings set(String fieldName, Object value) {
    return (SslSettings) super.set(fieldName, value);
  }

  @Override
  public SslSettings clone() {
    return (SslSettings) super.clone();
  }

}
