//Write program to upload a file(to DB) and download file(from DB) using JDBC.
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class jdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String st =  "jdbc:mysql://localhost:3306/sys";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(st, "root", "nkanwar1");

        //Create file
        File newFile = new File("text.txt");
        System.out.println(newFile.createNewFile());

        //Write a file
        FileWriter writer = new FileWriter("text.txt");
        writer.write("4 Kushagra 80000");
        writer.close();

        //Creating a query and reading file
        File nFile = new File ("C:\\Users\\nkanwar1\\IdeaProjects\\Gd\\text.txt");

        Scanner sc = new Scanner(nFile);
        while(sc.hasNextLine()){
            PreparedStatement ps = connection.prepareStatement("insert into emp values (?,?,?)");
            ps.setInt(1, Integer.parseInt(sc.next()));
            ps.setString(2, sc.next());
            ps.setFloat(3, Float.parseFloat(sc.next()));
            ps.executeUpdate();
        }
        sc.close();

        //Download data from database
        PreparedStatement statement = connection.prepareStatement("Select * from emp");
        ResultSet rs = statement.executeQuery();
        File f = new File("result.txt");
        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\nkanwar1\\IdeaProjects\\Gd\\result.txt"));
        while(rs.next()){
            for(int i = 1; i< 4; i++){
                fw.write(rs.getString(i)+" ");
            }
            fw.write("\n");

        }
        fw.close();
    }
}
