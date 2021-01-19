package pkg1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		//Accept request from web form
		int n1 = Integer.parseInt(request.getParameter("txt_n1"));
		int n2 = Integer.parseInt(request.getParameter("txt_n2"));
		
		//Process
		int n3 = n1+n2;
		
		//SetAttribute
		request.setAttribute("txt_n3", n3);		
		
		/*
		PrintWriter out = response.getWriter();
		out .print("Result  :"+n3+"<br/>");
		
		out.flush();
		out.close();
		*/
		
		//Forward
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.forward(request, response);	
	}
}
