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
 * TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation {
  @SerializedName("xid")
  private String xid = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("eciRaw")
  private String eciRaw = null;

  public TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * Transaction identifier.  For details, see &#x60;xid&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return xid
  **/
  @ApiModelProperty(value = "Transaction identifier.  For details, see `xid` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Payer auth Transaction identifier.
   * @return transactionId
  **/
  @ApiModelProperty(value = "Payer auth Transaction identifier.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation eciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
    return this;
  }

   /**
   * Raw electronic commerce indicator (ECI).  For details, see &#x60;eci_raw&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return eciRaw
  **/
  @ApiModelProperty(value = "Raw electronic commerce indicator (ECI).  For details, see `eci_raw` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getEciRaw() {
    return eciRaw;
  }

  public void setEciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation tssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation = (TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation) o;
    return Objects.equals(this.xid, tssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation.xid) &&
        Objects.equals(this.transactionId, tssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation.transactionId) &&
        Objects.equals(this.eciRaw, tssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation.eciRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xid, transactionId, eciRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation {\n");
    
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    eciRaw: ").append(toIndentedString(eciRaw)).append("\n");
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

