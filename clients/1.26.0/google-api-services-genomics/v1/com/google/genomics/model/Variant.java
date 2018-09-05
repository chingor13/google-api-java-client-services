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

package com.google.genomics.model;

/**
 * A variant represents a change in DNA sequence relative to a reference sequence. For example, a
 * variant could represent a SNP or an insertion. Variants belong to a variant set.
 *
 * Each of the calls on a variant represent a determination of genotype with respect to that
 * variant. For example, a call might assign probability of 0.32 to the occurrence of a SNP named
 * rs1234 in a sample named NA12345. A call belongs to a call set, which contains related calls
 * typically from one sample.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Variant extends com.google.api.client.json.GenericJson {

  /**
   * The bases that appear instead of the reference bases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> alternateBases;

  /**
   * The variant calls for this particular variant. Each one represents the determination of
   * genotype with respect to this variant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VariantCall> calls;

  /**
   * The date this variant was created, in milliseconds from the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long created;

  /**
   * The end position (0-based) of this variant. This corresponds to the first base after the last
   * base in the reference allele. So, the length of the reference allele is (end - start). This is
   * useful for variants that don't explicitly give alternate bases, for example large deletions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long end;

  /**
   * A list of filters (normally quality filters) this variant has failed. `PASS` indicates this
   * variant has passed all filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filter;

  /**
   * The server-generated variant ID, unique across all variants.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A map of additional variant information. This must be of the form map (string key mapping to a
   * list of string values).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.lang.Object>> info;

  /**
   * Names for the variant, for example a RefSNP ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> names;

  /**
   * A measure of how likely this variant is to be real. A higher value is better.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double quality;

  /**
   * The reference bases for this variant. They start at the given position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceBases;

  /**
   * The reference on which this variant occurs. (such as `chr20` or `X`)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceName;

  /**
   * The position at which this variant occurs (0-based). This corresponds to the first base of the
   * string of reference bases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * The ID of the variant set this variant belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String variantSetId;

  /**
   * The bases that appear instead of the reference bases.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAlternateBases() {
    return alternateBases;
  }

  /**
   * The bases that appear instead of the reference bases.
   * @param alternateBases alternateBases or {@code null} for none
   */
  public Variant setAlternateBases(java.util.List<java.lang.String> alternateBases) {
    this.alternateBases = alternateBases;
    return this;
  }

  /**
   * The variant calls for this particular variant. Each one represents the determination of
   * genotype with respect to this variant.
   * @return value or {@code null} for none
   */
  public java.util.List<VariantCall> getCalls() {
    return calls;
  }

  /**
   * The variant calls for this particular variant. Each one represents the determination of
   * genotype with respect to this variant.
   * @param calls calls or {@code null} for none
   */
  public Variant setCalls(java.util.List<VariantCall> calls) {
    this.calls = calls;
    return this;
  }

  /**
   * The date this variant was created, in milliseconds from the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreated() {
    return created;
  }

  /**
   * The date this variant was created, in milliseconds from the epoch.
   * @param created created or {@code null} for none
   */
  public Variant setCreated(java.lang.Long created) {
    this.created = created;
    return this;
  }

  /**
   * The end position (0-based) of this variant. This corresponds to the first base after the last
   * base in the reference allele. So, the length of the reference allele is (end - start). This is
   * useful for variants that don't explicitly give alternate bases, for example large deletions.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * The end position (0-based) of this variant. This corresponds to the first base after the last
   * base in the reference allele. So, the length of the reference allele is (end - start). This is
   * useful for variants that don't explicitly give alternate bases, for example large deletions.
   * @param end end or {@code null} for none
   */
  public Variant setEnd(java.lang.Long end) {
    this.end = end;
    return this;
  }

  /**
   * A list of filters (normally quality filters) this variant has failed. `PASS` indicates this
   * variant has passed all filters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilter() {
    return filter;
  }

  /**
   * A list of filters (normally quality filters) this variant has failed. `PASS` indicates this
   * variant has passed all filters.
   * @param filter filter or {@code null} for none
   */
  public Variant setFilter(java.util.List<java.lang.String> filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The server-generated variant ID, unique across all variants.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The server-generated variant ID, unique across all variants.
   * @param id id or {@code null} for none
   */
  public Variant setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A map of additional variant information. This must be of the form map (string key mapping to a
   * list of string values).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.lang.Object>> getInfo() {
    return info;
  }

  /**
   * A map of additional variant information. This must be of the form map (string key mapping to a
   * list of string values).
   * @param info info or {@code null} for none
   */
  public Variant setInfo(java.util.Map<String, java.util.List<java.lang.Object>> info) {
    this.info = info;
    return this;
  }

  /**
   * Names for the variant, for example a RefSNP ID.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNames() {
    return names;
  }

  /**
   * Names for the variant, for example a RefSNP ID.
   * @param names names or {@code null} for none
   */
  public Variant setNames(java.util.List<java.lang.String> names) {
    this.names = names;
    return this;
  }

  /**
   * A measure of how likely this variant is to be real. A higher value is better.
   * @return value or {@code null} for none
   */
  public java.lang.Double getQuality() {
    return quality;
  }

  /**
   * A measure of how likely this variant is to be real. A higher value is better.
   * @param quality quality or {@code null} for none
   */
  public Variant setQuality(java.lang.Double quality) {
    this.quality = quality;
    return this;
  }

  /**
   * The reference bases for this variant. They start at the given position.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceBases() {
    return referenceBases;
  }

  /**
   * The reference bases for this variant. They start at the given position.
   * @param referenceBases referenceBases or {@code null} for none
   */
  public Variant setReferenceBases(java.lang.String referenceBases) {
    this.referenceBases = referenceBases;
    return this;
  }

  /**
   * The reference on which this variant occurs. (such as `chr20` or `X`)
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceName() {
    return referenceName;
  }

  /**
   * The reference on which this variant occurs. (such as `chr20` or `X`)
   * @param referenceName referenceName or {@code null} for none
   */
  public Variant setReferenceName(java.lang.String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

  /**
   * The position at which this variant occurs (0-based). This corresponds to the first base of the
   * string of reference bases.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * The position at which this variant occurs (0-based). This corresponds to the first base of the
   * string of reference bases.
   * @param start start or {@code null} for none
   */
  public Variant setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  /**
   * The ID of the variant set this variant belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getVariantSetId() {
    return variantSetId;
  }

  /**
   * The ID of the variant set this variant belongs to.
   * @param variantSetId variantSetId or {@code null} for none
   */
  public Variant setVariantSetId(java.lang.String variantSetId) {
    this.variantSetId = variantSetId;
    return this;
  }

  @Override
  public Variant set(String fieldName, Object value) {
    return (Variant) super.set(fieldName, value);
  }

  @Override
  public Variant clone() {
    return (Variant) super.clone();
  }

}