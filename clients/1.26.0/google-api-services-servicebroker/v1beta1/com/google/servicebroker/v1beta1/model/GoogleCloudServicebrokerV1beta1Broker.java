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

package com.google.servicebroker.v1beta1.model;

/**
 * Broker represents a consumable collection of Service Registry catalogs exposed as an OSB Broker.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Broker API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudServicebrokerV1beta1Broker extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp for when the broker was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Name of the broker in the format: //brokers/. This allows for multiple brokers per project
   * which can be used to enable having custom brokers per GKE cluster, for example.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User friendly title of the broker. Limited to 1024 characters. Requests with longer titles will
   * be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. URL of the broker OSB-compliant endpoint, for example:
   * https://servicebroker.googleapis.com/projects//brokers/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Output only. Timestamp for when the broker was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp for when the broker was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Broker setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Name of the broker in the format: //brokers/. This allows for multiple brokers per project
   * which can be used to enable having custom brokers per GKE cluster, for example.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the broker in the format: //brokers/. This allows for multiple brokers per project
   * which can be used to enable having custom brokers per GKE cluster, for example.
   * @param name name or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Broker setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User friendly title of the broker. Limited to 1024 characters. Requests with longer titles will
   * be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * User friendly title of the broker. Limited to 1024 characters. Requests with longer titles will
   * be rejected.
   * @param title title or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Broker setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. URL of the broker OSB-compliant endpoint, for example:
   * https://servicebroker.googleapis.com/projects//brokers/
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Output only. URL of the broker OSB-compliant endpoint, for example:
   * https://servicebroker.googleapis.com/projects//brokers/
   * @param url url or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Broker setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public GoogleCloudServicebrokerV1beta1Broker set(String fieldName, Object value) {
    return (GoogleCloudServicebrokerV1beta1Broker) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudServicebrokerV1beta1Broker clone() {
    return (GoogleCloudServicebrokerV1beta1Broker) super.clone();
  }

}
