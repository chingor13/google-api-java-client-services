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

package com.google.vault.v1.model;

/**
 * An export file on cloud storage
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudStorageFile extends com.google.api.client.json.GenericJson {

  /**
   * The cloud storage bucket name of this export file. Can be used in cloud storage JSON/XML API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketName;

  /**
   * The md5 hash of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Hash;

  /**
   * The cloud storage object name of this export file. Can be used in cloud storage JSON/XML API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectName;

  /**
   * The size of the export file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long size;

  /**
   * The cloud storage bucket name of this export file. Can be used in cloud storage JSON/XML API.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketName() {
    return bucketName;
  }

  /**
   * The cloud storage bucket name of this export file. Can be used in cloud storage JSON/XML API.
   * @param bucketName bucketName or {@code null} for none
   */
  public CloudStorageFile setBucketName(java.lang.String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * The md5 hash of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Hash() {
    return md5Hash;
  }

  /**
   * The md5 hash of the file.
   * @param md5Hash md5Hash or {@code null} for none
   */
  public CloudStorageFile setMd5Hash(java.lang.String md5Hash) {
    this.md5Hash = md5Hash;
    return this;
  }

  /**
   * The cloud storage object name of this export file. Can be used in cloud storage JSON/XML API.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectName() {
    return objectName;
  }

  /**
   * The cloud storage object name of this export file. Can be used in cloud storage JSON/XML API.
   * @param objectName objectName or {@code null} for none
   */
  public CloudStorageFile setObjectName(java.lang.String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * The size of the export file.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * The size of the export file.
   * @param size size or {@code null} for none
   */
  public CloudStorageFile setSize(java.lang.Long size) {
    this.size = size;
    return this;
  }

  @Override
  public CloudStorageFile set(String fieldName, Object value) {
    return (CloudStorageFile) super.set(fieldName, value);
  }

  @Override
  public CloudStorageFile clone() {
    return (CloudStorageFile) super.clone();
  }

}