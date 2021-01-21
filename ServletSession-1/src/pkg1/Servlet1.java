package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// Process		
		//Received Login info
		String user = request.getParameter("txt_id");
		String password = request.getParameter("txt_pw");		
		RequestDispatcher rd;		
		
		if((user.equals("admin")) && (password.equals("admin@123"))){			
			
			HttpSession session = request.getSession();
			session.setAttribute("user_name", user);
			session.setAttribute("user_password", password);
			
			rd = request.getRequestDispatcher("servlet2");
			rd .forward(request, response); //Forward to Servlet2
		}
		else {
			out.println("Error: Login Name or Password!");
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response); //Forward to Servlet2
		}		
	}
}
