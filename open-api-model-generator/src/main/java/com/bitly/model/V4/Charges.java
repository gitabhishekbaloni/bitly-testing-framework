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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Charges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class Charges {
  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "charge_amount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  private BigDecimal chargeAmount;

  public static final String SERIALIZED_NAME_PROCESSING_TYPE = "processing_type";
  @SerializedName(SERIALIZED_NAME_PROCESSING_TYPE)
  private String processingType;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private BigDecimal taxAmount;

  public static final String SERIALIZED_NAME_CHARGE_NAME = "charge_name";
  @SerializedName(SERIALIZED_NAME_CHARGE_NAME)
  private String chargeName;


  public Charges chargeAmount(BigDecimal chargeAmount) {
    
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getChargeAmount() {
    return chargeAmount;
  }


  public void setChargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  public Charges processingType(String processingType) {
    
    this.processingType = processingType;
    return this;
  }

   /**
   * Get processingType
   * @return processingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcessingType() {
    return processingType;
  }


  public void setProcessingType(String processingType) {
    this.processingType = processingType;
  }


  public Charges taxAmount(BigDecimal taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }


  public Charges chargeName(String chargeName) {
    
    this.chargeName = chargeName;
    return this;
  }

   /**
   * Get chargeName
   * @return chargeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChargeName() {
    return chargeName;
  }


  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charges charges = (Charges) o;
    return Objects.equals(this.chargeAmount, charges.chargeAmount) &&
        Objects.equals(this.processingType, charges.processingType) &&
        Objects.equals(this.taxAmount, charges.taxAmount) &&
        Objects.equals(this.chargeName, charges.chargeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeAmount, processingType, taxAmount, chargeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charges {\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
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

