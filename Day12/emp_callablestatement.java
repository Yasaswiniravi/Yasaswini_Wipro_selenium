package Jdbc_connectivity;
/*import java.sql.*;

public class emp_callablestatement{
	public static void main(String[] args) {
		
	
	String url = "jdbc:mysql://localhost:3306/mydb";
    String user = "root";
    String password = "Anu@123";
 
    try (Connection con = DriverManager.getConnection(url, user, password)) {
        
        CallableStatement cst1 = con.prepareCall("{CALL update_emp1()}");
        CallableStatement cst2 = con.prepareCall("{CALL count_emp()}");
        CallableStatement cst3 = con.prepareCall("{CALL salary_stat()}");

       
        //cst.setInt(1,87);                
       //cst.setString(2, "Neeva sharma");
        cst1.execute();
        System.out.println("Bonus added successfully.\n");

        
//        ResultSet rs = cst1.executeQuery();
// 
//        System.out.println("ID\tName\t\t\tsalary");
//        System.out.println("------------------------------------");
// 
//        while (rs.next()) {
//            int emp_id = rs.getInt("emp_id");
//            String emp_name = rs.getString("emp_name");
//            int salary = rs.getInt("salary");
// 
//            System.out.printf("%d\t%-20s\t%d\n", emp_id, emp_name,salary);
//        }
        
        ResultSet rs1 = cst2.executeQuery();
        System.out.println("ID\tName\t\t\tsalary");
        System.out.println("------------------------------------");
 
        while (rs1.next()) {
        	System.out.println(rs1.getString("emp_name") + " - " + rs1.getInt("count") + " times");
//            String emp_name = rs2.getString("emp_name");
//            int count = rs2.getInt("count");
//            System.out.printf("%d\t%-20s\t%d\n", emp_name,count);
        }
        ResultSet rs2 = cst3.executeQuery();
        if (rs2.next()) {
            System.out.println("\nHighest Salary: " + rs2.getDouble("highest_salary"));
            System.out.println("Lowest Salary: " + rs2.getDouble("lowest_salary"));
        }

//        System.out.println("ID\tName\t\t\tsalary");
//        System.out.println("------------------------------------");
// 
//        while (rs3.next()) {
//        	int highest = rs3.getInt("highest_salary");
//            int lowest = rs3.getInt("lowest_salary");
//            System.out.printf("%d\t%-20s\t%d\n", highest,lowest);
//        }
        
 
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
 */

import java.sql.*;

public class emp_callablestatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hospital_db";
        String user = "root";
        String pass = "Anu@123";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {

            // 1. Add Bonus
            CallableStatement cs1 = con.prepareCall("{update_emp2()}");
            cs1.execute();
            System.out.println("Bonus added successfully.\n");

            // 2. Print Employees with Duplicate Names
            CallableStatement cs2 = con.prepareCall("{count_emp1()}");
            ResultSet rs1 = cs2.executeQuery();
            System.out.println("Employees with same names:");
            while (rs1.next()) {
                System.out.println(rs1.getString("emp_name") + " - " + rs1.getInt("count") + " times");
            }

            // 3. Highest and Lowest Salary
            CallableStatement cs3 = con.prepareCall("{salary_stat()}");
            ResultSet rs2 = cs3.executeQuery();
            if (rs2.next()) {
                System.out.println("\nHighest Salary: " + rs2.getDouble("highest_salary"));
                System.out.println("Lowest Salary: " + rs2.getDouble("lowest_salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



