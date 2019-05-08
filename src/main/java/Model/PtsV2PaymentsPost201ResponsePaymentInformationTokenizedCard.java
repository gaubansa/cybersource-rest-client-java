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
 * PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard {
  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("assuranceLevel")
  private String assuranceLevel = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("requestorId")
  private String requestorId = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * First six digits of token. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. 
   * @return prefix
  **/
  @ApiModelProperty(value = "First six digits of token. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. ")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of token. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of token. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International) 
   * @return type
  **/
  @ApiModelProperty(value = "Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard assuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
    return this;
  }

   /**
   * Confidence level of the tokenization. This value is assigned by the token service provider.  &#x60;Note&#x60; This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. 
   * @return assuranceLevel
  **/
  @ApiModelProperty(value = "Confidence level of the tokenization. This value is assigned by the token service provider.  `Note` This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. ")
  public String getAssuranceLevel() {
    return assuranceLevel;
  }

  public void setAssuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment network token expires. &#x60;Format: MM&#x60;. Possible values: 01 through 12.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (01 through 12) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use 12.  For processor-specific information, see the customer_cc_expmo field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment network token expires. `Format: MM`. Possible values: 01 through 12.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (01 through 12) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_=039), if there is no expiration date on the card, use 12.  For processor-specific information, see the customer_cc_expmo field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the payment network token expires. &#x60;Format: YYYY&#x60;.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (card_type&#x3D;039), if there is no expiration date on the card, use 2021.  For processor-specific information, see the customer_cc_expyr field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the payment network token expires. `Format: YYYY`.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (card_type=039), if there is no expiration date on the card, use 2021.  For processor-specific information, see the customer_cc_expyr field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

   /**
   * Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  &#x60;Note&#x60; This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. 
   * @return requestorId
  **/
  @ApiModelProperty(value = "Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  `Note` This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. ")
  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard = (PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard) o;
    return Objects.equals(this.prefix, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.prefix) &&
        Objects.equals(this.suffix, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.suffix) &&
        Objects.equals(this.type, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.type) &&
        Objects.equals(this.assuranceLevel, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.assuranceLevel) &&
        Objects.equals(this.expirationMonth, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.expirationYear) &&
        Objects.equals(this.requestorId, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedCard.requestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, suffix, type, assuranceLevel, expirationMonth, expirationYear, requestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationTokenizedCard {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assuranceLevel: ").append(toIndentedString(assuranceLevel)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
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

