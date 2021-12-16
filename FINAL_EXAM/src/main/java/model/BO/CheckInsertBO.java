package model.BO;

import java.sql.SQLException;

import model.BEAN.VacXin;
import model.DAO.CheckInsertDAO;

public class CheckInsertBO {
	private CheckInsertBO() {
		
	}
	public static boolean insertVacXin(VacXin v) throws SQLException {
		return CheckInsertDAO.insertVacXin(v);
	}

}
