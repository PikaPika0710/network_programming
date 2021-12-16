package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.BEAN.VacXin;
import model.DAO.VacXinDAO;

public class VacXinBO {
	private VacXinBO() {
		
	}
	public static List<VacXin> getAllVacXinBO() throws SQLException{
		return VacXinDAO.getAllVacXinDAO();
	}
	public static VacXin getVacXinbyID(String id) throws SQLException {
		
		return VacXinDAO.getVacXinbyID(id);
	}
}
