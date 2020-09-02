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
import bitly.api.model.bitly.V4.Feedback;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeactivateUser
 */
@JsonPropertyOrder({
  DeactivateUser.JSON_PROPERTY_FEEDBACK,
  DeactivateUser.JSON_PROPERTY_CONFIRM_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class DeactivateUser {
  public static final String JSON_PROPERTY_FEEDBACK = "feedback";
  private Feedback feedback = null;

  public static final String JSON_PROPERTY_CONFIRM_TEXT = "confirm_text";
  private String confirmText;


  public DeactivateUser feedback(Feedback feedback) {
    
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Feedback getFeedback() {
    return feedback;
  }


  public void setFeedback(Feedback feedback) {
    this.feedback = feedback;
  }


  public DeactivateUser confirmText(String confirmText) {
    
    this.confirmText = confirmText;
    return this;
  }

   /**
   * Get confirmText
   * @return confirmText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIRM_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmText() {
    return confirmText;
  }


  public void setConfirmText(String confirmText) {
    this.confirmText = confirmText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeactivateUser deactivateUser = (DeactivateUser) o;
    return Objects.equals(this.feedback, deactivateUser.feedback) &&
        Objects.equals(this.confirmText, deactivateUser.confirmText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback, confirmText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeactivateUser {\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    confirmText: ").append(toIndentedString(confirmText)).append("\n");
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

