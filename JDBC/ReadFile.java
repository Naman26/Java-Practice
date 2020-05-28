package jdbc2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;


public class ReadFile {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		System.out.println("hello");
		
		//Establish Driver and connection with the local database 

		String str = "jdbc:mysql://localhost:3306/sys";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(str, "root", "nkanwar1");
		System.out.println("Connection Established!");
	
		// Creating a Database
		String createDB = "CREATE TABLE IF NOT EXISTS fileUpload (fileName VARCHAR(20) PRIMARY KEY, text LONGTEXT)";
		PreparedStatement ps = connection.prepareStatement(createDB);
		ps.executeUpdate();
		System.out.println("Database created");
		
		//uploading files
		String insert = "INSERT INTO fileUpload values (?,?)";
		ps = connection.prepareStatement(insert);
		
		FileReader reader = new FileReader("C:\\Users\\nkanwar1\\Documents\\GitHub\\Java-Practice\\JDBC\\Sample1.txt");
		ps.setString(1, "English");
		ps.setCharacterStream(2, reader);
		ps.executeUpdate();
		System.out.println("English inserted");
		
		reader = new FileReader("C:\\Users\\nkanwar1\\Documents\\GitHub\\Java-Practice\\JDBC\\Sample2.txt");
		ps.setString(1, "Hindi");
		ps.setCharacterStream(2, reader);
		ps.executeUpdate();
		System.out.println("Hindi inserted");
		
		reader = new FileReader("C:\\Users\\nkanwar1\\Documents\\GitHub\\Java-Practice\\JDBC\\Sample3.txt");
		ps.setString(1, "Indonesian");
		ps.setCharacterStream(2, reader);
		ps.executeUpdate();
		System.out.println("Indonesian inserted");
			
		//Downloading the files
		String stmt = "SELECT text FROM fileUpload";
		PreparedStatement st = connection.prepareStatement(stmt);
		
		ResultSet result = st.executeQuery();
		FileWriter fw = new FileWriter("C:\\Users\\nkanwar1\\Documents\\GitHub\\Java-Practice\\JDBC\\output.txt");
		
		while(result.next()) {
			fw.append(result.getString(1));
			fw.append('\n');
			
		}
		fw.close();
		
	}
}
