
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		PrintWriter out1 = response.getWriter();
		PrintWriter out2 = response.getWriter();
		out.print("/r/ndoylevei mexri edw");
		out1.print(uname);
		out2.print(pass);
		


		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Connection conn = null;
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/registeredusers", "root", "");
			//conn.setAutoCommit(true);
			out.print("\r\nDatabase connection success!");
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("select * from users where username = '"+uname+"' and password = '"+pass+"' ");
			
			 if (res.next()) {
				 HttpSession session = request.getSession();
				 session.setAttribute("username", uname);
				 response.sendRedirect("Welcome.jsp?username="+uname+"");
				 }
			 else {
				 response.sendRedirect("Error.jsp"); }

			
		}
		 catch (Exception e) {
				
				out1.print("\r\nskata2");

				e.printStackTrace(); 
	
	
	
	}

}
}
