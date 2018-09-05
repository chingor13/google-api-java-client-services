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

package com.google.storagetransfer.v1.model;

/**
 * TransferOptions uses three boolean parameters to define the actions to be performed on objects in
 * a transfer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferOptions extends com.google.api.client.json.GenericJson {

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.  Note
   * that this option and `deleteObjectsUniqueInSink` are mutually exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleteObjectsFromSourceAfterTransfer;

  /**
   * Whether objects that exist only in the sink should be deleted.  Note that this option and
   * `deleteObjectsFromSourceAfterTransfer` are mutually exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleteObjectsUniqueInSink;

  /**
   * Whether overwriting objects that already exist in the sink is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean overwriteObjectsAlreadyExistingInSink;

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.  Note
   * that this option and `deleteObjectsUniqueInSink` are mutually exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleteObjectsFromSourceAfterTransfer() {
    return deleteObjectsFromSourceAfterTransfer;
  }

  /**
   * Whether objects should be deleted from the source after they are transferred to the sink.  Note
   * that this option and `deleteObjectsUniqueInSink` are mutually exclusive.
   * @param deleteObjectsFromSourceAfterTransfer deleteObjectsFromSourceAfterTransfer or {@code null} for none
   */
  public TransferOptions setDeleteObjectsFromSourceAfterTransfer(java.lang.Boolean deleteObjectsFromSourceAfterTransfer) {
    this.deleteObjectsFromSourceAfterTransfer = deleteObjectsFromSourceAfterTransfer;
    return this;
  }

  /**
   * Whether objects that exist only in the sink should be deleted.  Note that this option and
   * `deleteObjectsFromSourceAfterTransfer` are mutually exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleteObjectsUniqueInSink() {
    return deleteObjectsUniqueInSink;
  }

  /**
   * Whether objects that exist only in the sink should be deleted.  Note that this option and
   * `deleteObjectsFromSourceAfterTransfer` are mutually exclusive.
   * @param deleteObjectsUniqueInSink deleteObjectsUniqueInSink or {@code null} for none
   */
  public TransferOptions setDeleteObjectsUniqueInSink(java.lang.Boolean deleteObjectsUniqueInSink) {
    this.deleteObjectsUniqueInSink = deleteObjectsUniqueInSink;
    return this;
  }

  /**
   * Whether overwriting objects that already exist in the sink is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOverwriteObjectsAlreadyExistingInSink() {
    return overwriteObjectsAlreadyExistingInSink;
  }

  /**
   * Whether overwriting objects that already exist in the sink is allowed.
   * @param overwriteObjectsAlreadyExistingInSink overwriteObjectsAlreadyExistingInSink or {@code null} for none
   */
  public TransferOptions setOverwriteObjectsAlreadyExistingInSink(java.lang.Boolean overwriteObjectsAlreadyExistingInSink) {
    this.overwriteObjectsAlreadyExistingInSink = overwriteObjectsAlreadyExistingInSink;
    return this;
  }

  @Override
  public TransferOptions set(String fieldName, Object value) {
    return (TransferOptions) super.set(fieldName, value);
  }

  @Override
  public TransferOptions clone() {
    return (TransferOptions) super.clone();
  }

}