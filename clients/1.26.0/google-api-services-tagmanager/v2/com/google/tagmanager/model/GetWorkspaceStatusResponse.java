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
 * The changes that have occurred in the workspace since the base container version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetWorkspaceStatusResponse extends com.google.api.client.json.GenericJson {

  /**
   * The merge conflict after sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MergeConflict> mergeConflict;

  /**
   * Entities that have been changed in the workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Entity> workspaceChange;

  static {
    // hack to force ProGuard to consider Entity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Entity.class);
  }

  /**
   * The merge conflict after sync.
   * @return value or {@code null} for none
   */
  public java.util.List<MergeConflict> getMergeConflict() {
    return mergeConflict;
  }

  /**
   * The merge conflict after sync.
   * @param mergeConflict mergeConflict or {@code null} for none
   */
  public GetWorkspaceStatusResponse setMergeConflict(java.util.List<MergeConflict> mergeConflict) {
    this.mergeConflict = mergeConflict;
    return this;
  }

  /**
   * Entities that have been changed in the workspace.
   * @return value or {@code null} for none
   */
  public java.util.List<Entity> getWorkspaceChange() {
    return workspaceChange;
  }

  /**
   * Entities that have been changed in the workspace.
   * @param workspaceChange workspaceChange or {@code null} for none
   */
  public GetWorkspaceStatusResponse setWorkspaceChange(java.util.List<Entity> workspaceChange) {
    this.workspaceChange = workspaceChange;
    return this;
  }

  @Override
  public GetWorkspaceStatusResponse set(String fieldName, Object value) {
    return (GetWorkspaceStatusResponse) super.set(fieldName, value);
  }

  @Override
  public GetWorkspaceStatusResponse clone() {
    return (GetWorkspaceStatusResponse) super.clone();
  }

}
