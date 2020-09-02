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
import bitly.api.model.bitly.V4.BaseMetrics;
import bitly.api.model.bitly.V4.DeviceMetric;
import bitly.api.model.bitly.V4.DeviceMetricsAllOf;
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
 * DeviceMetrics
 */
@JsonPropertyOrder({
  DeviceMetrics.JSON_PROPERTY_UNITS,
  DeviceMetrics.JSON_PROPERTY_FACET,
  DeviceMetrics.JSON_PROPERTY_UNIT_REFERENCE,
  DeviceMetrics.JSON_PROPERTY_UNIT,
  DeviceMetrics.JSON_PROPERTY_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class DeviceMetrics {
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
  private List<DeviceMetric> metrics = null;


  public DeviceMetrics units(Integer units) {
    
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


  public DeviceMetrics facet(FacetEnum facet) {
    
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


  public DeviceMetrics unitReference(String unitReference) {
    
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


  public DeviceMetrics unit(String unit) {
    
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


  public DeviceMetrics metrics(List<DeviceMetric> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public DeviceMetrics addMetricsItem(DeviceMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<DeviceMetric>();
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

  public List<DeviceMetric> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<DeviceMetric> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMetrics deviceMetrics = (DeviceMetrics) o;
    return Objects.equals(this.units, deviceMetrics.units) &&
        Objects.equals(this.facet, deviceMetrics.facet) &&
        Objects.equals(this.unitReference, deviceMetrics.unitReference) &&
        Objects.equals(this.unit, deviceMetrics.unit) &&
        Objects.equals(this.metrics, deviceMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, facet, unitReference, unit, metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMetrics {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    unitReference: ").append(toIndentedString(unitReference)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

