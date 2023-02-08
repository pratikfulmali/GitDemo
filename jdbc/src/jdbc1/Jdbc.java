
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter User Name");
		String name = sc.next();
		System.out.println("Enter Password");
		String Pass = sc.next();

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Login");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		System.out.println("Connection Sucessfull");

		String sql = "Insert into empdetails(id,name,pass) values(?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, id);
		st.setString(2, name);

		st.setString(3, Pass);

		System.out.println("Ready to execute");
		st.execute();
		st.close();
		con.close();

	}
}
