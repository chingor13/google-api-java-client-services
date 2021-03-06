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

package com.google.videointelligence.v1beta1.model;

/**
 * Safe search annotation (based on per-frame visual signals only). If no unsafe content has been
 * detected in a frame, no annotations are present for that frame. If only some types of unsafe
 * content have been detected in a frame, the likelihood is set to `UNKNOWN` for all other types of
 * unsafe content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Likelihood of adult content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adult;

  /**
   * Likelihood of medical content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String medical;

  /**
   * Likelihood of racy content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String racy;

  /**
   * Likelihood that an obvious modification was made to the original version to make it appear
   * funny or offensive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spoof;

  /**
   * Video time offset in microseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeOffset;

  /**
   * Likelihood of violent content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String violent;

  /**
   * Likelihood of adult content.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdult() {
    return adult;
  }

  /**
   * Likelihood of adult content.
   * @param adult adult or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setAdult(java.lang.String adult) {
    this.adult = adult;
    return this;
  }

  /**
   * Likelihood of medical content.
   * @return value or {@code null} for none
   */
  public java.lang.String getMedical() {
    return medical;
  }

  /**
   * Likelihood of medical content.
   * @param medical medical or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setMedical(java.lang.String medical) {
    this.medical = medical;
    return this;
  }

  /**
   * Likelihood of racy content.
   * @return value or {@code null} for none
   */
  public java.lang.String getRacy() {
    return racy;
  }

  /**
   * Likelihood of racy content.
   * @param racy racy or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setRacy(java.lang.String racy) {
    this.racy = racy;
    return this;
  }

  /**
   * Likelihood that an obvious modification was made to the original version to make it appear
   * funny or offensive.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpoof() {
    return spoof;
  }

  /**
   * Likelihood that an obvious modification was made to the original version to make it appear
   * funny or offensive.
   * @param spoof spoof or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setSpoof(java.lang.String spoof) {
    this.spoof = spoof;
    return this;
  }

  /**
   * Video time offset in microseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeOffset() {
    return timeOffset;
  }

  /**
   * Video time offset in microseconds.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setTimeOffset(java.lang.Long timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  /**
   * Likelihood of violent content.
   * @return value or {@code null} for none
   */
  public java.lang.String getViolent() {
    return violent;
  }

  /**
   * Likelihood of violent content.
   * @param violent violent or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation setViolent(java.lang.String violent) {
    this.violent = violent;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation clone() {
    return (GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation) super.clone();
  }

}
