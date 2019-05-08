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
import Model.InlineResponse400Fields;
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
 * Error Bean
 */
@ApiModel(description = "Error Bean")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class InlineResponse400 {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("localizationKey")
  private String localizationKey = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("fields")
  private List<InlineResponse400Fields> fields = null;

  public InlineResponse400 code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Error code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Error code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponse400 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse400 localizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
    return this;
  }

   /**
   * Localization Key Name
   * @return localizationKey
  **/
  @ApiModelProperty(value = "Localization Key Name")
  public String getLocalizationKey() {
    return localizationKey;
  }

  public void setLocalizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
  }

  public InlineResponse400 correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Correlation Id
   * @return correlationId
  **/
  @ApiModelProperty(value = "Correlation Id")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public InlineResponse400 detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Error Detail
   * @return detail
  **/
  @ApiModelProperty(value = "Error Detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public InlineResponse400 fields(List<InlineResponse400Fields> fields) {
    this.fields = fields;
    return this;
  }

  public InlineResponse400 addFieldsItem(InlineResponse400Fields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<InlineResponse400Fields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Error fields List
   * @return fields
  **/
  @ApiModelProperty(value = "Error fields List")
  public List<InlineResponse400Fields> getFields() {
    return fields;
  }

  public void setFields(List<InlineResponse400Fields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.code, inlineResponse400.code) &&
        Objects.equals(this.message, inlineResponse400.message) &&
        Objects.equals(this.localizationKey, inlineResponse400.localizationKey) &&
        Objects.equals(this.correlationId, inlineResponse400.correlationId) &&
        Objects.equals(this.detail, inlineResponse400.detail) &&
        Objects.equals(this.fields, inlineResponse400.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, localizationKey, correlationId, detail, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizationKey: ").append(toIndentedString(localizationKey)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

