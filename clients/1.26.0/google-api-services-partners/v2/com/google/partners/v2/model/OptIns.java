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

package com.google.partners.v2.model;

/**
 * A set of opt-ins for a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OptIns extends com.google.api.client.json.GenericJson {

  /**
   * An opt-in about receiving email from Partners marketing teams. Includes member-only events and
   * special promotional offers for Google products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean marketComm;

  /**
   * An opt-in about receiving email with customized AdWords campaign management tips.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean performanceSuggestions;

  /**
   * An opt-in to allow recieivng phone calls about their Partners account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean phoneContact;

  /**
   * An opt-in to receive special promotional gifts and material in the mail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean physicalMail;

  /**
   * An opt-in about receiving email regarding new features and products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean specialOffers;

  /**
   * An opt-in about receiving email from Partners marketing teams. Includes member-only events and
   * special promotional offers for Google products.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMarketComm() {
    return marketComm;
  }

  /**
   * An opt-in about receiving email from Partners marketing teams. Includes member-only events and
   * special promotional offers for Google products.
   * @param marketComm marketComm or {@code null} for none
   */
  public OptIns setMarketComm(java.lang.Boolean marketComm) {
    this.marketComm = marketComm;
    return this;
  }

  /**
   * An opt-in about receiving email with customized AdWords campaign management tips.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPerformanceSuggestions() {
    return performanceSuggestions;
  }

  /**
   * An opt-in about receiving email with customized AdWords campaign management tips.
   * @param performanceSuggestions performanceSuggestions or {@code null} for none
   */
  public OptIns setPerformanceSuggestions(java.lang.Boolean performanceSuggestions) {
    this.performanceSuggestions = performanceSuggestions;
    return this;
  }

  /**
   * An opt-in to allow recieivng phone calls about their Partners account.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPhoneContact() {
    return phoneContact;
  }

  /**
   * An opt-in to allow recieivng phone calls about their Partners account.
   * @param phoneContact phoneContact or {@code null} for none
   */
  public OptIns setPhoneContact(java.lang.Boolean phoneContact) {
    this.phoneContact = phoneContact;
    return this;
  }

  /**
   * An opt-in to receive special promotional gifts and material in the mail.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPhysicalMail() {
    return physicalMail;
  }

  /**
   * An opt-in to receive special promotional gifts and material in the mail.
   * @param physicalMail physicalMail or {@code null} for none
   */
  public OptIns setPhysicalMail(java.lang.Boolean physicalMail) {
    this.physicalMail = physicalMail;
    return this;
  }

  /**
   * An opt-in about receiving email regarding new features and products.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpecialOffers() {
    return specialOffers;
  }

  /**
   * An opt-in about receiving email regarding new features and products.
   * @param specialOffers specialOffers or {@code null} for none
   */
  public OptIns setSpecialOffers(java.lang.Boolean specialOffers) {
    this.specialOffers = specialOffers;
    return this;
  }

  @Override
  public OptIns set(String fieldName, Object value) {
    return (OptIns) super.set(fieldName, value);
  }

  @Override
  public OptIns clone() {
    return (OptIns) super.clone();
  }

}
