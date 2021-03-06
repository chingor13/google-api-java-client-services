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

package com.google.streetviewpublish.v1.model;

/**
 * Raw pose measurement for an entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Pose extends com.google.api.client.json.GenericJson {

  /**
   * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an unmeasured quantity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double altitude;

  /**
   * Compass heading, measured at the center of the photo in degrees clockwise from North. Value
   * must be >=0 and <360. NaN indicates an unmeasured quantity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double heading;

  /**
   * Latitude and longitude pair of the pose, as explained here:
   * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng When creating a
   * Photo, if the latitude and longitude pair are not provided here, the geolocation from the exif
   * header will be used. If the latitude and longitude pair is not provided and cannot be found in
   * the exif header, the create photo process will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng latLngPair;

  /**
   * Level (the floor in a building) used to configure vertical navigation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Level level;

  /**
   * Pitch, measured at the center of the photo in degrees. Value must be >=-90 and <= 90. A value
   * of -90 means looking directly down, and a value of 90 means looking directly up. NaN indicates
   * an unmeasured quantity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pitch;

  /**
   * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0 means level with the
   * horizon. NaN indicates an unmeasured quantity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double roll;

  /**
   * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an unmeasured quantity.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAltitude() {
    return altitude;
  }

  /**
   * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an unmeasured quantity.
   * @param altitude altitude or {@code null} for none
   */
  public Pose setAltitude(java.lang.Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Compass heading, measured at the center of the photo in degrees clockwise from North. Value
   * must be >=0 and <360. NaN indicates an unmeasured quantity.
   * @return value or {@code null} for none
   */
  public java.lang.Double getHeading() {
    return heading;
  }

  /**
   * Compass heading, measured at the center of the photo in degrees clockwise from North. Value
   * must be >=0 and <360. NaN indicates an unmeasured quantity.
   * @param heading heading or {@code null} for none
   */
  public Pose setHeading(java.lang.Double heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Latitude and longitude pair of the pose, as explained here:
   * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng When creating a
   * Photo, if the latitude and longitude pair are not provided here, the geolocation from the exif
   * header will be used. If the latitude and longitude pair is not provided and cannot be found in
   * the exif header, the create photo process will fail.
   * @return value or {@code null} for none
   */
  public LatLng getLatLngPair() {
    return latLngPair;
  }

  /**
   * Latitude and longitude pair of the pose, as explained here:
   * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng When creating a
   * Photo, if the latitude and longitude pair are not provided here, the geolocation from the exif
   * header will be used. If the latitude and longitude pair is not provided and cannot be found in
   * the exif header, the create photo process will fail.
   * @param latLngPair latLngPair or {@code null} for none
   */
  public Pose setLatLngPair(LatLng latLngPair) {
    this.latLngPair = latLngPair;
    return this;
  }

  /**
   * Level (the floor in a building) used to configure vertical navigation.
   * @return value or {@code null} for none
   */
  public Level getLevel() {
    return level;
  }

  /**
   * Level (the floor in a building) used to configure vertical navigation.
   * @param level level or {@code null} for none
   */
  public Pose setLevel(Level level) {
    this.level = level;
    return this;
  }

  /**
   * Pitch, measured at the center of the photo in degrees. Value must be >=-90 and <= 90. A value
   * of -90 means looking directly down, and a value of 90 means looking directly up. NaN indicates
   * an unmeasured quantity.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPitch() {
    return pitch;
  }

  /**
   * Pitch, measured at the center of the photo in degrees. Value must be >=-90 and <= 90. A value
   * of -90 means looking directly down, and a value of 90 means looking directly up. NaN indicates
   * an unmeasured quantity.
   * @param pitch pitch or {@code null} for none
   */
  public Pose setPitch(java.lang.Double pitch) {
    this.pitch = pitch;
    return this;
  }

  /**
   * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0 means level with the
   * horizon. NaN indicates an unmeasured quantity.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRoll() {
    return roll;
  }

  /**
   * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0 means level with the
   * horizon. NaN indicates an unmeasured quantity.
   * @param roll roll or {@code null} for none
   */
  public Pose setRoll(java.lang.Double roll) {
    this.roll = roll;
    return this;
  }

  @Override
  public Pose set(String fieldName, Object value) {
    return (Pose) super.set(fieldName, value);
  }

  @Override
  public Pose clone() {
    return (Pose) super.clone();
  }

}
