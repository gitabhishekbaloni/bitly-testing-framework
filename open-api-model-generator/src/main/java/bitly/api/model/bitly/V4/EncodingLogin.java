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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EncodingLogin
 */
@JsonPropertyOrder({
  EncodingLogin.JSON_PROPERTY_ENCODING_LOGIN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class EncodingLogin {
  public static final String JSON_PROPERTY_ENCODING_LOGIN = "encoding_login";
  private List<String> encodingLogin = null;


  public EncodingLogin encodingLogin(List<String> encodingLogin) {
    
    this.encodingLogin = encodingLogin;
    return this;
  }

  public EncodingLogin addEncodingLoginItem(String encodingLoginItem) {
    if (this.encodingLogin == null) {
      this.encodingLogin = new ArrayList<String>();
    }
    this.encodingLogin.add(encodingLoginItem);
    return this;
  }

   /**
   * Get encodingLogin
   * @return encodingLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCODING_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEncodingLogin() {
    return encodingLogin;
  }


  public void setEncodingLogin(List<String> encodingLogin) {
    this.encodingLogin = encodingLogin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingLogin encodingLogin = (EncodingLogin) o;
    return Objects.equals(this.encodingLogin, encodingLogin.encodingLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingLogin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingLogin {\n");
    sb.append("    encodingLogin: ").append(toIndentedString(encodingLogin)).append("\n");
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

