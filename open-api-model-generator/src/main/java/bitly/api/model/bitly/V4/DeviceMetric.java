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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeviceMetric
 */
@JsonPropertyOrder({
  DeviceMetric.JSON_PROPERTY_CLICKS,
  DeviceMetric.JSON_PROPERTY_DEVICE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class DeviceMetric {
  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private String deviceType;


  public DeviceMetric clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public DeviceMetric deviceType(String deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMetric deviceMetric = (DeviceMetric) o;
    return Objects.equals(this.clicks, deviceMetric.clicks) &&
        Objects.equals(this.deviceType, deviceMetric.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks, deviceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMetric {\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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

