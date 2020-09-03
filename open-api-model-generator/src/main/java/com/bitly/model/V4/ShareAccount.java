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
 * ShareAccount
 */
@JsonPropertyOrder({
  ShareAccount.JSON_PROPERTY_NUMERIC_ID,
  ShareAccount.JSON_PROPERTY_ACCOUNT_LOGIN,
  ShareAccount.JSON_PROPERTY_ACCOUNT_TYPE,
  ShareAccount.JSON_PROPERTY_ACCOUNT_ID,
  ShareAccount.JSON_PROPERTY_OAUTH_ERROR,
  ShareAccount.JSON_PROPERTY_PRIMARY,
  ShareAccount.JSON_PROPERTY_VISIBLE,
  ShareAccount.JSON_PROPERTY_CONNECTED,
  ShareAccount.JSON_PROPERTY_ACCOUNT_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class ShareAccount {
  public static final String JSON_PROPERTY_NUMERIC_ID = "numeric_id";
  private Integer numericId;

  public static final String JSON_PROPERTY_ACCOUNT_LOGIN = "account_login";
  private String accountLogin;

  /**
   * Gets or Sets accountType
   */
  public enum AccountTypeEnum {
    TWITTER("twitter"),
    
    FACEBOOK("facebook");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "account_type";
  private AccountTypeEnum accountType;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_OAUTH_ERROR = "oauth_error";
  private String oauthError;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  private Boolean visible;

  public static final String JSON_PROPERTY_CONNECTED = "connected";
  private String connected;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
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
  @JsonProperty(JSON_PROPERTY_NUMERIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ACCOUNT_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_OAUTH_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
