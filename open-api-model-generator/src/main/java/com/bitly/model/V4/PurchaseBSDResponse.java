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
 * PurchaseBSDResponse
 */
@JsonPropertyOrder({
  PurchaseBSDResponse.JSON_PROPERTY_ORDER_ID,
  PurchaseBSDResponse.JSON_PROPERTY_DOMAIN,
  PurchaseBSDResponse.JSON_PROPERTY_TOTAL,
  PurchaseBSDResponse.JSON_PROPERTY_ORGANIZATION_GUID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class PurchaseBSDResponse {
  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private Integer orderId;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private String total;

  public static final String JSON_PROPERTY_ORGANIZATION_GUID = "organization_guid";
  private String organizationGuid;


  public PurchaseBSDResponse orderId(Integer orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrderId() {
    return orderId;
  }


  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public PurchaseBSDResponse domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public PurchaseBSDResponse total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  public PurchaseBSDResponse organizationGuid(String organizationGuid) {
    
    this.organizationGuid = organizationGuid;
    return this;
  }

   /**
   * Get organizationGuid
   * @return organizationGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationGuid() {
    return organizationGuid;
  }


  public void setOrganizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseBSDResponse purchaseBSDResponse = (PurchaseBSDResponse) o;
    return Objects.equals(this.orderId, purchaseBSDResponse.orderId) &&
        Objects.equals(this.domain, purchaseBSDResponse.domain) &&
        Objects.equals(this.total, purchaseBSDResponse.total) &&
        Objects.equals(this.organizationGuid, purchaseBSDResponse.organizationGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, domain, total, organizationGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseBSDResponse {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    organizationGuid: ").append(toIndentedString(organizationGuid)).append("\n");
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
