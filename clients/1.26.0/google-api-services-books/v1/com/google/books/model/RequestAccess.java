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

package com.google.books.model;

/**
 * Model definition for RequestAccess.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestAccess extends com.google.api.client.json.GenericJson {

  /**
   * A concurrent access response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConcurrentAccessRestriction concurrentAccess;

  /**
   * A download access response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DownloadAccessRestriction downloadAccess;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A concurrent access response.
   * @return value or {@code null} for none
   */
  public ConcurrentAccessRestriction getConcurrentAccess() {
    return concurrentAccess;
  }

  /**
   * A concurrent access response.
   * @param concurrentAccess concurrentAccess or {@code null} for none
   */
  public RequestAccess setConcurrentAccess(ConcurrentAccessRestriction concurrentAccess) {
    this.concurrentAccess = concurrentAccess;
    return this;
  }

  /**
   * A download access response.
   * @return value or {@code null} for none
   */
  public DownloadAccessRestriction getDownloadAccess() {
    return downloadAccess;
  }

  /**
   * A download access response.
   * @param downloadAccess downloadAccess or {@code null} for none
   */
  public RequestAccess setDownloadAccess(DownloadAccessRestriction downloadAccess) {
    this.downloadAccess = downloadAccess;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public RequestAccess setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public RequestAccess set(String fieldName, Object value) {
    return (RequestAccess) super.set(fieldName, value);
  }

  @Override
  public RequestAccess clone() {
    return (RequestAccess) super.clone();
  }

}
