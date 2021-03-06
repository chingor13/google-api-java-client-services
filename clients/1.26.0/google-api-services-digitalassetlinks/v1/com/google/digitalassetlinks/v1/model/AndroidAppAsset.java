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

package com.google.digitalassetlinks.v1.model;

/**
 * Describes an android app asset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Digital Asset Links API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidAppAsset extends com.google.api.client.json.GenericJson {

  /**
   * Because there is no global enforcement of package name uniqueness, we also require a signing
   * certificate, which in combination with the package name uniquely identifies an app.
   *
   * Some apps' signing keys are rotated, so they may be signed by different keys over time.  We
   * treat these as distinct assets, since we use (package name, cert) as the unique ID.  This
   * should not normally pose any problems as both versions of the app will make the same or similar
   * statements. Other assets making statements about the app will have to be updated when a key is
   * rotated, however.
   *
   * (Note that the syntaxes for publishing and querying for statements contain syntactic sugar to
   * easily let you specify apps that are known by multiple certificates.) REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertificateInfo certificate;

  /**
   * Android App assets are naturally identified by their Java package name. For example, the Google
   * Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Because there is no global enforcement of package name uniqueness, we also require a signing
   * certificate, which in combination with the package name uniquely identifies an app.
   *
   * Some apps' signing keys are rotated, so they may be signed by different keys over time.  We
   * treat these as distinct assets, since we use (package name, cert) as the unique ID.  This
   * should not normally pose any problems as both versions of the app will make the same or similar
   * statements. Other assets making statements about the app will have to be updated when a key is
   * rotated, however.
   *
   * (Note that the syntaxes for publishing and querying for statements contain syntactic sugar to
   * easily let you specify apps that are known by multiple certificates.) REQUIRED
   * @return value or {@code null} for none
   */
  public CertificateInfo getCertificate() {
    return certificate;
  }

  /**
   * Because there is no global enforcement of package name uniqueness, we also require a signing
   * certificate, which in combination with the package name uniquely identifies an app.
   *
   * Some apps' signing keys are rotated, so they may be signed by different keys over time.  We
   * treat these as distinct assets, since we use (package name, cert) as the unique ID.  This
   * should not normally pose any problems as both versions of the app will make the same or similar
   * statements. Other assets making statements about the app will have to be updated when a key is
   * rotated, however.
   *
   * (Note that the syntaxes for publishing and querying for statements contain syntactic sugar to
   * easily let you specify apps that are known by multiple certificates.) REQUIRED
   * @param certificate certificate or {@code null} for none
   */
  public AndroidAppAsset setCertificate(CertificateInfo certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Android App assets are naturally identified by their Java package name. For example, the Google
   * Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Android App assets are naturally identified by their Java package name. For example, the Google
   * Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
   * @param packageName packageName or {@code null} for none
   */
  public AndroidAppAsset setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  @Override
  public AndroidAppAsset set(String fieldName, Object value) {
    return (AndroidAppAsset) super.set(fieldName, value);
  }

  @Override
  public AndroidAppAsset clone() {
    return (AndroidAppAsset) super.clone();
  }

}
