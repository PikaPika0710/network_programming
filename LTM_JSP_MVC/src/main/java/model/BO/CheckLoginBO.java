package model.BO;

import java.sql.SQLException;

import model.BEAN.Account;
import model.DAO.CheckLoginDAO;

public class CheckLoginBO {
	private CheckLoginBO() {
		
	}

	public static Account checkLogin(String id, String pw) throws SQLException {
		return CheckLoginDAO.checkLogin(id, pw);
	}
}
