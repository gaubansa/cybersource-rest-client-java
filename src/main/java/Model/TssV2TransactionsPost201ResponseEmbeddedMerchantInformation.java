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
 * TssV2TransactionsPost201ResponseEmbeddedMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class TssV2TransactionsPost201ResponseEmbeddedMerchantInformation {
  @SerializedName("resellerId")
  private String resellerId = null;

  public TssV2TransactionsPost201ResponseEmbeddedMerchantInformation resellerId(String resellerId) {
    this.resellerId = resellerId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return resellerId
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getResellerId() {
    return resellerId;
  }

  public void setResellerId(String resellerId) {
    this.resellerId = resellerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedMerchantInformation tssV2TransactionsPost201ResponseEmbeddedMerchantInformation = (TssV2TransactionsPost201ResponseEmbeddedMerchantInformation) o;
    return Objects.equals(this.resellerId, tssV2TransactionsPost201ResponseEmbeddedMerchantInformation.resellerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resellerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedMerchantInformation {\n");
    
    sb.append("    resellerId: ").append(toIndentedString(resellerId)).append("\n");
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

