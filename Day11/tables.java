package Jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class tables {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Anu@123";
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Student (" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "city VARCHAR(50), " +
                    "percentage DOUBLE)");

            stmt.executeUpdate("INSERT INTO Student VALUES " +
                    "(101, 'Anu', 'Hyderabad', 90.5)," +
                    "(102, 'Mahe', 'Delhi', 92.3)," +
                    "(103, 'Manu', 'Hyderabad', 84.2)");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            System.out.println("All Student Records:");
            printStudentTable(rs);
            
         // Update Table
            stmt.executeUpdate("UPDATE Student SET percentage = 94.0 WHERE rollno = 103");

            // Highest Percentage
            rs = stmt.executeQuery("SELECT * FROM Student ORDER BY percentage DESC LIMIT 1");
            System.out.println("\nHighest Scoring Student:");
            printStudentTable(rs);
            
         // Arrange Records 
            rs = stmt.executeQuery("SELECT * FROM Student ORDER BY name ASC");
            System.out.println("\nStudents Sorted by Name:");
            printStudentTable(rs);

            // Same City 
            rs = stmt.executeQuery("SELECT * FROM Student WHERE city = 'Hyderabad'");
            System.out.println("\nStudents from Hyderabad:");
            printStudentTable(rs);
            
         // Add New Column
            stmt.executeUpdate("ALTER TABLE Student ADD email VARCHAR(50)");
            

            // Modify Column Datatype
            stmt.executeUpdate("ALTER TABLE Student MODIFY percentage FLOAT");

            // Rename Table
            stmt.executeUpdate("RENAME TABLE Student TO StudentInfo");

            //  Delete Column
            stmt.executeUpdate("ALTER TABLE StudentInfo DROP COLUMN email");

         // Delete Single Row
            stmt.executeUpdate("DELETE FROM StudentInfo WHERE rollno = 102");

            //  Delete All Records 
            //stmt.executeUpdate("TRUNCATE TABLE StudentInfo");
            //stmt.executeUpdate("DROP TABLE StudentInfo");
            /*stmt.executeUpdate("INSERT INTO StudentInfo (rollno, name, city, percentage) VALUES " +
            	    "(101, 'Anu', 'Hyderabad', 90.5)," +
            	    "(102, 'Mahe', 'Delhi', 92.3)," +
            	    "(103, 'Manu', 'Hyderabad', 84.2)");*/
            

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Institute (" +
                    "rollno INT PRIMARY KEY, " +
                    "college VARCHAR(50))");

            stmt.executeUpdate("INSERT  INTO Institute VALUES " +
                    "(101, 'JNTU'), (102, 'IIT'), (104, 'OU')");
         // Inner Join 
            System.out.println("\nInner Join :");
            rs = stmt.executeQuery("SELECT * FROM StudentInfo s INNER JOIN Institute i ON s.rollno = i.rollno");
            printJoinedTable(rs);

            // Left Join 
            System.out.println("\nLeft Join :");
            rs = stmt.executeQuery("SELECT * FROM StudentInfo s LEFT JOIN Institute i ON s.rollno = i.rollno");
            printJoinedTable(rs);

            // Right Join 
            System.out.println("\nRight Join :");
            rs = stmt.executeQuery("SELECT * FROM StudentInfo s RIGHT JOIN Institute i ON s.rollno = i.rollno");
            printJoinedTable(rs);

            // Full Join 
            System.out.println("\nFull Join :");
            rs = stmt.executeQuery(
                    "SELECT * FROM StudentInfo s LEFT JOIN Institute i ON s.rollno = i.rollno " +
                            "UNION " +
                            "SELECT * FROM StudentInfo s RIGHT JOIN Institute i ON s.rollno = i.rollno");
            printJoinedTable(rs);

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
	

	static void printStudentTable(ResultSet rs) throws SQLException {
	    System.out.println("ID\tName\t\tCity\t\tPercent");
	    System.out.println("-------------------------------------------------");
	    while (rs.next()) {
	        int rollno = rs.getInt("rollno");
	        String name = rs.getString("name");
	        String city = rs.getString("city");
	        double percentage = rs.getDouble("percentage");
	        System.out.println(rollno + "\t" + name + "\t\t" + city + "\t\t" + percentage);
	    }
	}

	static void printJoinedTable(ResultSet rs) throws SQLException {
	    System.out.println("ID\tName\t\tCity\t\tPercent\t\tCollege");
	    System.out.println("------------------------------------------------------------------");
	    while (rs.next()) {
	        int rollno = rs.getInt("rollno");
	        String name = rs.getString("name");
	        String city = rs.getString("city");
	        double percentage = rs.getDouble("percentage");
	        String college = rs.getString("college");
	        System.out.println(rollno + "\t" + name + "\t\t" + city + "\t\t" + percentage + "\t\t" + college);
	    }
	}

	

}
