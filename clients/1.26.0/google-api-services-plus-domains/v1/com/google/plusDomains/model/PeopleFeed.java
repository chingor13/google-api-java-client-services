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

package com.google.plusDomains.model;

/**
 * Model definition for PeopleFeed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PeopleFeed extends com.google.api.client.json.GenericJson {

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The people in this page of results. Each item includes the id, displayName, image, and url for
   * the person. To retrieve additional profile data, see the people.get method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Person> items;

  /**
   * Identifies this resource as a collection of people. Value: "plus#peopleFeed".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Link to this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The title of this collection of people.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The total number of people available in this list. The number of people in a response might be
   * smaller due to paging. This might not be set for all collections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * ETag of this response for caching purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of this response for caching purposes.
   * @param etag etag or {@code null} for none
   */
  public PeopleFeed setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The people in this page of results. Each item includes the id, displayName, image, and url for
   * the person. To retrieve additional profile data, see the people.get method.
   * @return value or {@code null} for none
   */
  public java.util.List<Person> getItems() {
    return items;
  }

  /**
   * The people in this page of results. Each item includes the id, displayName, image, and url for
   * the person. To retrieve additional profile data, see the people.get method.
   * @param items items or {@code null} for none
   */
  public PeopleFeed setItems(java.util.List<Person> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies this resource as a collection of people. Value: "plus#peopleFeed".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a collection of people. Value: "plus#peopleFeed".
   * @param kind kind or {@code null} for none
   */
  public PeopleFeed setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PeopleFeed setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Link to this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public PeopleFeed setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The title of this collection of people.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this collection of people.
   * @param title title or {@code null} for none
   */
  public PeopleFeed setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The total number of people available in this list. The number of people in a response might be
   * smaller due to paging. This might not be set for all collections.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * The total number of people available in this list. The number of people in a response might be
   * smaller due to paging. This might not be set for all collections.
   * @param totalItems totalItems or {@code null} for none
   */
  public PeopleFeed setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public PeopleFeed set(String fieldName, Object value) {
    return (PeopleFeed) super.set(fieldName, value);
  }

  @Override
  public PeopleFeed clone() {
    return (PeopleFeed) super.clone();
  }

}
