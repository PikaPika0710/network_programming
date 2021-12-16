package model.BO;

import model.Bean.Account;

public class LoginBO {

	public static Account checkLogin(String usr, String pwd) {
		return model.DAO.LoginDAO.checkLogin(usr, pwd);
	}

}
