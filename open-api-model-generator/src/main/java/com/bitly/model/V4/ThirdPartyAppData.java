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
 * ThirdPartyAppData
 */
@JsonPropertyOrder({
  ThirdPartyAppData.JSON_PROPERTY_THIRD_PARTY_APP_ID,
  ThirdPartyAppData.JSON_PROPERTY_INSTALL_URL,
  ThirdPartyAppData.JSON_PROPERTY_OS,
  ThirdPartyAppData.JSON_PROPERTY_NAME,
  ThirdPartyAppData.JSON_PROPERTY_ICON_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class ThirdPartyAppData {
  public static final String JSON_PROPERTY_THIRD_PARTY_APP_ID = "third_party_app_id";
  private String thirdPartyAppId;

  public static final String JSON_PROPERTY_INSTALL_URL = "install_url";
  private String installUrl;

  /**
   * Gets or Sets os
   */
  public enum OsEnum {
    IOS("ios"),
    
    ANDROID("android");

    private String value;

    OsEnum(String value) {
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
    public static OsEnum fromValue(String value) {
      for (OsEnum b : OsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OS = "os";
  private OsEnum os;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;


  public ThirdPartyAppData thirdPartyAppId(String thirdPartyAppId) {
    
    this.thirdPartyAppId = thirdPartyAppId;
    return this;
  }

   /**
   * Get thirdPartyAppId
   * @return thirdPartyAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartyAppId() {
    return thirdPartyAppId;
  }


  public void setThirdPartyAppId(String thirdPartyAppId) {
    this.thirdPartyAppId = thirdPartyAppId;
  }


  public ThirdPartyAppData installUrl(String installUrl) {
    
    this.installUrl = installUrl;
    return this;
  }

   /**
   * Get installUrl
   * @return installUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTALL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstallUrl() {
    return installUrl;
  }


  public void setInstallUrl(String installUrl) {
    this.installUrl = installUrl;
  }


  public ThirdPartyAppData os(OsEnum os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OsEnum getOs() {
    return os;
  }


  public void setOs(OsEnum os) {
    this.os = os;
  }


  public ThirdPartyAppData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ThirdPartyAppData iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyAppData thirdPartyAppData = (ThirdPartyAppData) o;
    return Objects.equals(this.thirdPartyAppId, thirdPartyAppData.thirdPartyAppId) &&
        Objects.equals(this.installUrl, thirdPartyAppData.installUrl) &&
        Objects.equals(this.os, thirdPartyAppData.os) &&
        Objects.equals(this.name, thirdPartyAppData.name) &&
        Objects.equals(this.iconUrl, thirdPartyAppData.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyAppId, installUrl, os, name, iconUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyAppData {\n");
    sb.append("    thirdPartyAppId: ").append(toIndentedString(thirdPartyAppId)).append("\n");
    sb.append("    installUrl: ").append(toIndentedString(installUrl)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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
