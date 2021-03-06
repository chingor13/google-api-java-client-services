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

package com.google.genomics.model;

/**
 * The search variant sets response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchVariantSetsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The variant sets belonging to the requested dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VariantSet> variantSets;

  static {
    // hack to force ProGuard to consider VariantSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(VariantSet.class);
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchVariantSetsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The variant sets belonging to the requested dataset.
   * @return value or {@code null} for none
   */
  public java.util.List<VariantSet> getVariantSets() {
    return variantSets;
  }

  /**
   * The variant sets belonging to the requested dataset.
   * @param variantSets variantSets or {@code null} for none
   */
  public SearchVariantSetsResponse setVariantSets(java.util.List<VariantSet> variantSets) {
    this.variantSets = variantSets;
    return this;
  }

  @Override
  public SearchVariantSetsResponse set(String fieldName, Object value) {
    return (SearchVariantSetsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchVariantSetsResponse clone() {
    return (SearchVariantSetsResponse) super.clone();
  }

}
