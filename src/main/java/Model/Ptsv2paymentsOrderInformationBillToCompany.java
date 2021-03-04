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
 * Ptsv2paymentsOrderInformationBillToCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class Ptsv2paymentsOrderInformationBillToCompany {
  @SerializedName("name")
  private String name = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  public Ptsv2paymentsOrderInformationBillToCompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the customer’s company.  **CyberSource through VisaNet** Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  For processor-specific information, see the &#x60;company_name&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the customer’s company.  **CyberSource through VisaNet** Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  For processor-specific information, see the `company_name` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsOrderInformationBillToCompany address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line in the street address of the company purchasing the product.
   * @return address1
  **/
  @ApiModelProperty(value = "First line in the street address of the company purchasing the product.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsOrderInformationBillToCompany address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Additional address information for the company purchasing the product.
   * @return address2
  **/
  @ApiModelProperty(value = "Additional address information for the company purchasing the product.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Ptsv2paymentsOrderInformationBillToCompany locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City in the address of the company purchasing the product.
   * @return locality
  **/
  @ApiModelProperty(value = "City in the address of the company purchasing the product.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsOrderInformationBillToCompany administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province in the address of the company purchasing the product. Use the State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province in the address of the company purchasing the product. Use the State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsOrderInformationBillToCompany postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code in the address of the company purchasing the product. The postal code must consist of 5 to 9 digits.  When the company country is the U.S., the 9-digit postal code must follow this format: **[5 digits][dash][4 digits]** #### Example &#x60;12345-6789&#x60;  When the company country is Canada, the 6-digit postal code must follow this format: **[alpha][numeric][alpha][space][numeric][alpha][numeric]** #### Example &#x60;A1B 2C3&#x60; 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code in the address of the company purchasing the product. The postal code must consist of 5 to 9 digits.  When the company country is the U.S., the 9-digit postal code must follow this format: **[5 digits][dash][4 digits]** #### Example `12345-6789`  When the company country is Canada, the 6-digit postal code must follow this format: **[alpha][numeric][alpha][space][numeric][alpha][numeric]** #### Example `A1B 2C3` ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsOrderInformationBillToCompany country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country in the address of the company purchasing the product. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). 
   * @return country
  **/
  @ApiModelProperty(value = "Country in the address of the company purchasing the product. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationBillToCompany ptsv2paymentsOrderInformationBillToCompany = (Ptsv2paymentsOrderInformationBillToCompany) o;
    return Objects.equals(this.name, ptsv2paymentsOrderInformationBillToCompany.name) &&
        Objects.equals(this.address1, ptsv2paymentsOrderInformationBillToCompany.address1) &&
        Objects.equals(this.address2, ptsv2paymentsOrderInformationBillToCompany.address2) &&
        Objects.equals(this.locality, ptsv2paymentsOrderInformationBillToCompany.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsOrderInformationBillToCompany.administrativeArea) &&
        Objects.equals(this.postalCode, ptsv2paymentsOrderInformationBillToCompany.postalCode) &&
        Objects.equals(this.country, ptsv2paymentsOrderInformationBillToCompany.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address1, address2, locality, administrativeArea, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationBillToCompany {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

