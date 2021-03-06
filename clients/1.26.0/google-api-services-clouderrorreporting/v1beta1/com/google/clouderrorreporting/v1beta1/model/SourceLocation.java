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

package com.google.clouderrorreporting.v1beta1.model;

/**
 * Indicates a location in the source code of the service for which errors are reported.
 * `functionName` must be provided by the application when reporting an error, unless the error
 * report contains a `message` with a supported exception stack trace. All fields are optional for
 * the later case.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Error Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceLocation extends com.google.api.client.json.GenericJson {

  /**
   * The source code filename, which can include a truncated relative path, or a full path from a
   * production machine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filePath;

  /**
   * Human-readable name of a function or method. The value can include optional context like the
   * class or package name. For example, `my.package.MyClass.method` in case of Java.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String functionName;

  /**
   * 1-based. 0 indicates that the line number is unknown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer lineNumber;

  /**
   * The source code filename, which can include a truncated relative path, or a full path from a
   * production machine.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilePath() {
    return filePath;
  }

  /**
   * The source code filename, which can include a truncated relative path, or a full path from a
   * production machine.
   * @param filePath filePath or {@code null} for none
   */
  public SourceLocation setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Human-readable name of a function or method. The value can include optional context like the
   * class or package name. For example, `my.package.MyClass.method` in case of Java.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunctionName() {
    return functionName;
  }

  /**
   * Human-readable name of a function or method. The value can include optional context like the
   * class or package name. For example, `my.package.MyClass.method` in case of Java.
   * @param functionName functionName or {@code null} for none
   */
  public SourceLocation setFunctionName(java.lang.String functionName) {
    this.functionName = functionName;
    return this;
  }

  /**
   * 1-based. 0 indicates that the line number is unknown.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * 1-based. 0 indicates that the line number is unknown.
   * @param lineNumber lineNumber or {@code null} for none
   */
  public SourceLocation setLineNumber(java.lang.Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  @Override
  public SourceLocation set(String fieldName, Object value) {
    return (SourceLocation) super.set(fieldName, value);
  }

  @Override
  public SourceLocation clone() {
    return (SourceLocation) super.clone();
  }

}
