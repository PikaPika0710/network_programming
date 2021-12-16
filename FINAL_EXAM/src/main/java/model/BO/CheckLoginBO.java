package model.BO;

import model.BEAN.Account;
import model.DAO.CheckLoginDAO;

public class CheckLoginBO {

	public static Account checkLogin(String usr, String pw) {
		return CheckLoginDAO.checkLogin(usr, pw);
	}

}
