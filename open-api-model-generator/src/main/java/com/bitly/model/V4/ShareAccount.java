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
 * ShareAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class ShareAccount {
  public static final String SERIALIZED_NAME_NUMERIC_ID = "numeric_id";
  @SerializedName(SERIALIZED_NAME_NUMERIC_ID)
  private Integer numericId;

  public static final String SERIALIZED_NAME_ACCOUNT_LOGIN = "account_login";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LOGIN)
  private String accountLogin;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    TWITTER("twitter"),
    
    FACEBOOK("facebook");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_OAUTH_ERROR = "oauth_error";
  @SerializedName(SERIALIZED_NAME_OAUTH_ERROR)
  private String oauthError;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_CONNECTED = "connected";
  @SerializedName(SERIALIZED_NAME_CONNECTED)
  private String connected;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;


  public ShareAccount numericId(Integer numericId) {
    
    this.numericId = numericId;
    return this;
  }

   /**
   * Get numericId
   * @return numericId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumericId() {
    return numericId;
  }


  public void setNumericId(Integer numericId) {
    this.numericId = numericId;
  }


  public ShareAccount accountLogin(String accountLogin) {
    
    this.accountLogin = accountLogin;
    return this;
  }

   /**
   * Get accountLogin
   * @return accountLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountLogin() {
    return accountLogin;
  }


  public void setAccountLogin(String accountLogin) {
    this.accountLogin = accountLogin;
  }


  public ShareAccount accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public ShareAccount accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ShareAccount oauthError(String oauthError) {
    
    this.oauthError = oauthError;
    return this;
  }

   /**
   * Get oauthError
   * @return oauthError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOauthError() {
    return oauthError;
  }


  public void setOauthError(String oauthError) {
    this.oauthError = oauthError;
  }


  public ShareAccount primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public ShareAccount visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public ShareAccount connected(String connected) {
    
    this.connected = connected;
    return this;
  }

   /**
   * ISO timestamp
   * @return connected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO timestamp")

  public String getConnected() {
    return connected;
  }


  public void setConnected(String connected) {
    this.connected = connected;
  }


  public ShareAccount accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareAccount shareAccount = (ShareAccount) o;
    return Objects.equals(this.numericId, shareAccount.numericId) &&
        Objects.equals(this.accountLogin, shareAccount.accountLogin) &&
        Objects.equals(this.accountType, shareAccount.accountType) &&
        Objects.equals(this.accountId, shareAccount.accountId) &&
        Objects.equals(this.oauthError, shareAccount.oauthError) &&
        Objects.equals(this.primary, shareAccount.primary) &&
        Objects.equals(this.visible, shareAccount.visible) &&
        Objects.equals(this.connected, shareAccount.connected) &&
        Objects.equals(this.accountName, shareAccount.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numericId, accountLogin, accountType, accountId, oauthError, primary, visible, connected, accountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareAccount {\n");
    sb.append("    numericId: ").append(toIndentedString(numericId)).append("\n");
    sb.append("    accountLogin: ").append(toIndentedString(accountLogin)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    oauthError: ").append(toIndentedString(oauthError)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

