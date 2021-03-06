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
 * The default filter associated with a sheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicFilter extends com.google.api.client.json.GenericJson {

  /**
   * The criteria for showing/hiding values per column. The map's key is the column index, and the
   * value is the criteria for that column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, FilterCriteria> criteria;

  static {
    // hack to force ProGuard to consider FilterCriteria used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FilterCriteria.class);
  }

  /**
   * The range the filter covers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The sort order per column. Later specifications are used when values are equal in the earlier
   * specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SortSpec> sortSpecs;

  static {
    // hack to force ProGuard to consider SortSpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SortSpec.class);
  }

  /**
   * The criteria for showing/hiding values per column. The map's key is the column index, and the
   * value is the criteria for that column.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, FilterCriteria> getCriteria() {
    return criteria;
  }

  /**
   * The criteria for showing/hiding values per column. The map's key is the column index, and the
   * value is the criteria for that column.
   * @param criteria criteria or {@code null} for none
   */
  public BasicFilter setCriteria(java.util.Map<String, FilterCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * The range the filter covers.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range the filter covers.
   * @param range range or {@code null} for none
   */
  public BasicFilter setRange(GridRange range) {
    this.range = range;
    return this;
  }

  /**
   * The sort order per column. Later specifications are used when values are equal in the earlier
   * specifications.
   * @return value or {@code null} for none
   */
  public java.util.List<SortSpec> getSortSpecs() {
    return sortSpecs;
  }

  /**
   * The sort order per column. Later specifications are used when values are equal in the earlier
   * specifications.
   * @param sortSpecs sortSpecs or {@code null} for none
   */
  public BasicFilter setSortSpecs(java.util.List<SortSpec> sortSpecs) {
    this.sortSpecs = sortSpecs;
    return this;
  }

  @Override
  public BasicFilter set(String fieldName, Object value) {
    return (BasicFilter) super.set(fieldName, value);
  }

  @Override
  public BasicFilter clone() {
    return (BasicFilter) super.clone();
  }

}
