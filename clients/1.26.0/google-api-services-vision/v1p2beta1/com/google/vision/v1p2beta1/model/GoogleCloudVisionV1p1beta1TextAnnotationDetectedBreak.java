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

package com.google.vision.v1p2beta1.model;

/**
 * Detected start or end of a structural component.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak extends com.google.api.client.json.GenericJson {

  /**
   * True if break prepends the element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPrefix;

  /**
   * Detected break type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * True if break prepends the element.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPrefix() {
    return isPrefix;
  }

  /**
   * True if break prepends the element.
   * @param isPrefix isPrefix or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak setIsPrefix(java.lang.Boolean isPrefix) {
    this.isPrefix = isPrefix;
    return this;
  }

  /**
   * Detected break type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Detected break type.
   * @param type type or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak clone() {
    return (GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak) super.clone();
  }

}
