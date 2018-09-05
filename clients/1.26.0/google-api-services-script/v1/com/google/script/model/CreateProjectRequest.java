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
 * Request to create a script project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateProjectRequest extends com.google.api.client.json.GenericJson {

  /**
   * The Drive ID of a parent file that the created script project is bound to. This is usually the
   * ID of a Google Doc, Google Sheet, Google Form, or Google Slides file. If not set, a standalone
   * script project is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentId;

  /**
   * The title for the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The Drive ID of a parent file that the created script project is bound to. This is usually the
   * ID of a Google Doc, Google Sheet, Google Form, or Google Slides file. If not set, a standalone
   * script project is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentId() {
    return parentId;
  }

  /**
   * The Drive ID of a parent file that the created script project is bound to. This is usually the
   * ID of a Google Doc, Google Sheet, Google Form, or Google Slides file. If not set, a standalone
   * script project is created.
   * @param parentId parentId or {@code null} for none
   */
  public CreateProjectRequest setParentId(java.lang.String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The title for the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title for the project.
   * @param title title or {@code null} for none
   */
  public CreateProjectRequest setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public CreateProjectRequest set(String fieldName, Object value) {
    return (CreateProjectRequest) super.set(fieldName, value);
  }

  @Override
  public CreateProjectRequest clone() {
    return (CreateProjectRequest) super.clone();
  }

}