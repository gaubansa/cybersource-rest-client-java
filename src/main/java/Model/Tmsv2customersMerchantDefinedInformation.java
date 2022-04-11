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
 * Tmsv2customersMerchantDefinedInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class Tmsv2customersMerchantDefinedInformation {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public Tmsv2customersMerchantDefinedInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The number you assign as the name for your merchant-defined data or secure field. Valid values are data1 to data4 and sensitive1 to sensitive4  For example, to set the name for merchant-defined data 2 field, you would reference merchantDefinedInformation[x].name as data2 Valid values: - data1 - data2 - data3 - data4 - sensitive1 - sensitive2 - sensitive3 - sensitive4 
   * @return name
  **/
  @ApiModelProperty(value = "The number you assign as the name for your merchant-defined data or secure field. Valid values are data1 to data4 and sensitive1 to sensitive4  For example, to set the name for merchant-defined data 2 field, you would reference merchantDefinedInformation[x].name as data2 Valid values: - data1 - data2 - data3 - data4 - sensitive1 - sensitive2 - sensitive3 - sensitive4 ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tmsv2customersMerchantDefinedInformation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value you assign for your merchant-defined data field.  **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver&#39;s license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant&#39;s account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension. 
   * @return value
  **/
  @ApiModelProperty(value = "The value you assign for your merchant-defined data field.  **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver's license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant's account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersMerchantDefinedInformation tmsv2customersMerchantDefinedInformation = (Tmsv2customersMerchantDefinedInformation) o;
    return Objects.equals(this.name, tmsv2customersMerchantDefinedInformation.name) &&
        Objects.equals(this.value, tmsv2customersMerchantDefinedInformation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersMerchantDefinedInformation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

