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
 * Model definition for ExternalId.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalId extends com.google.api.client.json.GenericJson {

  /**
   * The id used by the source of this data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The name of the source of this data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceName;

  /**
   * The id used by the source of this data.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The id used by the source of this data.
   * @param id id or {@code null} for none
   */
  public ExternalId setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The name of the source of this data.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceName() {
    return sourceName;
  }

  /**
   * The name of the source of this data.
   * @param sourceName sourceName or {@code null} for none
   */
  public ExternalId setSourceName(java.lang.String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  @Override
  public ExternalId set(String fieldName, Object value) {
    return (ExternalId) super.set(fieldName, value);
  }

  @Override
  public ExternalId clone() {
    return (ExternalId) super.clone();
  }

}