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
 * This is a JSON template for an achievement increment response
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
public final class AchievementIncrementResponse extends com.google.api.client.json.GenericJson {

  /**
   * The current steps recorded for this incremental achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer currentSteps;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#achievementIncrementResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Whether the current steps for the achievement has reached the number of steps required to
   * unlock.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean newlyUnlocked;

  /**
   * The current steps recorded for this incremental achievement.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCurrentSteps() {
    return currentSteps;
  }

  /**
   * The current steps recorded for this incremental achievement.
   * @param currentSteps currentSteps or {@code null} for none
   */
  public AchievementIncrementResponse setCurrentSteps(java.lang.Integer currentSteps) {
    this.currentSteps = currentSteps;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#achievementIncrementResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#achievementIncrementResponse.
   * @param kind kind or {@code null} for none
   */
  public AchievementIncrementResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Whether the current steps for the achievement has reached the number of steps required to
   * unlock.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNewlyUnlocked() {
    return newlyUnlocked;
  }

  /**
   * Whether the current steps for the achievement has reached the number of steps required to
   * unlock.
   * @param newlyUnlocked newlyUnlocked or {@code null} for none
   */
  public AchievementIncrementResponse setNewlyUnlocked(java.lang.Boolean newlyUnlocked) {
    this.newlyUnlocked = newlyUnlocked;
    return this;
  }

  @Override
  public AchievementIncrementResponse set(String fieldName, Object value) {
    return (AchievementIncrementResponse) super.set(fieldName, value);
  }

  @Override
  public AchievementIncrementResponse clone() {
    return (AchievementIncrementResponse) super.clone();
  }

}