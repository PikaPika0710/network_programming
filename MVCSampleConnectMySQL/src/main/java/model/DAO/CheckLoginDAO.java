package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.BEAN.Wife;

public class CheckLoginDAO {
	private CheckLoginDAO() {

	}

	public static boolean isValid(String usr, String pw) {
		boolean check = true;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			String user = "root";
			String pass = "";
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			String sql = "Select * from admin where username ='" + usr + "' and password ='" + pw + "'";
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				check = true;
			} else {
				check = false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

	public static ArrayList<Wife> getWifeList(String username) {
		ArrayList<Wife> wifeArray = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			String user = "root";
			String pass = "";
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement st = conn.createStatement();
			String sql = "Select * from wife";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("address");
				boolean alive = rs.getString("alive").equals("1") ? true : false;
				Wife w = new Wife(name, address, alive);
				wifeArray.add(w);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return wifeArray;
	}
}
