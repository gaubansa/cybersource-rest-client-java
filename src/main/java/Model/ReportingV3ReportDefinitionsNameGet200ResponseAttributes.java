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
 * ReportingV3ReportDefinitionsNameGet200ResponseAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class ReportingV3ReportDefinitionsNameGet200ResponseAttributes {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("filterType")
  private String filterType = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("supportedType")
  private String supportedType = null;

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Attribute Filter Type.
   * @return filterType
  **/
  @ApiModelProperty(example = "MULTI", value = "Attribute Filter Type.")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseAttributes supportedType(String supportedType) {
    this.supportedType = supportedType;
    return this;
  }

   /**
   * Valid values for the filter.
   * @return supportedType
  **/
  @ApiModelProperty(example = "", value = "Valid values for the filter.")
  public String getSupportedType() {
    return supportedType;
  }

  public void setSupportedType(String supportedType) {
    this.supportedType = supportedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportDefinitionsNameGet200ResponseAttributes reportingV3ReportDefinitionsNameGet200ResponseAttributes = (ReportingV3ReportDefinitionsNameGet200ResponseAttributes) o;
    return Objects.equals(this.id, reportingV3ReportDefinitionsNameGet200ResponseAttributes.id) &&
        Objects.equals(this.name, reportingV3ReportDefinitionsNameGet200ResponseAttributes.name) &&
        Objects.equals(this.description, reportingV3ReportDefinitionsNameGet200ResponseAttributes.description) &&
        Objects.equals(this.filterType, reportingV3ReportDefinitionsNameGet200ResponseAttributes.filterType) &&
        Objects.equals(this._default, reportingV3ReportDefinitionsNameGet200ResponseAttributes._default) &&
        Objects.equals(this.required, reportingV3ReportDefinitionsNameGet200ResponseAttributes.required) &&
        Objects.equals(this.supportedType, reportingV3ReportDefinitionsNameGet200ResponseAttributes.supportedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, filterType, _default, required, supportedType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportDefinitionsNameGet200ResponseAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    supportedType: ").append(toIndentedString(supportedType)).append("\n");
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

