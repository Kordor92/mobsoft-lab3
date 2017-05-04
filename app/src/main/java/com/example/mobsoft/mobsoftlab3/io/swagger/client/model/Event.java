package  com.example.mobsoft.mobsoftlab3.io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Event   {
  
  @SerializedName("event_id")
  private Integer eventId = null;
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("display_name")
  private String displayName = null;
  
  @SerializedName("location")
  private String location = null;
  
  @SerializedName("numberofplayers")
  private String numberofplayers = null;
  
  @SerializedName("prerequisites")
  private String prerequisites = null;
  

  
  /**
   * ID of the Event.
   **/
  @ApiModelProperty(value = "ID of the Event.")
  public Integer getEventId() {
    return eventId;
  }
  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  
  /**
   * Description of game.
   **/
  @ApiModelProperty(value = "Description of game.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Display name of game.
   **/
  @ApiModelProperty(value = "Display name of game.")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Location of the game.
   **/
  @ApiModelProperty(value = "Location of the game.")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   * Number of Players. For example, 4 people.
   **/
  @ApiModelProperty(value = "Number of Players. For example, 4 people.")
  public String getNumberofplayers() {
    return numberofplayers;
  }
  public void setNumberofplayers(String numberofplayers) {
    this.numberofplayers = numberofplayers;
  }

  
  /**
   * The prerequisite of the player to join. (For example, one lvl 4 priest, 2 lvl 3 warrior).
   **/
  @ApiModelProperty(value = "The prerequisite of the player to join. (For example, one lvl 4 priest, 2 lvl 3 warrior).")
  public String getPrerequisites() {
    return prerequisites;
  }
  public void setPrerequisites(String prerequisites) {
    this.prerequisites = prerequisites;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(eventId, event.eventId) &&
        Objects.equals(description, event.description) &&
        Objects.equals(displayName, event.displayName) &&
        Objects.equals(location, event.location) &&
        Objects.equals(numberofplayers, event.numberofplayers) &&
        Objects.equals(prerequisites, event.prerequisites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, description, displayName, location, numberofplayers, prerequisites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    numberofplayers: ").append(toIndentedString(numberofplayers)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
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
