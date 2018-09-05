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

package com.google.proximitybeacon.v1beta1.model;

/**
 * Diagnostics for a single beacon.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Proximity Beacon API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Diagnostics extends com.google.api.client.json.GenericJson {

  /**
   * An unordered list of Alerts that the beacon has.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> alerts;

  /**
   * Resource name of the beacon. For Eddystone-EID beacons, this may be the beacon's current EID,
   * or the beacon's "stable" Eddystone-UID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beaconName;

  /**
   * The date when the battery is expected to be low. If the value is missing then there is no
   * estimate for when the battery will be low. This value is only an estimate, not an exact date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date estimatedLowBatteryDate;

  /**
   * An unordered list of Alerts that the beacon has.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAlerts() {
    return alerts;
  }

  /**
   * An unordered list of Alerts that the beacon has.
   * @param alerts alerts or {@code null} for none
   */
  public Diagnostics setAlerts(java.util.List<java.lang.String> alerts) {
    this.alerts = alerts;
    return this;
  }

  /**
   * Resource name of the beacon. For Eddystone-EID beacons, this may be the beacon's current EID,
   * or the beacon's "stable" Eddystone-UID.
   * @return value or {@code null} for none
   */
  public java.lang.String getBeaconName() {
    return beaconName;
  }

  /**
   * Resource name of the beacon. For Eddystone-EID beacons, this may be the beacon's current EID,
   * or the beacon's "stable" Eddystone-UID.
   * @param beaconName beaconName or {@code null} for none
   */
  public Diagnostics setBeaconName(java.lang.String beaconName) {
    this.beaconName = beaconName;
    return this;
  }

  /**
   * The date when the battery is expected to be low. If the value is missing then there is no
   * estimate for when the battery will be low. This value is only an estimate, not an exact date.
   * @return value or {@code null} for none
   */
  public Date getEstimatedLowBatteryDate() {
    return estimatedLowBatteryDate;
  }

  /**
   * The date when the battery is expected to be low. If the value is missing then there is no
   * estimate for when the battery will be low. This value is only an estimate, not an exact date.
   * @param estimatedLowBatteryDate estimatedLowBatteryDate or {@code null} for none
   */
  public Diagnostics setEstimatedLowBatteryDate(Date estimatedLowBatteryDate) {
    this.estimatedLowBatteryDate = estimatedLowBatteryDate;
    return this;
  }

  @Override
  public Diagnostics set(String fieldName, Object value) {
    return (Diagnostics) super.set(fieldName, value);
  }

  @Override
  public Diagnostics clone() {
    return (Diagnostics) super.clone();
  }

}