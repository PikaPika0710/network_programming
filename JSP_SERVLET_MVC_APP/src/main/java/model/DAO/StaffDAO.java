package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BEAN.Staff;

public class StaffDAO {
	public static List<Staff> getAllStaff() {
		List<Staff> staffs = new ArrayList<Staff>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from nhanvien";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				Staff staff = new Staff(rs.getString("IDNV"), rs.getString("Hoten"), rs.getString("IDPB"),
						rs.getString("Diachi"));
				staffs.add(staff);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return staffs;
	}

	public static List<Staff> getAllStaffOfDepartment(String option) {
		List<Staff> staffs = new ArrayList<Staff>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from nhanvien where IDPB='" + option + "'";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				Staff staff = new Staff(rs.getString("IDNV"), rs.getString("Hoten"), rs.getString("IDPB"),
						rs.getString("Diachi"));
				staffs.add(staff);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return staffs;
	}

	public static List<Staff> getAllStaff(String how, String value) {
		List<Staff> staffs = new ArrayList<Staff>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from nhanvien where " + how + " LIKE '%" + value + "%'";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				Staff staff = new Staff(rs.getString("IDNV"), rs.getString("Hoten"), rs.getString("IDPB"),
						rs.getString("Diachi"));
				staffs.add(staff);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return staffs;
	}

	public static boolean insertStaff(Staff staff) {
		boolean check = false;
		if (!getAllStaff("IDNV", staff.getId()).isEmpty()) {
			return check;
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/dulieu";
				Connection con = DriverManager.getConnection(url, "root", "");
				String query = "Insert into nhanvien values(?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, staff.getId());
				ps.setString(2, staff.getName());
				ps.setString(3, staff.getDepartmentID());
				ps.setString(4, staff.getAddress());
				check = ps.executeUpdate() > 0 ? true : false;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}

	public static boolean deleteStaff(String IDNV) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Delete from nhanvien where IDNV = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, IDNV);
			check = ps.executeUpdate() > 0 ? true : false;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return check;
	}

	public static boolean deleteStaffs(String[] values) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement ps = null;
			int count = 0;
			String query = "Delete from nhanvien where IDNV = ?";
			ps = con.prepareStatement(query);
			for (int i = 0; i < values.length; i++) {
				ps.setString(1, values[i]);
				count = count + ps.executeUpdate();
			}
			check = count > 0 ? true : false;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return check;
	}
}
