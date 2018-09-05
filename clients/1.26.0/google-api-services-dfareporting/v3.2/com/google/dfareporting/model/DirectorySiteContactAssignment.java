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

package com.google.dfareporting.model;

/**
 * Directory Site Contact Assignment
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectorySiteContactAssignment extends com.google.api.client.json.GenericJson {

  /**
   * ID of this directory site contact. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long contactId;

  /**
   * Visibility of this directory site contact assignment. When set to PUBLIC this contact
   * assignment is visible to all account and agency users; when set to PRIVATE it is visible only
   * to the site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visibility;

  /**
   * ID of this directory site contact. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getContactId() {
    return contactId;
  }

  /**
   * ID of this directory site contact. This is a read-only, auto-generated field.
   * @param contactId contactId or {@code null} for none
   */
  public DirectorySiteContactAssignment setContactId(java.lang.Long contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Visibility of this directory site contact assignment. When set to PUBLIC this contact
   * assignment is visible to all account and agency users; when set to PRIVATE it is visible only
   * to the site.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisibility() {
    return visibility;
  }

  /**
   * Visibility of this directory site contact assignment. When set to PUBLIC this contact
   * assignment is visible to all account and agency users; when set to PRIVATE it is visible only
   * to the site.
   * @param visibility visibility or {@code null} for none
   */
  public DirectorySiteContactAssignment setVisibility(java.lang.String visibility) {
    this.visibility = visibility;
    return this;
  }

  @Override
  public DirectorySiteContactAssignment set(String fieldName, Object value) {
    return (DirectorySiteContactAssignment) super.set(fieldName, value);
  }

  @Override
  public DirectorySiteContactAssignment clone() {
    return (DirectorySiteContactAssignment) super.clone();
  }

}