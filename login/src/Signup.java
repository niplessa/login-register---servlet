
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// πάρε τις παραμετρους από την post (id, username, password)
		// String id = request.getParameter("id");
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		PrintWriter out1 = response.getWriter();
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			// Connection conn = null;
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/registeredusers", "root", "");
			//conn.setAutoCommit(true);
			
			Statement stmt = conn.createStatement();
			//out.print("Success!");
			//stmt.executeUpdate("INSERT INTO users() values('"+ uname +"','" +password +"')" );
	        stmt.executeUpdate("insert into users values('"+uname+"','"+pass+"')");
	        //out.print("You have created an account succesfully!!");
	        response.sendRedirect("Signup.jsp?username="+uname+"");
			
			
			
		} catch (Exception e) {
			
			out1.print("\r\nskata");

			e.printStackTrace();

		}

	}
}
