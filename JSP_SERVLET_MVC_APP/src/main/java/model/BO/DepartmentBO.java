package model.BO;

import java.util.List;

import model.BEAN.Department;
import model.DAO.DepartmentDAO;

public class DepartmentBO {

	public static List<Department> getAllDepartment() {
		return DepartmentDAO.getAllDepartment();
	}

	public static Department getDepartmentByID(String IDPB) {
		return DepartmentDAO.getDepartmentByID(IDPB);
	}

	public static boolean updateDepartment(Department d) {
		return DepartmentDAO.updateDepartment(d);
	}

}
