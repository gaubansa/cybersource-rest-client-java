/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * Ptsv2paymentsMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class Ptsv2paymentsMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("alternateName")
  private String alternateName = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  public Ptsv2paymentsMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  For Payouts: * Paymentech (22) 
   * @return name
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  For Payouts: * Paymentech (22) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return alternateName
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) * FDCCompass (13) * Paymentech (13) 
   * @return contact
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) * FDCCompass (13) * Paymentech (13) ")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return address1
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant City. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant City. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return country
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return postalCode
  **/
  @ApiModelProperty(value = "For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsMerchantInformationMerchantDescriptor administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Merchant State. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Merchant State. For the descriptions, used-by information, data types, and lengths for these fields, see Merchant Descriptors in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantInformationMerchantDescriptor ptsv2paymentsMerchantInformationMerchantDescriptor = (Ptsv2paymentsMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, ptsv2paymentsMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.alternateName, ptsv2paymentsMerchantInformationMerchantDescriptor.alternateName) &&
        Objects.equals(this.contact, ptsv2paymentsMerchantInformationMerchantDescriptor.contact) &&
        Objects.equals(this.address1, ptsv2paymentsMerchantInformationMerchantDescriptor.address1) &&
        Objects.equals(this.locality, ptsv2paymentsMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.country, ptsv2paymentsMerchantInformationMerchantDescriptor.country) &&
        Objects.equals(this.postalCode, ptsv2paymentsMerchantInformationMerchantDescriptor.postalCode) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsMerchantInformationMerchantDescriptor.administrativeArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, alternateName, contact, address1, locality, country, postalCode, administrativeArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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

