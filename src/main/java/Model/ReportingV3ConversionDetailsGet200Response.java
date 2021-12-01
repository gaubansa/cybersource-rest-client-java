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
import Model.ReportingV3ConversionDetailsGet200ResponseConversionDetails;
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
 * ReportingV3ConversionDetailsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class ReportingV3ConversionDetailsGet200Response {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("conversionDetails")
  private List<ReportingV3ConversionDetailsGet200ResponseConversionDetails> conversionDetails = null;

  public ReportingV3ConversionDetailsGet200Response organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Merchant Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "testMerchantId", value = "Merchant Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ConversionDetailsGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3ConversionDetailsGet200Response endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3ConversionDetailsGet200Response conversionDetails(List<ReportingV3ConversionDetailsGet200ResponseConversionDetails> conversionDetails) {
    this.conversionDetails = conversionDetails;
    return this;
  }

  public ReportingV3ConversionDetailsGet200Response addConversionDetailsItem(ReportingV3ConversionDetailsGet200ResponseConversionDetails conversionDetailsItem) {
    if (this.conversionDetails == null) {
      this.conversionDetails = new ArrayList<ReportingV3ConversionDetailsGet200ResponseConversionDetails>();
    }
    this.conversionDetails.add(conversionDetailsItem);
    return this;
  }

   /**
   * Get conversionDetails
   * @return conversionDetails
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3ConversionDetailsGet200ResponseConversionDetails> getConversionDetails() {
    return conversionDetails;
  }

  public void setConversionDetails(List<ReportingV3ConversionDetailsGet200ResponseConversionDetails> conversionDetails) {
    this.conversionDetails = conversionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ConversionDetailsGet200Response reportingV3ConversionDetailsGet200Response = (ReportingV3ConversionDetailsGet200Response) o;
    return Objects.equals(this.organizationId, reportingV3ConversionDetailsGet200Response.organizationId) &&
        Objects.equals(this.startTime, reportingV3ConversionDetailsGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3ConversionDetailsGet200Response.endTime) &&
        Objects.equals(this.conversionDetails, reportingV3ConversionDetailsGet200Response.conversionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, startTime, endTime, conversionDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ConversionDetailsGet200Response {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    conversionDetails: ").append(toIndentedString(conversionDetails)).append("\n");
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

