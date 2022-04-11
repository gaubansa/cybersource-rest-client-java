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
import java.util.ArrayList;
import java.util.List;

/**
 * Decides whether to call Payer Authentication along with DM or not
 */
@ApiModel(description = "Decides whether to call Payer Authentication along with DM or not")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class Riskv1decisionsProcessingInformation {
  @SerializedName("actionList")
  private List<String> actionList = null;

  public Riskv1decisionsProcessingInformation actionList(List<String> actionList) {
    this.actionList = actionList;
    return this;
  }

  public Riskv1decisionsProcessingInformation addActionListItem(String actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<String>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * Use CONSUMER_AUTHENTICATION to use Payer Authentication along with Decision Manager. For any other value, only Decision Manager will run. 
   * @return actionList
  **/
  @ApiModelProperty(value = "Use CONSUMER_AUTHENTICATION to use Payer Authentication along with Decision Manager. For any other value, only Decision Manager will run. ")
  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsProcessingInformation riskv1decisionsProcessingInformation = (Riskv1decisionsProcessingInformation) o;
    return Objects.equals(this.actionList, riskv1decisionsProcessingInformation.actionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsProcessingInformation {\n");
    
    sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
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

