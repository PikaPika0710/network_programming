package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BEAN.Account;
import model.BEAN.Department;
import model.BEAN.Staff;

public class CheckLoginDAO {

	public static Account checkLogin(String usr, String pw) {
		Account ac = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from admin where username = '" + usr + "' and password = '" + pw + "'";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				ac = new Account(rs.getString("username"), rs.getString("password"),
						Integer.parseInt(rs.getString("idrole")));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return ac;
	}

}
