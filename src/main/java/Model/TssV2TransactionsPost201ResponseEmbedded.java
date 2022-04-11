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
import Model.TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TssV2TransactionsPost201ResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class TssV2TransactionsPost201ResponseEmbedded {
  @SerializedName("transactionSummaries")
  private List<TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries> transactionSummaries = null;

  public TssV2TransactionsPost201ResponseEmbedded transactionSummaries(List<TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries> transactionSummaries) {
    this.transactionSummaries = transactionSummaries;
    return this;
  }

  public TssV2TransactionsPost201ResponseEmbedded addTransactionSummariesItem(TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries transactionSummariesItem) {
    if (this.transactionSummaries == null) {
      this.transactionSummaries = new ArrayList<TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries>();
    }
    this.transactionSummaries.add(transactionSummariesItem);
    return this;
  }

   /**
   * transaction search summary
   * @return transactionSummaries
  **/
  @ApiModelProperty(value = "transaction search summary")
  public List<TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries> getTransactionSummaries() {
    return transactionSummaries;
  }

  public void setTransactionSummaries(List<TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries> transactionSummaries) {
    this.transactionSummaries = transactionSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbedded tssV2TransactionsPost201ResponseEmbedded = (TssV2TransactionsPost201ResponseEmbedded) o;
    return Objects.equals(this.transactionSummaries, tssV2TransactionsPost201ResponseEmbedded.transactionSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionSummaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbedded {\n");
    
    sb.append("    transactionSummaries: ").append(toIndentedString(transactionSummaries)).append("\n");
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

