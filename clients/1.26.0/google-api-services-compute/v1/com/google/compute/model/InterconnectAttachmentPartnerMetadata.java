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
 * Informational metadata about Partner attachments from Partners to display to customers. These
 * fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER
 * attachments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectAttachmentPartnerMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the
   * Partner?s portal. For instance ?Chicago 1?. This value may be validated to match approved
   * Partner values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interconnectName;

  /**
   * Plain text name of the Partner providing this attachment. This value may be validated to match
   * approved Partner values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerName;

  /**
   * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep-link
   * to the specific resource on the Partner portal. This value may be validated to match approved
   * Partner values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portalUrl;

  /**
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the
   * Partner?s portal. For instance ?Chicago 1?. This value may be validated to match approved
   * Partner values.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterconnectName() {
    return interconnectName;
  }

  /**
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the
   * Partner?s portal. For instance ?Chicago 1?. This value may be validated to match approved
   * Partner values.
   * @param interconnectName interconnectName or {@code null} for none
   */
  public InterconnectAttachmentPartnerMetadata setInterconnectName(java.lang.String interconnectName) {
    this.interconnectName = interconnectName;
    return this;
  }

  /**
   * Plain text name of the Partner providing this attachment. This value may be validated to match
   * approved Partner values.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerName() {
    return partnerName;
  }

  /**
   * Plain text name of the Partner providing this attachment. This value may be validated to match
   * approved Partner values.
   * @param partnerName partnerName or {@code null} for none
   */
  public InterconnectAttachmentPartnerMetadata setPartnerName(java.lang.String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep-link
   * to the specific resource on the Partner portal. This value may be validated to match approved
   * Partner values.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortalUrl() {
    return portalUrl;
  }

  /**
   * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep-link
   * to the specific resource on the Partner portal. This value may be validated to match approved
   * Partner values.
   * @param portalUrl portalUrl or {@code null} for none
   */
  public InterconnectAttachmentPartnerMetadata setPortalUrl(java.lang.String portalUrl) {
    this.portalUrl = portalUrl;
    return this;
  }

  @Override
  public InterconnectAttachmentPartnerMetadata set(String fieldName, Object value) {
    return (InterconnectAttachmentPartnerMetadata) super.set(fieldName, value);
  }

  @Override
  public InterconnectAttachmentPartnerMetadata clone() {
    return (InterconnectAttachmentPartnerMetadata) super.clone();
  }

}
