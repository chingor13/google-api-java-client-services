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

package com.google.adexchangebuyer.model;

/**
 * A proposal can contain multiple deals. A deal contains the terms and targeting information that
 * is used for serving.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MarketplaceDeal extends com.google.api.client.json.GenericJson {

  /**
   * Buyer private data (hidden from seller).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateData buyerPrivateData;

  /**
   * The time (ms since epoch) of the deal creation. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTimeMs;

  /**
   * Specifies the creative pre-approval policy (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativePreApprovalPolicy;

  /**
   * Specifies whether the creative is safeFrame compatible (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeSafeFrameCompatibility;

  /**
   * A unique deal-id for the deal (readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealId;

  /**
   * Metadata about the serving status of this deal (readonly, writes via custom actions)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DealServingMetadata dealServingMetadata;

  /**
   * The set of fields around delivery control that are interesting for a buyer to see but are non-
   * negotiable. These are set by the publisher. This message is assigned an id of 100 since some
   * day we would want to model this as a protobuf extension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeliveryControl deliveryControl;

  /**
   * The external deal id assigned to this deal once the deal is finalized. This is the deal-id that
   * shows up in serving/reporting etc. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalDealId;

  /**
   * Proposed flight end time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long flightEndTimeMs;

  /**
   * Proposed flight start time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long flightStartTimeMs;

  /**
   * Description for the deal terms. (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventoryDescription;

  /**
   * Indicates whether the current deal is a RFP template. RFP template is created by buyer and not
   * based on seller created products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRfpTemplate;

  /**
   * True, if the buyside inventory setup is complete for this deal. (readonly, except via
   * OrderSetupCompleted action)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSetupComplete;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceDeal".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The time (ms since epoch) when the deal was last updated. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdateTimeMs;

  /**
   * The name of the deal. (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The product-id from which this deal was created. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The revision number of the product that the deal was created from (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long productRevisionNumber;

  /**
   * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by
   * seller and ADVERTISR means creative is provided by buyer. (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String programmaticCreativeSource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalId;

  /**
   * Optional Seller contact information for the deal (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> sellerContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd
   * together. (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SharedTargeting> sharedTargetings;

  /**
   * The syndication product associated with the deal. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syndicationProduct;

  /**
   * The negotiable terms of the deal. (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DealTerms terms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webPropertyCode;

  /**
   * Buyer private data (hidden from seller).
   * @return value or {@code null} for none
   */
  public PrivateData getBuyerPrivateData() {
    return buyerPrivateData;
  }

  /**
   * Buyer private data (hidden from seller).
   * @param buyerPrivateData buyerPrivateData or {@code null} for none
   */
  public MarketplaceDeal setBuyerPrivateData(PrivateData buyerPrivateData) {
    this.buyerPrivateData = buyerPrivateData;
    return this;
  }

  /**
   * The time (ms since epoch) of the deal creation. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTimeMs() {
    return creationTimeMs;
  }

  /**
   * The time (ms since epoch) of the deal creation. (readonly)
   * @param creationTimeMs creationTimeMs or {@code null} for none
   */
  public MarketplaceDeal setCreationTimeMs(java.lang.Long creationTimeMs) {
    this.creationTimeMs = creationTimeMs;
    return this;
  }

  /**
   * Specifies the creative pre-approval policy (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativePreApprovalPolicy() {
    return creativePreApprovalPolicy;
  }

  /**
   * Specifies the creative pre-approval policy (buyer-readonly)
   * @param creativePreApprovalPolicy creativePreApprovalPolicy or {@code null} for none
   */
  public MarketplaceDeal setCreativePreApprovalPolicy(java.lang.String creativePreApprovalPolicy) {
    this.creativePreApprovalPolicy = creativePreApprovalPolicy;
    return this;
  }

  /**
   * Specifies whether the creative is safeFrame compatible (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeSafeFrameCompatibility() {
    return creativeSafeFrameCompatibility;
  }

  /**
   * Specifies whether the creative is safeFrame compatible (buyer-readonly)
   * @param creativeSafeFrameCompatibility creativeSafeFrameCompatibility or {@code null} for none
   */
  public MarketplaceDeal setCreativeSafeFrameCompatibility(java.lang.String creativeSafeFrameCompatibility) {
    this.creativeSafeFrameCompatibility = creativeSafeFrameCompatibility;
    return this;
  }

  /**
   * A unique deal-id for the deal (readonly).
   * @return value or {@code null} for none
   */
  public java.lang.String getDealId() {
    return dealId;
  }

  /**
   * A unique deal-id for the deal (readonly).
   * @param dealId dealId or {@code null} for none
   */
  public MarketplaceDeal setDealId(java.lang.String dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * Metadata about the serving status of this deal (readonly, writes via custom actions)
   * @return value or {@code null} for none
   */
  public DealServingMetadata getDealServingMetadata() {
    return dealServingMetadata;
  }

  /**
   * Metadata about the serving status of this deal (readonly, writes via custom actions)
   * @param dealServingMetadata dealServingMetadata or {@code null} for none
   */
  public MarketplaceDeal setDealServingMetadata(DealServingMetadata dealServingMetadata) {
    this.dealServingMetadata = dealServingMetadata;
    return this;
  }

  /**
   * The set of fields around delivery control that are interesting for a buyer to see but are non-
   * negotiable. These are set by the publisher. This message is assigned an id of 100 since some
   * day we would want to model this as a protobuf extension.
   * @return value or {@code null} for none
   */
  public DeliveryControl getDeliveryControl() {
    return deliveryControl;
  }

  /**
   * The set of fields around delivery control that are interesting for a buyer to see but are non-
   * negotiable. These are set by the publisher. This message is assigned an id of 100 since some
   * day we would want to model this as a protobuf extension.
   * @param deliveryControl deliveryControl or {@code null} for none
   */
  public MarketplaceDeal setDeliveryControl(DeliveryControl deliveryControl) {
    this.deliveryControl = deliveryControl;
    return this;
  }

  /**
   * The external deal id assigned to this deal once the deal is finalized. This is the deal-id that
   * shows up in serving/reporting etc. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalDealId() {
    return externalDealId;
  }

  /**
   * The external deal id assigned to this deal once the deal is finalized. This is the deal-id that
   * shows up in serving/reporting etc. (readonly)
   * @param externalDealId externalDealId or {@code null} for none
   */
  public MarketplaceDeal setExternalDealId(java.lang.String externalDealId) {
    this.externalDealId = externalDealId;
    return this;
  }

  /**
   * Proposed flight end time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * @return value or {@code null} for none
   */
  public java.lang.Long getFlightEndTimeMs() {
    return flightEndTimeMs;
  }

  /**
   * Proposed flight end time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * @param flightEndTimeMs flightEndTimeMs or {@code null} for none
   */
  public MarketplaceDeal setFlightEndTimeMs(java.lang.Long flightEndTimeMs) {
    this.flightEndTimeMs = flightEndTimeMs;
    return this;
  }

  /**
   * Proposed flight start time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * @return value or {@code null} for none
   */
  public java.lang.Long getFlightStartTimeMs() {
    return flightStartTimeMs;
  }

  /**
   * Proposed flight start time of the deal (ms since epoch) This will generally be stored in a
   * granularity of a second. (updatable)
   * @param flightStartTimeMs flightStartTimeMs or {@code null} for none
   */
  public MarketplaceDeal setFlightStartTimeMs(java.lang.Long flightStartTimeMs) {
    this.flightStartTimeMs = flightStartTimeMs;
    return this;
  }

  /**
   * Description for the deal terms. (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getInventoryDescription() {
    return inventoryDescription;
  }

  /**
   * Description for the deal terms. (buyer-readonly)
   * @param inventoryDescription inventoryDescription or {@code null} for none
   */
  public MarketplaceDeal setInventoryDescription(java.lang.String inventoryDescription) {
    this.inventoryDescription = inventoryDescription;
    return this;
  }

  /**
   * Indicates whether the current deal is a RFP template. RFP template is created by buyer and not
   * based on seller created products.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRfpTemplate() {
    return isRfpTemplate;
  }

  /**
   * Indicates whether the current deal is a RFP template. RFP template is created by buyer and not
   * based on seller created products.
   * @param isRfpTemplate isRfpTemplate or {@code null} for none
   */
  public MarketplaceDeal setIsRfpTemplate(java.lang.Boolean isRfpTemplate) {
    this.isRfpTemplate = isRfpTemplate;
    return this;
  }

  /**
   * True, if the buyside inventory setup is complete for this deal. (readonly, except via
   * OrderSetupCompleted action)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSetupComplete() {
    return isSetupComplete;
  }

  /**
   * True, if the buyside inventory setup is complete for this deal. (readonly, except via
   * OrderSetupCompleted action)
   * @param isSetupComplete isSetupComplete or {@code null} for none
   */
  public MarketplaceDeal setIsSetupComplete(java.lang.Boolean isSetupComplete) {
    this.isSetupComplete = isSetupComplete;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceDeal".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "adexchangebuyer#marketplaceDeal".
   * @param kind kind or {@code null} for none
   */
  public MarketplaceDeal setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The time (ms since epoch) when the deal was last updated. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdateTimeMs() {
    return lastUpdateTimeMs;
  }

  /**
   * The time (ms since epoch) when the deal was last updated. (readonly)
   * @param lastUpdateTimeMs lastUpdateTimeMs or {@code null} for none
   */
  public MarketplaceDeal setLastUpdateTimeMs(java.lang.Long lastUpdateTimeMs) {
    this.lastUpdateTimeMs = lastUpdateTimeMs;
    return this;
  }

  /**
   * The name of the deal. (updatable)
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the deal. (updatable)
   * @param name name or {@code null} for none
   */
  public MarketplaceDeal setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The product-id from which this deal was created. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The product-id from which this deal was created. (readonly, except on create)
   * @param productId productId or {@code null} for none
   */
  public MarketplaceDeal setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The revision number of the product that the deal was created from (readonly, except on create)
   * @return value or {@code null} for none
   */
  public java.lang.Long getProductRevisionNumber() {
    return productRevisionNumber;
  }

  /**
   * The revision number of the product that the deal was created from (readonly, except on create)
   * @param productRevisionNumber productRevisionNumber or {@code null} for none
   */
  public MarketplaceDeal setProductRevisionNumber(java.lang.Long productRevisionNumber) {
    this.productRevisionNumber = productRevisionNumber;
    return this;
  }

  /**
   * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by
   * seller and ADVERTISR means creative is provided by buyer. (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getProgrammaticCreativeSource() {
    return programmaticCreativeSource;
  }

  /**
   * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by
   * seller and ADVERTISR means creative is provided by buyer. (buyer-readonly)
   * @param programmaticCreativeSource programmaticCreativeSource or {@code null} for none
   */
  public MarketplaceDeal setProgrammaticCreativeSource(java.lang.String programmaticCreativeSource) {
    this.programmaticCreativeSource = programmaticCreativeSource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalId() {
    return proposalId;
  }

  /**
   * @param proposalId proposalId or {@code null} for none
   */
  public MarketplaceDeal setProposalId(java.lang.String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * Optional Seller contact information for the deal (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getSellerContacts() {
    return sellerContacts;
  }

  /**
   * Optional Seller contact information for the deal (buyer-readonly)
   * @param sellerContacts sellerContacts or {@code null} for none
   */
  public MarketplaceDeal setSellerContacts(java.util.List<ContactInformation> sellerContacts) {
    this.sellerContacts = sellerContacts;
    return this;
  }

  /**
   * The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd
   * together. (updatable)
   * @return value or {@code null} for none
   */
  public java.util.List<SharedTargeting> getSharedTargetings() {
    return sharedTargetings;
  }

  /**
   * The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd
   * together. (updatable)
   * @param sharedTargetings sharedTargetings or {@code null} for none
   */
  public MarketplaceDeal setSharedTargetings(java.util.List<SharedTargeting> sharedTargetings) {
    this.sharedTargetings = sharedTargetings;
    return this;
  }

  /**
   * The syndication product associated with the deal. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public java.lang.String getSyndicationProduct() {
    return syndicationProduct;
  }

  /**
   * The syndication product associated with the deal. (readonly, except on create)
   * @param syndicationProduct syndicationProduct or {@code null} for none
   */
  public MarketplaceDeal setSyndicationProduct(java.lang.String syndicationProduct) {
    this.syndicationProduct = syndicationProduct;
    return this;
  }

  /**
   * The negotiable terms of the deal. (updatable)
   * @return value or {@code null} for none
   */
  public DealTerms getTerms() {
    return terms;
  }

  /**
   * The negotiable terms of the deal. (updatable)
   * @param terms terms or {@code null} for none
   */
  public MarketplaceDeal setTerms(DealTerms terms) {
    this.terms = terms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebPropertyCode() {
    return webPropertyCode;
  }

  /**
   * @param webPropertyCode webPropertyCode or {@code null} for none
   */
  public MarketplaceDeal setWebPropertyCode(java.lang.String webPropertyCode) {
    this.webPropertyCode = webPropertyCode;
    return this;
  }

  @Override
  public MarketplaceDeal set(String fieldName, Object value) {
    return (MarketplaceDeal) super.set(fieldName, value);
  }

  @Override
  public MarketplaceDeal clone() {
    return (MarketplaceDeal) super.clone();
  }

}