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

package com.google.dfareporting.model;

/**
 * DFP Settings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DfpSettings extends com.google.api.client.json.GenericJson {

  /**
   * DFP network code for this directory site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dfpNetworkCode;

  /**
   * DFP network name for this directory site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dfpNetworkName;

  /**
   * Whether this directory site accepts programmatic placements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean programmaticPlacementAccepted;

  /**
   * Whether this directory site accepts publisher-paid tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pubPaidPlacementAccepted;

  /**
   * Whether this directory site is available only via DoubleClick Publisher Portal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publisherPortalOnly;

  /**
   * DFP network code for this directory site.
   * @return value or {@code null} for none
   */
  public java.lang.String getDfpNetworkCode() {
    return dfpNetworkCode;
  }

  /**
   * DFP network code for this directory site.
   * @param dfpNetworkCode dfpNetworkCode or {@code null} for none
   */
  public DfpSettings setDfpNetworkCode(java.lang.String dfpNetworkCode) {
    this.dfpNetworkCode = dfpNetworkCode;
    return this;
  }

  /**
   * DFP network name for this directory site.
   * @return value or {@code null} for none
   */
  public java.lang.String getDfpNetworkName() {
    return dfpNetworkName;
  }

  /**
   * DFP network name for this directory site.
   * @param dfpNetworkName dfpNetworkName or {@code null} for none
   */
  public DfpSettings setDfpNetworkName(java.lang.String dfpNetworkName) {
    this.dfpNetworkName = dfpNetworkName;
    return this;
  }

  /**
   * Whether this directory site accepts programmatic placements.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProgrammaticPlacementAccepted() {
    return programmaticPlacementAccepted;
  }

  /**
   * Whether this directory site accepts programmatic placements.
   * @param programmaticPlacementAccepted programmaticPlacementAccepted or {@code null} for none
   */
  public DfpSettings setProgrammaticPlacementAccepted(java.lang.Boolean programmaticPlacementAccepted) {
    this.programmaticPlacementAccepted = programmaticPlacementAccepted;
    return this;
  }

  /**
   * Whether this directory site accepts publisher-paid tags.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPubPaidPlacementAccepted() {
    return pubPaidPlacementAccepted;
  }

  /**
   * Whether this directory site accepts publisher-paid tags.
   * @param pubPaidPlacementAccepted pubPaidPlacementAccepted or {@code null} for none
   */
  public DfpSettings setPubPaidPlacementAccepted(java.lang.Boolean pubPaidPlacementAccepted) {
    this.pubPaidPlacementAccepted = pubPaidPlacementAccepted;
    return this;
  }

  /**
   * Whether this directory site is available only via DoubleClick Publisher Portal.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublisherPortalOnly() {
    return publisherPortalOnly;
  }

  /**
   * Whether this directory site is available only via DoubleClick Publisher Portal.
   * @param publisherPortalOnly publisherPortalOnly or {@code null} for none
   */
  public DfpSettings setPublisherPortalOnly(java.lang.Boolean publisherPortalOnly) {
    this.publisherPortalOnly = publisherPortalOnly;
    return this;
  }

  @Override
  public DfpSettings set(String fieldName, Object value) {
    return (DfpSettings) super.set(fieldName, value);
  }

  @Override
  public DfpSettings clone() {
    return (DfpSettings) super.clone();
  }

}