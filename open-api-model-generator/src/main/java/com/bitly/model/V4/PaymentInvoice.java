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
import com.bitly.model.V4.Charges;
import com.bitly.model.V4.Payments;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentInvoice
 */
@JsonPropertyOrder({
  PaymentInvoice.JSON_PROPERTY_TOTAL_TAX,
  PaymentInvoice.JSON_PROPERTY_DESCRIPTION,
  PaymentInvoice.JSON_PROPERTY_CHARGES,
  PaymentInvoice.JSON_PROPERTY_INVOICE_ID,
  PaymentInvoice.JSON_PROPERTY_INVOICE_DATE,
  PaymentInvoice.JSON_PROPERTY_PAYMENTS,
  PaymentInvoice.JSON_PROPERTY_INVOICE_NUMBER,
  PaymentInvoice.JSON_PROPERTY_TOTAL,
  PaymentInvoice.JSON_PROPERTY_SUBTOTAL,
  PaymentInvoice.JSON_PROPERTY_INVOICE_DUE_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class PaymentInvoice {
  public static final String JSON_PROPERTY_TOTAL_TAX = "total_tax";
  private BigDecimal totalTax;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private Charges charges;

  public static final String JSON_PROPERTY_INVOICE_ID = "invoice_id";
  private String invoiceId;

  public static final String JSON_PROPERTY_INVOICE_DATE = "invoice_date";
  private String invoiceDate;

  public static final String JSON_PROPERTY_PAYMENTS = "payments";
  private Payments payments;

  public static final String JSON_PROPERTY_INVOICE_NUMBER = "invoice_number";
  private String invoiceNumber;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_SUBTOTAL = "subtotal";
  private BigDecimal subtotal;

  public static final String JSON_PROPERTY_INVOICE_DUE_DATE = "invoice_due_date";
  private String invoiceDueDate;


  public PaymentInvoice totalTax(BigDecimal totalTax) {
    
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalTax() {
    return totalTax;
  }


  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }


  public PaymentInvoice description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentInvoice charges(Charges charges) {
    
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Charges getCharges() {
    return charges;
  }


  public void setCharges(Charges charges) {
    this.charges = charges;
  }


  public PaymentInvoice invoiceId(String invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }


  public PaymentInvoice invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public PaymentInvoice payments(Payments payments) {
    
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Payments getPayments() {
    return payments;
  }


  public void setPayments(Payments payments) {
    this.payments = payments;
  }


  public PaymentInvoice invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public PaymentInvoice total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public PaymentInvoice subtotal(BigDecimal subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Get subtotal
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
  }


  public PaymentInvoice invoiceDueDate(String invoiceDueDate) {
    
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

   /**
   * Get invoiceDueDate
   * @return invoiceDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDueDate() {
    return invoiceDueDate;
  }


  public void setInvoiceDueDate(String invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInvoice paymentInvoice = (PaymentInvoice) o;
    return Objects.equals(this.totalTax, paymentInvoice.totalTax) &&
        Objects.equals(this.description, paymentInvoice.description) &&
        Objects.equals(this.charges, paymentInvoice.charges) &&
        Objects.equals(this.invoiceId, paymentInvoice.invoiceId) &&
        Objects.equals(this.invoiceDate, paymentInvoice.invoiceDate) &&
        Objects.equals(this.payments, paymentInvoice.payments) &&
        Objects.equals(this.invoiceNumber, paymentInvoice.invoiceNumber) &&
        Objects.equals(this.total, paymentInvoice.total) &&
        Objects.equals(this.subtotal, paymentInvoice.subtotal) &&
        Objects.equals(this.invoiceDueDate, paymentInvoice.invoiceDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTax, description, charges, invoiceId, invoiceDate, payments, invoiceNumber, total, subtotal, invoiceDueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInvoice {\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    invoiceDueDate: ").append(toIndentedString(invoiceDueDate)).append("\n");
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
