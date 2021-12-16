package model.BO;

import java.sql.SQLException;

import model.DAO.CheckInsertDAO;

public class CheckInsertBO {
	private CheckInsertBO() {
		
	}
	public static boolean checkInsertBO(String id, String pw, String name, String sex, String hobby) throws SQLException{
		return CheckInsertDAO.checkInsertDAO(id, pw, name, sex, hobby);
	}

}
