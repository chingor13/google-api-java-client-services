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
 * A batch entry encoding a single non-batch inventory request.
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
public final class InventoryCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * Price and availability of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Inventory inventory;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The ID of the product for which to update price and availability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The code of the store for which to update price and availability. Use online to update price
   * and availability of an online product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeCode;

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
  public InventoryCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Price and availability of the product.
   * @return value or {@code null} for none
   */
  public Inventory getInventory() {
    return inventory;
  }

  /**
   * Price and availability of the product.
   * @param inventory inventory or {@code null} for none
   */
  public InventoryCustomBatchRequestEntry setInventory(Inventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public InventoryCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The ID of the product for which to update price and availability.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product for which to update price and availability.
   * @param productId productId or {@code null} for none
   */
  public InventoryCustomBatchRequestEntry setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The code of the store for which to update price and availability. Use online to update price
   * and availability of an online product.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreCode() {
    return storeCode;
  }

  /**
   * The code of the store for which to update price and availability. Use online to update price
   * and availability of an online product.
   * @param storeCode storeCode or {@code null} for none
   */
  public InventoryCustomBatchRequestEntry setStoreCode(java.lang.String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  @Override
  public InventoryCustomBatchRequestEntry set(String fieldName, Object value) {
    return (InventoryCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public InventoryCustomBatchRequestEntry clone() {
    return (InventoryCustomBatchRequestEntry) super.clone();
  }

}
