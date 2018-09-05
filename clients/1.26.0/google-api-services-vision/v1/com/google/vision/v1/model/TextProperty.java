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

package com.google.vision.v1.model;

/**
 * Additional information detected on the structural component.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextProperty extends com.google.api.client.json.GenericJson {

  /**
   * Detected start or end of a text segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DetectedBreak detectedBreak;

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DetectedLanguage> detectedLanguages;

  /**
   * Detected start or end of a text segment.
   * @return value or {@code null} for none
   */
  public DetectedBreak getDetectedBreak() {
    return detectedBreak;
  }

  /**
   * Detected start or end of a text segment.
   * @param detectedBreak detectedBreak or {@code null} for none
   */
  public TextProperty setDetectedBreak(DetectedBreak detectedBreak) {
    this.detectedBreak = detectedBreak;
    return this;
  }

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<DetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public TextProperty setDetectedLanguages(java.util.List<DetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  @Override
  public TextProperty set(String fieldName, Object value) {
    return (TextProperty) super.set(fieldName, value);
  }

  @Override
  public TextProperty clone() {
    return (TextProperty) super.clone();
  }

}