package controllers;


import play.*;
import play.mvc.*;
import play.libs.Json;


public class Registration extends Controller {
	
	public static void Post(String user, String Password, String Id){
		
		
	}		
	
	public static void Put(String user, String Password, String Id){
			
	}	
	
	public static Result Get(){
		User user = new User();
		user.UserId = "user";
		user.Password = "XXXX";		
		return ok(Json.toJson(user));		
	}

}
