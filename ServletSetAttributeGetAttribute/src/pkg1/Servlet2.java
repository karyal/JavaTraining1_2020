package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		//Receive results
		int n1 = Integer.parseInt(request.getParameter("txt_n1"));
		int n2 = Integer.parseInt(request.getParameter("txt_n2"));
		int n3 = (int) request.getAttribute("txt_n3");
		
		//Print Output
		PrintWriter out = response.getWriter();
		out .println("First No : "+n1+"<br/>");
		out .println("Second No : "+n2+"<br/>");
		out .println("Result No : "+n3+"<br/>");
		
		out .println("<br/><br/><br/><br/><br/><br/>");
		out .println("<a href='index.jsp'>Index</a>");
	}

}

