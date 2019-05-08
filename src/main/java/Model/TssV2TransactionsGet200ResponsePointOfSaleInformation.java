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
 * TssV2TransactionsGet200ResponsePointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class TssV2TransactionsGet200ResponsePointOfSaleInformation {
  @SerializedName("entryMode")
  private String entryMode = null;

  @SerializedName("terminalCapability")
  private Integer terminalCapability = null;

  public TssV2TransactionsGet200ResponsePointOfSaleInformation entryMode(String entryMode) {
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Method of entering credit card information into the POS terminal. Possible values:   - contact: Read from direct contact with chip card.  - contactless: Read from a contactless interface using chip data.  - keyed: Manually keyed into POS terminal.  - msd: Read from a contactless interface using magnetic stripe data (MSD).  - swiped: Read from credit card magnetic stripe.  The contact, contactless, and msd values are supported only for EMV transactions. * Applicable only for CTV for Payouts. 
   * @return entryMode
  **/
  @ApiModelProperty(value = "Method of entering credit card information into the POS terminal. Possible values:   - contact: Read from direct contact with chip card.  - contactless: Read from a contactless interface using chip data.  - keyed: Manually keyed into POS terminal.  - msd: Read from a contactless interface using magnetic stripe data (MSD).  - swiped: Read from credit card magnetic stripe.  The contact, contactless, and msd values are supported only for EMV transactions. * Applicable only for CTV for Payouts. ")
  public String getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(String entryMode) {
    this.entryMode = entryMode;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation terminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
    return this;
  }

   /**
   * POS terminal’s capability. Possible values:   - 1: Terminal has a magnetic stripe reader only.  - 2: Terminal has a magnetic stripe reader and manual entry capability.  - 3: Terminal has manual entry capability only.  - 4: Terminal can read chip cards.  - 5: Terminal can read contactless chip cards.  The values of 4 and 5 are supported only for EMV transactions. * Applicable only for CTV for Payouts.   
   * minimum: 1
   * maximum: 5
   * @return terminalCapability
  **/
  @ApiModelProperty(value = "POS terminal’s capability. Possible values:   - 1: Terminal has a magnetic stripe reader only.  - 2: Terminal has a magnetic stripe reader and manual entry capability.  - 3: Terminal has manual entry capability only.  - 4: Terminal can read chip cards.  - 5: Terminal can read contactless chip cards.  The values of 4 and 5 are supported only for EMV transactions. * Applicable only for CTV for Payouts.   ")
  public Integer getTerminalCapability() {
    return terminalCapability;
  }

  public void setTerminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePointOfSaleInformation tssV2TransactionsGet200ResponsePointOfSaleInformation = (TssV2TransactionsGet200ResponsePointOfSaleInformation) o;
    return Objects.equals(this.entryMode, tssV2TransactionsGet200ResponsePointOfSaleInformation.entryMode) &&
        Objects.equals(this.terminalCapability, tssV2TransactionsGet200ResponsePointOfSaleInformation.terminalCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryMode, terminalCapability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePointOfSaleInformation {\n");
    
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    terminalCapability: ").append(toIndentedString(terminalCapability)).append("\n");
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

