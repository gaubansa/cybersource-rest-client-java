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
 * PtsV2PayoutsPost201ResponseRecipientInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class PtsV2PayoutsPost201ResponseRecipientInformationCard {
  @SerializedName("balance")
  private String balance = null;

  @SerializedName("currency")
  private String currency = null;

  public PtsV2PayoutsPost201ResponseRecipientInformationCard balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * This field shows the available balance in the prepaid account.  Acquirers always receive the available balance in the transaction currency. 
   * @return balance
  **/
  @ApiModelProperty(value = "This field shows the available balance in the prepaid account.  Acquirers always receive the available balance in the transaction currency. ")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public PtsV2PayoutsPost201ResponseRecipientInformationCard currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer. 
   * @return currency
  **/
  @ApiModelProperty(value = "This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201ResponseRecipientInformationCard ptsV2PayoutsPost201ResponseRecipientInformationCard = (PtsV2PayoutsPost201ResponseRecipientInformationCard) o;
    return Objects.equals(this.balance, ptsV2PayoutsPost201ResponseRecipientInformationCard.balance) &&
        Objects.equals(this.currency, ptsV2PayoutsPost201ResponseRecipientInformationCard.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseRecipientInformationCard {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

