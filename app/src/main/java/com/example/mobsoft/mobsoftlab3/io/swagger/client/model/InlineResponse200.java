package  com.example.mobsoft.mobsoftlab3.io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse200   {
  
  @SerializedName("numberOfPlayers")
  private Integer numberOfPlayers = null;
  
  @SerializedName("address")
  private String address = null;
  
  @SerializedName("name")
  private String name = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfPlayers() {
    return numberOfPlayers;
  }
  public void setNumberOfPlayers(Integer numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(numberOfPlayers, inlineResponse200.numberOfPlayers) &&
        Objects.equals(address, inlineResponse200.address) &&
        Objects.equals(name, inlineResponse200.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfPlayers, address, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    numberOfPlayers: ").append(toIndentedString(numberOfPlayers)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
