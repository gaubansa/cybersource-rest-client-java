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
import Model.PtsV2PaymentsPost201ResponseErrorInformationDetails;
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
 * PtsV2PayoutsPost201ResponseErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class PtsV2PayoutsPost201ResponseErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details = null;

  public PtsV2PayoutsPost201ResponseErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status.  Possible values:  - EXPIRED_CARD  - PROCESSOR_DECLINED  - STOLEN_LOST_CARD  - UNAUTHORIZED_CARD  - CVN_NOT_MATCH  - INVALID_CVN  - BLACKLISTED_CUSTOMER  - INVALID_ACCOUNT  - GENERAL_DECLINE  - RISK_CONTROL_DECLINE  - PROCESSOR_RISK_CONTROL_DECLINE  - ALLOWABLE_PIN_RETRIES_EXCEEDED  - PROCESSOR_ERROR 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status.  Possible values:  - EXPIRED_CARD  - PROCESSOR_DECLINED  - STOLEN_LOST_CARD  - UNAUTHORIZED_CARD  - CVN_NOT_MATCH  - INVALID_CVN  - BLACKLISTED_CUSTOMER  - INVALID_ACCOUNT  - GENERAL_DECLINE  - RISK_CONTROL_DECLINE  - PROCESSOR_RISK_CONTROL_DECLINE  - ALLOWABLE_PIN_RETRIES_EXCEEDED  - PROCESSOR_ERROR ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PtsV2PayoutsPost201ResponseErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PtsV2PayoutsPost201ResponseErrorInformation details(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public PtsV2PayoutsPost201ResponseErrorInformation addDetailsItem(PtsV2PaymentsPost201ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV2PaymentsPost201ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201ResponseErrorInformation ptsV2PayoutsPost201ResponseErrorInformation = (PtsV2PayoutsPost201ResponseErrorInformation) o;
    return Objects.equals(this.reason, ptsV2PayoutsPost201ResponseErrorInformation.reason) &&
        Objects.equals(this.message, ptsV2PayoutsPost201ResponseErrorInformation.message) &&
        Objects.equals(this.details, ptsV2PayoutsPost201ResponseErrorInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseErrorInformation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

