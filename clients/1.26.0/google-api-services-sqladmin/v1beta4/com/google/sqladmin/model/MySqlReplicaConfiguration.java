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
 * Read-replica configuration specific to MySQL databases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MySqlReplicaConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caCertificate;

  /**
   * PEM representation of the slave's x509 certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientCertificate;

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientKey;

  /**
   * Seconds to wait between connect retries. MySQL's default is 60 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer connectRetryInterval;

  /**
   * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created.
   * The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also
   * supported. Dumps should have the binlog co-ordinates from which replication should begin. This
   * can be accomplished by setting --master-data to 1 when using mysqldump.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dumpFilePath;

  /**
   * This is always sql#mysqlReplicaConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Interval in milliseconds between replication heartbeats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long masterHeartbeatPeriod;

  /**
   * The password for the replication connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * A list of permissible ciphers to use for SSL encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sslCipher;

  /**
   * The username for the replication connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Whether or not to check the master's Common Name value in the certificate that it sends during
   * the SSL handshake.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifyServerCertificate;

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaCertificate() {
    return caCertificate;
  }

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * @param caCertificate caCertificate or {@code null} for none
   */
  public MySqlReplicaConfiguration setCaCertificate(java.lang.String caCertificate) {
    this.caCertificate = caCertificate;
    return this;
  }

  /**
   * PEM representation of the slave's x509 certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientCertificate() {
    return clientCertificate;
  }

  /**
   * PEM representation of the slave's x509 certificate.
   * @param clientCertificate clientCertificate or {@code null} for none
   */
  public MySqlReplicaConfiguration setClientCertificate(java.lang.String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientKey() {
    return clientKey;
  }

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate.
   * @param clientKey clientKey or {@code null} for none
   */
  public MySqlReplicaConfiguration setClientKey(java.lang.String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

  /**
   * Seconds to wait between connect retries. MySQL's default is 60 seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConnectRetryInterval() {
    return connectRetryInterval;
  }

  /**
   * Seconds to wait between connect retries. MySQL's default is 60 seconds.
   * @param connectRetryInterval connectRetryInterval or {@code null} for none
   */
  public MySqlReplicaConfiguration setConnectRetryInterval(java.lang.Integer connectRetryInterval) {
    this.connectRetryInterval = connectRetryInterval;
    return this;
  }

  /**
   * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created.
   * The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also
   * supported. Dumps should have the binlog co-ordinates from which replication should begin. This
   * can be accomplished by setting --master-data to 1 when using mysqldump.
   * @return value or {@code null} for none
   */
  public java.lang.String getDumpFilePath() {
    return dumpFilePath;
  }

  /**
   * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created.
   * The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also
   * supported. Dumps should have the binlog co-ordinates from which replication should begin. This
   * can be accomplished by setting --master-data to 1 when using mysqldump.
   * @param dumpFilePath dumpFilePath or {@code null} for none
   */
  public MySqlReplicaConfiguration setDumpFilePath(java.lang.String dumpFilePath) {
    this.dumpFilePath = dumpFilePath;
    return this;
  }

  /**
   * This is always sql#mysqlReplicaConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#mysqlReplicaConfiguration.
   * @param kind kind or {@code null} for none
   */
  public MySqlReplicaConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Interval in milliseconds between replication heartbeats.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMasterHeartbeatPeriod() {
    return masterHeartbeatPeriod;
  }

  /**
   * Interval in milliseconds between replication heartbeats.
   * @param masterHeartbeatPeriod masterHeartbeatPeriod or {@code null} for none
   */
  public MySqlReplicaConfiguration setMasterHeartbeatPeriod(java.lang.Long masterHeartbeatPeriod) {
    this.masterHeartbeatPeriod = masterHeartbeatPeriod;
    return this;
  }

  /**
   * The password for the replication connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password for the replication connection.
   * @param password password or {@code null} for none
   */
  public MySqlReplicaConfiguration setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * A list of permissible ciphers to use for SSL encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getSslCipher() {
    return sslCipher;
  }

  /**
   * A list of permissible ciphers to use for SSL encryption.
   * @param sslCipher sslCipher or {@code null} for none
   */
  public MySqlReplicaConfiguration setSslCipher(java.lang.String sslCipher) {
    this.sslCipher = sslCipher;
    return this;
  }

  /**
   * The username for the replication connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username for the replication connection.
   * @param username username or {@code null} for none
   */
  public MySqlReplicaConfiguration setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  /**
   * Whether or not to check the master's Common Name value in the certificate that it sends during
   * the SSL handshake.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifyServerCertificate() {
    return verifyServerCertificate;
  }

  /**
   * Whether or not to check the master's Common Name value in the certificate that it sends during
   * the SSL handshake.
   * @param verifyServerCertificate verifyServerCertificate or {@code null} for none
   */
  public MySqlReplicaConfiguration setVerifyServerCertificate(java.lang.Boolean verifyServerCertificate) {
    this.verifyServerCertificate = verifyServerCertificate;
    return this;
  }

  @Override
  public MySqlReplicaConfiguration set(String fieldName, Object value) {
    return (MySqlReplicaConfiguration) super.set(fieldName, value);
  }

  @Override
  public MySqlReplicaConfiguration clone() {
    return (MySqlReplicaConfiguration) super.clone();
  }

}