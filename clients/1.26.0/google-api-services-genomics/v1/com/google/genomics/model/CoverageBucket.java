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
 * A bucket over which read coverage has been precomputed. A bucket corresponds to a specific range
 * of the reference sequence.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CoverageBucket extends com.google.api.client.json.GenericJson {

  /**
   * The average number of reads which are aligned to each individual reference base in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanCoverage;

  /**
   * The genomic coordinate range spanned by this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range range;

  /**
   * The average number of reads which are aligned to each individual reference base in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanCoverage() {
    return meanCoverage;
  }

  /**
   * The average number of reads which are aligned to each individual reference base in this bucket.
   * @param meanCoverage meanCoverage or {@code null} for none
   */
  public CoverageBucket setMeanCoverage(java.lang.Float meanCoverage) {
    this.meanCoverage = meanCoverage;
    return this;
  }

  /**
   * The genomic coordinate range spanned by this bucket.
   * @return value or {@code null} for none
   */
  public Range getRange() {
    return range;
  }

  /**
   * The genomic coordinate range spanned by this bucket.
   * @param range range or {@code null} for none
   */
  public CoverageBucket setRange(Range range) {
    this.range = range;
    return this;
  }

  @Override
  public CoverageBucket set(String fieldName, Object value) {
    return (CoverageBucket) super.set(fieldName, value);
  }

  @Override
  public CoverageBucket clone() {
    return (CoverageBucket) super.clone();
  }

}
