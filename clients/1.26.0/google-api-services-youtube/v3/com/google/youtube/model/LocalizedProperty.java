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

package com.google.youtube.model;

/**
 * Model definition for LocalizedProperty.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocalizedProperty extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("default")
  private java.lang.String default__;

  /**
   * The language of the default property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LanguageTag defaultLanguage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalizedString> localized;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDefault() {
    return default__;
  }

  /**
   * @param default__ default__ or {@code null} for none
   */
  public LocalizedProperty setDefault(java.lang.String default__) {
    this.default__ = default__;
    return this;
  }

  /**
   * The language of the default property.
   * @return value or {@code null} for none
   */
  public LanguageTag getDefaultLanguage() {
    return defaultLanguage;
  }

  /**
   * The language of the default property.
   * @param defaultLanguage defaultLanguage or {@code null} for none
   */
  public LocalizedProperty setDefaultLanguage(LanguageTag defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LocalizedString> getLocalized() {
    return localized;
  }

  /**
   * @param localized localized or {@code null} for none
   */
  public LocalizedProperty setLocalized(java.util.List<LocalizedString> localized) {
    this.localized = localized;
    return this;
  }

  @Override
  public LocalizedProperty set(String fieldName, Object value) {
    return (LocalizedProperty) super.set(fieldName, value);
  }

  @Override
  public LocalizedProperty clone() {
    return (LocalizedProperty) super.clone();
  }

}