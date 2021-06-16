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
import Model.PtsV1TransactionBatchesIdGet200ResponseLinksTransactions;
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
 * PtsV1TransactionBatchesIdGet200ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class PtsV1TransactionBatchesIdGet200ResponseLinks {
  @SerializedName("transactions")
  private List<PtsV1TransactionBatchesIdGet200ResponseLinksTransactions> transactions = null;

  public PtsV1TransactionBatchesIdGet200ResponseLinks transactions(List<PtsV1TransactionBatchesIdGet200ResponseLinksTransactions> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PtsV1TransactionBatchesIdGet200ResponseLinks addTransactionsItem(PtsV1TransactionBatchesIdGet200ResponseLinksTransactions transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<PtsV1TransactionBatchesIdGet200ResponseLinksTransactions>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")
  public List<PtsV1TransactionBatchesIdGet200ResponseLinksTransactions> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<PtsV1TransactionBatchesIdGet200ResponseLinksTransactions> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV1TransactionBatchesIdGet200ResponseLinks ptsV1TransactionBatchesIdGet200ResponseLinks = (PtsV1TransactionBatchesIdGet200ResponseLinks) o;
    return Objects.equals(this.transactions, ptsV1TransactionBatchesIdGet200ResponseLinks.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesIdGet200ResponseLinks {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

