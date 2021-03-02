/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * Contains the updatable invoice information.
 */
@ApiModel(description = "Contains the updatable invoice information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class Invoicingv2invoicesidInvoiceInformation {
  @SerializedName("description")
  private String description = null;

  @SerializedName("dueDate")
  private LocalDate dueDate = null;

  @SerializedName("allowPartialPayments")
  private Boolean allowPartialPayments = null;

  @SerializedName("deliveryMode")
  private String deliveryMode = null;

  public Invoicingv2invoicesidInvoiceInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description included in the invoice.
   * @return description
  **/
  @ApiModelProperty(value = "The description included in the invoice.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Invoicingv2invoicesidInvoiceInformation dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The invoice due date. This field is required for creating an invoice. Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day 
   * @return dueDate
  **/
  @ApiModelProperty(value = "The invoice due date. This field is required for creating an invoice. Format: `YYYY-MM-DD`, where `YYYY` = year, `MM` = month, and `DD` = day ")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Invoicingv2invoicesidInvoiceInformation allowPartialPayments(Boolean allowPartialPayments) {
    this.allowPartialPayments = allowPartialPayments;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, the payer can make a partial invoice payment.
   * @return allowPartialPayments
  **/
  @ApiModelProperty(value = "If set to `true`, the payer can make a partial invoice payment.")
  public Boolean getAllowPartialPayments() {
    return allowPartialPayments;
  }

  public void setAllowPartialPayments(Boolean allowPartialPayments) {
    this.allowPartialPayments = allowPartialPayments;
  }

  public Invoicingv2invoicesidInvoiceInformation deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * If set to &#x60;None&#x60;, the invoice is created, and its status is set to &#39;CREATED&#39;, but no email is sent.    Possible values:        - &#x60;None&#x60;   - &#x60;Email&#x60;  
   * @return deliveryMode
  **/
  @ApiModelProperty(value = "If set to `None`, the invoice is created, and its status is set to 'CREATED', but no email is sent.    Possible values:        - `None`   - `Email`  ")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoicingv2invoicesidInvoiceInformation invoicingv2invoicesidInvoiceInformation = (Invoicingv2invoicesidInvoiceInformation) o;
    return Objects.equals(this.description, invoicingv2invoicesidInvoiceInformation.description) &&
        Objects.equals(this.dueDate, invoicingv2invoicesidInvoiceInformation.dueDate) &&
        Objects.equals(this.allowPartialPayments, invoicingv2invoicesidInvoiceInformation.allowPartialPayments) &&
        Objects.equals(this.deliveryMode, invoicingv2invoicesidInvoiceInformation.deliveryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueDate, allowPartialPayments, deliveryMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoicingv2invoicesidInvoiceInformation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    allowPartialPayments: ").append(toIndentedString(allowPartialPayments)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
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

