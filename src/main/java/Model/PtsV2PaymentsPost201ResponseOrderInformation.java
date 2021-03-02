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
import Model.PtsV2PaymentsPost201ResponseOrderInformationAmountDetails;
import Model.PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class PtsV2PaymentsPost201ResponseOrderInformation {
  @SerializedName("amountDetails")
  private PtsV2PaymentsPost201ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("invoiceDetails")
  private PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails invoiceDetails = null;

  public PtsV2PaymentsPost201ResponseOrderInformation amountDetails(PtsV2PaymentsPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(PtsV2PaymentsPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public PtsV2PaymentsPost201ResponseOrderInformation invoiceDetails(PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseOrderInformation ptsV2PaymentsPost201ResponseOrderInformation = (PtsV2PaymentsPost201ResponseOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsV2PaymentsPost201ResponseOrderInformation.amountDetails) &&
        Objects.equals(this.invoiceDetails, ptsV2PaymentsPost201ResponseOrderInformation.invoiceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, invoiceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
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

