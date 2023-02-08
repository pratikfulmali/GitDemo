package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrimaryKey {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","root");
		System.out.println("connection is done");
		
		String query="insert into logout(id,name,city)values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, 0);
		ps.setString(2,"Pratik");
		ps.setString(3, "yavatmal");
		ps.execute();
		
		ps.setInt(1, 1);
		ps.setString(2,"Rohit");
		ps.setString(3, "Nagpur");
		ps.execute();
		
		ps.setInt(1, 2);
		ps.setString(2,"Shyam");
		ps.setString(3, "Mumbai");
		ps.execute();
		
		System.out.println("data entered successfully");
	}

}

