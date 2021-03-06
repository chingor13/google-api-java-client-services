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

package com.google.script.model;

/**
 * Representation of a single script deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deployment extends com.google.api.client.json.GenericJson {

  /**
   * The deployment configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeploymentConfig deploymentConfig;

  /**
   * The deployment ID for this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentId;

  /**
   * The deployment's entry points.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntryPoint> entryPoints;

  static {
    // hack to force ProGuard to consider EntryPoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntryPoint.class);
  }

  /**
   * Last modified date time stamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The deployment configuration.
   * @return value or {@code null} for none
   */
  public DeploymentConfig getDeploymentConfig() {
    return deploymentConfig;
  }

  /**
   * The deployment configuration.
   * @param deploymentConfig deploymentConfig or {@code null} for none
   */
  public Deployment setDeploymentConfig(DeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
    return this;
  }

  /**
   * The deployment ID for this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentId() {
    return deploymentId;
  }

  /**
   * The deployment ID for this deployment.
   * @param deploymentId deploymentId or {@code null} for none
   */
  public Deployment setDeploymentId(java.lang.String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment's entry points.
   * @return value or {@code null} for none
   */
  public java.util.List<EntryPoint> getEntryPoints() {
    return entryPoints;
  }

  /**
   * The deployment's entry points.
   * @param entryPoints entryPoints or {@code null} for none
   */
  public Deployment setEntryPoints(java.util.List<EntryPoint> entryPoints) {
    this.entryPoints = entryPoints;
    return this;
  }

  /**
   * Last modified date time stamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Last modified date time stamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Deployment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Deployment set(String fieldName, Object value) {
    return (Deployment) super.set(fieldName, value);
  }

  @Override
  public Deployment clone() {
    return (Deployment) super.clone();
  }

}
