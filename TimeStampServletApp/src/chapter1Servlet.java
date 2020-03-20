import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Chapter1Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter pw = response.getWriter();
		java.util.Date today = new java.util.Date();
		pw.println("<html> " + "<body>" + "<h2 align=center> chapter 1 servlet </h2>" + "<br>"+ today + "</body>"+ "</html>");
	}
}