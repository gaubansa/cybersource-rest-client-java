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

/**
 * InvoicingV2InvoicesAllGet200ResponseCustomerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class InvoicingV2InvoicesAllGet200ResponseCustomerInformation {
  @SerializedName("name")
  private String name = null;

  @SerializedName("merchantCustomerId")
  private String merchantCustomerId = null;

  public InvoicingV2InvoicesAllGet200ResponseCustomerInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Payer name for the invoice.
   * @return name
  **/
  @ApiModelProperty(value = "Payer name for the invoice.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InvoicingV2InvoicesAllGet200ResponseCustomerInformation merchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

   /**
   * Your identifier for the customer.  When a subscription or customer profile is being created, the maximum length for this field for most processors is 30. Otherwise, the maximum length is 100.  #### Comercio Latino For recurring payments in Mexico, the value is the customer’s contract number. Note Before you request the authorization, you must inform the issuer of the customer contract numbers that will be used for recurring transactions.  #### Worldpay VAP For a follow-on credit with Worldpay VAP, CyberSource checks the following locations, in the order given, for a customer account ID value and uses the first value it finds: 1. &#x60;customer_account_id&#x60; value in the follow-on credit request 2. Customer account ID value that was used for the capture that is being credited 3. Customer account ID value that was used for the original authorization If a customer account ID value cannot be found in any of these locations, then no value is used.  For processor-specific information, see the &#x60;customer_account_id&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return merchantCustomerId
  **/
  @ApiModelProperty(value = "Your identifier for the customer.  When a subscription or customer profile is being created, the maximum length for this field for most processors is 30. Otherwise, the maximum length is 100.  #### Comercio Latino For recurring payments in Mexico, the value is the customer’s contract number. Note Before you request the authorization, you must inform the issuer of the customer contract numbers that will be used for recurring transactions.  #### Worldpay VAP For a follow-on credit with Worldpay VAP, CyberSource checks the following locations, in the order given, for a customer account ID value and uses the first value it finds: 1. `customer_account_id` value in the follow-on credit request 2. Customer account ID value that was used for the capture that is being credited 3. Customer account ID value that was used for the original authorization If a customer account ID value cannot be found in any of these locations, then no value is used.  For processor-specific information, see the `customer_account_id` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesAllGet200ResponseCustomerInformation invoicingV2InvoicesAllGet200ResponseCustomerInformation = (InvoicingV2InvoicesAllGet200ResponseCustomerInformation) o;
    return Objects.equals(this.name, invoicingV2InvoicesAllGet200ResponseCustomerInformation.name) &&
        Objects.equals(this.merchantCustomerId, invoicingV2InvoicesAllGet200ResponseCustomerInformation.merchantCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, merchantCustomerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200ResponseCustomerInformation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
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

