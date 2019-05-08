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
 * Ptsv2paymentsidcapturesAggregatorInformationSubMerchant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class Ptsv2paymentsidcapturesAggregatorInformationSubMerchant {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Sub-merchant’s business name.  **American Express Direct**\\ The maximum length of the sub-merchant name depends on the length of the aggregator name. The combined length for both values must not exceed 36 characters.  **CyberSource through VisaNet**\\ With American Express, the maximum length of the sub-merchant name depends on the length of the aggregator name. The combined length for both values must not exceed 36 characters. The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters.  **FDC Nashville Global**\\ With Mastercard, the maximum length of the sub-merchant name depends on the length of the aggregator name: - If aggregator name length is 1 through 3, maximum sub-merchant name length is 21. - If aggregator name length is 4 through 7, maximum sub-merchant name length is 17. - If aggregator name length is 8 through 12, maximum sub-merchant name length is 12. 
   * @return name
  **/
  @ApiModelProperty(value = "Sub-merchant’s business name.  **American Express Direct**\\ The maximum length of the sub-merchant name depends on the length of the aggregator name. The combined length for both values must not exceed 36 characters.  **CyberSource through VisaNet**\\ With American Express, the maximum length of the sub-merchant name depends on the length of the aggregator name. The combined length for both values must not exceed 36 characters. The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters.  **FDC Nashville Global**\\ With Mastercard, the maximum length of the sub-merchant name depends on the length of the aggregator name: - If aggregator name length is 1 through 3, maximum sub-merchant name length is 21. - If aggregator name length is 4 through 7, maximum sub-merchant name length is 17. - If aggregator name length is 8 through 12, maximum sub-merchant name length is 12. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the sub-merchant’s street address.  See \&quot;Aggregator Support,\&quot; page 100.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the sub-merchant’s street address.  See \"Aggregator Support,\" page 100.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Sub-merchant’s city.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file.  **FDC Compass**\\ This value must consist of uppercase characters.  For details, see \&quot;Aggregator Support,\&quot; page 100. 
   * @return locality
  **/
  @ApiModelProperty(value = "Sub-merchant’s city.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file.  **FDC Compass**\\ This value must consist of uppercase characters.  For details, see \"Aggregator Support,\" page 100. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Sub-merchant’s state or province. Use the State, Province, and Territory Codes for the United States and Canada.  See \&quot;Aggregator Support,\&quot; page 100.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Sub-merchant’s state or province. Use the State, Province, and Territory Codes for the United States and Canada.  See \"Aggregator Support,\" page 100.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Partial postal code for the sub-merchant’s address.  See \&quot;Aggregator Support,\&quot; page 100 for details.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Partial postal code for the sub-merchant’s address.  See \"Aggregator Support,\" page 100 for details.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file5.  **FDC Compass**\\ This value must consist of uppercase characters. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Sub-merchant’s country. Use the two-character ISO Standard Country Codes.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file.  **FDC Compass**\\ This value must consist of uppercase characters.  See \&quot;Aggregator Support,\&quot; page 101. 
   * @return country
  **/
  @ApiModelProperty(value = "Sub-merchant’s country. Use the two-character ISO Standard Country Codes.  **CyberSource through VisaNet**\\ The value for this field does not map to the TC 33 capture file.  **FDC Compass**\\ This value must consist of uppercase characters.  See \"Aggregator Support,\" page 101. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Sub-merchant’s email address.  **Maximum length for processors**   - American Express Direct: 40  - CyberSource through VisaNet: 40  - FDC Compass: 40  - FDC Nashville Global: 19  **CyberSource through VisaNet**\\ With American Express, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCRB - Position: 25-64 - Field: American Express Seller E-mail Address  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. 
   * @return email
  **/
  @ApiModelProperty(value = "Sub-merchant’s email address.  **Maximum length for processors**   - American Express Direct: 40  - CyberSource through VisaNet: 40  - FDC Compass: 40  - FDC Nashville Global: 19  **CyberSource through VisaNet**\\ With American Express, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP01 TCRB - Position: 25-64 - Field: American Express Seller E-mail Address  **Note** The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant’s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Ptsv2paymentsidcapturesAggregatorInformationSubMerchant phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Sub-merchant’s telephone number.  **Maximum length for procesors**   - American Express Direct: 20  - CyberSource through VisaNet: 20  - FDC Compass: 13  - FDC Nashville Global: 10  **CyberSource through VisaNet**\\ With American Express, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCRB - Position: 5-24 - Field: American Express Seller Telephone Number  **FDC Compass**\\ This value must consist of uppercase characters. Use one of these recommended formats:\\ &#x60;NNN-NNN-NNNN&#x60;\\ &#x60;NNN-AAAAAAA&#x60; 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Sub-merchant’s telephone number.  **Maximum length for procesors**   - American Express Direct: 20  - CyberSource through VisaNet: 20  - FDC Compass: 13  - FDC Nashville Global: 10  **CyberSource through VisaNet**\\ With American Express, the value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCRB - Position: 5-24 - Field: American Express Seller Telephone Number  **FDC Compass**\\ This value must consist of uppercase characters. Use one of these recommended formats:\\ `NNN-NNN-NNNN`\\ `NNN-AAAAAAA` ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesAggregatorInformationSubMerchant ptsv2paymentsidcapturesAggregatorInformationSubMerchant = (Ptsv2paymentsidcapturesAggregatorInformationSubMerchant) o;
    return Objects.equals(this.name, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.name) &&
        Objects.equals(this.address1, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.address1) &&
        Objects.equals(this.locality, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.administrativeArea) &&
        Objects.equals(this.postalCode, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.postalCode) &&
        Objects.equals(this.country, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.country) &&
        Objects.equals(this.email, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.email) &&
        Objects.equals(this.phoneNumber, ptsv2paymentsidcapturesAggregatorInformationSubMerchant.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address1, locality, administrativeArea, postalCode, country, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesAggregatorInformationSubMerchant {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

