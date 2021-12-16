package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BEAN.VacXin;
import utils.DBConnection;

public class VacXinDAO {

	public static List<VacXin> getAllVacXinDAO() throws SQLException {
		List<VacXin> vacxin = new ArrayList<VacXin>();
		Connection con = DBConnection.getConnection();
		String query = "Select * from vacxin";
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		while (rs.next()) {
			String MaVacXin = rs.getString("MaVacXin");
			String TenVacXin = rs.getString("TenVacXin");
			int SoMui = Integer.parseInt(rs.getString("SoMui"));
			String MoTa = rs.getString("MoTa");
			Double GiaVacXin = Double.parseDouble(rs.getString("GiaVacXin"));
			String TenHangSX = rs.getString("TenHangSX");
			VacXin v = new VacXin(MaVacXin, TenVacXin, SoMui, MoTa, GiaVacXin, TenHangSX);
			vacxin.add(v);
		}
		return vacxin;

	}

	public static VacXin getVacXinbyID(String id) throws SQLException {
		Connection con = DBConnection.getConnection();
		String query = "Select * from vacxin where MaVacXin = '" + id + "'";
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		VacXin v = new VacXin();
		if (rs.next()) {
			String MaVacXin = rs.getString("MaVacXin");
			String TenVacXin = rs.getString("TenVacXin");
			int SoMui = Integer.parseInt(rs.getString("SoMui"));
			String MoTa = rs.getString("MoTa");
			Double GiaVacXin = Double.parseDouble(rs.getString("GiaVacXin"));
			String TenHangSX = rs.getString("TenHangSX");
			v = new VacXin(MaVacXin, TenVacXin, SoMui, MoTa, GiaVacXin, TenHangSX);
			
		}
		return v;
	}

}
