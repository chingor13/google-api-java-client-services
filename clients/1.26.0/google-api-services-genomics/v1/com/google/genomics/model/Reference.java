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
 * A reference is a canonical assembled DNA sequence, intended to act as a reference coordinate
 * space for other genomic annotations. A single reference might represent the human chromosome 1 or
 * mitochandrial DNA, for instance. A reference belongs to one or more reference sets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Reference extends com.google.api.client.json.GenericJson {

  /**
   * The server-generated reference ID, unique across all references.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The length of this reference's sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long length;

  /**
   * MD5 of the upper-case sequence excluding all whitespace characters (this is equivalent to SQ:M5
   * in SAM). This value is represented in lower case hexadecimal format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5checksum;

  /**
   * The name of this reference, for example `22`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ncbiTaxonId;

  /**
   * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally with a version
   * number, for example `GCF_000001405.26`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceAccessions;

  /**
   * The URI from which the sequence was obtained. Typically specifies a FASTA format file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUri;

  /**
   * The server-generated reference ID, unique across all references.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The server-generated reference ID, unique across all references.
   * @param id id or {@code null} for none
   */
  public Reference setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The length of this reference's sequence.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLength() {
    return length;
  }

  /**
   * The length of this reference's sequence.
   * @param length length or {@code null} for none
   */
  public Reference setLength(java.lang.Long length) {
    this.length = length;
    return this;
  }

  /**
   * MD5 of the upper-case sequence excluding all whitespace characters (this is equivalent to SQ:M5
   * in SAM). This value is represented in lower case hexadecimal format.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5checksum() {
    return md5checksum;
  }

  /**
   * MD5 of the upper-case sequence excluding all whitespace characters (this is equivalent to SQ:M5
   * in SAM). This value is represented in lower case hexadecimal format.
   * @param md5checksum md5checksum or {@code null} for none
   */
  public Reference setMd5checksum(java.lang.String md5checksum) {
    this.md5checksum = md5checksum;
    return this;
  }

  /**
   * The name of this reference, for example `22`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this reference, for example `22`.
   * @param name name or {@code null} for none
   */
  public Reference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNcbiTaxonId() {
    return ncbiTaxonId;
  }

  /**
   * ID from http://www.ncbi.nlm.nih.gov/taxonomy. For example, 9606 for human.
   * @param ncbiTaxonId ncbiTaxonId or {@code null} for none
   */
  public Reference setNcbiTaxonId(java.lang.Integer ncbiTaxonId) {
    this.ncbiTaxonId = ncbiTaxonId;
    return this;
  }

  /**
   * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally with a version
   * number, for example `GCF_000001405.26`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceAccessions() {
    return sourceAccessions;
  }

  /**
   * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally with a version
   * number, for example `GCF_000001405.26`.
   * @param sourceAccessions sourceAccessions or {@code null} for none
   */
  public Reference setSourceAccessions(java.util.List<java.lang.String> sourceAccessions) {
    this.sourceAccessions = sourceAccessions;
    return this;
  }

  /**
   * The URI from which the sequence was obtained. Typically specifies a FASTA format file.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUri() {
    return sourceUri;
  }

  /**
   * The URI from which the sequence was obtained. Typically specifies a FASTA format file.
   * @param sourceUri sourceUri or {@code null} for none
   */
  public Reference setSourceUri(java.lang.String sourceUri) {
    this.sourceUri = sourceUri;
    return this;
  }

  @Override
  public Reference set(String fieldName, Object value) {
    return (Reference) super.set(fieldName, value);
  }

  @Override
  public Reference clone() {
    return (Reference) super.clone();
  }

}