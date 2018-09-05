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

package com.google.androidenterprise.model;

/**
 * An event generated whenever a product's availability changes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductAvailabilityChangeEvent extends com.google.api.client.json.GenericJson {

  /**
   * The new state of the product. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availabilityStatus;

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which the product availability
   * changed. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The new state of the product. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailabilityStatus() {
    return availabilityStatus;
  }

  /**
   * The new state of the product. This field will always be present.
   * @param availabilityStatus availabilityStatus or {@code null} for none
   */
  public ProductAvailabilityChangeEvent setAvailabilityStatus(java.lang.String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
    return this;
  }

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which the product availability
   * changed. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which the product availability
   * changed. This field will always be present.
   * @param productId productId or {@code null} for none
   */
  public ProductAvailabilityChangeEvent setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public ProductAvailabilityChangeEvent set(String fieldName, Object value) {
    return (ProductAvailabilityChangeEvent) super.set(fieldName, value);
  }

  @Override
  public ProductAvailabilityChangeEvent clone() {
    return (ProductAvailabilityChangeEvent) super.clone();
  }

}