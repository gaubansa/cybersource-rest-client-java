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
 * TssV2TransactionsGet200ResponsePaymentInformationBankMandate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationBankMandate {
  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("recurringType")
  private String recurringType = null;

  @SerializedName("id")
  private String id = null;

  public TssV2TransactionsGet200ResponsePaymentInformationBankMandate referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Unique value generated by CyberSource that identifies the transaction. Use this value to identify transactions in the Collections Report, which provides settlement information.  For details, see the &#x60;direct_debit_reconciliation_reference_number&#x60; reply field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Unique value generated by CyberSource that identifies the transaction. Use this value to identify transactions in the Collections Report, which provides settlement information.  For details, see the `direct_debit_reconciliation_reference_number` reply field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) ")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankMandate recurringType(String recurringType) {
    this.recurringType = recurringType;
    return this;
  }

   /**
   * Whether the direct debit is the first or last direct debit associated with the mandate, or one in between. Required only for the United Kingdom. Possible values: - &#x60;001&#x60;: First direct debit associated with this mandate. Use this value if a one-time direct debit). - &#x60;002&#x60;: Subsequent direct debits associated with this mandate. - &#x60;003&#x60;: Last direct debit associated with this mandate.  For details, see the &#x60;direct_debit_recurring_type&#x60; request field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) 
   * @return recurringType
  **/
  @ApiModelProperty(value = "Whether the direct debit is the first or last direct debit associated with the mandate, or one in between. Required only for the United Kingdom. Possible values: - `001`: First direct debit associated with this mandate. Use this value if a one-time direct debit). - `002`: Subsequent direct debits associated with this mandate. - `003`: Last direct debit associated with this mandate.  For details, see the `direct_debit_recurring_type` request field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) ")
  public String getRecurringType() {
    return recurringType;
  }

  public void setRecurringType(String recurringType) {
    this.recurringType = recurringType;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankMandate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The mandate ID. Required only for the United Kingdom.  For details, see the &#x60;mandate_id&#x60; request field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) 
   * @return id
  **/
  @ApiModelProperty(value = "The mandate ID. Required only for the United Kingdom.  For details, see the `mandate_id` request field description in [Ingenico ePayments Developer Guide For Direct Debits.](https://apps.cybersource.com/library/documentation/dev_guides/Ingenico_ePayments_Dev/html/) ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationBankMandate tssV2TransactionsGet200ResponsePaymentInformationBankMandate = (TssV2TransactionsGet200ResponsePaymentInformationBankMandate) o;
    return Objects.equals(this.referenceNumber, tssV2TransactionsGet200ResponsePaymentInformationBankMandate.referenceNumber) &&
        Objects.equals(this.recurringType, tssV2TransactionsGet200ResponsePaymentInformationBankMandate.recurringType) &&
        Objects.equals(this.id, tssV2TransactionsGet200ResponsePaymentInformationBankMandate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, recurringType, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationBankMandate {\n");
    
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    recurringType: ").append(toIndentedString(recurringType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

