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
 * TssV2TransactionsGet200ResponseOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class TssV2TransactionsGet200ResponseOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("authorizedAmount")
  private String authorizedAmount = null;

  @SerializedName("settlementAmount")
  private String settlementAmount = null;

  @SerializedName("settlementCurrency")
  private String settlementCurrency = null;

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in:  Table 15, \&quot;Authorization Information for Specific Processors,\&quot; on page 43  Table 19, \&quot;Capture Information for Specific Processors,\&quot; on page 58  Table 23, \&quot;Credit Information for Specific Processors,\&quot; on page 75 If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations,\&quot; page 247.  **DCC with a Third-Party Provider**\\ Set this field to the converted amount that was returned by the DCC provider. You must include either this field or offer0 and the offerlevel field amount in your request. For details, see \&quot;Dynamic Currency Conversion with a Third Party Provider,\&quot; page 125.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 15, \&quot;Authorization Information for Specific Processors,\&quot; on page 43.  **DCC for First Data**\\ Not used. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in:  Table 15, \"Authorization Information for Specific Processors,\" on page 43  Table 19, \"Capture Information for Specific Processors,\" on page 58  Table 23, \"Credit Information for Specific Processors,\" on page 75 If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \"Zero Amount Authorizations,\" page 247.  **DCC with a Third-Party Provider**\\ Set this field to the converted amount that was returned by the DCC provider. You must include either this field or offer0 and the offerlevel field amount in your request. For details, see \"Dynamic Currency Conversion with a Third Party Provider,\" page 125.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 15, \"Authorization Information for Specific Processors,\" on page 43.  **DCC for First Data**\\ Not used. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your request for Payment API.  **DCC for First Data**\\ Your local currency. For details, see \&quot;Dynamic Currency Conversion for First Data,\&quot; page 113. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your request for Payment API.  **DCC for First Data**\\ Your local currency. For details, see \"Dynamic Currency Conversion for First Data,\" page 113. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails authorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
    return this;
  }

   /**
   * Amount that was authorized. 
   * @return authorizedAmount
  **/
  @ApiModelProperty(value = "Amount that was authorized. ")
  public String getAuthorizedAmount() {
    return authorizedAmount;
  }

  public void setAuthorizedAmount(String authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails settlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder’s account. 
   * @return settlementAmount
  **/
  @ApiModelProperty(value = "This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder’s account. ")
  public String getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationAmountDetails settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder&#39;s account. 
   * @return settlementCurrency
  **/
  @ApiModelProperty(value = "This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder's account. ")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseOrderInformationAmountDetails tssV2TransactionsGet200ResponseOrderInformationAmountDetails = (TssV2TransactionsGet200ResponseOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.currency) &&
        Objects.equals(this.taxAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.taxAmount) &&
        Objects.equals(this.authorizedAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.authorizedAmount) &&
        Objects.equals(this.settlementAmount, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.settlementAmount) &&
        Objects.equals(this.settlementCurrency, tssV2TransactionsGet200ResponseOrderInformationAmountDetails.settlementCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, taxAmount, authorizedAmount, settlementAmount, settlementCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    authorizedAmount: ").append(toIndentedString(authorizedAmount)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
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

