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
import com.bitly.model.V4.BaseMetrics;
import com.bitly.model.V4.CityMetric;
import com.bitly.model.V4.CityMetricsAllOf;
import com.bitly.model.V4.OtherMetrics;
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
 * CityMetrics
 */
@JsonPropertyOrder({
  CityMetrics.JSON_PROPERTY_UNITS,
  CityMetrics.JSON_PROPERTY_FACET,
  CityMetrics.JSON_PROPERTY_UNIT_REFERENCE,
  CityMetrics.JSON_PROPERTY_UNIT,
  CityMetrics.JSON_PROPERTY_METRICS,
  CityMetrics.JSON_PROPERTY_OTHER_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class CityMetrics {
  public static final String JSON_PROPERTY_UNITS = "units";
  private Integer units;

  /**
   * Gets or Sets facet
   */
  public enum FacetEnum {
    COUNTRIES("countries"),
    
    CITIES("cities"),
    
    DEVICES("devices"),
    
    REFERRERS("referrers"),
    
    REFERRERS_BY_DOMAIN("referrers_by_domain"),
    
    REFERRING_DOMAINS("referring_domains"),
    
    REFERRING_NETWORKS("referring_networks"),
    
    SHORTEN_COUNTS("shorten_counts");

    private String value;

    FacetEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FacetEnum fromValue(String value) {
      for (FacetEnum b : FacetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FACET = "facet";
  private FacetEnum facet;

  public static final String JSON_PROPERTY_UNIT_REFERENCE = "unit_reference";
  private String unitReference;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<CityMetric> metrics = null;

  public static final String JSON_PROPERTY_OTHER_METRICS = "other_metrics";
  private OtherMetrics otherMetrics;


  public CityMetrics units(Integer units) {
    
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


  public CityMetrics facet(FacetEnum facet) {
    
    this.facet = facet;
    return this;
  }

   /**
   * Get facet
   * @return facet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacetEnum getFacet() {
    return facet;
  }


  public void setFacet(FacetEnum facet) {
    this.facet = facet;
  }


  public CityMetrics unitReference(String unitReference) {
    
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

  public String getUnitReference() {
    return unitReference;
  }


  public void setUnitReference(String unitReference) {
    this.unitReference = unitReference;
  }


  public CityMetrics unit(String unit) {
    
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


  public CityMetrics metrics(List<CityMetric> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public CityMetrics addMetricsItem(CityMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<CityMetric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CityMetric> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<CityMetric> metrics) {
    this.metrics = metrics;
  }


  public CityMetrics otherMetrics(OtherMetrics otherMetrics) {
    
    this.otherMetrics = otherMetrics;
    return this;
  }

   /**
   * Get otherMetrics
   * @return otherMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OTHER_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OtherMetrics getOtherMetrics() {
    return otherMetrics;
  }


  public void setOtherMetrics(OtherMetrics otherMetrics) {
    this.otherMetrics = otherMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityMetrics cityMetrics = (CityMetrics) o;
    return Objects.equals(this.units, cityMetrics.units) &&
        Objects.equals(this.facet, cityMetrics.facet) &&
        Objects.equals(this.unitReference, cityMetrics.unitReference) &&
        Objects.equals(this.unit, cityMetrics.unit) &&
        Objects.equals(this.metrics, cityMetrics.metrics) &&
        Objects.equals(this.otherMetrics, cityMetrics.otherMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, facet, unitReference, unit, metrics, otherMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityMetrics {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    unitReference: ").append(toIndentedString(unitReference)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    otherMetrics: ").append(toIndentedString(otherMetrics)).append("\n");
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
