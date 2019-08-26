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
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator {
  @SerializedName("merchantInitiatedTransaction")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction = null;

  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator merchantInitiatedTransaction(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
    return this;
  }

   /**
   * Get merchantInitiatedTransaction
   * @return merchantInitiatedTransaction
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction getMerchantInitiatedTransaction() {
    return merchantInitiatedTransaction;
  }

  public void setMerchantInitiatedTransaction(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator tmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator = (TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator) o;
    return Objects.equals(this.merchantInitiatedTransaction, tmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator.merchantInitiatedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInitiatedTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200ResponseProcessingInformationAuthorizationOptionsInitiator {\n");
    
    sb.append("    merchantInitiatedTransaction: ").append(toIndentedString(merchantInitiatedTransaction)).append("\n");
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

