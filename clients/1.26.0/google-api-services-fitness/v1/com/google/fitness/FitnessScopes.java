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

package com.google.fitness;

/**
 * Available OAuth 2.0 scopes for use with the Fitness.
 *
 * @since 1.4
 */
public class FitnessScopes {

  /** View your activity information in Google Fit. */
  public static final String FITNESS_ACTIVITY_READ = "https://www.googleapis.com/auth/fitness.activity.read";

  /** View and store your activity information in Google Fit. */
  public static final String FITNESS_ACTIVITY_WRITE = "https://www.googleapis.com/auth/fitness.activity.write";

  /** View blood glucose data in Google Fit. */
  public static final String FITNESS_BLOOD_GLUCOSE_READ = "https://www.googleapis.com/auth/fitness.blood_glucose.read";

  /** View and store blood glucose data in Google Fit. */
  public static final String FITNESS_BLOOD_GLUCOSE_WRITE = "https://www.googleapis.com/auth/fitness.blood_glucose.write";

  /** View blood pressure data in Google Fit. */
  public static final String FITNESS_BLOOD_PRESSURE_READ = "https://www.googleapis.com/auth/fitness.blood_pressure.read";

  /** View and store blood pressure data in Google Fit. */
  public static final String FITNESS_BLOOD_PRESSURE_WRITE = "https://www.googleapis.com/auth/fitness.blood_pressure.write";

  /** View body sensor information in Google Fit. */
  public static final String FITNESS_BODY_READ = "https://www.googleapis.com/auth/fitness.body.read";

  /** View and store body sensor data in Google Fit. */
  public static final String FITNESS_BODY_WRITE = "https://www.googleapis.com/auth/fitness.body.write";

  /** View body temperature data in Google Fit. */
  public static final String FITNESS_BODY_TEMPERATURE_READ = "https://www.googleapis.com/auth/fitness.body_temperature.read";

  /** View and store body temperature data in Google Fit. */
  public static final String FITNESS_BODY_TEMPERATURE_WRITE = "https://www.googleapis.com/auth/fitness.body_temperature.write";

  /** View your stored location data in Google Fit. */
  public static final String FITNESS_LOCATION_READ = "https://www.googleapis.com/auth/fitness.location.read";

  /** View and store your location data in Google Fit. */
  public static final String FITNESS_LOCATION_WRITE = "https://www.googleapis.com/auth/fitness.location.write";

  /** View nutrition information in Google Fit. */
  public static final String FITNESS_NUTRITION_READ = "https://www.googleapis.com/auth/fitness.nutrition.read";

  /** View and store nutrition information in Google Fit. */
  public static final String FITNESS_NUTRITION_WRITE = "https://www.googleapis.com/auth/fitness.nutrition.write";

  /** View oxygen saturation data in Google Fit. */
  public static final String FITNESS_OXYGEN_SATURATION_READ = "https://www.googleapis.com/auth/fitness.oxygen_saturation.read";

  /** View and store oxygen saturation data in Google Fit. */
  public static final String FITNESS_OXYGEN_SATURATION_WRITE = "https://www.googleapis.com/auth/fitness.oxygen_saturation.write";

  /** View reproductive health data in Google Fit. */
  public static final String FITNESS_REPRODUCTIVE_HEALTH_READ = "https://www.googleapis.com/auth/fitness.reproductive_health.read";

  /** View and store reproductive health data in Google Fit. */
  public static final String FITNESS_REPRODUCTIVE_HEALTH_WRITE = "https://www.googleapis.com/auth/fitness.reproductive_health.write";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(FITNESS_ACTIVITY_READ);
    set.add(FITNESS_ACTIVITY_WRITE);
    set.add(FITNESS_BLOOD_GLUCOSE_READ);
    set.add(FITNESS_BLOOD_GLUCOSE_WRITE);
    set.add(FITNESS_BLOOD_PRESSURE_READ);
    set.add(FITNESS_BLOOD_PRESSURE_WRITE);
    set.add(FITNESS_BODY_READ);
    set.add(FITNESS_BODY_WRITE);
    set.add(FITNESS_BODY_TEMPERATURE_READ);
    set.add(FITNESS_BODY_TEMPERATURE_WRITE);
    set.add(FITNESS_LOCATION_READ);
    set.add(FITNESS_LOCATION_WRITE);
    set.add(FITNESS_NUTRITION_READ);
    set.add(FITNESS_NUTRITION_WRITE);
    set.add(FITNESS_OXYGEN_SATURATION_READ);
    set.add(FITNESS_OXYGEN_SATURATION_WRITE);
    set.add(FITNESS_REPRODUCTIVE_HEALTH_READ);
    set.add(FITNESS_REPRODUCTIVE_HEALTH_WRITE);
    return java.util.Collections.unmodifiableSet(set);
  }

  private FitnessScopes() {
  }
}