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

package com.google.testing.model;

/**
 * The currently supported Android devices.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidDeviceCatalog extends com.google.api.client.json.GenericJson {

  /**
   * The set of supported Android device models. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AndroidModel> models;

  static {
    // hack to force ProGuard to consider AndroidModel used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AndroidModel.class);
  }

  /**
   * The set of supported runtime configurations. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidRuntimeConfiguration runtimeConfiguration;

  /**
   * The set of supported Android OS versions. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AndroidVersion> versions;

  static {
    // hack to force ProGuard to consider AndroidVersion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AndroidVersion.class);
  }

  /**
   * The set of supported Android device models. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<AndroidModel> getModels() {
    return models;
  }

  /**
   * The set of supported Android device models. @OutputOnly
   * @param models models or {@code null} for none
   */
  public AndroidDeviceCatalog setModels(java.util.List<AndroidModel> models) {
    this.models = models;
    return this;
  }

  /**
   * The set of supported runtime configurations. @OutputOnly
   * @return value or {@code null} for none
   */
  public AndroidRuntimeConfiguration getRuntimeConfiguration() {
    return runtimeConfiguration;
  }

  /**
   * The set of supported runtime configurations. @OutputOnly
   * @param runtimeConfiguration runtimeConfiguration or {@code null} for none
   */
  public AndroidDeviceCatalog setRuntimeConfiguration(AndroidRuntimeConfiguration runtimeConfiguration) {
    this.runtimeConfiguration = runtimeConfiguration;
    return this;
  }

  /**
   * The set of supported Android OS versions. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<AndroidVersion> getVersions() {
    return versions;
  }

  /**
   * The set of supported Android OS versions. @OutputOnly
   * @param versions versions or {@code null} for none
   */
  public AndroidDeviceCatalog setVersions(java.util.List<AndroidVersion> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public AndroidDeviceCatalog set(String fieldName, Object value) {
    return (AndroidDeviceCatalog) super.set(fieldName, value);
  }

  @Override
  public AndroidDeviceCatalog clone() {
    return (AndroidDeviceCatalog) super.clone();
  }

}
