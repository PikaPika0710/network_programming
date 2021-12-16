package example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadPDFServlet")
public class ReadPDFServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadPDFServlet() {
		super();
	}

	static byte[] data = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/pdf");
		try {
			// Read file pdf
			// Cannot using BufferReader because pdf is binary text, so cannot be read
			String path = "D:/BACH KHOA/Nam III_Ki I/LT Mang - Pham Minh Tuan/LTM_all.pdf";
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
			System.out.println("Read file");
			if (data == null) {
				data = bis.readAllBytes();
			}
			// Send content of file
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			bos.write(data);
			System.out.println("Send file");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
