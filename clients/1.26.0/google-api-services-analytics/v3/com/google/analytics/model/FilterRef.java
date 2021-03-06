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

package com.google.analytics.model;

/**
 * JSON template for a profile filter link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FilterRef extends com.google.api.client.json.GenericJson {

  /**
   * Account ID to which this filter belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Link for this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String href;

  /**
   * Filter ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Kind value for filter reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Account ID to which this filter belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * Account ID to which this filter belongs.
   * @param accountId accountId or {@code null} for none
   */
  public FilterRef setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Link for this filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getHref() {
    return href;
  }

  /**
   * Link for this filter.
   * @param href href or {@code null} for none
   */
  public FilterRef setHref(java.lang.String href) {
    this.href = href;
    return this;
  }

  /**
   * Filter ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Filter ID.
   * @param id id or {@code null} for none
   */
  public FilterRef setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Kind value for filter reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind value for filter reference.
   * @param kind kind or {@code null} for none
   */
  public FilterRef setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this filter.
   * @param name name or {@code null} for none
   */
  public FilterRef setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public FilterRef set(String fieldName, Object value) {
    return (FilterRef) super.set(fieldName, value);
  }

  @Override
  public FilterRef clone() {
    return (FilterRef) super.clone();
  }

}
