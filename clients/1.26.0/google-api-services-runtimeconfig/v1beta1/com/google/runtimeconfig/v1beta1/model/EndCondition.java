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

package com.google.runtimeconfig.v1beta1.model;

/**
 * The condition that a Waiter resource is waiting for.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EndCondition extends com.google.api.client.json.GenericJson {

  /**
   * The cardinality of the `EndCondition`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Cardinality cardinality;

  /**
   * The cardinality of the `EndCondition`.
   * @return value or {@code null} for none
   */
  public Cardinality getCardinality() {
    return cardinality;
  }

  /**
   * The cardinality of the `EndCondition`.
   * @param cardinality cardinality or {@code null} for none
   */
  public EndCondition setCardinality(Cardinality cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  @Override
  public EndCondition set(String fieldName, Object value) {
    return (EndCondition) super.set(fieldName, value);
  }

  @Override
  public EndCondition clone() {
    return (EndCondition) super.clone();
  }

}
