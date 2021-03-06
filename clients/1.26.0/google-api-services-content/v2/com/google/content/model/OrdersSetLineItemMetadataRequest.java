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
 * Model definition for OrdersSetLineItemMetadataRequest.
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
public final class OrdersSetLineItemMetadataRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderMerchantProvidedAnnotation> annotations;

  static {
    // hack to force ProGuard to consider OrderMerchantProvidedAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderMerchantProvidedAnnotation.class);
  }

  /**
   * The ID of the line item to set metadata. Either lineItemId or productId is required.
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
   * The ID of the product to set metadata. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<OrderMerchantProvidedAnnotation> getAnnotations() {
    return annotations;
  }

  /**
   * @param annotations annotations or {@code null} for none
   */
  public OrdersSetLineItemMetadataRequest setAnnotations(java.util.List<OrderMerchantProvidedAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * The ID of the line item to set metadata. Either lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * The ID of the line item to set metadata. Either lineItemId or productId is required.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrdersSetLineItemMetadataRequest setLineItemId(java.lang.String lineItemId) {
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
  public OrdersSetLineItemMetadataRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The ID of the product to set metadata. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product to set metadata. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @param productId productId or {@code null} for none
   */
  public OrdersSetLineItemMetadataRequest setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public OrdersSetLineItemMetadataRequest set(String fieldName, Object value) {
    return (OrdersSetLineItemMetadataRequest) super.set(fieldName, value);
  }

  @Override
  public OrdersSetLineItemMetadataRequest clone() {
    return (OrdersSetLineItemMetadataRequest) super.clone();
  }

}
