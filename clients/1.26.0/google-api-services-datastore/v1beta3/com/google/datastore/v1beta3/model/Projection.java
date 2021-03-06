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

package com.google.datastore.v1beta3.model;

/**
 * A representation of a property in a projection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Projection extends com.google.api.client.json.GenericJson {

  /**
   * The property to project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PropertyReference property;

  /**
   * The property to project.
   * @return value or {@code null} for none
   */
  public PropertyReference getProperty() {
    return property;
  }

  /**
   * The property to project.
   * @param property property or {@code null} for none
   */
  public Projection setProperty(PropertyReference property) {
    this.property = property;
    return this;
  }

  @Override
  public Projection set(String fieldName, Object value) {
    return (Projection) super.set(fieldName, value);
  }

  @Override
  public Projection clone() {
    return (Projection) super.clone();
  }

}
