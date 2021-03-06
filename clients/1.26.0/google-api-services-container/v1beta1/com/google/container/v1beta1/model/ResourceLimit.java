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

package com.google.container.v1beta1.model;

/**
 * Contains information about amount of some resource in the cluster. For memory, value should be in
 * GB.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceLimit extends com.google.api.client.json.GenericJson {

  /**
   * Maximum amount of the resource in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maximum;

  /**
   * Minimum amount of the resource in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minimum;

  /**
   * Resource name "cpu", "memory" or gpu-specific string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Maximum amount of the resource in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaximum() {
    return maximum;
  }

  /**
   * Maximum amount of the resource in the cluster.
   * @param maximum maximum or {@code null} for none
   */
  public ResourceLimit setMaximum(java.lang.Long maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Minimum amount of the resource in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinimum() {
    return minimum;
  }

  /**
   * Minimum amount of the resource in the cluster.
   * @param minimum minimum or {@code null} for none
   */
  public ResourceLimit setMinimum(java.lang.Long minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Resource name "cpu", "memory" or gpu-specific string.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Resource name "cpu", "memory" or gpu-specific string.
   * @param resourceType resourceType or {@code null} for none
   */
  public ResourceLimit setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public ResourceLimit set(String fieldName, Object value) {
    return (ResourceLimit) super.set(fieldName, value);
  }

  @Override
  public ResourceLimit clone() {
    return (ResourceLimit) super.clone();
  }

}
