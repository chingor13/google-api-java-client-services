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

package com.google.games.model;

/**
 * This is a JSON template for a Quest Milestone resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuestMilestone extends com.google.api.client.json.GenericJson {

  /**
   * The completion reward data of the milestone, represented as a Base64-encoded string. This is a
   * developer-specified binary blob with size between 0 and 2 KB before encoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String completionRewardData;

  /**
   * The criteria of the milestone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuestCriterion> criteria;

  static {
    // hack to force ProGuard to consider QuestCriterion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QuestCriterion.class);
  }

  /**
   * The milestone ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#questMilestone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The current state of the milestone. Possible values are:   - "COMPLETED_NOT_CLAIMED" - The
   * milestone is complete, but has not yet been claimed.  - "CLAIMED" - The milestone is complete
   * and has been claimed.  - "NOT_COMPLETED" - The milestone has not yet been completed.  -
   * "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The completion reward data of the milestone, represented as a Base64-encoded string. This is a
   * developer-specified binary blob with size between 0 and 2 KB before encoding.
   * @see #decodeCompletionRewardData()
   * @return value or {@code null} for none
   */
  public java.lang.String getCompletionRewardData() {
    return completionRewardData;
  }

  /**
   * The completion reward data of the milestone, represented as a Base64-encoded string. This is a
   * developer-specified binary blob with size between 0 and 2 KB before encoding.
   * @see #getCompletionRewardData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCompletionRewardData() {
    return com.google.api.client.util.Base64.decodeBase64(completionRewardData);
  }

  /**
   * The completion reward data of the milestone, represented as a Base64-encoded string. This is a
   * developer-specified binary blob with size between 0 and 2 KB before encoding.
   * @see #encodeCompletionRewardData()
   * @param completionRewardData completionRewardData or {@code null} for none
   */
  public QuestMilestone setCompletionRewardData(java.lang.String completionRewardData) {
    this.completionRewardData = completionRewardData;
    return this;
  }

  /**
   * The completion reward data of the milestone, represented as a Base64-encoded string. This is a
   * developer-specified binary blob with size between 0 and 2 KB before encoding.
   * @see #setCompletionRewardData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public QuestMilestone encodeCompletionRewardData(byte[] completionRewardData) {
    this.completionRewardData = com.google.api.client.util.Base64.encodeBase64URLSafeString(completionRewardData);
    return this;
  }

  /**
   * The criteria of the milestone.
   * @return value or {@code null} for none
   */
  public java.util.List<QuestCriterion> getCriteria() {
    return criteria;
  }

  /**
   * The criteria of the milestone.
   * @param criteria criteria or {@code null} for none
   */
  public QuestMilestone setCriteria(java.util.List<QuestCriterion> criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * The milestone ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The milestone ID.
   * @param id id or {@code null} for none
   */
  public QuestMilestone setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#questMilestone.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#questMilestone.
   * @param kind kind or {@code null} for none
   */
  public QuestMilestone setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The current state of the milestone. Possible values are:   - "COMPLETED_NOT_CLAIMED" - The
   * milestone is complete, but has not yet been claimed.  - "CLAIMED" - The milestone is complete
   * and has been claimed.  - "NOT_COMPLETED" - The milestone has not yet been completed.  -
   * "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the milestone. Possible values are:   - "COMPLETED_NOT_CLAIMED" - The
   * milestone is complete, but has not yet been claimed.  - "CLAIMED" - The milestone is complete
   * and has been claimed.  - "NOT_COMPLETED" - The milestone has not yet been completed.  -
   * "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
   * @param state state or {@code null} for none
   */
  public QuestMilestone setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public QuestMilestone set(String fieldName, Object value) {
    return (QuestMilestone) super.set(fieldName, value);
  }

  @Override
  public QuestMilestone clone() {
    return (QuestMilestone) super.clone();
  }

}