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
 * PtsV2CreditsPost201ResponseCreditAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class PtsV2CreditsPost201ResponseCreditAmountDetails {
  @SerializedName("creditAmount")
  private String creditAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public PtsV2CreditsPost201ResponseCreditAmountDetails creditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * Total amount of the credit.
   * @return creditAmount
  **/
  @ApiModelProperty(value = "Total amount of the credit.")
  public String getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }

  public PtsV2CreditsPost201ResponseCreditAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \&quot;Features for Debit Cards and Prepaid Cards\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \"Features for Debit Cards and Prepaid Cards\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201ResponseCreditAmountDetails ptsV2CreditsPost201ResponseCreditAmountDetails = (PtsV2CreditsPost201ResponseCreditAmountDetails) o;
    return Objects.equals(this.creditAmount, ptsV2CreditsPost201ResponseCreditAmountDetails.creditAmount) &&
        Objects.equals(this.currency, ptsV2CreditsPost201ResponseCreditAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201ResponseCreditAmountDetails {\n");
    
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

