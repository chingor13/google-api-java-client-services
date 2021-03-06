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

package com.google.bigquery.model;

/**
 * Model definition for TableRow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableRow extends com.google.api.client.json.GenericJson {

  /**
   * Represents a single row in the result set, consisting of one or more fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableCell> f;

  static {
    // hack to force ProGuard to consider TableCell used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TableCell.class);
  }

  /**
   * Represents a single row in the result set, consisting of one or more fields.
   * @return value or {@code null} for none
   */
  public java.util.List<TableCell> getF() {
    return f;
  }

  /**
   * Represents a single row in the result set, consisting of one or more fields.
   * @param f f or {@code null} for none
   */
  public TableRow setF(java.util.List<TableCell> f) {
    this.f = f;
    return this;
  }

  @Override
  public TableRow set(String fieldName, Object value) {
    return (TableRow) super.set(fieldName, value);
  }

  @Override
  public TableRow clone() {
    return (TableRow) super.clone();
  }

}
