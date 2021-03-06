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

package com.google.youtubeAnalytics;

/**
 * Available OAuth 2.0 scopes for use with the YouTube Analytics API.
 *
 * @since 1.4
 */
public class YouTubeAnalyticsScopes {

  /** Manage your YouTube account. */
  public static final String YOUTUBE = "https://www.googleapis.com/auth/youtube";

  /** View your YouTube account. */
  public static final String YOUTUBE_READONLY = "https://www.googleapis.com/auth/youtube.readonly";

  /** View and manage your assets and associated content on YouTube. */
  public static final String YOUTUBEPARTNER = "https://www.googleapis.com/auth/youtubepartner";

  /** View monetary and non-monetary YouTube Analytics reports for your YouTube content. */
  public static final String YT_ANALYTICS_MONETARY_READONLY = "https://www.googleapis.com/auth/yt-analytics-monetary.readonly";

  /** View YouTube Analytics reports for your YouTube content. */
  public static final String YT_ANALYTICS_READONLY = "https://www.googleapis.com/auth/yt-analytics.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(YOUTUBE);
    set.add(YOUTUBE_READONLY);
    set.add(YOUTUBEPARTNER);
    set.add(YT_ANALYTICS_MONETARY_READONLY);
    set.add(YT_ANALYTICS_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private YouTubeAnalyticsScopes() {
  }
}
