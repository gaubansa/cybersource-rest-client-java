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
 * PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails {
  @SerializedName("reversedAmount")
  private String reversedAmount = null;

  @SerializedName("originalTransactionAmount")
  private String originalTransactionAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails reversedAmount(String reversedAmount) {
    this.reversedAmount = reversedAmount;
    return this;
  }

   /**
   * Total reversed amount.  For details, see &#x60;auth_reversal_amount&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return reversedAmount
  **/
  @ApiModelProperty(value = "Total reversed amount.  For details, see `auth_reversal_amount` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getReversedAmount() {
    return reversedAmount;
  }

  public void setReversedAmount(String reversedAmount) {
    this.reversedAmount = reversedAmount;
  }

  public PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails originalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
    return this;
  }

   /**
   * Amount of the original transaction.  For details, see &#x60;original_transaction_amount&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return originalTransactionAmount
  **/
  @ApiModelProperty(value = "Amount of the original transaction.  For details, see `original_transaction_amount` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getOriginalTransactionAmount() {
    return originalTransactionAmount;
  }

  public void setOriginalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
  }

  public PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails currency(String currency) {
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
    PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails ptsV2PaymentsReversalsPost201ResponseReversalAmountDetails = (PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails) o;
    return Objects.equals(this.reversedAmount, ptsV2PaymentsReversalsPost201ResponseReversalAmountDetails.reversedAmount) &&
        Objects.equals(this.originalTransactionAmount, ptsV2PaymentsReversalsPost201ResponseReversalAmountDetails.originalTransactionAmount) &&
        Objects.equals(this.currency, ptsV2PaymentsReversalsPost201ResponseReversalAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reversedAmount, originalTransactionAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsReversalsPost201ResponseReversalAmountDetails {\n");
    
    sb.append("    reversedAmount: ").append(toIndentedString(reversedAmount)).append("\n");
    sb.append("    originalTransactionAmount: ").append(toIndentedString(originalTransactionAmount)).append("\n");
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

