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

package com.google.searchconsole.v1.model;

/**
 * Mobile-friendly test request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Search Console URL Testing Tools API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunMobileFriendlyTestRequest extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not screenshot is requested. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requestScreenshot;

  /**
   * URL for inspection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Whether or not screenshot is requested. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequestScreenshot() {
    return requestScreenshot;
  }

  /**
   * Whether or not screenshot is requested. Default is false.
   * @param requestScreenshot requestScreenshot or {@code null} for none
   */
  public RunMobileFriendlyTestRequest setRequestScreenshot(java.lang.Boolean requestScreenshot) {
    this.requestScreenshot = requestScreenshot;
    return this;
  }

  /**
   * URL for inspection.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL for inspection.
   * @param url url or {@code null} for none
   */
  public RunMobileFriendlyTestRequest setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public RunMobileFriendlyTestRequest set(String fieldName, Object value) {
    return (RunMobileFriendlyTestRequest) super.set(fieldName, value);
  }

  @Override
  public RunMobileFriendlyTestRequest clone() {
    return (RunMobileFriendlyTestRequest) super.clone();
  }

}
