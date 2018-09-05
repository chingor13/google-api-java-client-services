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

package com.google.sheets.v4.model;

/**
 * A request to update properties of developer metadata. Updates the properties of the developer
 * metadata selected by the filters to the values provided in the DeveloperMetadata resource.
 * Callers must specify the properties they wish to update in the fields parameter, as well as
 * specify at least one DataFilter matching the metadata they wish to update.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateDeveloperMetadataRequest extends com.google.api.client.json.GenericJson {

  /**
   * The filters matching the developer metadata entries to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataFilter> dataFilters;

  /**
   * The value that all metadata matched by the data filters will be updated to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeveloperMetadata developerMetadata;

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `developerMetadata` is implied and should not be specified. A single `"*"` can be used as
   * short-hand for listing every field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The filters matching the developer metadata entries to update.
   * @return value or {@code null} for none
   */
  public java.util.List<DataFilter> getDataFilters() {
    return dataFilters;
  }

  /**
   * The filters matching the developer metadata entries to update.
   * @param dataFilters dataFilters or {@code null} for none
   */
  public UpdateDeveloperMetadataRequest setDataFilters(java.util.List<DataFilter> dataFilters) {
    this.dataFilters = dataFilters;
    return this;
  }

  /**
   * The value that all metadata matched by the data filters will be updated to.
   * @return value or {@code null} for none
   */
  public DeveloperMetadata getDeveloperMetadata() {
    return developerMetadata;
  }

  /**
   * The value that all metadata matched by the data filters will be updated to.
   * @param developerMetadata developerMetadata or {@code null} for none
   */
  public UpdateDeveloperMetadataRequest setDeveloperMetadata(DeveloperMetadata developerMetadata) {
    this.developerMetadata = developerMetadata;
    return this;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `developerMetadata` is implied and should not be specified. A single `"*"` can be used as
   * short-hand for listing every field.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `developerMetadata` is implied and should not be specified. A single `"*"` can be used as
   * short-hand for listing every field.
   * @param fields fields or {@code null} for none
   */
  public UpdateDeveloperMetadataRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public UpdateDeveloperMetadataRequest set(String fieldName, Object value) {
    return (UpdateDeveloperMetadataRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateDeveloperMetadataRequest clone() {
    return (UpdateDeveloperMetadataRequest) super.clone();
  }

}