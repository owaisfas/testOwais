package controllers;

import javax.sql.DataSource;

import java.sql.*;

import play.*;
import play.db.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() throws SQLException {
        return ok(index.render("Your new application is ready.2" + Application.somethingRandom()));
    }
    
    public static Result index2() {
        return ok(index.render("Your new application is ready.2"));
    }

    public static void main (String [] args) throws SQLException
    {    
    	System.out.println("WTF");    	
    }
    
    public static String somethingRandom() throws SQLException
    {
    	DataSource ds = DB.getDataSource();
    	Connection conn = DB.getConnection();
    	String outString = "";
    	try{
    	      Statement stmt = conn.createStatement();
    	      ResultSet rs = stmt.executeQuery("SELECT TOP 5 [id]  FROM [orbit].[dbo].[Call]");
    	      
    	      while (rs.next()) {
    	        outString += rs.getString("id");
    	      }
    	      System.out.println(outString);
    	}
    	catch(Exception e){
    		return outString;
    	}
    	finally{
    		conn.close();    		
    	}
    	return outString;
    	
    }
    
}
