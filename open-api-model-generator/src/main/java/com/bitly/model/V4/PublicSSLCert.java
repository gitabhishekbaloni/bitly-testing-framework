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

/**
 * SSL Certification
 */
@ApiModel(description = "SSL Certification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class PublicSSLCert {
  public static final String SERIALIZED_NAME_CUSTOM_CERT = "custom_cert";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CERT)
  private Boolean customCert;

  public static final String SERIALIZED_NAME_VALID_END = "valid_end";
  @SerializedName(SERIALIZED_NAME_VALID_END)
  private Integer validEnd;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;


  public PublicSSLCert customCert(Boolean customCert) {
    
    this.customCert = customCert;
    return this;
  }

   /**
   * Get customCert
   * @return customCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCustomCert() {
    return customCert;
  }


  public void setCustomCert(Boolean customCert) {
    this.customCert = customCert;
  }


  public PublicSSLCert validEnd(Integer validEnd) {
    
    this.validEnd = validEnd;
    return this;
  }

   /**
   * Get validEnd
   * @return validEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValidEnd() {
    return validEnd;
  }


  public void setValidEnd(Integer validEnd) {
    this.validEnd = validEnd;
  }


  public PublicSSLCert issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicSSLCert publicSSLCert = (PublicSSLCert) o;
    return Objects.equals(this.customCert, publicSSLCert.customCert) &&
        Objects.equals(this.validEnd, publicSSLCert.validEnd) &&
        Objects.equals(this.issuer, publicSSLCert.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customCert, validEnd, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSSLCert {\n");
    sb.append("    customCert: ").append(toIndentedString(customCert)).append("\n");
    sb.append("    validEnd: ").append(toIndentedString(validEnd)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

