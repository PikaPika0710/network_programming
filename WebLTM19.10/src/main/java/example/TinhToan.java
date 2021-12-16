package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TinhToan")
public class TinhToan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TinhToan() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Enumeration<String> names = request.getParameterNames();
//		while(names.hasMoreElements()) {
//			System.out.println(names.nextElement());
//		}
		Double A=null,B=null;
		PrintWriter out = response.getWriter();
		try {
			A = Double.parseDouble(request.getParameter("A"));
			B = Double.parseDouble(request.getParameter("B"));
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Ket qua</h1>");
			out.println(A + " + " + B + " = " + (A + B));
			out.println("<br><br>");
			out.println("<a href = \"JavaScript: history.back()\">Back</a>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception ex) {
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Error Format! Please input the right format!</h1>");
			out.println("</body>");
			out.println("</html>");		
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
