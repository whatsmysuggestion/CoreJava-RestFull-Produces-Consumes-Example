package com.kkar.rest;

 
import javax.ws.rs.*; 
import javax.ws.rs.core.*;
 
 

@Path("/json/data")
public class JSONService {
	
	
	  
	
	  @GET	  
	  @Path("/get") // @Produces(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON) 
	  public Track getTrackInJSON() {
	  
	  Track track = new Track(); 
	  track.setTitle("Test Title");
	  track.setSinger("Test");
	  
	  return track;
	  
	  }
	 
	
	
	  
	  
	  
	  
	
	
	
	  @GET	  
	  @Path("/xml/{pin}")	  
	  @Produces(MediaType.APPLICATION_XML) 
	  
	  public Customer  getCustomerInXML(@PathParam("pin") int pin) {
	
	  Customer customer = new Customer(); 
	  customer.setName("kkar");
	  customer.setPin(pin);
	  
	  return customer;
	  
	  }
	  
	 
	  
	
	
	
	  
	  
	  
	  
	  
	
	
	  @POST
	  @Path("/xmlInput")
	  @Produces(MediaType.APPLICATION_XML)
	  @Consumes(MediaType.APPLICATION_XML) 
	  public Customer  getCustomerWthXML(Customer old) {
	  
	  Customer newcustomer = new Customer(); 
	  newcustomer.setName(old.getName()+"Reddy");
	  newcustomer.setPin(old.getPin());
	  
	  return newcustomer;
	  
	  }
	  
	  
	  
	  
	 
	

	
	
	
	
	  @POST	  
	  @Path("/post")
	  @Consumes(MediaType.APPLICATION_JSON)	  
	  @Produces(MediaType.APPLICATION_JSON) 
	  public Response createTrackInJSON(Track  track) {
	  
	  String result = "Track saved : " + track;
	  
	  return Response.status(200).entity(result).build();
	  
	  }
	 
	 
	 
}