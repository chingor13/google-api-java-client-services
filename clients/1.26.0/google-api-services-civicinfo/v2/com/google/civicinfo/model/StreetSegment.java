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

package com.google.civicinfo.model;

/**
 * Model definition for StreetSegment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StreetSegment extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> administrationRegionIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beforeGeocodeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String catalistUniquePrecinctCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cityCouncilDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String congressionalDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contestIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countyCouncilDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countyFips;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long datasetId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> earlyVoteSiteByIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endHouseNumber;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PointProto geocodedPoint;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> geographicDivisionOcdIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String judicialDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mailOnly;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String municipalDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ncoaAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> oddOrEvens;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pollinglocationByIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String precinctName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String precinctOcdId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Provenance> provenances;

  static {
    // hack to force ProGuard to consider Provenance used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Provenance.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean published;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schoolDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startHouseNumber;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startLatE7;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startLngE7;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateHouseDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateSenateDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subAdministrativeAreaName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long surrogateId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetsmartUniquePrecinctCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String townshipDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitNumber;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vanPrecinctCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> voterGeographicDivisionOcdIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wardDistrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean wildcard;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zip;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdministrationRegionIds() {
    return administrationRegionIds;
  }

  /**
   * @param administrationRegionIds administrationRegionIds or {@code null} for none
   */
  public StreetSegment setAdministrationRegionIds(java.util.List<java.lang.String> administrationRegionIds) {
    this.administrationRegionIds = administrationRegionIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBeforeGeocodeId() {
    return beforeGeocodeId;
  }

  /**
   * @param beforeGeocodeId beforeGeocodeId or {@code null} for none
   */
  public StreetSegment setBeforeGeocodeId(java.lang.String beforeGeocodeId) {
    this.beforeGeocodeId = beforeGeocodeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCatalistUniquePrecinctCode() {
    return catalistUniquePrecinctCode;
  }

  /**
   * @param catalistUniquePrecinctCode catalistUniquePrecinctCode or {@code null} for none
   */
  public StreetSegment setCatalistUniquePrecinctCode(java.lang.String catalistUniquePrecinctCode) {
    this.catalistUniquePrecinctCode = catalistUniquePrecinctCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public StreetSegment setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCityCouncilDistrict() {
    return cityCouncilDistrict;
  }

  /**
   * @param cityCouncilDistrict cityCouncilDistrict or {@code null} for none
   */
  public StreetSegment setCityCouncilDistrict(java.lang.String cityCouncilDistrict) {
    this.cityCouncilDistrict = cityCouncilDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCongressionalDistrict() {
    return congressionalDistrict;
  }

  /**
   * @param congressionalDistrict congressionalDistrict or {@code null} for none
   */
  public StreetSegment setCongressionalDistrict(java.lang.String congressionalDistrict) {
    this.congressionalDistrict = congressionalDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContestIds() {
    return contestIds;
  }

  /**
   * @param contestIds contestIds or {@code null} for none
   */
  public StreetSegment setContestIds(java.util.List<java.lang.String> contestIds) {
    this.contestIds = contestIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountyCouncilDistrict() {
    return countyCouncilDistrict;
  }

  /**
   * @param countyCouncilDistrict countyCouncilDistrict or {@code null} for none
   */
  public StreetSegment setCountyCouncilDistrict(java.lang.String countyCouncilDistrict) {
    this.countyCouncilDistrict = countyCouncilDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountyFips() {
    return countyFips;
  }

  /**
   * @param countyFips countyFips or {@code null} for none
   */
  public StreetSegment setCountyFips(java.lang.String countyFips) {
    this.countyFips = countyFips;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDatasetId() {
    return datasetId;
  }

  /**
   * @param datasetId datasetId or {@code null} for none
   */
  public StreetSegment setDatasetId(java.lang.Long datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEarlyVoteSiteByIds() {
    return earlyVoteSiteByIds;
  }

  /**
   * @param earlyVoteSiteByIds earlyVoteSiteByIds or {@code null} for none
   */
  public StreetSegment setEarlyVoteSiteByIds(java.util.List<java.lang.String> earlyVoteSiteByIds) {
    this.earlyVoteSiteByIds = earlyVoteSiteByIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndHouseNumber() {
    return endHouseNumber;
  }

  /**
   * @param endHouseNumber endHouseNumber or {@code null} for none
   */
  public StreetSegment setEndHouseNumber(java.lang.Long endHouseNumber) {
    this.endHouseNumber = endHouseNumber;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PointProto getGeocodedPoint() {
    return geocodedPoint;
  }

  /**
   * @param geocodedPoint geocodedPoint or {@code null} for none
   */
  public StreetSegment setGeocodedPoint(PointProto geocodedPoint) {
    this.geocodedPoint = geocodedPoint;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGeographicDivisionOcdIds() {
    return geographicDivisionOcdIds;
  }

  /**
   * @param geographicDivisionOcdIds geographicDivisionOcdIds or {@code null} for none
   */
  public StreetSegment setGeographicDivisionOcdIds(java.util.List<java.lang.String> geographicDivisionOcdIds) {
    this.geographicDivisionOcdIds = geographicDivisionOcdIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public StreetSegment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getJudicialDistrict() {
    return judicialDistrict;
  }

  /**
   * @param judicialDistrict judicialDistrict or {@code null} for none
   */
  public StreetSegment setJudicialDistrict(java.lang.String judicialDistrict) {
    this.judicialDistrict = judicialDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMailOnly() {
    return mailOnly;
  }

  /**
   * @param mailOnly mailOnly or {@code null} for none
   */
  public StreetSegment setMailOnly(java.lang.Boolean mailOnly) {
    this.mailOnly = mailOnly;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMunicipalDistrict() {
    return municipalDistrict;
  }

  /**
   * @param municipalDistrict municipalDistrict or {@code null} for none
   */
  public StreetSegment setMunicipalDistrict(java.lang.String municipalDistrict) {
    this.municipalDistrict = municipalDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNcoaAddress() {
    return ncoaAddress;
  }

  /**
   * @param ncoaAddress ncoaAddress or {@code null} for none
   */
  public StreetSegment setNcoaAddress(java.lang.String ncoaAddress) {
    this.ncoaAddress = ncoaAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOddOrEvens() {
    return oddOrEvens;
  }

  /**
   * @param oddOrEvens oddOrEvens or {@code null} for none
   */
  public StreetSegment setOddOrEvens(java.util.List<java.lang.String> oddOrEvens) {
    this.oddOrEvens = oddOrEvens;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalId() {
    return originalId;
  }

  /**
   * @param originalId originalId or {@code null} for none
   */
  public StreetSegment setOriginalId(java.lang.String originalId) {
    this.originalId = originalId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPollinglocationByIds() {
    return pollinglocationByIds;
  }

  /**
   * @param pollinglocationByIds pollinglocationByIds or {@code null} for none
   */
  public StreetSegment setPollinglocationByIds(java.util.List<java.lang.String> pollinglocationByIds) {
    this.pollinglocationByIds = pollinglocationByIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrecinctName() {
    return precinctName;
  }

  /**
   * @param precinctName precinctName or {@code null} for none
   */
  public StreetSegment setPrecinctName(java.lang.String precinctName) {
    this.precinctName = precinctName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrecinctOcdId() {
    return precinctOcdId;
  }

  /**
   * @param precinctOcdId precinctOcdId or {@code null} for none
   */
  public StreetSegment setPrecinctOcdId(java.lang.String precinctOcdId) {
    this.precinctOcdId = precinctOcdId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Provenance> getProvenances() {
    return provenances;
  }

  /**
   * @param provenances provenances or {@code null} for none
   */
  public StreetSegment setProvenances(java.util.List<Provenance> provenances) {
    this.provenances = provenances;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublished() {
    return published;
  }

  /**
   * @param published published or {@code null} for none
   */
  public StreetSegment setPublished(java.lang.Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSchoolDistrict() {
    return schoolDistrict;
  }

  /**
   * @param schoolDistrict schoolDistrict or {@code null} for none
   */
  public StreetSegment setSchoolDistrict(java.lang.String schoolDistrict) {
    this.schoolDistrict = schoolDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartHouseNumber() {
    return startHouseNumber;
  }

  /**
   * @param startHouseNumber startHouseNumber or {@code null} for none
   */
  public StreetSegment setStartHouseNumber(java.lang.Long startHouseNumber) {
    this.startHouseNumber = startHouseNumber;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartLatE7() {
    return startLatE7;
  }

  /**
   * @param startLatE7 startLatE7 or {@code null} for none
   */
  public StreetSegment setStartLatE7(java.lang.Long startLatE7) {
    this.startLatE7 = startLatE7;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartLngE7() {
    return startLngE7;
  }

  /**
   * @param startLngE7 startLngE7 or {@code null} for none
   */
  public StreetSegment setStartLngE7(java.lang.Long startLngE7) {
    this.startLngE7 = startLngE7;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * @param state state or {@code null} for none
   */
  public StreetSegment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStateHouseDistrict() {
    return stateHouseDistrict;
  }

  /**
   * @param stateHouseDistrict stateHouseDistrict or {@code null} for none
   */
  public StreetSegment setStateHouseDistrict(java.lang.String stateHouseDistrict) {
    this.stateHouseDistrict = stateHouseDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStateSenateDistrict() {
    return stateSenateDistrict;
  }

  /**
   * @param stateSenateDistrict stateSenateDistrict or {@code null} for none
   */
  public StreetSegment setStateSenateDistrict(java.lang.String stateSenateDistrict) {
    this.stateSenateDistrict = stateSenateDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetName() {
    return streetName;
  }

  /**
   * @param streetName streetName or {@code null} for none
   */
  public StreetSegment setStreetName(java.lang.String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSubAdministrativeAreaName() {
    return subAdministrativeAreaName;
  }

  /**
   * @param subAdministrativeAreaName subAdministrativeAreaName or {@code null} for none
   */
  public StreetSegment setSubAdministrativeAreaName(java.lang.String subAdministrativeAreaName) {
    this.subAdministrativeAreaName = subAdministrativeAreaName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getSurrogateId() {
    return surrogateId;
  }

  /**
   * @param surrogateId surrogateId or {@code null} for none
   */
  public StreetSegment setSurrogateId(java.lang.Long surrogateId) {
    this.surrogateId = surrogateId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetsmartUniquePrecinctCode() {
    return targetsmartUniquePrecinctCode;
  }

  /**
   * @param targetsmartUniquePrecinctCode targetsmartUniquePrecinctCode or {@code null} for none
   */
  public StreetSegment setTargetsmartUniquePrecinctCode(java.lang.String targetsmartUniquePrecinctCode) {
    this.targetsmartUniquePrecinctCode = targetsmartUniquePrecinctCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTownshipDistrict() {
    return townshipDistrict;
  }

  /**
   * @param townshipDistrict townshipDistrict or {@code null} for none
   */
  public StreetSegment setTownshipDistrict(java.lang.String townshipDistrict) {
    this.townshipDistrict = townshipDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitNumber() {
    return unitNumber;
  }

  /**
   * @param unitNumber unitNumber or {@code null} for none
   */
  public StreetSegment setUnitNumber(java.lang.String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitType() {
    return unitType;
  }

  /**
   * @param unitType unitType or {@code null} for none
   */
  public StreetSegment setUnitType(java.lang.String unitType) {
    this.unitType = unitType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVanPrecinctCode() {
    return vanPrecinctCode;
  }

  /**
   * @param vanPrecinctCode vanPrecinctCode or {@code null} for none
   */
  public StreetSegment setVanPrecinctCode(java.lang.String vanPrecinctCode) {
    this.vanPrecinctCode = vanPrecinctCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVoterGeographicDivisionOcdIds() {
    return voterGeographicDivisionOcdIds;
  }

  /**
   * @param voterGeographicDivisionOcdIds voterGeographicDivisionOcdIds or {@code null} for none
   */
  public StreetSegment setVoterGeographicDivisionOcdIds(java.util.List<java.lang.String> voterGeographicDivisionOcdIds) {
    this.voterGeographicDivisionOcdIds = voterGeographicDivisionOcdIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWardDistrict() {
    return wardDistrict;
  }

  /**
   * @param wardDistrict wardDistrict or {@code null} for none
   */
  public StreetSegment setWardDistrict(java.lang.String wardDistrict) {
    this.wardDistrict = wardDistrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWildcard() {
    return wildcard;
  }

  /**
   * @param wildcard wildcard or {@code null} for none
   */
  public StreetSegment setWildcard(java.lang.Boolean wildcard) {
    this.wildcard = wildcard;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getZip() {
    return zip;
  }

  /**
   * @param zip zip or {@code null} for none
   */
  public StreetSegment setZip(java.lang.String zip) {
    this.zip = zip;
    return this;
  }

  @Override
  public StreetSegment set(String fieldName, Object value) {
    return (StreetSegment) super.set(fieldName, value);
  }

  @Override
  public StreetSegment clone() {
    return (StreetSegment) super.clone();
  }

}
