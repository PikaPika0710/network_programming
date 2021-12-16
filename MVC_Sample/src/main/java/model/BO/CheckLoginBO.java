package model.BO;

import java.util.ArrayList;

import model.BEAN.Wife;
import model.DAO.CheckLoginDAO;

public class CheckLoginBO {
	private CheckLoginBO() {

	}

	public static boolean isValid(String usr, String pw) {
		return CheckLoginDAO.isValid(usr, pw);
	}

	public static ArrayList<Wife> getWifeList(String username) {
		return CheckLoginDAO.getWifeList(username);
	}
}
