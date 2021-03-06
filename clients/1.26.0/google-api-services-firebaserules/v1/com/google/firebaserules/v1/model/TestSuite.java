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

package com.google.firebaserules.v1.model;

/**
 * `TestSuite` is a collection of `TestCase` instances that validate the logical correctness of a
 * `Ruleset`. The `TestSuite` may be referenced in-line within a `TestRuleset` invocation or as part
 * of a `Release` object as a pre-release check.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestSuite extends com.google.api.client.json.GenericJson {

  /**
   * Collection of test cases associated with the `TestSuite`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestCase> testCases;

  /**
   * Collection of test cases associated with the `TestSuite`.
   * @return value or {@code null} for none
   */
  public java.util.List<TestCase> getTestCases() {
    return testCases;
  }

  /**
   * Collection of test cases associated with the `TestSuite`.
   * @param testCases testCases or {@code null} for none
   */
  public TestSuite setTestCases(java.util.List<TestCase> testCases) {
    this.testCases = testCases;
    return this;
  }

  @Override
  public TestSuite set(String fieldName, Object value) {
    return (TestSuite) super.set(fieldName, value);
  }

  @Override
  public TestSuite clone() {
    return (TestSuite) super.clone();
  }

}
