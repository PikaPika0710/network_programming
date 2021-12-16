package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BEAN.Department;
import model.BEAN.Staff;

public class DepartmentDAO {
	public static List<Department> getAllDepartment() {
		List<Department> departments = new ArrayList<Department>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from phongban";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				Department department = new Department(rs.getString("IDPB"), rs.getString("Tenpb"),
						rs.getString("Mota"));
				departments.add(department);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return departments;
	}

	public static Department getDepartmentByID(String IDPB) {
		Department d = new Department();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Select * from phongban where IDPB = '" + IDPB + "'";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				d = new Department(rs.getString("IDPB"), rs.getString("Tenpb"), rs.getString("Mota"));

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

	public static boolean updateDepartment(Department d) {
		boolean check = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dulieu";
			Connection con = DriverManager.getConnection(url, "root", "");
			String query = "Update phongban set Tenpb = ?, Mota= ? where IDPB = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, d.getName());
			ps.setString(2, d.getDescription());
			ps.setString(3, d.getId());
			check = ps.executeUpdate() > 0 ? true : false;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
}
