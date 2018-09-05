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

package com.google.cloudbilling.model;

/**
 * Encapsulation of billing information for a GCP Console project. A project has at most one
 * associated billing account at a time (but a billing account can be assigned to multiple
 * projects).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectBillingInfo extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the billing account associated with the project, if any. For example,
   * `billingAccounts/012345-567890-ABCDEF`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingAccountName;

  /**
   * True if the project is associated with an open billing account, to which usage on the project
   * is charged. False if the project is associated with a closed billing account, or no billing
   * account at all, and therefore cannot use paid services. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean billingEnabled;

  /**
   * The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the billing information
   * for project `tokyo-rain-123` would be `projects/tokyo-rain-123/billingInfo`. This field is
   * read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the project that this `ProjectBillingInfo` represents, such as `tokyo-rain-123`. This
   * is a convenience field so that you don't need to parse the `name` field to obtain a project ID.
   * This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The resource name of the billing account associated with the project, if any. For example,
   * `billingAccounts/012345-567890-ABCDEF`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingAccountName() {
    return billingAccountName;
  }

  /**
   * The resource name of the billing account associated with the project, if any. For example,
   * `billingAccounts/012345-567890-ABCDEF`.
   * @param billingAccountName billingAccountName or {@code null} for none
   */
  public ProjectBillingInfo setBillingAccountName(java.lang.String billingAccountName) {
    this.billingAccountName = billingAccountName;
    return this;
  }

  /**
   * True if the project is associated with an open billing account, to which usage on the project
   * is charged. False if the project is associated with a closed billing account, or no billing
   * account at all, and therefore cannot use paid services. This field is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBillingEnabled() {
    return billingEnabled;
  }

  /**
   * True if the project is associated with an open billing account, to which usage on the project
   * is charged. False if the project is associated with a closed billing account, or no billing
   * account at all, and therefore cannot use paid services. This field is read-only.
   * @param billingEnabled billingEnabled or {@code null} for none
   */
  public ProjectBillingInfo setBillingEnabled(java.lang.Boolean billingEnabled) {
    this.billingEnabled = billingEnabled;
    return this;
  }

  /**
   * The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the billing information
   * for project `tokyo-rain-123` would be `projects/tokyo-rain-123/billingInfo`. This field is
   * read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the billing information
   * for project `tokyo-rain-123` would be `projects/tokyo-rain-123/billingInfo`. This field is
   * read-only.
   * @param name name or {@code null} for none
   */
  public ProjectBillingInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the project that this `ProjectBillingInfo` represents, such as `tokyo-rain-123`. This
   * is a convenience field so that you don't need to parse the `name` field to obtain a project ID.
   * This field is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The ID of the project that this `ProjectBillingInfo` represents, such as `tokyo-rain-123`. This
   * is a convenience field so that you don't need to parse the `name` field to obtain a project ID.
   * This field is read-only.
   * @param projectId projectId or {@code null} for none
   */
  public ProjectBillingInfo setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public ProjectBillingInfo set(String fieldName, Object value) {
    return (ProjectBillingInfo) super.set(fieldName, value);
  }

  @Override
  public ProjectBillingInfo clone() {
    return (ProjectBillingInfo) super.clone();
  }

}