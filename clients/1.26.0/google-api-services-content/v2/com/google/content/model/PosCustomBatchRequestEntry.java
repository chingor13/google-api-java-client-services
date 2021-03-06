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

package com.google.content.model;

/**
 * Model definition for PosCustomBatchRequestEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PosCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * The inventory to submit. Set this only if the method is inventory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosInventory inventory;

  /**
   * The ID of the POS data provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The sale information to submit. Set this only if the method is sale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosSale sale;

  /**
   * The store information to submit. Set this only if the method is insert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PosStore store;

  /**
   * The store code. Set this only if the method is delete or get.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeCode;

  /**
   * The ID of the account for which to get/submit data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger targetMerchantId;

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public PosCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The inventory to submit. Set this only if the method is inventory.
   * @return value or {@code null} for none
   */
  public PosInventory getInventory() {
    return inventory;
  }

  /**
   * The inventory to submit. Set this only if the method is inventory.
   * @param inventory inventory or {@code null} for none
   */
  public PosCustomBatchRequestEntry setInventory(PosInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * The ID of the POS data provider.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the POS data provider.
   * @param merchantId merchantId or {@code null} for none
   */
  public PosCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * @param method method or {@code null} for none
   */
  public PosCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * The sale information to submit. Set this only if the method is sale.
   * @return value or {@code null} for none
   */
  public PosSale getSale() {
    return sale;
  }

  /**
   * The sale information to submit. Set this only if the method is sale.
   * @param sale sale or {@code null} for none
   */
  public PosCustomBatchRequestEntry setSale(PosSale sale) {
    this.sale = sale;
    return this;
  }

  /**
   * The store information to submit. Set this only if the method is insert.
   * @return value or {@code null} for none
   */
  public PosStore getStore() {
    return store;
  }

  /**
   * The store information to submit. Set this only if the method is insert.
   * @param store store or {@code null} for none
   */
  public PosCustomBatchRequestEntry setStore(PosStore store) {
    this.store = store;
    return this;
  }

  /**
   * The store code. Set this only if the method is delete or get.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreCode() {
    return storeCode;
  }

  /**
   * The store code. Set this only if the method is delete or get.
   * @param storeCode storeCode or {@code null} for none
   */
  public PosCustomBatchRequestEntry setStoreCode(java.lang.String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * The ID of the account for which to get/submit data.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTargetMerchantId() {
    return targetMerchantId;
  }

  /**
   * The ID of the account for which to get/submit data.
   * @param targetMerchantId targetMerchantId or {@code null} for none
   */
  public PosCustomBatchRequestEntry setTargetMerchantId(java.math.BigInteger targetMerchantId) {
    this.targetMerchantId = targetMerchantId;
    return this;
  }

  @Override
  public PosCustomBatchRequestEntry set(String fieldName, Object value) {
    return (PosCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public PosCustomBatchRequestEntry clone() {
    return (PosCustomBatchRequestEntry) super.clone();
  }

}
