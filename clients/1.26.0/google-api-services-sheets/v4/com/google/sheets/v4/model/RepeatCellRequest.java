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
 * Updates all cells in the range to the values in the given Cell object. Only the fields listed in
 * the fields field are updated; others are unchanged.
 *
 * If writing a cell with a formula, the formula's ranges will automatically increment for each
 * field in the range. For example, if writing a cell with formula `=A1` into range B2:C4, B2 would
 * be `=A1`, B3 would be `=A2`, B4 would be `=A3`, C2 would be `=B1`, C3 would be `=B2`, C4 would be
 * `=B3`.
 *
 * To keep the formula's ranges static, use the `$` indicator. For example, use the formula `=$A$1`
 * to prevent both the row and the column from incrementing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepeatCellRequest extends com.google.api.client.json.GenericJson {

  /**
   * The data to write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CellData cell;

  /**
   * The fields that should be updated.  At least one field must be specified. The root `cell` is
   * implied and should not be specified. A single `"*"` can be used as short-hand for listing every
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The range to repeat the cell in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The data to write.
   * @return value or {@code null} for none
   */
  public CellData getCell() {
    return cell;
  }

  /**
   * The data to write.
   * @param cell cell or {@code null} for none
   */
  public RepeatCellRequest setCell(CellData cell) {
    this.cell = cell;
    return this;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root `cell` is
   * implied and should not be specified. A single `"*"` can be used as short-hand for listing every
   * field.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root `cell` is
   * implied and should not be specified. A single `"*"` can be used as short-hand for listing every
   * field.
   * @param fields fields or {@code null} for none
   */
  public RepeatCellRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The range to repeat the cell in.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range to repeat the cell in.
   * @param range range or {@code null} for none
   */
  public RepeatCellRequest setRange(GridRange range) {
    this.range = range;
    return this;
  }

  @Override
  public RepeatCellRequest set(String fieldName, Object value) {
    return (RepeatCellRequest) super.set(fieldName, value);
  }

  @Override
  public RepeatCellRequest clone() {
    return (RepeatCellRequest) super.clone();
  }

}