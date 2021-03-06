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
 * This is a JSON template for the status of a room that the player has joined.
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
public final class RoomStatus extends com.google.api.client.json.GenericJson {

  /**
   * Auto-matching status for this room. Not set if the room is not currently in the automatching
   * queue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RoomAutoMatchStatus autoMatchingStatus;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomStatus.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The participants involved in the room, along with their statuses. Includes participants who
   * have left or declined invitations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RoomParticipant> participants;

  static {
    // hack to force ProGuard to consider RoomParticipant used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RoomParticipant.class);
  }

  /**
   * Globally unique ID for a room.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roomId;

  /**
   * The status of the room. Possible values are:   - "ROOM_INVITING" - One or more players have
   * been invited and not responded.  - "ROOM_AUTO_MATCHING" - One or more slots need to be filled
   * by auto-matching.  - "ROOM_CONNECTING" - Players have joined are connecting to each other
   * (either before or after auto-matching).  - "ROOM_ACTIVE" - All players have joined and
   * connected to each other.  - "ROOM_DELETED" - All joined players have left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The version of the status for the room: an increasing counter, used by the client to ignore
   * out-of-order updates to room status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer statusVersion;

  /**
   * Auto-matching status for this room. Not set if the room is not currently in the automatching
   * queue.
   * @return value or {@code null} for none
   */
  public RoomAutoMatchStatus getAutoMatchingStatus() {
    return autoMatchingStatus;
  }

  /**
   * Auto-matching status for this room. Not set if the room is not currently in the automatching
   * queue.
   * @param autoMatchingStatus autoMatchingStatus or {@code null} for none
   */
  public RoomStatus setAutoMatchingStatus(RoomAutoMatchStatus autoMatchingStatus) {
    this.autoMatchingStatus = autoMatchingStatus;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomStatus.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomStatus.
   * @param kind kind or {@code null} for none
   */
  public RoomStatus setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The participants involved in the room, along with their statuses. Includes participants who
   * have left or declined invitations.
   * @return value or {@code null} for none
   */
  public java.util.List<RoomParticipant> getParticipants() {
    return participants;
  }

  /**
   * The participants involved in the room, along with their statuses. Includes participants who
   * have left or declined invitations.
   * @param participants participants or {@code null} for none
   */
  public RoomStatus setParticipants(java.util.List<RoomParticipant> participants) {
    this.participants = participants;
    return this;
  }

  /**
   * Globally unique ID for a room.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoomId() {
    return roomId;
  }

  /**
   * Globally unique ID for a room.
   * @param roomId roomId or {@code null} for none
   */
  public RoomStatus setRoomId(java.lang.String roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * The status of the room. Possible values are:   - "ROOM_INVITING" - One or more players have
   * been invited and not responded.  - "ROOM_AUTO_MATCHING" - One or more slots need to be filled
   * by auto-matching.  - "ROOM_CONNECTING" - Players have joined are connecting to each other
   * (either before or after auto-matching).  - "ROOM_ACTIVE" - All players have joined and
   * connected to each other.  - "ROOM_DELETED" - All joined players have left.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the room. Possible values are:   - "ROOM_INVITING" - One or more players have
   * been invited and not responded.  - "ROOM_AUTO_MATCHING" - One or more slots need to be filled
   * by auto-matching.  - "ROOM_CONNECTING" - Players have joined are connecting to each other
   * (either before or after auto-matching).  - "ROOM_ACTIVE" - All players have joined and
   * connected to each other.  - "ROOM_DELETED" - All joined players have left.
   * @param status status or {@code null} for none
   */
  public RoomStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The version of the status for the room: an increasing counter, used by the client to ignore
   * out-of-order updates to room status.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatusVersion() {
    return statusVersion;
  }

  /**
   * The version of the status for the room: an increasing counter, used by the client to ignore
   * out-of-order updates to room status.
   * @param statusVersion statusVersion or {@code null} for none
   */
  public RoomStatus setStatusVersion(java.lang.Integer statusVersion) {
    this.statusVersion = statusVersion;
    return this;
  }

  @Override
  public RoomStatus set(String fieldName, Object value) {
    return (RoomStatus) super.set(fieldName, value);
  }

  @Override
  public RoomStatus clone() {
    return (RoomStatus) super.clone();
  }

}
