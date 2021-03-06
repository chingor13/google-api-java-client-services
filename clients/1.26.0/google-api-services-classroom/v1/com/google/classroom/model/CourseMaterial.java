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

package com.google.classroom.model;

/**
 * A material attached to a course as part of a material set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CourseMaterial extends com.google.api.client.json.GenericJson {

  /**
   * Google Drive file attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveFile driveFile;

  /**
   * Google Forms attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Form form;

  /**
   * Link atatchment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Link link;

  /**
   * Youtube video attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private YouTubeVideo youTubeVideo;

  /**
   * Google Drive file attachment.
   * @return value or {@code null} for none
   */
  public DriveFile getDriveFile() {
    return driveFile;
  }

  /**
   * Google Drive file attachment.
   * @param driveFile driveFile or {@code null} for none
   */
  public CourseMaterial setDriveFile(DriveFile driveFile) {
    this.driveFile = driveFile;
    return this;
  }

  /**
   * Google Forms attachment.
   * @return value or {@code null} for none
   */
  public Form getForm() {
    return form;
  }

  /**
   * Google Forms attachment.
   * @param form form or {@code null} for none
   */
  public CourseMaterial setForm(Form form) {
    this.form = form;
    return this;
  }

  /**
   * Link atatchment.
   * @return value or {@code null} for none
   */
  public Link getLink() {
    return link;
  }

  /**
   * Link atatchment.
   * @param link link or {@code null} for none
   */
  public CourseMaterial setLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   * Youtube video attachment.
   * @return value or {@code null} for none
   */
  public YouTubeVideo getYouTubeVideo() {
    return youTubeVideo;
  }

  /**
   * Youtube video attachment.
   * @param youTubeVideo youTubeVideo or {@code null} for none
   */
  public CourseMaterial setYouTubeVideo(YouTubeVideo youTubeVideo) {
    this.youTubeVideo = youTubeVideo;
    return this;
  }

  @Override
  public CourseMaterial set(String fieldName, Object value) {
    return (CourseMaterial) super.set(fieldName, value);
  }

  @Override
  public CourseMaterial clone() {
    return (CourseMaterial) super.clone();
  }

}
