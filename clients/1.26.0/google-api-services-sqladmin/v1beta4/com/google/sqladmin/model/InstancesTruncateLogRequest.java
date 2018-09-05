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
 * Instance truncate log request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesTruncateLogRequest extends com.google.api.client.json.GenericJson {

  /**
   * Contains details about the truncate log operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TruncateLogContext truncateLogContext;

  /**
   * Contains details about the truncate log operation.
   * @return value or {@code null} for none
   */
  public TruncateLogContext getTruncateLogContext() {
    return truncateLogContext;
  }

  /**
   * Contains details about the truncate log operation.
   * @param truncateLogContext truncateLogContext or {@code null} for none
   */
  public InstancesTruncateLogRequest setTruncateLogContext(TruncateLogContext truncateLogContext) {
    this.truncateLogContext = truncateLogContext;
    return this;
  }

  @Override
  public InstancesTruncateLogRequest set(String fieldName, Object value) {
    return (InstancesTruncateLogRequest) super.set(fieldName, value);
  }

  @Override
  public InstancesTruncateLogRequest clone() {
    return (InstancesTruncateLogRequest) super.clone();
  }

}