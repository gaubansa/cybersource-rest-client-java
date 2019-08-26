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
import Model.PtsV2PaymentsPost201ResponsePaymentInformationBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePaymentInformationBank
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationBank {
  @SerializedName("account")
  private PtsV2PaymentsPost201ResponsePaymentInformationBankAccount account = null;

  @SerializedName("correctedRoutingNumber")
  private String correctedRoutingNumber = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationBank account(PtsV2PaymentsPost201ResponsePaymentInformationBankAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationBankAccount getAccount() {
    return account;
  }

  public void setAccount(PtsV2PaymentsPost201ResponsePaymentInformationBankAccount account) {
    this.account = account;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationBank correctedRoutingNumber(String correctedRoutingNumber) {
    this.correctedRoutingNumber = correctedRoutingNumber;
    return this;
  }

   /**
   * Corrected account number from the ACH verification service.  For details, see &#x60;ecp_debit_corrected_routing_number&#x60; or &#x60;ecp_credit_corrected_routing_number&#x60; reply field descriptions in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return correctedRoutingNumber
  **/
  @ApiModelProperty(value = "Corrected account number from the ACH verification service.  For details, see `ecp_debit_corrected_routing_number` or `ecp_credit_corrected_routing_number` reply field descriptions in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getCorrectedRoutingNumber() {
    return correctedRoutingNumber;
  }

  public void setCorrectedRoutingNumber(String correctedRoutingNumber) {
    this.correctedRoutingNumber = correctedRoutingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationBank ptsV2PaymentsPost201ResponsePaymentInformationBank = (PtsV2PaymentsPost201ResponsePaymentInformationBank) o;
    return Objects.equals(this.account, ptsV2PaymentsPost201ResponsePaymentInformationBank.account) &&
        Objects.equals(this.correctedRoutingNumber, ptsV2PaymentsPost201ResponsePaymentInformationBank.correctedRoutingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, correctedRoutingNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationBank {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    correctedRoutingNumber: ").append(toIndentedString(correctedRoutingNumber)).append("\n");
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

