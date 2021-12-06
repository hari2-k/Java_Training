import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.*;
public class JDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","123456");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from student");
		while(rs.next()) {
		int roll=rs.getInt("Roll no");
		String name=rs.getString("Name");
		String city=rs.getString("City");
		
		System.out.print(roll+" "+name+" "+city);
		}
		st.close();
		con.close();
}
}