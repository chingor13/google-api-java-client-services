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

package com.google.dataflow.model;

/**
 * The response to a GetTemplate request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetTemplateResponse extends com.google.api.client.json.GenericJson {

  /**
   * The template metadata describing the template name, available parameters, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TemplateMetadata metadata;

  /**
   * The status of the get template request. Any problems with the request will be indicated in the
   * error_details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The template metadata describing the template name, available parameters, etc.
   * @return value or {@code null} for none
   */
  public TemplateMetadata getMetadata() {
    return metadata;
  }

  /**
   * The template metadata describing the template name, available parameters, etc.
   * @param metadata metadata or {@code null} for none
   */
  public GetTemplateResponse setMetadata(TemplateMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The status of the get template request. Any problems with the request will be indicated in the
   * error_details.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * The status of the get template request. Any problems with the request will be indicated in the
   * error_details.
   * @param status status or {@code null} for none
   */
  public GetTemplateResponse setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public GetTemplateResponse set(String fieldName, Object value) {
    return (GetTemplateResponse) super.set(fieldName, value);
  }

  @Override
  public GetTemplateResponse clone() {
    return (GetTemplateResponse) super.clone();
  }

}