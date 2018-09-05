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
 * Model definition for OrdersInStoreRefundLineItemRequest.
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
public final class OrdersInStoreRefundLineItemRequest extends com.google.api.client.json.GenericJson {

  /**
   * The amount that is refunded. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amountPretax;

  /**
   * Tax amount that correspond to refund amount in amountPretax. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amountTax;

  /**
   * The ID of the line item to return. Either lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemId;

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * The ID of the product to return. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The quantity to return and refund.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantity;

  /**
   * The reason for the return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The explanation of the reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reasonText;

  /**
   * The amount that is refunded. Required.
   * @return value or {@code null} for none
   */
  public Price getAmountPretax() {
    return amountPretax;
  }

  /**
   * The amount that is refunded. Required.
   * @param amountPretax amountPretax or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setAmountPretax(Price amountPretax) {
    this.amountPretax = amountPretax;
    return this;
  }

  /**
   * Tax amount that correspond to refund amount in amountPretax. Required.
   * @return value or {@code null} for none
   */
  public Price getAmountTax() {
    return amountTax;
  }

  /**
   * Tax amount that correspond to refund amount in amountPretax. Required.
   * @param amountTax amountTax or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setAmountTax(Price amountTax) {
    this.amountTax = amountTax;
    return this;
  }

  /**
   * The ID of the line item to return. Either lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * The ID of the line item to return. Either lineItemId or productId is required.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setLineItemId(java.lang.String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * @param operationId operationId or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The ID of the product to return. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product to return. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @param productId productId or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The quantity to return and refund.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * The quantity to return and refund.
   * @param quantity quantity or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The reason for the return.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for the return.
   * @param reason reason or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The explanation of the reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getReasonText() {
    return reasonText;
  }

  /**
   * The explanation of the reason.
   * @param reasonText reasonText or {@code null} for none
   */
  public OrdersInStoreRefundLineItemRequest setReasonText(java.lang.String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  @Override
  public OrdersInStoreRefundLineItemRequest set(String fieldName, Object value) {
    return (OrdersInStoreRefundLineItemRequest) super.set(fieldName, value);
  }

  @Override
  public OrdersInStoreRefundLineItemRequest clone() {
    return (OrdersInStoreRefundLineItemRequest) super.clone();
  }

}