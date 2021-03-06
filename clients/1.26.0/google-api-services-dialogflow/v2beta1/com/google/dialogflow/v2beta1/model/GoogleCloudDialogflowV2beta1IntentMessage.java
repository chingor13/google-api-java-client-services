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

package com.google.dialogflow.v2beta1.model;

/**
 * Corresponds to the `Response` field in the Dialogflow console.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessage extends com.google.api.client.json.GenericJson {

  /**
   * Displays a basic card for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageBasicCard basicCard;

  /**
   * Displays a card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageCard card;

  /**
   * Displays a carousel card for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect carouselSelect;

  /**
   * Displays an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageImage image;

  /**
   * Displays a link out suggestion chip for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion linkOutSuggestion;

  /**
   * Displays a list card for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageListSelect listSelect;

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. The platform that this message is intended for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Displays quick replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageQuickReplies quickReplies;

  /**
   * Returns a voice or text-only response for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses simpleResponses;

  /**
   * Displays suggestion chips for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageSuggestions suggestions;

  /**
   * Plays audio from a file in Telephony Gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio telephonyPlayAudio;

  /**
   * Synthesizes speech in Telephony Gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech telephonySynthesizeSpeech;

  /**
   * Transfers the call in Telephony Gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall telephonyTransferCall;

  /**
   * Returns a text response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageText text;

  /**
   * Displays a basic card for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard getBasicCard() {
    return basicCard;
  }

  /**
   * Displays a basic card for Actions on Google.
   * @param basicCard basicCard or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setBasicCard(GoogleCloudDialogflowV2beta1IntentMessageBasicCard basicCard) {
    this.basicCard = basicCard;
    return this;
  }

  /**
   * Displays a card.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCard getCard() {
    return card;
  }

  /**
   * Displays a card.
   * @param card card or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setCard(GoogleCloudDialogflowV2beta1IntentMessageCard card) {
    this.card = card;
    return this;
  }

  /**
   * Displays a carousel card for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect getCarouselSelect() {
    return carouselSelect;
  }

  /**
   * Displays a carousel card for Actions on Google.
   * @param carouselSelect carouselSelect or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setCarouselSelect(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect carouselSelect) {
    this.carouselSelect = carouselSelect;
    return this;
  }

  /**
   * Displays an image.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageImage getImage() {
    return image;
  }

  /**
   * Displays an image.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setImage(GoogleCloudDialogflowV2beta1IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Displays a link out suggestion chip for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion getLinkOutSuggestion() {
    return linkOutSuggestion;
  }

  /**
   * Displays a link out suggestion chip for Actions on Google.
   * @param linkOutSuggestion linkOutSuggestion or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setLinkOutSuggestion(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion linkOutSuggestion) {
    this.linkOutSuggestion = linkOutSuggestion;
    return this;
  }

  /**
   * Displays a list card for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageListSelect getListSelect() {
    return listSelect;
  }

  /**
   * Displays a list card for Actions on Google.
   * @param listSelect listSelect or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setListSelect(GoogleCloudDialogflowV2beta1IntentMessageListSelect listSelect) {
    this.listSelect = listSelect;
    return this;
  }

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. The platform that this message is intended for.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * Optional. The platform that this message is intended for.
   * @param platform platform or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Displays quick replies.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageQuickReplies getQuickReplies() {
    return quickReplies;
  }

  /**
   * Displays quick replies.
   * @param quickReplies quickReplies or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setQuickReplies(GoogleCloudDialogflowV2beta1IntentMessageQuickReplies quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }

  /**
   * Returns a voice or text-only response for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses getSimpleResponses() {
    return simpleResponses;
  }

  /**
   * Returns a voice or text-only response for Actions on Google.
   * @param simpleResponses simpleResponses or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setSimpleResponses(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses simpleResponses) {
    this.simpleResponses = simpleResponses;
    return this;
  }

  /**
   * Displays suggestion chips for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageSuggestions getSuggestions() {
    return suggestions;
  }

  /**
   * Displays suggestion chips for Actions on Google.
   * @param suggestions suggestions or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setSuggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestions suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * Plays audio from a file in Telephony Gateway.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio getTelephonyPlayAudio() {
    return telephonyPlayAudio;
  }

  /**
   * Plays audio from a file in Telephony Gateway.
   * @param telephonyPlayAudio telephonyPlayAudio or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setTelephonyPlayAudio(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio telephonyPlayAudio) {
    this.telephonyPlayAudio = telephonyPlayAudio;
    return this;
  }

  /**
   * Synthesizes speech in Telephony Gateway.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech getTelephonySynthesizeSpeech() {
    return telephonySynthesizeSpeech;
  }

  /**
   * Synthesizes speech in Telephony Gateway.
   * @param telephonySynthesizeSpeech telephonySynthesizeSpeech or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setTelephonySynthesizeSpeech(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech telephonySynthesizeSpeech) {
    this.telephonySynthesizeSpeech = telephonySynthesizeSpeech;
    return this;
  }

  /**
   * Transfers the call in Telephony Gateway.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall getTelephonyTransferCall() {
    return telephonyTransferCall;
  }

  /**
   * Transfers the call in Telephony Gateway.
   * @param telephonyTransferCall telephonyTransferCall or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setTelephonyTransferCall(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall telephonyTransferCall) {
    this.telephonyTransferCall = telephonyTransferCall;
    return this;
  }

  /**
   * Returns a text response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageText getText() {
    return text;
  }

  /**
   * Returns a text response.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessage setText(GoogleCloudDialogflowV2beta1IntentMessageText text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessage clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessage) super.clone();
  }

}
