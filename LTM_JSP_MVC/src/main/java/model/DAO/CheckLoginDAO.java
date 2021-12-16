package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BEAN.Account;

public class CheckLoginDAO {
	private CheckLoginDAO() {

	}

	public static Account checkLogin(String id, String pw) throws SQLException {
		Account a = null;
		// Connect to database
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jsp_mvc";
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement s = con.createStatement();
			String query = "Select * from account where id = '" + id + "' and pass = '" + pw + "'";
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				String id1 = rs.getString("id");
				String pw1 = rs.getString("pass");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String hobby = rs.getString("hobby");
				a = new Account(id1, pw1, name, sex, hobby);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a;
//		 Hard
//		List<Account> l = new ArrayList<>();
//		Account a1 = new Account();
//		a1.setId("tcviet");
//		a1.setPass("123456");
//		a1.setName("Tran Cong Viet");
//		a1.setSex("Nam");
//		a1.setHobby("Da Bong, Bida");
//		l.add(a1);
//
//		Account a2 = new Account();
//		a2.setId("ptnguyen");
//		a2.setPass("123456");
//		a2.setName("Pham Thanh Nguyen");
//		a2.setSex("Nam");
//		a2.setHobby("Da Bong, Bida");
//		l.add(a2);
//
//		Account a3 = new Account();
//		a3.setId("hhthien");
//		a3.setPass("123456");
//		a3.setName("Ho Hoang Thien");
//		a3.setSex("Nam");
//		a3.setHobby("Da Bong, Bida");
//		l.add(a3);
//
//		Account a4 = new Account();
//		a4.setId("dgbao");
//		a4.setPass("123456");
//		a4.setName("Dinh Gia Bao");
//		a4.setSex("Nu");
//		a4.setHobby("Di choi, Coding");
//		l.add(a4);
//
//		for (Account a : l) {
//			if (a.getId().equals(id) && a.getPass().equals(pw)) {
//				return a;
//			}
//		}
//		return null;		
	}
}
