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

package com.google.firestore.v1beta1.model;

/**
 * The result of applying a write.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WriteResult extends com.google.api.client.json.GenericJson {

  /**
   * The results of applying each DocumentTransform.FieldTransform, in the same order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Value> transformResults;

  /**
   * The last update time of the document after applying the write. Not set after a `delete`.
   *
   * If the write did not actually change the document, this will be the previous update_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The results of applying each DocumentTransform.FieldTransform, in the same order.
   * @return value or {@code null} for none
   */
  public java.util.List<Value> getTransformResults() {
    return transformResults;
  }

  /**
   * The results of applying each DocumentTransform.FieldTransform, in the same order.
   * @param transformResults transformResults or {@code null} for none
   */
  public WriteResult setTransformResults(java.util.List<Value> transformResults) {
    this.transformResults = transformResults;
    return this;
  }

  /**
   * The last update time of the document after applying the write. Not set after a `delete`.
   *
   * If the write did not actually change the document, this will be the previous update_time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update time of the document after applying the write. Not set after a `delete`.
   *
   * If the write did not actually change the document, this will be the previous update_time.
   * @param updateTime updateTime or {@code null} for none
   */
  public WriteResult setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public WriteResult set(String fieldName, Object value) {
    return (WriteResult) super.set(fieldName, value);
  }

  @Override
  public WriteResult clone() {
    return (WriteResult) super.clone();
  }

}
