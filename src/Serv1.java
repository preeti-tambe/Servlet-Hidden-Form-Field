

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class Serv1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name= request.getParameter("uname");
		out.print("<b> Welcome to servlet 1 : "+name);
		
		out.print("<br/><form action='serv2'>");
		out.print("<input type='hidden' name='uname' value="+name+">");
		out.print("<input type='submit' value='serv2'>");
		out.print("</form>");
		
	}

}
