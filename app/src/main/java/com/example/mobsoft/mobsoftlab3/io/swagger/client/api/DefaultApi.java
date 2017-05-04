package  com.example.mobsoft.mobsoftlab3.io.swagger.client.api;

import com.example.mobsoft.mobsoftlab3.io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.example.mobsoft.mobsoftlab3.io.swagger.client.model.InlineResponse200;
import com.example.mobsoft.mobsoftlab3.io.swagger.client.model.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  
  /**
   * 
   * Gets `Event` object.\nOptional query param of **name** determines\nname of returned array
   * @param name Name of the Event
   * @param location Location of the Event (Address)
   * @return Call<List<InlineResponse200>>
   */
  
  @GET("event")
  Call<List<InlineResponse200>> eventGet(
    @Query("name") String name, @Query("location") String location
  );

  
  /**
   * 
   * Gets `Event` objects.
   * @return Call<List<Event>>
   */
  
  @GET("event/all")
  Call<List<Event>> eventAllGet();
    

  
  /**
   * 
   * Join `Event`.\nOptional query param of **name** determines\nname of event.
   * @param id Name of the Event
   * @param name Name of the Event
   * @param role The role of player
   * @return Call<Void>
   */
  
  @POST("event/join")
  Call<Void> eventJoinPost(
    @Query("id") Integer id, @Query("name") String name, @Query("role") String role
  );

  
  /**
   * 
   * Gets `Event` objects.
   * @return Call<List<InlineResponse200>>
   */
  
  @GET("event/my")
  Call<List<InlineResponse200>> eventMyGet();
    

  
}
