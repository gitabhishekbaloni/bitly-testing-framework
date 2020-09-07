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
 * ThirdPartyAppData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class ThirdPartyAppData {
  public static final String SERIALIZED_NAME_THIRD_PARTY_APP_ID = "third_party_app_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_APP_ID)
  private String thirdPartyAppId;

  public static final String SERIALIZED_NAME_INSTALL_URL = "install_url";
  @SerializedName(SERIALIZED_NAME_INSTALL_URL)
  private String installUrl;

  /**
   * Gets or Sets os
   */
  @JsonAdapter(OsEnum.Adapter.class)
  public enum OsEnum {
    IOS("ios"),
    
    ANDROID("android");

    private String value;

    OsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OsEnum fromValue(String value) {
      for (OsEnum b : OsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private OsEnum os;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
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

