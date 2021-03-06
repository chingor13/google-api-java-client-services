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

package com.google.serviceusage.v1beta1.model;

/**
 * Response message for the `ListServices` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListServicesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token that can be passed to `ListServices` to resume a paginated query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The available services for the requested project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Service> services;

  static {
    // hack to force ProGuard to consider Service used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Service.class);
  }

  /**
   * Token that can be passed to `ListServices` to resume a paginated query.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token that can be passed to `ListServices` to resume a paginated query.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListServicesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The available services for the requested project.
   * @return value or {@code null} for none
   */
  public java.util.List<Service> getServices() {
    return services;
  }

  /**
   * The available services for the requested project.
   * @param services services or {@code null} for none
   */
  public ListServicesResponse setServices(java.util.List<Service> services) {
    this.services = services;
    return this;
  }

  @Override
  public ListServicesResponse set(String fieldName, Object value) {
    return (ListServicesResponse) super.set(fieldName, value);
  }

  @Override
  public ListServicesResponse clone() {
    return (ListServicesResponse) super.clone();
  }

}
