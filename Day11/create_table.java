package Jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class create_table {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Anu@123";		
		//Class.forName("com.sql.cj.jdbc.Driver");
		String sql="create table students(rollno int,"
				+"name varchar(50),"
				+"per int,"
				+"email varchar(50))";
		
		String insertSQL="insert into students values(101,'Anu',90,'anu@gmail.com'),"
				+"(102,'mahe',96,'mahe@gmail.com'),"
				+"(103,'manu',87,'manu@gmail.com')";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
		    System.out.println("connection created");
		    
		    Statement stmt=con.createStatement();
		    stmt.executeUpdate(sql);
		    System.out.println("Students table created");
		    int rowInserted=stmt.executeUpdate(insertSQL);
		    if(rowInserted>0) {
		    	System.out.println("new student record inserted");
		    }
			ResultSet rs=stmt.executeQuery("select * from students");
			System.out.println("rollno\t name\t percentage\t email ");
			while(rs.next()) {
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				System.out.println(rollno+" "+name+" "+per+" "+email);
			}
			rs.close();
		    stmt.close();
		    con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
