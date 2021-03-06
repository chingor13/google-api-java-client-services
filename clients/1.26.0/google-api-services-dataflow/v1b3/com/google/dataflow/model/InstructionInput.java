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
 * An input of an instruction, as a reference to an output of a producer instruction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstructionInput extends com.google.api.client.json.GenericJson {

  /**
   * The output index (origin zero) within the producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer outputNum;

  /**
   * The index (origin zero) of the parallel instruction that produces the output to be consumed by
   * this input.  This index is relative to the list of instructions in this input's instruction's
   * containing MapTask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer producerInstructionIndex;

  /**
   * The output index (origin zero) within the producer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOutputNum() {
    return outputNum;
  }

  /**
   * The output index (origin zero) within the producer.
   * @param outputNum outputNum or {@code null} for none
   */
  public InstructionInput setOutputNum(java.lang.Integer outputNum) {
    this.outputNum = outputNum;
    return this;
  }

  /**
   * The index (origin zero) of the parallel instruction that produces the output to be consumed by
   * this input.  This index is relative to the list of instructions in this input's instruction's
   * containing MapTask.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProducerInstructionIndex() {
    return producerInstructionIndex;
  }

  /**
   * The index (origin zero) of the parallel instruction that produces the output to be consumed by
   * this input.  This index is relative to the list of instructions in this input's instruction's
   * containing MapTask.
   * @param producerInstructionIndex producerInstructionIndex or {@code null} for none
   */
  public InstructionInput setProducerInstructionIndex(java.lang.Integer producerInstructionIndex) {
    this.producerInstructionIndex = producerInstructionIndex;
    return this;
  }

  @Override
  public InstructionInput set(String fieldName, Object value) {
    return (InstructionInput) super.set(fieldName, value);
  }

  @Override
  public InstructionInput clone() {
    return (InstructionInput) super.clone();
  }

}
