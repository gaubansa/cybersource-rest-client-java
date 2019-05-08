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
 * Use this for a non-tokenized payment card.
 */
@ApiModel(description = "Use this for a non-tokenized payment card.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class Riskv1decisionsPaymentInformationCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bin")
  private String bin = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  public Riskv1decisionsPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also knows as the Primary Account Nunmber (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the &#x60;customer_cc_number&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also knows as the Primary Account Nunmber (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the `customer_cc_number` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Riskv1decisionsPaymentInformationCard type(String type) {
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

  public Riskv1decisionsPaymentInformationCard bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * description: The BIN is the first six digits of the card&#39;s Primary Account Number (PAN). 
   * @return bin
  **/
  @ApiModelProperty(value = "description: The BIN is the first six digits of the card's Primary Account Number (PAN). ")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public Riskv1decisionsPaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;12&#x60;.  For processor-specific information, see the &#x60;customer_cc_expmo&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_=039), if there is no expiration date on the card, use `12`.  For processor-specific information, see the `customer_cc_expmo` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Riskv1decisionsPaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;.   **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;1900&#x60; through &#x60;3000&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;2021&#x60;.  For processor-specific information, see the &#x60;customer_cc_expyr&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the credit card expires.  Format: `YYYY`.   **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`1900` through `3000`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (_type_=039), if there is no expiration date on the card, use `2021`.  For processor-specific information, see the `customer_cc_expyr` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsPaymentInformationCard riskv1decisionsPaymentInformationCard = (Riskv1decisionsPaymentInformationCard) o;
    return Objects.equals(this.number, riskv1decisionsPaymentInformationCard.number) &&
        Objects.equals(this.type, riskv1decisionsPaymentInformationCard.type) &&
        Objects.equals(this.bin, riskv1decisionsPaymentInformationCard.bin) &&
        Objects.equals(this.expirationMonth, riskv1decisionsPaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, riskv1decisionsPaymentInformationCard.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, bin, expirationMonth, expirationYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsPaymentInformationCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
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

