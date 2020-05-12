/*Write a program to perform below:
1) Establish a connection to database.
2) Use Statement, Prepared Statement, Callable Statement and ResultSet.
* */

import java.sql.*;
import java.util.Scanner;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String st =  "jdbc:mysql://localhost:3306/sys";
        //Establishing a connection with the Database com.mysql.jdbc.Driver is depricated
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(st, "root", "nkanwar1");
        String s1 = "CREATE TABLE if not exists emp (emp_id int PRIMARY KEY, emp_name VARCHAR(24), emp_salary float)";

        Statement statement = connection.createStatement();
        statement.execute(s1);

        //Prepared Statement
        String s2 = "insert into emp values (?,?,?)";
        PreparedStatement ps = connection.prepareStatement(s2);
        ps.setInt(1, 1);
        ps.setString(2, "Naman Kanwar");
        ps.setFloat(3, 950000);
        ps.executeUpdate();

       //Callable Statement
        /*
       Stored Procedure
        CREATE DEFINER=`root`@`localhost` PROCEDURE `add_emp`(in emp_id int, in emp_name varchar(20), in emp_salary float)
        BEGIN
	insert into emp values(emp_id, emp_name, emp_salary);
END
        * */
        Scanner sc = new Scanner(System.in);
        CallableStatement cs = connection.prepareCall("call add_emp(?,?,?)");

        System.out.println("Enter Employee name: ");
        String empl_name = sc.nextLine();
        System.out.println("Enter salary: ");
        double sal = sc.nextDouble();
        cs.setInt(1, 3);
        cs.setString(2, empl_name);
        cs.setDouble(3, sal);
        cs.executeUpdate();

        //ResultSet
        String s3 = "Select * from emp";
        PreparedStatement preparedStatement = connection.prepareStatement(s3);

        ResultSet result = preparedStatement.executeQuery();

        while (result.next()){
            System.out.println(result.getInt(1)+" "+result.getString(2)+ " " + result.getDouble(3));
        }

    }
    
}
