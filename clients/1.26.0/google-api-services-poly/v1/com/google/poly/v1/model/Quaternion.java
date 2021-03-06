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

package com.google.poly.v1.model;

/**
 * A [Quaternion](//en.wikipedia.org/wiki/Quaternion). Please note: if in the response you see "w:
 * 1" and nothing else this is the default value of [0, 0, 0, 1] where x,y, and z are 0.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Poly API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Quaternion extends com.google.api.client.json.GenericJson {

  /**
   * The scalar component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double w;

  /**
   * The x component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double x;

  /**
   * The y component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double y;

  /**
   * The z component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double z;

  /**
   * The scalar component.
   * @return value or {@code null} for none
   */
  public java.lang.Double getW() {
    return w;
  }

  /**
   * The scalar component.
   * @param w w or {@code null} for none
   */
  public Quaternion setW(java.lang.Double w) {
    this.w = w;
    return this;
  }

  /**
   * The x component.
   * @return value or {@code null} for none
   */
  public java.lang.Double getX() {
    return x;
  }

  /**
   * The x component.
   * @param x x or {@code null} for none
   */
  public Quaternion setX(java.lang.Double x) {
    this.x = x;
    return this;
  }

  /**
   * The y component.
   * @return value or {@code null} for none
   */
  public java.lang.Double getY() {
    return y;
  }

  /**
   * The y component.
   * @param y y or {@code null} for none
   */
  public Quaternion setY(java.lang.Double y) {
    this.y = y;
    return this;
  }

  /**
   * The z component.
   * @return value or {@code null} for none
   */
  public java.lang.Double getZ() {
    return z;
  }

  /**
   * The z component.
   * @param z z or {@code null} for none
   */
  public Quaternion setZ(java.lang.Double z) {
    this.z = z;
    return this;
  }

  @Override
  public Quaternion set(String fieldName, Object value) {
    return (Quaternion) super.set(fieldName, value);
  }

  @Override
  public Quaternion clone() {
    return (Quaternion) super.clone();
  }

}
