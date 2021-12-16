package model.BO;

import java.sql.SQLException;

import model.BEAN.VacXin;
import model.DAO.CheckUpdateDAO;

public class CheckUpdateBO {
	private CheckUpdateBO() {
		
	}
	public static boolean update(VacXin x) throws SQLException {
		return CheckUpdateDAO.update(x);
	}
}
