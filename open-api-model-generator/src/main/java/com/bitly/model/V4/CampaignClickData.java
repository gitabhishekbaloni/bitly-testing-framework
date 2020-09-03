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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CampaignClickData
 */
@JsonPropertyOrder({
  CampaignClickData.JSON_PROPERTY_TS,
  CampaignClickData.JSON_PROPERTY_CLICKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class CampaignClickData {
  public static final String JSON_PROPERTY_TS = "ts";
  private Integer ts;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;


  public CampaignClickData ts(Integer ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTs() {
    return ts;
  }


  public void setTs(Integer ts) {
    this.ts = ts;
  }


  public CampaignClickData clicks(Integer clicks) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignClickData campaignClickData = (CampaignClickData) o;
    return Objects.equals(this.ts, campaignClickData.ts) &&
        Objects.equals(this.clicks, campaignClickData.clicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, clicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignClickData {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
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
