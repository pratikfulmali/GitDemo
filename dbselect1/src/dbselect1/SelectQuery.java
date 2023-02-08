package dbselect1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/login";
	       String username="root";
	       String password="root";
	       
	       String Query="select * from sun;";
	        
	       Class.forName("com.mysql.jdbc.Driver");
	       
	      Connection con=DriverManager.getConnection(url, username, password);
	       
	       Statement stmt=con.createStatement();
	       ResultSet rs=stmt.executeQuery(Query);
	       while (rs.next()) {
	    	   
	    	   String a=rs.getString("id");
	    	   String b=rs.getString("name");
	    	   String c=rs.getString("city");
	    	  
	    	   
	    	   System.out.println("row are   "+a+" "+b+"   "+c+"  " );

	}

}
	}
