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
import com.bitly.model.V4.CountItem;
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
 * GroupBitlinksCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class GroupBitlinksCount {
  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Integer units;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<CountItem> data = null;

  public static final String SERIALIZED_NAME_UNIT_REFERENCE = "unit_reference";
  @SerializedName(SERIALIZED_NAME_UNIT_REFERENCE)
  private Integer unitReference;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public GroupBitlinksCount units(Integer units) {
    
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


  public GroupBitlinksCount data(List<CountItem> data) {
    
    this.data = data;
    return this;
  }

  public GroupBitlinksCount addDataItem(CountItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CountItem>();
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

  public List<CountItem> getData() {
    return data;
  }


  public void setData(List<CountItem> data) {
    this.data = data;
  }


  public GroupBitlinksCount unitReference(Integer unitReference) {
    
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


  public GroupBitlinksCount unit(String unit) {
    
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
    GroupBitlinksCount groupBitlinksCount = (GroupBitlinksCount) o;
    return Objects.equals(this.units, groupBitlinksCount.units) &&
        Objects.equals(this.data, groupBitlinksCount.data) &&
        Objects.equals(this.unitReference, groupBitlinksCount.unitReference) &&
        Objects.equals(this.unit, groupBitlinksCount.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, data, unitReference, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBitlinksCount {\n");
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

