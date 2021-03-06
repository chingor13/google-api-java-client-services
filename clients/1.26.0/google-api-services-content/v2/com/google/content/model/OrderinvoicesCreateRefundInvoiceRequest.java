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
 * Model definition for OrderinvoicesCreateRefundInvoiceRequest.
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
public final class OrderinvoicesCreateRefundInvoiceRequest extends com.google.api.client.json.GenericJson {

  /**
   * [required] The ID of the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceId;

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Option to create a refund-only invoice. Exactly one of refundOnlyOption or returnOption must be
   * provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption refundOnlyOption;

  /**
   * Option to create an invoice for a refund and mark all items within the invoice as returned.
   * Exactly one of refundOnlyOption or returnOption must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption returnOption;

  /**
   * Invoice details for different shipment groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ShipmentInvoice> shipmentInvoices;

  /**
   * [required] The ID of the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceId() {
    return invoiceId;
  }

  /**
   * [required] The ID of the invoice.
   * @param invoiceId invoiceId or {@code null} for none
   */
  public OrderinvoicesCreateRefundInvoiceRequest setInvoiceId(java.lang.String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * @param operationId operationId or {@code null} for none
   */
  public OrderinvoicesCreateRefundInvoiceRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Option to create a refund-only invoice. Exactly one of refundOnlyOption or returnOption must be
   * provided.
   * @return value or {@code null} for none
   */
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption getRefundOnlyOption() {
    return refundOnlyOption;
  }

  /**
   * Option to create a refund-only invoice. Exactly one of refundOnlyOption or returnOption must be
   * provided.
   * @param refundOnlyOption refundOnlyOption or {@code null} for none
   */
  public OrderinvoicesCreateRefundInvoiceRequest setRefundOnlyOption(OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption refundOnlyOption) {
    this.refundOnlyOption = refundOnlyOption;
    return this;
  }

  /**
   * Option to create an invoice for a refund and mark all items within the invoice as returned.
   * Exactly one of refundOnlyOption or returnOption must be provided.
   * @return value or {@code null} for none
   */
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption getReturnOption() {
    return returnOption;
  }

  /**
   * Option to create an invoice for a refund and mark all items within the invoice as returned.
   * Exactly one of refundOnlyOption or returnOption must be provided.
   * @param returnOption returnOption or {@code null} for none
   */
  public OrderinvoicesCreateRefundInvoiceRequest setReturnOption(OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption returnOption) {
    this.returnOption = returnOption;
    return this;
  }

  /**
   * Invoice details for different shipment groups.
   * @return value or {@code null} for none
   */
  public java.util.List<ShipmentInvoice> getShipmentInvoices() {
    return shipmentInvoices;
  }

  /**
   * Invoice details for different shipment groups.
   * @param shipmentInvoices shipmentInvoices or {@code null} for none
   */
  public OrderinvoicesCreateRefundInvoiceRequest setShipmentInvoices(java.util.List<ShipmentInvoice> shipmentInvoices) {
    this.shipmentInvoices = shipmentInvoices;
    return this;
  }

  @Override
  public OrderinvoicesCreateRefundInvoiceRequest set(String fieldName, Object value) {
    return (OrderinvoicesCreateRefundInvoiceRequest) super.set(fieldName, value);
  }

  @Override
  public OrderinvoicesCreateRefundInvoiceRequest clone() {
    return (OrderinvoicesCreateRefundInvoiceRequest) super.clone();
  }

}
