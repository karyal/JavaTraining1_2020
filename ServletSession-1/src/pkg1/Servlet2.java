package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Display Session Details
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();
		
		//Print
		out.print("User : "+ session.getAttribute("user_name")+"<br/>");
		out.print("Password : "+ session.getAttribute("user_password")+"<br/>");
		
		out.print("ID : "+ session.getId()+"<br/>");
		out.print("Creation Time : "+ session.getCreationTime()+"<br/>");
		out.print("Last Access Time : "+ session.getLastAccessedTime()+"<br/>");
		out.print("Interval : "+ session.getMaxInactiveInterval()+"<br/>");
		
		out.close();
	}

}
