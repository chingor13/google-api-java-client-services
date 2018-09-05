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

package com.google.tagmanager.model;

/**
 * Represents an external user or internal Google Tag Manager system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkspaceProposalUser extends com.google.api.client.json.GenericJson {

  /**
   * Gaia id associated with a user, absent for the Google Tag Manager system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gaiaId;

  /**
   * User type distinguishes between a user and the Google Tag Manager system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Gaia id associated with a user, absent for the Google Tag Manager system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGaiaId() {
    return gaiaId;
  }

  /**
   * Gaia id associated with a user, absent for the Google Tag Manager system.
   * @param gaiaId gaiaId or {@code null} for none
   */
  public WorkspaceProposalUser setGaiaId(java.lang.Long gaiaId) {
    this.gaiaId = gaiaId;
    return this;
  }

  /**
   * User type distinguishes between a user and the Google Tag Manager system.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * User type distinguishes between a user and the Google Tag Manager system.
   * @param type type or {@code null} for none
   */
  public WorkspaceProposalUser setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public WorkspaceProposalUser set(String fieldName, Object value) {
    return (WorkspaceProposalUser) super.set(fieldName, value);
  }

  @Override
  public WorkspaceProposalUser clone() {
    return (WorkspaceProposalUser) super.clone();
  }

}