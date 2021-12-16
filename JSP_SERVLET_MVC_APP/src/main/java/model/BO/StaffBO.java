package model.BO;

import java.util.List;

import model.BEAN.Staff;
import model.DAO.StaffDAO;

public class StaffBO {
	public static List<Staff> getAllStaff() {
		return StaffDAO.getAllStaff();
	}

	
	public static List<Staff> getAllStaffOfDepartment(String option) {
		return StaffDAO.getAllStaffOfDepartment(option);
	}

	public static List<Staff> findAllStaff(String how, String value) {
		return StaffDAO.getAllStaff(how, value);
	}


	public static boolean insertStaff(Staff s) {
		return StaffDAO.insertStaff(s);	
	}


	public static boolean deleteStaff(String IDNV) {
		return StaffDAO.deleteStaff(IDNV);	
	}


	public static boolean deleteStaffs(String[] values) {
		return StaffDAO.deleteStaffs(values);	
	}
}
