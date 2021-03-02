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
 * Contains merchant-defined key-value pairs.
 */
@ApiModel(description = "Contains merchant-defined key-value pairs.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class Riskv1decisionsMerchantDefinedInformation {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public Riskv1decisionsMerchantDefinedInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Fields that you can use to store information. The value appears in the Case Management Details window in the Business Center. The first four fields are the same fields that are used by the Secure Data services. See request code examples. **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver&#39;s license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant&#39;s account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension. 
   * @return key
  **/
  @ApiModelProperty(value = "Fields that you can use to store information. The value appears in the Case Management Details window in the Business Center. The first four fields are the same fields that are used by the Secure Data services. See request code examples. **Warning** Merchant-defined data fields are not intended to and must not be used to capture personally identifying information. Accordingly, merchants are prohibited from capturing, obtaining, and/or transmitting any personally identifying information in or via the merchant-defined data fields. Personally identifying information includes, but is not limited to, address, credit card number, social security number, driver's license number, state-issued identification number, passport number, and card verification numbers (CVV, CVC2, CVV2, CID, CVN). In the event CyberSource discovers that a merchant is capturing and/or transmitting personally identifying information via the merchant-defined data fields, whether or not intentionally, CyberSource will immediately suspend the merchant's account, which will result in a rejection of any and all transaction requests submitted by the merchant after the point of suspension. ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Riskv1decisionsMerchantDefinedInformation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * String value for the key
   * @return value
  **/
  @ApiModelProperty(value = "String value for the key")
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
    Riskv1decisionsMerchantDefinedInformation riskv1decisionsMerchantDefinedInformation = (Riskv1decisionsMerchantDefinedInformation) o;
    return Objects.equals(this.key, riskv1decisionsMerchantDefinedInformation.key) &&
        Objects.equals(this.value, riskv1decisionsMerchantDefinedInformation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsMerchantDefinedInformation {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

