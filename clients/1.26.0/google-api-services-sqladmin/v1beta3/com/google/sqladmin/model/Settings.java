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

package com.google.sqladmin.model;

/**
 * Database instance settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Settings extends com.google.api.client.json.GenericJson {

  /**
   * The activation policy for this instance. This specifies when the instance should be activated
   * and is applicable only when the instance state is RUNNABLE. This can be one of the following.
   * ALWAYS: The instance should always be active. NEVER: The instance should never be activated.
   * ON_DEMAND: The instance is activated upon receiving requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activationPolicy;

  /**
   * The App Engine app IDs that can access this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> authorizedGaeApplications;

  /**
   * The daily backup configuration for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackupConfiguration> backupConfiguration;

  static {
    // hack to force ProGuard to consider BackupConfiguration used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BackupConfiguration.class);
  }

  /**
   * The database flags passed to the instance at startup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatabaseFlags> databaseFlags;

  static {
    // hack to force ProGuard to consider DatabaseFlags used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DatabaseFlags.class);
  }

  /**
   * Configuration specific to read replica instance. Indicates whether replication is enabled or
   * not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean databaseReplicationEnabled;

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IpConfiguration ipConfiguration;

  /**
   * This is always sql#settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or GCE zone for better performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocationPreference locationPreference;

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pricingPlan;

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replicationType;

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long settingsVersion;

  /**
   * The tier of service for this instance, for example D1, D2. For more information, see pricing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * The activation policy for this instance. This specifies when the instance should be activated
   * and is applicable only when the instance state is RUNNABLE. This can be one of the following.
   * ALWAYS: The instance should always be active. NEVER: The instance should never be activated.
   * ON_DEMAND: The instance is activated upon receiving requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getActivationPolicy() {
    return activationPolicy;
  }

  /**
   * The activation policy for this instance. This specifies when the instance should be activated
   * and is applicable only when the instance state is RUNNABLE. This can be one of the following.
   * ALWAYS: The instance should always be active. NEVER: The instance should never be activated.
   * ON_DEMAND: The instance is activated upon receiving requests.
   * @param activationPolicy activationPolicy or {@code null} for none
   */
  public Settings setActivationPolicy(java.lang.String activationPolicy) {
    this.activationPolicy = activationPolicy;
    return this;
  }

  /**
   * The App Engine app IDs that can access this instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAuthorizedGaeApplications() {
    return authorizedGaeApplications;
  }

  /**
   * The App Engine app IDs that can access this instance.
   * @param authorizedGaeApplications authorizedGaeApplications or {@code null} for none
   */
  public Settings setAuthorizedGaeApplications(java.util.List<java.lang.String> authorizedGaeApplications) {
    this.authorizedGaeApplications = authorizedGaeApplications;
    return this;
  }

  /**
   * The daily backup configuration for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<BackupConfiguration> getBackupConfiguration() {
    return backupConfiguration;
  }

  /**
   * The daily backup configuration for the instance.
   * @param backupConfiguration backupConfiguration or {@code null} for none
   */
  public Settings setBackupConfiguration(java.util.List<BackupConfiguration> backupConfiguration) {
    this.backupConfiguration = backupConfiguration;
    return this;
  }

  /**
   * The database flags passed to the instance at startup.
   * @return value or {@code null} for none
   */
  public java.util.List<DatabaseFlags> getDatabaseFlags() {
    return databaseFlags;
  }

  /**
   * The database flags passed to the instance at startup.
   * @param databaseFlags databaseFlags or {@code null} for none
   */
  public Settings setDatabaseFlags(java.util.List<DatabaseFlags> databaseFlags) {
    this.databaseFlags = databaseFlags;
    return this;
  }

  /**
   * Configuration specific to read replica instance. Indicates whether replication is enabled or
   * not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDatabaseReplicationEnabled() {
    return databaseReplicationEnabled;
  }

  /**
   * Configuration specific to read replica instance. Indicates whether replication is enabled or
   * not.
   * @param databaseReplicationEnabled databaseReplicationEnabled or {@code null} for none
   */
  public Settings setDatabaseReplicationEnabled(java.lang.Boolean databaseReplicationEnabled) {
    this.databaseReplicationEnabled = databaseReplicationEnabled;
    return this;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance.
   * @return value or {@code null} for none
   */
  public IpConfiguration getIpConfiguration() {
    return ipConfiguration;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance.
   * @param ipConfiguration ipConfiguration or {@code null} for none
   */
  public Settings setIpConfiguration(IpConfiguration ipConfiguration) {
    this.ipConfiguration = ipConfiguration;
    return this;
  }

  /**
   * This is always sql#settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#settings.
   * @param kind kind or {@code null} for none
   */
  public Settings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or GCE zone for better performance.
   * @return value or {@code null} for none
   */
  public LocationPreference getLocationPreference() {
    return locationPreference;
  }

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or GCE zone for better performance.
   * @param locationPreference locationPreference or {@code null} for none
   */
  public Settings setLocationPreference(LocationPreference locationPreference) {
    this.locationPreference = locationPreference;
    return this;
  }

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE.
   * @return value or {@code null} for none
   */
  public java.lang.String getPricingPlan() {
    return pricingPlan;
  }

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE.
   * @param pricingPlan pricingPlan or {@code null} for none
   */
  public Settings setPricingPlan(java.lang.String pricingPlan) {
    this.pricingPlan = pricingPlan;
    return this;
  }

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplicationType() {
    return replicationType;
  }

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * @param replicationType replicationType or {@code null} for none
   */
  public Settings setReplicationType(java.lang.String replicationType) {
    this.replicationType = replicationType;
    return this;
  }

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSettingsVersion() {
    return settingsVersion;
  }

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * @param settingsVersion settingsVersion or {@code null} for none
   */
  public Settings setSettingsVersion(java.lang.Long settingsVersion) {
    this.settingsVersion = settingsVersion;
    return this;
  }

  /**
   * The tier of service for this instance, for example D1, D2. For more information, see pricing.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * The tier of service for this instance, for example D1, D2. For more information, see pricing.
   * @param tier tier or {@code null} for none
   */
  public Settings setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public Settings set(String fieldName, Object value) {
    return (Settings) super.set(fieldName, value);
  }

  @Override
  public Settings clone() {
    return (Settings) super.clone();
  }

}