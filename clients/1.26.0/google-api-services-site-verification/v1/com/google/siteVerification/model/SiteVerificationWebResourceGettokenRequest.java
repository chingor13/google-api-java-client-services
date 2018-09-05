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

package com.google.siteVerification.model;

/**
 * Model definition for SiteVerificationWebResourceGettokenRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Site Verification API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SiteVerificationWebResourceGettokenRequest extends com.google.api.client.json.GenericJson {

  /**
   * The site for which a verification token will be generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Site site;

  /**
   * The verification method that will be used to verify this site. For sites, 'FILE' or 'META'
   * methods may be used. For domains, only 'DNS' may be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationMethod;

  /**
   * The site for which a verification token will be generated.
   * @return value or {@code null} for none
   */
  public Site getSite() {
    return site;
  }

  /**
   * The site for which a verification token will be generated.
   * @param site site or {@code null} for none
   */
  public SiteVerificationWebResourceGettokenRequest setSite(Site site) {
    this.site = site;
    return this;
  }

  /**
   * The verification method that will be used to verify this site. For sites, 'FILE' or 'META'
   * methods may be used. For domains, only 'DNS' may be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationMethod() {
    return verificationMethod;
  }

  /**
   * The verification method that will be used to verify this site. For sites, 'FILE' or 'META'
   * methods may be used. For domains, only 'DNS' may be used.
   * @param verificationMethod verificationMethod or {@code null} for none
   */
  public SiteVerificationWebResourceGettokenRequest setVerificationMethod(java.lang.String verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  @Override
  public SiteVerificationWebResourceGettokenRequest set(String fieldName, Object value) {
    return (SiteVerificationWebResourceGettokenRequest) super.set(fieldName, value);
  }

  @Override
  public SiteVerificationWebResourceGettokenRequest clone() {
    return (SiteVerificationWebResourceGettokenRequest) super.clone();
  }

  /**
   * The site for which a verification token will be generated.
   */
  public static final class Site extends com.google.api.client.json.GenericJson {

    /**
     * The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to
     * INET_DOMAIN, the site identifier is a domain name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String identifier;

    /**
     * The type of resource to be verified. Can be SITE or INET_DOMAIN (domain name).
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to
     * INET_DOMAIN, the site identifier is a domain name.
     * @return value or {@code null} for none
     */
    public java.lang.String getIdentifier() {
      return identifier;
    }

    /**
     * The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to
     * INET_DOMAIN, the site identifier is a domain name.
     * @param identifier identifier or {@code null} for none
     */
    public Site setIdentifier(java.lang.String identifier) {
      this.identifier = identifier;
      return this;
    }

    /**
     * The type of resource to be verified. Can be SITE or INET_DOMAIN (domain name).
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * The type of resource to be verified. Can be SITE or INET_DOMAIN (domain name).
     * @param type type or {@code null} for none
     */
    public Site setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public Site set(String fieldName, Object value) {
      return (Site) super.set(fieldName, value);
    }

    @Override
    public Site clone() {
      return (Site) super.clone();
    }

  }

}