/*
 * Bitly API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@bitly.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bitly.model.V4;

import java.util.Objects;
import java.util.Arrays;
import com.bitly.model.V4.FacetCountItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupClicksByFacetRollup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class GroupClicksByFacetRollup {
  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Integer units;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<FacetCountItem> data = null;

  public static final String SERIALIZED_NAME_UNIT_REFERENCE = "unit_reference";
  @SerializedName(SERIALIZED_NAME_UNIT_REFERENCE)
  private Integer unitReference;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public GroupClicksByFacetRollup units(Integer units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnits() {
    return units;
  }


  public void setUnits(Integer units) {
    this.units = units;
  }


  public GroupClicksByFacetRollup data(List<FacetCountItem> data) {
    
    this.data = data;
    return this;
  }

  public GroupClicksByFacetRollup addDataItem(FacetCountItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<FacetCountItem>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FacetCountItem> getData() {
    return data;
  }


  public void setData(List<FacetCountItem> data) {
    this.data = data;
  }


  public GroupClicksByFacetRollup unitReference(Integer unitReference) {
    
    this.unitReference = unitReference;
    return this;
  }

   /**
   * Get unitReference
   * @return unitReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnitReference() {
    return unitReference;
  }


  public void setUnitReference(Integer unitReference) {
    this.unitReference = unitReference;
  }


  public GroupClicksByFacetRollup unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupClicksByFacetRollup groupClicksByFacetRollup = (GroupClicksByFacetRollup) o;
    return Objects.equals(this.units, groupClicksByFacetRollup.units) &&
        Objects.equals(this.data, groupClicksByFacetRollup.data) &&
        Objects.equals(this.unitReference, groupClicksByFacetRollup.unitReference) &&
        Objects.equals(this.unit, groupClicksByFacetRollup.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, data, unitReference, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupClicksByFacetRollup {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    unitReference: ").append(toIndentedString(unitReference)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

