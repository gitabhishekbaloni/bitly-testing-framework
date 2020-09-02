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
 * UpdateCustomBitlink
 */
@JsonPropertyOrder({
  UpdateCustomBitlink.JSON_PROPERTY_BITLINK_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class UpdateCustomBitlink {
  public static final String JSON_PROPERTY_BITLINK_ID = "bitlink_id";
  private String bitlinkId;


  public UpdateCustomBitlink bitlinkId(String bitlinkId) {
    
    this.bitlinkId = bitlinkId;
    return this;
  }

   /**
   * Get bitlinkId
   * @return bitlinkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BITLINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBitlinkId() {
    return bitlinkId;
  }


  public void setBitlinkId(String bitlinkId) {
    this.bitlinkId = bitlinkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomBitlink updateCustomBitlink = (UpdateCustomBitlink) o;
    return Objects.equals(this.bitlinkId, updateCustomBitlink.bitlinkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitlinkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomBitlink {\n");
    sb.append("    bitlinkId: ").append(toIndentedString(bitlinkId)).append("\n");
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

