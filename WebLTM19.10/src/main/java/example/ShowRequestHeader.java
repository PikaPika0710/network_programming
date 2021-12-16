package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowRequestHeaderServlet")
public class ShowRequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowRequestHeader() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Servlet Example: Showing Request Headers";
		String docType = "<!DOCTYPE HTML>\n";
		out.println(docType + "<HTML>\n" 
				+ "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"#FDF5E6\">\n"  
				+ "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" 
				+ "<B>Request Method: </B>" + request.getMethod() + "<BR>" 
				+ "<B>Request URI: </B>"+ request.getRequestURI() + "<BR>" 
				+ "<B>Request Protocol: </B>" + request.getProtocol() + "<BR><BR>" 
				+ "<TABLE BORDER=1 ALIGN=\"CENTER\">" 
				+ "<TR BGCOLOR=\"#FFAD00\">"
				+ "<TH>Header Name<TH>Header Value");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
