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

package com.google.groupssettings.model;

/**
 * JSON template for Group resource
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Groups Settings API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Groups extends com.google.api.client.json.GenericJson {

  /**
   * Are external members allowed to join the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allowExternalMembers;

  /**
   * Is google allowed to contact admins.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allowGoogleCommunication;

  /**
   * If posting from web is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allowWebPosting;

  /**
   * If the group is archive only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String archiveOnly;

  /**
   * Custom footer text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customFooterText;

  /**
   * Default email to which reply to any message should go.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customReplyTo;

  /**
   * Default message deny notification message
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultMessageDenyNotificationText;

  /**
   * Description of the group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Email id of the group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * If favorite replies should be displayed above other replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String favoriteRepliesOnTop;

  /**
   * Whether to include custom footer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String includeCustomFooter;

  /**
   * If this groups should be included in global address list or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String includeInGlobalAddressList;

  /**
   * If the contents of the group are archived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String isArchived;

  /**
   * The type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Maximum message size allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxMessageBytes;

  /**
   * Can members post using the group email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String membersCanPostAsTheGroup;

  /**
   * Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageDisplayFont;

  /**
   * Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS
   * MODERATE_NEW_MEMBERS MODERATE_NONE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageModerationLevel;

  /**
   * Name of the Group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Primary language for the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryLanguage;

  /**
   * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM
   * REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE REPLY_TO_MANAGERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replyTo;

  /**
   * Should the member be notified if his message is denied by owner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sendMessageDenyNotification;

  /**
   * Is the group listed in groups directory
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String showInGroupDirectory;

  /**
   * Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE
   * SILENTLY_MODERATE REJECT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spamModerationLevel;

  /**
   * Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_OWNERS_CAN_ADD
   * ALL_MEMBERS_CAN_ADD NONE_CAN_ADD
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanAdd;

  /**
   * Permission to add references to a topic. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanAddReferences;

  /**
   * Permission to assign topics in a forum to another user. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanAssignTopics;

  /**
   * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT
   * ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT ALL_MANAGERS_CAN_CONTACT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanContactOwner;

  /**
   * Permission to enter free form tags for topics in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanEnterFreeFormTags;

  /**
   * Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE
   * ALL_MANAGERS_CAN_INVITE ALL_OWNERS_CAN_INVITE NONE_CAN_INVITE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanInvite;

  /**
   * Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN
   * INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanJoin;

  /**
   * Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_OWNERS_CAN_LEAVE
   * ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanLeaveGroup;

  /**
   * Permission to mark a topic as a duplicate of another topic. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanMarkDuplicate;

  /**
   * Permission to mark any other user's post as a favorite reply. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanMarkFavoriteReplyOnAnyTopic;

  /**
   * Permission to mark a post for a topic they started as a favorite reply. Possible values are:
   * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanMarkFavoriteReplyOnOwnTopic;

  /**
   * Permission to mark a topic as not needing a response. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanMarkNoResponseNeeded;

  /**
   * Permission to change tags and categories. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanModifyTagsAndCategories;

  /**
   * Permissions to post messages to the group. Possible values are: NONE_CAN_POST
   * ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST ALL_IN_DOMAIN_CAN_POST
   * ANYONE_CAN_POST
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanPostMessage;

  /**
   * Permission to take topics in a forum. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanTakeTopics;

  /**
   * Permission to unassign any topic in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanUnassignTopic;

  /**
   * Permission to unmark any post from a favorite reply. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanUnmarkFavoriteReplyOnAnyTopic;

  /**
   * Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW ALL_OWNERS_CAN_VIEW
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanViewGroup;

  /**
   * Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String whoCanViewMembership;

  /**
   * Are external members allowed to join the group.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllowExternalMembers() {
    return allowExternalMembers;
  }

  /**
   * Are external members allowed to join the group.
   * @param allowExternalMembers allowExternalMembers or {@code null} for none
   */
  public Groups setAllowExternalMembers(java.lang.String allowExternalMembers) {
    this.allowExternalMembers = allowExternalMembers;
    return this;
  }

  /**
   * Is google allowed to contact admins.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllowGoogleCommunication() {
    return allowGoogleCommunication;
  }

  /**
   * Is google allowed to contact admins.
   * @param allowGoogleCommunication allowGoogleCommunication or {@code null} for none
   */
  public Groups setAllowGoogleCommunication(java.lang.String allowGoogleCommunication) {
    this.allowGoogleCommunication = allowGoogleCommunication;
    return this;
  }

  /**
   * If posting from web is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllowWebPosting() {
    return allowWebPosting;
  }

  /**
   * If posting from web is allowed.
   * @param allowWebPosting allowWebPosting or {@code null} for none
   */
  public Groups setAllowWebPosting(java.lang.String allowWebPosting) {
    this.allowWebPosting = allowWebPosting;
    return this;
  }

  /**
   * If the group is archive only
   * @return value or {@code null} for none
   */
  public java.lang.String getArchiveOnly() {
    return archiveOnly;
  }

  /**
   * If the group is archive only
   * @param archiveOnly archiveOnly or {@code null} for none
   */
  public Groups setArchiveOnly(java.lang.String archiveOnly) {
    this.archiveOnly = archiveOnly;
    return this;
  }

  /**
   * Custom footer text.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomFooterText() {
    return customFooterText;
  }

  /**
   * Custom footer text.
   * @param customFooterText customFooterText or {@code null} for none
   */
  public Groups setCustomFooterText(java.lang.String customFooterText) {
    this.customFooterText = customFooterText;
    return this;
  }

  /**
   * Default email to which reply to any message should go.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomReplyTo() {
    return customReplyTo;
  }

  /**
   * Default email to which reply to any message should go.
   * @param customReplyTo customReplyTo or {@code null} for none
   */
  public Groups setCustomReplyTo(java.lang.String customReplyTo) {
    this.customReplyTo = customReplyTo;
    return this;
  }

  /**
   * Default message deny notification message
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultMessageDenyNotificationText() {
    return defaultMessageDenyNotificationText;
  }

  /**
   * Default message deny notification message
   * @param defaultMessageDenyNotificationText defaultMessageDenyNotificationText or {@code null} for none
   */
  public Groups setDefaultMessageDenyNotificationText(java.lang.String defaultMessageDenyNotificationText) {
    this.defaultMessageDenyNotificationText = defaultMessageDenyNotificationText;
    return this;
  }

  /**
   * Description of the group
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the group
   * @param description description or {@code null} for none
   */
  public Groups setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Email id of the group
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Email id of the group
   * @param email email or {@code null} for none
   */
  public Groups setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * If favorite replies should be displayed above other replies.
   * @return value or {@code null} for none
   */
  public java.lang.String getFavoriteRepliesOnTop() {
    return favoriteRepliesOnTop;
  }

  /**
   * If favorite replies should be displayed above other replies.
   * @param favoriteRepliesOnTop favoriteRepliesOnTop or {@code null} for none
   */
  public Groups setFavoriteRepliesOnTop(java.lang.String favoriteRepliesOnTop) {
    this.favoriteRepliesOnTop = favoriteRepliesOnTop;
    return this;
  }

  /**
   * Whether to include custom footer.
   * @return value or {@code null} for none
   */
  public java.lang.String getIncludeCustomFooter() {
    return includeCustomFooter;
  }

  /**
   * Whether to include custom footer.
   * @param includeCustomFooter includeCustomFooter or {@code null} for none
   */
  public Groups setIncludeCustomFooter(java.lang.String includeCustomFooter) {
    this.includeCustomFooter = includeCustomFooter;
    return this;
  }

  /**
   * If this groups should be included in global address list or not.
   * @return value or {@code null} for none
   */
  public java.lang.String getIncludeInGlobalAddressList() {
    return includeInGlobalAddressList;
  }

  /**
   * If this groups should be included in global address list or not.
   * @param includeInGlobalAddressList includeInGlobalAddressList or {@code null} for none
   */
  public Groups setIncludeInGlobalAddressList(java.lang.String includeInGlobalAddressList) {
    this.includeInGlobalAddressList = includeInGlobalAddressList;
    return this;
  }

  /**
   * If the contents of the group are archived.
   * @return value or {@code null} for none
   */
  public java.lang.String getIsArchived() {
    return isArchived;
  }

  /**
   * If the contents of the group are archived.
   * @param isArchived isArchived or {@code null} for none
   */
  public Groups setIsArchived(java.lang.String isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * The type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the resource.
   * @param kind kind or {@code null} for none
   */
  public Groups setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Maximum message size allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxMessageBytes() {
    return maxMessageBytes;
  }

  /**
   * Maximum message size allowed.
   * @param maxMessageBytes maxMessageBytes or {@code null} for none
   */
  public Groups setMaxMessageBytes(java.lang.Integer maxMessageBytes) {
    this.maxMessageBytes = maxMessageBytes;
    return this;
  }

  /**
   * Can members post using the group email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getMembersCanPostAsTheGroup() {
    return membersCanPostAsTheGroup;
  }

  /**
   * Can members post using the group email address.
   * @param membersCanPostAsTheGroup membersCanPostAsTheGroup or {@code null} for none
   */
  public Groups setMembersCanPostAsTheGroup(java.lang.String membersCanPostAsTheGroup) {
    this.membersCanPostAsTheGroup = membersCanPostAsTheGroup;
    return this;
  }

  /**
   * Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageDisplayFont() {
    return messageDisplayFont;
  }

  /**
   * Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT
   * @param messageDisplayFont messageDisplayFont or {@code null} for none
   */
  public Groups setMessageDisplayFont(java.lang.String messageDisplayFont) {
    this.messageDisplayFont = messageDisplayFont;
    return this;
  }

  /**
   * Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS
   * MODERATE_NEW_MEMBERS MODERATE_NONE
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageModerationLevel() {
    return messageModerationLevel;
  }

  /**
   * Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS
   * MODERATE_NEW_MEMBERS MODERATE_NONE
   * @param messageModerationLevel messageModerationLevel or {@code null} for none
   */
  public Groups setMessageModerationLevel(java.lang.String messageModerationLevel) {
    this.messageModerationLevel = messageModerationLevel;
    return this;
  }

  /**
   * Name of the Group
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the Group
   * @param name name or {@code null} for none
   */
  public Groups setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Primary language for the group.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryLanguage() {
    return primaryLanguage;
  }

  /**
   * Primary language for the group.
   * @param primaryLanguage primaryLanguage or {@code null} for none
   */
  public Groups setPrimaryLanguage(java.lang.String primaryLanguage) {
    this.primaryLanguage = primaryLanguage;
    return this;
  }

  /**
   * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM
   * REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE REPLY_TO_MANAGERS
   * @return value or {@code null} for none
   */
  public java.lang.String getReplyTo() {
    return replyTo;
  }

  /**
   * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM
   * REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE REPLY_TO_MANAGERS
   * @param replyTo replyTo or {@code null} for none
   */
  public Groups setReplyTo(java.lang.String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  /**
   * Should the member be notified if his message is denied by owner.
   * @return value or {@code null} for none
   */
  public java.lang.String getSendMessageDenyNotification() {
    return sendMessageDenyNotification;
  }

  /**
   * Should the member be notified if his message is denied by owner.
   * @param sendMessageDenyNotification sendMessageDenyNotification or {@code null} for none
   */
  public Groups setSendMessageDenyNotification(java.lang.String sendMessageDenyNotification) {
    this.sendMessageDenyNotification = sendMessageDenyNotification;
    return this;
  }

  /**
   * Is the group listed in groups directory
   * @return value or {@code null} for none
   */
  public java.lang.String getShowInGroupDirectory() {
    return showInGroupDirectory;
  }

  /**
   * Is the group listed in groups directory
   * @param showInGroupDirectory showInGroupDirectory or {@code null} for none
   */
  public Groups setShowInGroupDirectory(java.lang.String showInGroupDirectory) {
    this.showInGroupDirectory = showInGroupDirectory;
    return this;
  }

  /**
   * Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE
   * SILENTLY_MODERATE REJECT
   * @return value or {@code null} for none
   */
  public java.lang.String getSpamModerationLevel() {
    return spamModerationLevel;
  }

  /**
   * Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE
   * SILENTLY_MODERATE REJECT
   * @param spamModerationLevel spamModerationLevel or {@code null} for none
   */
  public Groups setSpamModerationLevel(java.lang.String spamModerationLevel) {
    this.spamModerationLevel = spamModerationLevel;
    return this;
  }

  /**
   * Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_OWNERS_CAN_ADD
   * ALL_MEMBERS_CAN_ADD NONE_CAN_ADD
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanAdd() {
    return whoCanAdd;
  }

  /**
   * Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_OWNERS_CAN_ADD
   * ALL_MEMBERS_CAN_ADD NONE_CAN_ADD
   * @param whoCanAdd whoCanAdd or {@code null} for none
   */
  public Groups setWhoCanAdd(java.lang.String whoCanAdd) {
    this.whoCanAdd = whoCanAdd;
    return this;
  }

  /**
   * Permission to add references to a topic. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanAddReferences() {
    return whoCanAddReferences;
  }

  /**
   * Permission to add references to a topic. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanAddReferences whoCanAddReferences or {@code null} for none
   */
  public Groups setWhoCanAddReferences(java.lang.String whoCanAddReferences) {
    this.whoCanAddReferences = whoCanAddReferences;
    return this;
  }

  /**
   * Permission to assign topics in a forum to another user. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanAssignTopics() {
    return whoCanAssignTopics;
  }

  /**
   * Permission to assign topics in a forum to another user. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanAssignTopics whoCanAssignTopics or {@code null} for none
   */
  public Groups setWhoCanAssignTopics(java.lang.String whoCanAssignTopics) {
    this.whoCanAssignTopics = whoCanAssignTopics;
    return this;
  }

  /**
   * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT
   * ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT ALL_MANAGERS_CAN_CONTACT
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanContactOwner() {
    return whoCanContactOwner;
  }

  /**
   * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT
   * ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT ALL_MANAGERS_CAN_CONTACT
   * @param whoCanContactOwner whoCanContactOwner or {@code null} for none
   */
  public Groups setWhoCanContactOwner(java.lang.String whoCanContactOwner) {
    this.whoCanContactOwner = whoCanContactOwner;
    return this;
  }

  /**
   * Permission to enter free form tags for topics in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanEnterFreeFormTags() {
    return whoCanEnterFreeFormTags;
  }

  /**
   * Permission to enter free form tags for topics in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanEnterFreeFormTags whoCanEnterFreeFormTags or {@code null} for none
   */
  public Groups setWhoCanEnterFreeFormTags(java.lang.String whoCanEnterFreeFormTags) {
    this.whoCanEnterFreeFormTags = whoCanEnterFreeFormTags;
    return this;
  }

  /**
   * Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE
   * ALL_MANAGERS_CAN_INVITE ALL_OWNERS_CAN_INVITE NONE_CAN_INVITE
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanInvite() {
    return whoCanInvite;
  }

  /**
   * Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE
   * ALL_MANAGERS_CAN_INVITE ALL_OWNERS_CAN_INVITE NONE_CAN_INVITE
   * @param whoCanInvite whoCanInvite or {@code null} for none
   */
  public Groups setWhoCanInvite(java.lang.String whoCanInvite) {
    this.whoCanInvite = whoCanInvite;
    return this;
  }

  /**
   * Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN
   * INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanJoin() {
    return whoCanJoin;
  }

  /**
   * Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN
   * INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN
   * @param whoCanJoin whoCanJoin or {@code null} for none
   */
  public Groups setWhoCanJoin(java.lang.String whoCanJoin) {
    this.whoCanJoin = whoCanJoin;
    return this;
  }

  /**
   * Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_OWNERS_CAN_LEAVE
   * ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanLeaveGroup() {
    return whoCanLeaveGroup;
  }

  /**
   * Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_OWNERS_CAN_LEAVE
   * ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE
   * @param whoCanLeaveGroup whoCanLeaveGroup or {@code null} for none
   */
  public Groups setWhoCanLeaveGroup(java.lang.String whoCanLeaveGroup) {
    this.whoCanLeaveGroup = whoCanLeaveGroup;
    return this;
  }

  /**
   * Permission to mark a topic as a duplicate of another topic. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanMarkDuplicate() {
    return whoCanMarkDuplicate;
  }

  /**
   * Permission to mark a topic as a duplicate of another topic. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanMarkDuplicate whoCanMarkDuplicate or {@code null} for none
   */
  public Groups setWhoCanMarkDuplicate(java.lang.String whoCanMarkDuplicate) {
    this.whoCanMarkDuplicate = whoCanMarkDuplicate;
    return this;
  }

  /**
   * Permission to mark any other user's post as a favorite reply. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanMarkFavoriteReplyOnAnyTopic() {
    return whoCanMarkFavoriteReplyOnAnyTopic;
  }

  /**
   * Permission to mark any other user's post as a favorite reply. Possible values are: NONE
   * OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanMarkFavoriteReplyOnAnyTopic whoCanMarkFavoriteReplyOnAnyTopic or {@code null} for none
   */
  public Groups setWhoCanMarkFavoriteReplyOnAnyTopic(java.lang.String whoCanMarkFavoriteReplyOnAnyTopic) {
    this.whoCanMarkFavoriteReplyOnAnyTopic = whoCanMarkFavoriteReplyOnAnyTopic;
    return this;
  }

  /**
   * Permission to mark a post for a topic they started as a favorite reply. Possible values are:
   * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanMarkFavoriteReplyOnOwnTopic() {
    return whoCanMarkFavoriteReplyOnOwnTopic;
  }

  /**
   * Permission to mark a post for a topic they started as a favorite reply. Possible values are:
   * NONE OWNERS_ONLY MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanMarkFavoriteReplyOnOwnTopic whoCanMarkFavoriteReplyOnOwnTopic or {@code null} for none
   */
  public Groups setWhoCanMarkFavoriteReplyOnOwnTopic(java.lang.String whoCanMarkFavoriteReplyOnOwnTopic) {
    this.whoCanMarkFavoriteReplyOnOwnTopic = whoCanMarkFavoriteReplyOnOwnTopic;
    return this;
  }

  /**
   * Permission to mark a topic as not needing a response. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanMarkNoResponseNeeded() {
    return whoCanMarkNoResponseNeeded;
  }

  /**
   * Permission to mark a topic as not needing a response. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanMarkNoResponseNeeded whoCanMarkNoResponseNeeded or {@code null} for none
   */
  public Groups setWhoCanMarkNoResponseNeeded(java.lang.String whoCanMarkNoResponseNeeded) {
    this.whoCanMarkNoResponseNeeded = whoCanMarkNoResponseNeeded;
    return this;
  }

  /**
   * Permission to change tags and categories. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanModifyTagsAndCategories() {
    return whoCanModifyTagsAndCategories;
  }

  /**
   * Permission to change tags and categories. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanModifyTagsAndCategories whoCanModifyTagsAndCategories or {@code null} for none
   */
  public Groups setWhoCanModifyTagsAndCategories(java.lang.String whoCanModifyTagsAndCategories) {
    this.whoCanModifyTagsAndCategories = whoCanModifyTagsAndCategories;
    return this;
  }

  /**
   * Permissions to post messages to the group. Possible values are: NONE_CAN_POST
   * ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST ALL_IN_DOMAIN_CAN_POST
   * ANYONE_CAN_POST
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanPostMessage() {
    return whoCanPostMessage;
  }

  /**
   * Permissions to post messages to the group. Possible values are: NONE_CAN_POST
   * ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST ALL_IN_DOMAIN_CAN_POST
   * ANYONE_CAN_POST
   * @param whoCanPostMessage whoCanPostMessage or {@code null} for none
   */
  public Groups setWhoCanPostMessage(java.lang.String whoCanPostMessage) {
    this.whoCanPostMessage = whoCanPostMessage;
    return this;
  }

  /**
   * Permission to take topics in a forum. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanTakeTopics() {
    return whoCanTakeTopics;
  }

  /**
   * Permission to take topics in a forum. Possible values are: NONE OWNERS_ONLY MANAGERS_ONLY
   * OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanTakeTopics whoCanTakeTopics or {@code null} for none
   */
  public Groups setWhoCanTakeTopics(java.lang.String whoCanTakeTopics) {
    this.whoCanTakeTopics = whoCanTakeTopics;
    return this;
  }

  /**
   * Permission to unassign any topic in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanUnassignTopic() {
    return whoCanUnassignTopic;
  }

  /**
   * Permission to unassign any topic in a forum. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanUnassignTopic whoCanUnassignTopic or {@code null} for none
   */
  public Groups setWhoCanUnassignTopic(java.lang.String whoCanUnassignTopic) {
    this.whoCanUnassignTopic = whoCanUnassignTopic;
    return this;
  }

  /**
   * Permission to unmark any post from a favorite reply. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanUnmarkFavoriteReplyOnAnyTopic() {
    return whoCanUnmarkFavoriteReplyOnAnyTopic;
  }

  /**
   * Permission to unmark any post from a favorite reply. Possible values are: NONE OWNERS_ONLY
   * MANAGERS_ONLY OWNERS_AND_MANAGERS ALL_MEMBERS
   * @param whoCanUnmarkFavoriteReplyOnAnyTopic whoCanUnmarkFavoriteReplyOnAnyTopic or {@code null} for none
   */
  public Groups setWhoCanUnmarkFavoriteReplyOnAnyTopic(java.lang.String whoCanUnmarkFavoriteReplyOnAnyTopic) {
    this.whoCanUnmarkFavoriteReplyOnAnyTopic = whoCanUnmarkFavoriteReplyOnAnyTopic;
    return this;
  }

  /**
   * Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW ALL_OWNERS_CAN_VIEW
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanViewGroup() {
    return whoCanViewGroup;
  }

  /**
   * Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW ALL_OWNERS_CAN_VIEW
   * @param whoCanViewGroup whoCanViewGroup or {@code null} for none
   */
  public Groups setWhoCanViewGroup(java.lang.String whoCanViewGroup) {
    this.whoCanViewGroup = whoCanViewGroup;
    return this;
  }

  /**
   * Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
   * @return value or {@code null} for none
   */
  public java.lang.String getWhoCanViewMembership() {
    return whoCanViewMembership;
  }

  /**
   * Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW
   * ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW
   * @param whoCanViewMembership whoCanViewMembership or {@code null} for none
   */
  public Groups setWhoCanViewMembership(java.lang.String whoCanViewMembership) {
    this.whoCanViewMembership = whoCanViewMembership;
    return this;
  }

  @Override
  public Groups set(String fieldName, Object value) {
    return (Groups) super.set(fieldName, value);
  }

  @Override
  public Groups clone() {
    return (Groups) super.clone();
  }

}
