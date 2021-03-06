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

package com.google.fusiontables.model;

/**
 * Represents a PointStyle within a StyleSetting
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PointStyle extends com.google.api.client.json.GenericJson {

  /**
   * Name of the icon. Use values defined in
   * http://www.google.com/fusiontables/DataSource?dsrcid=308519
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconName;

  /**
   * Column or a bucket value from which the icon name is to be determined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StyleFunction iconStyler;

  /**
   * Name of the icon. Use values defined in
   * http://www.google.com/fusiontables/DataSource?dsrcid=308519
   * @return value or {@code null} for none
   */
  public java.lang.String getIconName() {
    return iconName;
  }

  /**
   * Name of the icon. Use values defined in
   * http://www.google.com/fusiontables/DataSource?dsrcid=308519
   * @param iconName iconName or {@code null} for none
   */
  public PointStyle setIconName(java.lang.String iconName) {
    this.iconName = iconName;
    return this;
  }

  /**
   * Column or a bucket value from which the icon name is to be determined.
   * @return value or {@code null} for none
   */
  public StyleFunction getIconStyler() {
    return iconStyler;
  }

  /**
   * Column or a bucket value from which the icon name is to be determined.
   * @param iconStyler iconStyler or {@code null} for none
   */
  public PointStyle setIconStyler(StyleFunction iconStyler) {
    this.iconStyler = iconStyler;
    return this;
  }

  @Override
  public PointStyle set(String fieldName, Object value) {
    return (PointStyle) super.set(fieldName, value);
  }

  @Override
  public PointStyle clone() {
    return (PointStyle) super.clone();
  }

}
