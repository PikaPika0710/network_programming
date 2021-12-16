package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckInsertDAO {
	private CheckInsertDAO() {

	}

	public static boolean checkInsertDAO(String id, String pw, String name, String sex, String hobby)
			throws SQLException {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jsp_mvc";
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement s = con.createStatement();
			String query = "Select * from account where id = '" + id + "'";
			ResultSet rs = s.executeQuery(query);
			if (rs.next()) {
				check = false;
			} else {
				String query2 = "Insert into account values('" + id + "','" + pw + "','" + name + "','" + sex + "','"
						+ hobby + "')";
				s.execute(query2);
				check = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return check;
	}
}
