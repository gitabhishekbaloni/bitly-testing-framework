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
import bitly.api.model.bitly.V4.BitlinkBody;
import bitly.api.model.bitly.V4.ClickLink;
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
 * SortedLinks
 */
@JsonPropertyOrder({
  SortedLinks.JSON_PROPERTY_SORTED_LINKS,
  SortedLinks.JSON_PROPERTY_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class SortedLinks {
  public static final String JSON_PROPERTY_SORTED_LINKS = "sorted_links";
  private List<ClickLink> sortedLinks = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<BitlinkBody> links = null;


  public SortedLinks sortedLinks(List<ClickLink> sortedLinks) {
    
    this.sortedLinks = sortedLinks;
    return this;
  }

  public SortedLinks addSortedLinksItem(ClickLink sortedLinksItem) {
    if (this.sortedLinks == null) {
      this.sortedLinks = new ArrayList<ClickLink>();
    }
    this.sortedLinks.add(sortedLinksItem);
    return this;
  }

   /**
   * Get sortedLinks
   * @return sortedLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORTED_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClickLink> getSortedLinks() {
    return sortedLinks;
  }


  public void setSortedLinks(List<ClickLink> sortedLinks) {
    this.sortedLinks = sortedLinks;
  }


  public SortedLinks links(List<BitlinkBody> links) {
    
    this.links = links;
    return this;
  }

  public SortedLinks addLinksItem(BitlinkBody linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<BitlinkBody>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BitlinkBody> getLinks() {
    return links;
  }


  public void setLinks(List<BitlinkBody> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortedLinks sortedLinks = (SortedLinks) o;
    return Objects.equals(this.sortedLinks, sortedLinks.sortedLinks) &&
        Objects.equals(this.links, sortedLinks.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedLinks, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortedLinks {\n");
    sb.append("    sortedLinks: ").append(toIndentedString(sortedLinks)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

