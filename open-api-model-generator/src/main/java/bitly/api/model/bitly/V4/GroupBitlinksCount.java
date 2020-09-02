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


package bitly.api.model.bitly.V4;

import java.util.Objects;
import java.util.Arrays;
import bitly.api.model.bitly.V4.CountItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * GroupBitlinksCount
 */
@JsonPropertyOrder({
  GroupBitlinksCount.JSON_PROPERTY_UNITS,
  GroupBitlinksCount.JSON_PROPERTY_DATA,
  GroupBitlinksCount.JSON_PROPERTY_UNIT_REFERENCE,
  GroupBitlinksCount.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class GroupBitlinksCount {
  public static final String JSON_PROPERTY_UNITS = "units";
  private Integer units;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<CountItem> data = null;

  public static final String JSON_PROPERTY_UNIT_REFERENCE = "unit_reference";
  private Integer unitReference;

  public static final String JSON_PROPERTY_UNIT = "unit";
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
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_UNIT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

