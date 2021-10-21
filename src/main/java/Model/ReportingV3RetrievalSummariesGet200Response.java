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
import Model.ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries;
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
import org.joda.time.DateTime;

/**
 * ReportingV3RetrievalSummariesGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-13T13:37:43.460+05:30")
public class ReportingV3RetrievalSummariesGet200Response {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("retrievalSummaries")
  private List<ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries> retrievalSummaries = null;

  public ReportingV3RetrievalSummariesGet200Response organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "testrest", value = "Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3RetrievalSummariesGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Report Start Date
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3RetrievalSummariesGet200Response endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Report Start Date
   * @return endTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ReportingV3RetrievalSummariesGet200Response retrievalSummaries(List<ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries> retrievalSummaries) {
    this.retrievalSummaries = retrievalSummaries;
    return this;
  }

  public ReportingV3RetrievalSummariesGet200Response addRetrievalSummariesItem(ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries retrievalSummariesItem) {
    if (this.retrievalSummaries == null) {
      this.retrievalSummaries = new ArrayList<ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries>();
    }
    this.retrievalSummaries.add(retrievalSummariesItem);
    return this;
  }

   /**
   * List of Summary values
   * @return retrievalSummaries
  **/
  @ApiModelProperty(value = "List of Summary values")
  public List<ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries> getRetrievalSummaries() {
    return retrievalSummaries;
  }

  public void setRetrievalSummaries(List<ReportingV3ChargebackSummariesGet200ResponseChargebackSummaries> retrievalSummaries) {
    this.retrievalSummaries = retrievalSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3RetrievalSummariesGet200Response reportingV3RetrievalSummariesGet200Response = (ReportingV3RetrievalSummariesGet200Response) o;
    return Objects.equals(this.organizationId, reportingV3RetrievalSummariesGet200Response.organizationId) &&
        Objects.equals(this.startTime, reportingV3RetrievalSummariesGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3RetrievalSummariesGet200Response.endTime) &&
        Objects.equals(this.retrievalSummaries, reportingV3RetrievalSummariesGet200Response.retrievalSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, startTime, endTime, retrievalSummaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3RetrievalSummariesGet200Response {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    retrievalSummaries: ").append(toIndentedString(retrievalSummaries)).append("\n");
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

