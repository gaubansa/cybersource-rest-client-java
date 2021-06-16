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
 * TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the recipient.  #### Litle Maximum length: 25  #### All other processors Maximum length: 60  Optional field. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number associated with the shipping address.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the shipping address.")
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
    TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo = (TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo) o;
    return Objects.equals(this.firstName, tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo.lastName) &&
        Objects.equals(this.address1, tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo.address1) &&
        Objects.equals(this.country, tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo.country) &&
        Objects.equals(this.phoneNumber, tssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address1, country, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

