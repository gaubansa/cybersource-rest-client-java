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
 * The expirationMonth, expirationYear and securityCode is sent to the issuer as part of network token enrollment and is not stored under the Instrument Identifier token. 
 */
@ApiModel(description = "The expirationMonth, expirationYear and securityCode is sent to the issuer as part of network token enrollment and is not stored under the Instrument Identifier token. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers. 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the credit card expires.  Format: `YYYY`. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card Verification Number. 
   * @return securityCode
  **/
  @ApiModelProperty(value = "Card Verification Number. ")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard = (Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard) o;
    return Objects.equals(this.number, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard.number) &&
        Objects.equals(this.expirationMonth, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard.expirationYear) &&
        Objects.equals(this.securityCode, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, securityCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

