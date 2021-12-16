package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.Account;
import utils.DBConnection;

public class LoginDAO {

	public static Account checkLogin(String usr, String pwd) {
		Account ac = null;
		try {
			Connection con = DBConnection.getConnection();
			String query = "Select * from account where username = '" + usr + "' and password = '" + pwd + "'";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.next()) {
				ac = new Account(rs.getString("username"), rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ac;
	}

}
