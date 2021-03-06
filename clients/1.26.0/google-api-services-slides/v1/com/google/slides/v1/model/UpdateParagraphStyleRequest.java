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

package com.google.slides.v1.model;

/**
 * Updates the styling for all of the paragraphs within a Shape or Table that overlap with the given
 * text index range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateParagraphStyleRequest extends com.google.api.client.json.GenericJson {

  /**
   * The location of the cell in the table containing the paragraph(s) to style. If `object_id`
   * refers to a table, `cell_location` must have a value. Otherwise, it must not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation cellLocation;

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `style` is implied and should not be specified.
   * A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the paragraph alignment, set `fields` to `"alignment"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The object ID of the shape or table with the text to be styled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The paragraph's style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParagraphStyle style;

  /**
   * The range of text containing the paragraph(s) to style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range textRange;

  /**
   * The location of the cell in the table containing the paragraph(s) to style. If `object_id`
   * refers to a table, `cell_location` must have a value. Otherwise, it must not.
   * @return value or {@code null} for none
   */
  public TableCellLocation getCellLocation() {
    return cellLocation;
  }

  /**
   * The location of the cell in the table containing the paragraph(s) to style. If `object_id`
   * refers to a table, `cell_location` must have a value. Otherwise, it must not.
   * @param cellLocation cellLocation or {@code null} for none
   */
  public UpdateParagraphStyleRequest setCellLocation(TableCellLocation cellLocation) {
    this.cellLocation = cellLocation;
    return this;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `style` is implied and should not be specified.
   * A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the paragraph alignment, set `fields` to `"alignment"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `style` is implied and should not be specified.
   * A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the paragraph alignment, set `fields` to `"alignment"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @param fields fields or {@code null} for none
   */
  public UpdateParagraphStyleRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The object ID of the shape or table with the text to be styled.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the shape or table with the text to be styled.
   * @param objectId objectId or {@code null} for none
   */
  public UpdateParagraphStyleRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The paragraph's style.
   * @return value or {@code null} for none
   */
  public ParagraphStyle getStyle() {
    return style;
  }

  /**
   * The paragraph's style.
   * @param style style or {@code null} for none
   */
  public UpdateParagraphStyleRequest setStyle(ParagraphStyle style) {
    this.style = style;
    return this;
  }

  /**
   * The range of text containing the paragraph(s) to style.
   * @return value or {@code null} for none
   */
  public Range getTextRange() {
    return textRange;
  }

  /**
   * The range of text containing the paragraph(s) to style.
   * @param textRange textRange or {@code null} for none
   */
  public UpdateParagraphStyleRequest setTextRange(Range textRange) {
    this.textRange = textRange;
    return this;
  }

  @Override
  public UpdateParagraphStyleRequest set(String fieldName, Object value) {
    return (UpdateParagraphStyleRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateParagraphStyleRequest clone() {
    return (UpdateParagraphStyleRequest) super.clone();
  }

}
