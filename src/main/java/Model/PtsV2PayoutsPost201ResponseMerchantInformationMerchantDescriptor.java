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
 * PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Merchant&#39;s name.  For more details about the merchant-related fields, see the &#x60;merchant_descriptor&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22. 
   * @return name
  **/
  @ApiModelProperty(value = "Merchant's name.  For more details about the merchant-related fields, see the `merchant_descriptor` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_city&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_city` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Merchant&#39;s country.  For the descriptions, used-by information, data types, and lengths for these fields, see the &#x60;merchant_descriptor_country&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return country
  **/
  @ApiModelProperty(value = "Merchant's country.  For the descriptions, used-by information, data types, and lengths for these fields, see the `merchant_descriptor_country` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
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
    PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor = (PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.locality, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.country, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locality, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
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

