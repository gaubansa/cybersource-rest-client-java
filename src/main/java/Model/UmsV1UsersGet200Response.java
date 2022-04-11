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
import Model.UmsV1UsersGet200ResponseUsers;
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
 * UmsV1UsersGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class UmsV1UsersGet200Response {
  @SerializedName("users")
  private List<UmsV1UsersGet200ResponseUsers> users = null;

  public UmsV1UsersGet200Response users(List<UmsV1UsersGet200ResponseUsers> users) {
    this.users = users;
    return this;
  }

  public UmsV1UsersGet200Response addUsersItem(UmsV1UsersGet200ResponseUsers usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UmsV1UsersGet200ResponseUsers>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<UmsV1UsersGet200ResponseUsers> getUsers() {
    return users;
  }

  public void setUsers(List<UmsV1UsersGet200ResponseUsers> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmsV1UsersGet200Response umsV1UsersGet200Response = (UmsV1UsersGet200Response) o;
    return Objects.equals(this.users, umsV1UsersGet200Response.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmsV1UsersGet200Response {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

