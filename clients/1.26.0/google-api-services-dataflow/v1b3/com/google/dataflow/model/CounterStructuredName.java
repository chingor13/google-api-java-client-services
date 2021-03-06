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
 * Identifies a counter within a per-job namespace. Counters whose structured names are the same get
 * merged into a single value for the job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CounterStructuredName extends com.google.api.client.json.GenericJson {

  /**
   * Name of the optimized step being executed by the workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String componentStepName;

  /**
   * Name of the stage. An execution step contains multiple component steps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionStepName;

  /**
   * Index of an input collection that's being read from/written to as a side input. The index
   * identifies a step's side inputs starting by 1 (e.g. the first side input has input_index 1, the
   * third has input_index 3). Side inputs are identified by a pair of (original_step_name,
   * input_index). This field helps uniquely identify them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer inputIndex;

  /**
   * Counter name. Not necessarily globally-unique, but unique within the context of the other
   * fields. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * One of the standard Origins defined above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String origin;

  /**
   * A string containing a more specific namespace of the counter's origin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originNamespace;

  /**
   * The step name requesting an operation, such as GBK. I.e. the ParDo causing a read/write from
   * shuffle to occur, or a read from side inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalRequestingStepName;

  /**
   * System generated name of the original step in the user's graph, before optimization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalStepName;

  /**
   * Portion of this counter, either key or value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portion;

  /**
   * ID of a particular worker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerId;

  /**
   * Name of the optimized step being executed by the workers.
   * @return value or {@code null} for none
   */
  public java.lang.String getComponentStepName() {
    return componentStepName;
  }

  /**
   * Name of the optimized step being executed by the workers.
   * @param componentStepName componentStepName or {@code null} for none
   */
  public CounterStructuredName setComponentStepName(java.lang.String componentStepName) {
    this.componentStepName = componentStepName;
    return this;
  }

  /**
   * Name of the stage. An execution step contains multiple component steps.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionStepName() {
    return executionStepName;
  }

  /**
   * Name of the stage. An execution step contains multiple component steps.
   * @param executionStepName executionStepName or {@code null} for none
   */
  public CounterStructuredName setExecutionStepName(java.lang.String executionStepName) {
    this.executionStepName = executionStepName;
    return this;
  }

  /**
   * Index of an input collection that's being read from/written to as a side input. The index
   * identifies a step's side inputs starting by 1 (e.g. the first side input has input_index 1, the
   * third has input_index 3). Side inputs are identified by a pair of (original_step_name,
   * input_index). This field helps uniquely identify them.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInputIndex() {
    return inputIndex;
  }

  /**
   * Index of an input collection that's being read from/written to as a side input. The index
   * identifies a step's side inputs starting by 1 (e.g. the first side input has input_index 1, the
   * third has input_index 3). Side inputs are identified by a pair of (original_step_name,
   * input_index). This field helps uniquely identify them.
   * @param inputIndex inputIndex or {@code null} for none
   */
  public CounterStructuredName setInputIndex(java.lang.Integer inputIndex) {
    this.inputIndex = inputIndex;
    return this;
  }

  /**
   * Counter name. Not necessarily globally-unique, but unique within the context of the other
   * fields. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Counter name. Not necessarily globally-unique, but unique within the context of the other
   * fields. Required.
   * @param name name or {@code null} for none
   */
  public CounterStructuredName setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * One of the standard Origins defined above.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrigin() {
    return origin;
  }

  /**
   * One of the standard Origins defined above.
   * @param origin origin or {@code null} for none
   */
  public CounterStructuredName setOrigin(java.lang.String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * A string containing a more specific namespace of the counter's origin.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginNamespace() {
    return originNamespace;
  }

  /**
   * A string containing a more specific namespace of the counter's origin.
   * @param originNamespace originNamespace or {@code null} for none
   */
  public CounterStructuredName setOriginNamespace(java.lang.String originNamespace) {
    this.originNamespace = originNamespace;
    return this;
  }

  /**
   * The step name requesting an operation, such as GBK. I.e. the ParDo causing a read/write from
   * shuffle to occur, or a read from side inputs.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalRequestingStepName() {
    return originalRequestingStepName;
  }

  /**
   * The step name requesting an operation, such as GBK. I.e. the ParDo causing a read/write from
   * shuffle to occur, or a read from side inputs.
   * @param originalRequestingStepName originalRequestingStepName or {@code null} for none
   */
  public CounterStructuredName setOriginalRequestingStepName(java.lang.String originalRequestingStepName) {
    this.originalRequestingStepName = originalRequestingStepName;
    return this;
  }

  /**
   * System generated name of the original step in the user's graph, before optimization.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalStepName() {
    return originalStepName;
  }

  /**
   * System generated name of the original step in the user's graph, before optimization.
   * @param originalStepName originalStepName or {@code null} for none
   */
  public CounterStructuredName setOriginalStepName(java.lang.String originalStepName) {
    this.originalStepName = originalStepName;
    return this;
  }

  /**
   * Portion of this counter, either key or value.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortion() {
    return portion;
  }

  /**
   * Portion of this counter, either key or value.
   * @param portion portion or {@code null} for none
   */
  public CounterStructuredName setPortion(java.lang.String portion) {
    this.portion = portion;
    return this;
  }

  /**
   * ID of a particular worker.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerId() {
    return workerId;
  }

  /**
   * ID of a particular worker.
   * @param workerId workerId or {@code null} for none
   */
  public CounterStructuredName setWorkerId(java.lang.String workerId) {
    this.workerId = workerId;
    return this;
  }

  @Override
  public CounterStructuredName set(String fieldName, Object value) {
    return (CounterStructuredName) super.set(fieldName, value);
  }

  @Override
  public CounterStructuredName clone() {
    return (CounterStructuredName) super.clone();
  }

}
