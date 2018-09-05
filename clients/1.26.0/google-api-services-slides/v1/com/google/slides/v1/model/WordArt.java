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

package com.google.slides.v1.model;

/**
 * A PageElement kind representing word art.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WordArt extends com.google.api.client.json.GenericJson {

  /**
   * The text rendered as word art.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String renderedText;

  /**
   * The text rendered as word art.
   * @return value or {@code null} for none
   */
  public java.lang.String getRenderedText() {
    return renderedText;
  }

  /**
   * The text rendered as word art.
   * @param renderedText renderedText or {@code null} for none
   */
  public WordArt setRenderedText(java.lang.String renderedText) {
    this.renderedText = renderedText;
    return this;
  }

  @Override
  public WordArt set(String fieldName, Object value) {
    return (WordArt) super.set(fieldName, value);
  }

  @Override
  public WordArt clone() {
    return (WordArt) super.clone();
  }

}