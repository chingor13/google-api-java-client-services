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

package com.google.androidmanagement.v1.model;

/**
 * Information about security related device settings on device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceSettings extends com.google.api.client.json.GenericJson {

  /**
   * Whether ADB (https://developer.android.com/studio/command-line/adb.html) is enabled on the
   * device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adbEnabled;

  /**
   * Whether developer mode is enabled on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean developmentSettingsEnabled;

  /**
   * Encryption status from DevicePolicyManager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionStatus;

  /**
   * Whether the device is secured with PIN/password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDeviceSecure;

  /**
   * Whether the storage encryption is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isEncrypted;

  /**
   * Whether installing apps from unknown sources is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean unknownSourcesEnabled;

  /**
   * Whether Verify Apps (Google Play Protect
   * (https://support.google.com/googleplay/answer/2812853)) is enabled on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifyAppsEnabled;

  /**
   * Whether ADB (https://developer.android.com/studio/command-line/adb.html) is enabled on the
   * device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdbEnabled() {
    return adbEnabled;
  }

  /**
   * Whether ADB (https://developer.android.com/studio/command-line/adb.html) is enabled on the
   * device.
   * @param adbEnabled adbEnabled or {@code null} for none
   */
  public DeviceSettings setAdbEnabled(java.lang.Boolean adbEnabled) {
    this.adbEnabled = adbEnabled;
    return this;
  }

  /**
   * Whether developer mode is enabled on the device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDevelopmentSettingsEnabled() {
    return developmentSettingsEnabled;
  }

  /**
   * Whether developer mode is enabled on the device.
   * @param developmentSettingsEnabled developmentSettingsEnabled or {@code null} for none
   */
  public DeviceSettings setDevelopmentSettingsEnabled(java.lang.Boolean developmentSettingsEnabled) {
    this.developmentSettingsEnabled = developmentSettingsEnabled;
    return this;
  }

  /**
   * Encryption status from DevicePolicyManager.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionStatus() {
    return encryptionStatus;
  }

  /**
   * Encryption status from DevicePolicyManager.
   * @param encryptionStatus encryptionStatus or {@code null} for none
   */
  public DeviceSettings setEncryptionStatus(java.lang.String encryptionStatus) {
    this.encryptionStatus = encryptionStatus;
    return this;
  }

  /**
   * Whether the device is secured with PIN/password.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDeviceSecure() {
    return isDeviceSecure;
  }

  /**
   * Whether the device is secured with PIN/password.
   * @param isDeviceSecure isDeviceSecure or {@code null} for none
   */
  public DeviceSettings setIsDeviceSecure(java.lang.Boolean isDeviceSecure) {
    this.isDeviceSecure = isDeviceSecure;
    return this;
  }

  /**
   * Whether the storage encryption is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsEncrypted() {
    return isEncrypted;
  }

  /**
   * Whether the storage encryption is enabled.
   * @param isEncrypted isEncrypted or {@code null} for none
   */
  public DeviceSettings setIsEncrypted(java.lang.Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Whether installing apps from unknown sources is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnknownSourcesEnabled() {
    return unknownSourcesEnabled;
  }

  /**
   * Whether installing apps from unknown sources is enabled.
   * @param unknownSourcesEnabled unknownSourcesEnabled or {@code null} for none
   */
  public DeviceSettings setUnknownSourcesEnabled(java.lang.Boolean unknownSourcesEnabled) {
    this.unknownSourcesEnabled = unknownSourcesEnabled;
    return this;
  }

  /**
   * Whether Verify Apps (Google Play Protect
   * (https://support.google.com/googleplay/answer/2812853)) is enabled on the device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifyAppsEnabled() {
    return verifyAppsEnabled;
  }

  /**
   * Whether Verify Apps (Google Play Protect
   * (https://support.google.com/googleplay/answer/2812853)) is enabled on the device.
   * @param verifyAppsEnabled verifyAppsEnabled or {@code null} for none
   */
  public DeviceSettings setVerifyAppsEnabled(java.lang.Boolean verifyAppsEnabled) {
    this.verifyAppsEnabled = verifyAppsEnabled;
    return this;
  }

  @Override
  public DeviceSettings set(String fieldName, Object value) {
    return (DeviceSettings) super.set(fieldName, value);
  }

  @Override
  public DeviceSettings clone() {
    return (DeviceSettings) super.clone();
  }

}