package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/trung_tam_y_te";
			con = DriverManager.getConnection(url, "root", "");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private DBConnection() {
		
	}

	public static Connection getConnection() {
		return con;
	}
}
