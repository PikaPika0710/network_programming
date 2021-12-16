package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UCLNBCNN")
public class UCLNBCNN extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UCLNBCNN() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Xu li nghiep vu :v
		PrintWriter out = response.getWriter();

		BigInteger A, B;
		try {
			A = new BigInteger(request.getParameter("A"));
			B = new BigInteger(request.getParameter("B"));
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Ket qua</h1>");
			out.println("UCLN: " + UCLN(A, B));
			out.println("BCNN: " + BCNN(A, B));
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Cannot parse into number. Please input the right format!</h1>");
			out.println("</body>");
			out.println("</html>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected BigInteger BCNN(BigInteger A, BigInteger B) {
		return A.multiply(B).divide(UCLN(A, B));
	}

	protected BigInteger UCLN(BigInteger A, BigInteger B) {
		if (A.compareTo(B) == 0) {
			return A;
		} else if (A.compareTo(B) == 1) {
			return UCLN(A.subtract(B), B);	
		} else {
			return UCLN(A, B.subtract(A));
		}
	}
}
