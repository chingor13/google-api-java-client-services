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

package com.google.compute.model;

/**
 * Model definition for ProjectsGetXpnResources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectsGetXpnResources extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   * resources (a.k.a service projects)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Service resources (a.k.a service projects) attached to this project as their shared VPC host.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XpnResourceId> resources;

  /**
   * [Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   * resources (a.k.a service projects)
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service
   * resources (a.k.a service projects)
   * @param kind kind or {@code null} for none
   */
  public ProjectsGetXpnResources setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ProjectsGetXpnResources setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Service resources (a.k.a service projects) attached to this project as their shared VPC host.
   * @return value or {@code null} for none
   */
  public java.util.List<XpnResourceId> getResources() {
    return resources;
  }

  /**
   * Service resources (a.k.a service projects) attached to this project as their shared VPC host.
   * @param resources resources or {@code null} for none
   */
  public ProjectsGetXpnResources setResources(java.util.List<XpnResourceId> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public ProjectsGetXpnResources set(String fieldName, Object value) {
    return (ProjectsGetXpnResources) super.set(fieldName, value);
  }

  @Override
  public ProjectsGetXpnResources clone() {
    return (ProjectsGetXpnResources) super.clone();
  }

}
