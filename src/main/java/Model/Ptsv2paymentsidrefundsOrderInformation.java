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
import Model.Ptsv2paymentsidcapturesOrderInformationAmountDetails;
import Model.Ptsv2paymentsidcapturesOrderInformationBillTo;
import Model.Ptsv2paymentsidcapturesOrderInformationInvoiceDetails;
import Model.Ptsv2paymentsidcapturesOrderInformationShipTo;
import Model.Ptsv2paymentsidcapturesOrderInformationShippingDetails;
import Model.Ptsv2paymentsidrefundsOrderInformationLineItems;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsidrefundsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Ptsv2paymentsidrefundsOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails = null;

  @SerializedName("billTo")
  private Ptsv2paymentsidcapturesOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private Ptsv2paymentsidcapturesOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Ptsv2paymentsidrefundsOrderInformationLineItems> lineItems = null;

  @SerializedName("invoiceDetails")
  private Ptsv2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails = null;

  @SerializedName("shippingDetails")
  private Ptsv2paymentsidcapturesOrderInformationShippingDetails shippingDetails = null;

  public Ptsv2paymentsidrefundsOrderInformation amountDetails(Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2paymentsidrefundsOrderInformation billTo(Ptsv2paymentsidcapturesOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Ptsv2paymentsidcapturesOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Ptsv2paymentsidrefundsOrderInformation shipTo(Ptsv2paymentsidcapturesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Ptsv2paymentsidcapturesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Ptsv2paymentsidrefundsOrderInformation lineItems(List<Ptsv2paymentsidrefundsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Ptsv2paymentsidrefundsOrderInformation addLineItemsItem(Ptsv2paymentsidrefundsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Ptsv2paymentsidrefundsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsidrefundsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Ptsv2paymentsidrefundsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Ptsv2paymentsidrefundsOrderInformation invoiceDetails(Ptsv2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(Ptsv2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public Ptsv2paymentsidrefundsOrderInformation shippingDetails(Ptsv2paymentsidcapturesOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(Ptsv2paymentsidcapturesOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsOrderInformation ptsv2paymentsidrefundsOrderInformation = (Ptsv2paymentsidrefundsOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsidrefundsOrderInformation.amountDetails) &&
        Objects.equals(this.billTo, ptsv2paymentsidrefundsOrderInformation.billTo) &&
        Objects.equals(this.shipTo, ptsv2paymentsidrefundsOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, ptsv2paymentsidrefundsOrderInformation.lineItems) &&
        Objects.equals(this.invoiceDetails, ptsv2paymentsidrefundsOrderInformation.invoiceDetails) &&
        Objects.equals(this.shippingDetails, ptsv2paymentsidrefundsOrderInformation.shippingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, billTo, shipTo, lineItems, invoiceDetails, shippingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
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

