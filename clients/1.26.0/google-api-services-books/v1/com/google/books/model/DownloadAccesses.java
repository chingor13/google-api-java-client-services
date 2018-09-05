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
 * Model definition for DownloadAccesses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DownloadAccesses extends com.google.api.client.json.GenericJson {

  /**
   * A list of download access responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DownloadAccessRestriction> downloadAccessList;

  static {
    // hack to force ProGuard to consider DownloadAccessRestriction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DownloadAccessRestriction.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of download access responses.
   * @return value or {@code null} for none
   */
  public java.util.List<DownloadAccessRestriction> getDownloadAccessList() {
    return downloadAccessList;
  }

  /**
   * A list of download access responses.
   * @param downloadAccessList downloadAccessList or {@code null} for none
   */
  public DownloadAccesses setDownloadAccessList(java.util.List<DownloadAccessRestriction> downloadAccessList) {
    this.downloadAccessList = downloadAccessList;
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
  public DownloadAccesses setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public DownloadAccesses set(String fieldName, Object value) {
    return (DownloadAccesses) super.set(fieldName, value);
  }

  @Override
  public DownloadAccesses clone() {
    return (DownloadAccesses) super.clone();
  }

}