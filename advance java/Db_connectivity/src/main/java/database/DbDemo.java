package database;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class DbDemo
 */
public class DbDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter(); // CREATING OBJECT OF GET WRITER() "PW" FOR PRINTING
		
		Connection connection = null;  //CREATING OBJECT OF CONNECTION 
		
		ResultSet rs= null;  // holding result of sql query
		
		
		 String name =request.getParameter("name");  //getting data from user using element id 
	     String address =request.getParameter("add");
	     String city =request.getParameter("ct");
		
		
		
		 String jdbcUrl = "jdbc:mysql://localhost:3306/lorddatabase?";
	        String username = "root";
	        String password = "Mysql@12";

	        try {
	            // Load the MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            // Establish the connection
	             connection = DriverManager.getConnection(jdbcUrl, username, password);
	            
	              
	           
	            
	           
	        } 
	        
	        catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            pw.println("MySQL JDBC Driver not found.");
	        } 
	        
	        catch (SQLException e) {
	            e.printStackTrace();
	            pw.println("Connection failed.");
	        }
	        
	        
	        
	        try {
	            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO studentdetails (NAME , ADDRESS , CITY) values (?,?,?);");
	            preparedStatement.setString(1,name);
	            preparedStatement.setString(2,address);
	            preparedStatement.setString(3,city);
	            

	            if (preparedStatement.executeUpdate()==1)
	            {
	            	
	            	pw.println("<center><h1 style='color: blue; font-family: Arial, sans-serif; font-size: 36px; background-color: lightgray; padding: 10px; border-radius: 10px;'>Student List</h1></center>");

	                
	            }    
	            else
	                pw.println("Cannot insert record");


	        }
	        catch (SQLException e)
	        {
	            pw.println(e);
	        }
	        
	        // fetching data
	        try {
				PreparedStatement preparedStatement= connection.prepareStatement("Select * From Studentdetails");
				rs = preparedStatement.executeQuery();
				
				
				//printing data of database
				// Start HTML output
	            pw.println("<html><head>");
	            pw.println("<style>");
	            pw.println(".container { margin-top: 50px; width: 80%; margin-left: auto; margin-right: auto; }");
	            pw.println(".table { width: 100%; border-collapse: collapse; margin-top: 20px; border-color: black }");
	            pw.println(".table th, .table td { border: 1px solid #dddddd; text-align: left; padding: 8px;}");
	           
	            pw.println(".table tr:nth-child(even) { background-color: #f9f9f9; }");
	            pw.println(".header { display: flex; justify-content: space-between; align-items: center; }");
	            pw.println(".header h1 { margin: 0; }");
	            pw.println("</style>");
	            pw.println("</head><body style='background-image: url('https://img.freepik.com/free-photo/teacher-s-day-elements-composition_23-2149044935.jpg?w=1060&t=st=1721681473~exp=1721682073~hmac=321c3e6b63e33fb844c4aba5424c7386b185ac0eff867f31a97a9244178d78da')'>");
	            pw.println("<div class='container'>");
	            pw.println("<div class='header'>");
	            pw.println("</div>");
	            pw.println("<table class='table'>");
	            pw.println("<thead>");
	            pw.println("<tr>");
	            pw.println("<th>Roll No</th>");
	            pw.println("<th>Name</th>");
	            pw.println("<th>Address</th>");
	            pw.println("<th>City</th>");
	            pw.println("</tr>");
	            pw.println("</thead>");
	            pw.println("<tbody>");

				
				while (rs.next()) {
	                int roll_no = rs.getInt("roll_no");
	                String name1 = rs.getString("name");
	                String address1 = rs.getString("address");
	                String city1 = rs.getString("city");

	                pw.println("<tr>");
	                pw.println("<td>" + roll_no + "</td>");
	                pw.println("<td>" + name1 + "</td>");
	                pw.println("<td>" + address1 + "</td>");
	                pw.println("<td>" + city1 + "</td>");
	                pw.println("</tr>");
	                
	            }
				
				
				pw.println("</tbody>");
	            pw.println("</table>");
	            pw.println("</div>");
	            pw.println("</body></html>");

				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				pw.println("Cant Fetch Data");
			}
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
