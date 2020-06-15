package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.Statement;
/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/test")
public class Servlet2 extends HttpServlet {
	
	int rank;
	String name;
	String org;
	
	private Connection getConnection() throws ClassNotFoundException, SQLException,IOException  {
		String str = "jdbc:mysql://localhost:3306/sys";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(str, "root", "nkanwar1");
		String createDB = "CREATE TABLE IF NOT EXISTS sys.heroRegistration (rank1 INT PRIMARY KEY, name VARCHAR(20), org VARCHAR(20))";
		PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(createDB);
		ps.executeUpdate();
		return conn;		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection c = getConnection();
			PreparedStatement ps = c.prepareStatement("SELECT * FROM heroRegistration");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				PrintWriter pw = response.getWriter();
				pw.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getString(3));
				System.out.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getString(3));
				
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = response.getWriter();
		pw.println("Done");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rank = Integer.parseInt(request.getParameter("r"));
		name = request.getParameter("fn");
		org = request.getParameter("pn");
		try {
			Connection c = getConnection();
			PreparedStatement ps = c.prepareStatement("INSERT INTO heroRegistration VALUES (?,?,?)");
			ps.setInt(1, rank);
			ps.setString(2, name);
			ps.setString(3, org);
			ps.executeUpdate();
			System.out.println("Entering Data");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet(request, response);
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter pw = response.getWriter(); 
		pw.write("Hello");
		rank = Integer.parseInt(request.getParameter("r"));
		try {
			Connection c = getConnection();
			PreparedStatement ps = c.prepareStatement("DELETE FROM heroRegistration WHERE rank1 LIKE "+ rank);
			ps.executeUpdate();
			System.out.println("Deleting Data");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}

	}



}
