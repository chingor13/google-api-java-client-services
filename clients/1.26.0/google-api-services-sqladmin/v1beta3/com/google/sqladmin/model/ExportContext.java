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

package com.google.sqladmin.model;

/**
 * Database instance export context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportContext extends com.google.api.client.json.GenericJson {

  /**
   * Databases (for example, guestbook) from which the export is made. If unspecified, all databases
   * are exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> database;

  /**
   * This is always sql#exportContext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Tables to export, or that were exported, from the specified database. If you specify tables,
   * specify one and only one database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> table;

  /**
   * The path to the file in Google Cloud Storage where the export will be stored, or where it was
   * already stored. The URI is in the form gs://bucketName/fileName. If the file already exists,
   * the operation fails. If the filename ends with .gz, the contents are compressed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Databases (for example, guestbook) from which the export is made. If unspecified, all databases
   * are exported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDatabase() {
    return database;
  }

  /**
   * Databases (for example, guestbook) from which the export is made. If unspecified, all databases
   * are exported.
   * @param database database or {@code null} for none
   */
  public ExportContext setDatabase(java.util.List<java.lang.String> database) {
    this.database = database;
    return this;
  }

  /**
   * This is always sql#exportContext.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#exportContext.
   * @param kind kind or {@code null} for none
   */
  public ExportContext setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Tables to export, or that were exported, from the specified database. If you specify tables,
   * specify one and only one database.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTable() {
    return table;
  }

  /**
   * Tables to export, or that were exported, from the specified database. If you specify tables,
   * specify one and only one database.
   * @param table table or {@code null} for none
   */
  public ExportContext setTable(java.util.List<java.lang.String> table) {
    this.table = table;
    return this;
  }

  /**
   * The path to the file in Google Cloud Storage where the export will be stored, or where it was
   * already stored. The URI is in the form gs://bucketName/fileName. If the file already exists,
   * the operation fails. If the filename ends with .gz, the contents are compressed.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The path to the file in Google Cloud Storage where the export will be stored, or where it was
   * already stored. The URI is in the form gs://bucketName/fileName. If the file already exists,
   * the operation fails. If the filename ends with .gz, the contents are compressed.
   * @param uri uri or {@code null} for none
   */
  public ExportContext setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ExportContext set(String fieldName, Object value) {
    return (ExportContext) super.set(fieldName, value);
  }

  @Override
  public ExportContext clone() {
    return (ExportContext) super.clone();
  }

}