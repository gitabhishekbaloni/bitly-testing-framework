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
import com.bitly.model.V4.DeeplinkMetric;
import com.bitly.model.V4.TimeUnit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeeplinkMetricsRollup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class DeeplinkMetricsRollup {
  public static final String SERIALIZED_NAME_UNIT_REFERENCE = "unit_reference";
  @SerializedName(SERIALIZED_NAME_UNIT_REFERENCE)
  private String unitReference;

  public static final String SERIALIZED_NAME_IOS = "ios";
  @SerializedName(SERIALIZED_NAME_IOS)
  private DeeplinkMetric ios;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private DeeplinkMetric other;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Integer units = -1;

  public static final String SERIALIZED_NAME_ANDROID = "android";
  @SerializedName(SERIALIZED_NAME_ANDROID)
  private DeeplinkMetric android;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private TimeUnit unit = TimeUnit.DAY;


  public DeeplinkMetricsRollup unitReference(String unitReference) {
    
    this.unitReference = unitReference;
    return this;
  }

   /**
   * data returned up to this reference timestamp
   * @return unitReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "data returned up to this reference timestamp")

  public String getUnitReference() {
    return unitReference;
  }


  public void setUnitReference(String unitReference) {
    this.unitReference = unitReference;
  }


  public DeeplinkMetricsRollup ios(DeeplinkMetric ios) {
    
    this.ios = ios;
    return this;
  }

   /**
   * Get ios
   * @return ios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeeplinkMetric getIos() {
    return ios;
  }


  public void setIos(DeeplinkMetric ios) {
    this.ios = ios;
  }


  public DeeplinkMetricsRollup other(DeeplinkMetric other) {
    
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeeplinkMetric getOther() {
    return other;
  }


  public void setOther(DeeplinkMetric other) {
    this.other = other;
  }


  public DeeplinkMetricsRollup units(Integer units) {
    
    this.units = units;
    return this;
  }

   /**
   * the number of units queried for
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the number of units queried for")

  public Integer getUnits() {
    return units;
  }


  public void setUnits(Integer units) {
    this.units = units;
  }


  public DeeplinkMetricsRollup android(DeeplinkMetric android) {
    
    this.android = android;
    return this;
  }

   /**
   * Get android
   * @return android
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeeplinkMetric getAndroid() {
    return android;
  }


  public void setAndroid(DeeplinkMetric android) {
    this.android = android;
  }


  public DeeplinkMetricsRollup unit(TimeUnit unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeUnit getUnit() {
    return unit;
  }


  public void setUnit(TimeUnit unit) {
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
    DeeplinkMetricsRollup deeplinkMetricsRollup = (DeeplinkMetricsRollup) o;
    return Objects.equals(this.unitReference, deeplinkMetricsRollup.unitReference) &&
        Objects.equals(this.ios, deeplinkMetricsRollup.ios) &&
        Objects.equals(this.other, deeplinkMetricsRollup.other) &&
        Objects.equals(this.units, deeplinkMetricsRollup.units) &&
        Objects.equals(this.android, deeplinkMetricsRollup.android) &&
        Objects.equals(this.unit, deeplinkMetricsRollup.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitReference, ios, other, units, android, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeeplinkMetricsRollup {\n");
    sb.append("    unitReference: ").append(toIndentedString(unitReference)).append("\n");
    sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
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

