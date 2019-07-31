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
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("method")
  private String method = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. 
   * @return name
  **/
  @ApiModelProperty(value = "A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType method(String method) {
    this.method = method;
    return this;
  }

   /**
   * A Payment Type is enabled through a Method. Examples: Visa, Master Card, ApplePay, iDeal
   * @return method
  **/
  @ApiModelProperty(value = "A Payment Type is enabled through a Method. Examples: Visa, Master Card, ApplePay, iDeal")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType) o;
    return Objects.equals(this.name, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType.name) &&
        Objects.equals(this.method, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

