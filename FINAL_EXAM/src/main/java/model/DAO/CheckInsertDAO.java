package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.BEAN.VacXin;
import utils.DBConnection;

public class CheckInsertDAO {

	public static boolean insertVacXin(VacXin v) throws SQLException {
		Connection con = DBConnection.getConnection();
		Statement s;
		s = con.createStatement();
		String queryInsert = "Insert into vacxin(MaVacXin, TenVacXin, SoMui, MoTa, GiaVacXin, TenHangSX) " + "values('"
				+ v.getMaVacXin() + "','" + v.getTenVacXin() + "','" + v.getSoMui() + "','" + v.getMoTa() + "','"
				+ v.getGiaVacXin() + "','" + v.getTenHangSX() + "')";
		int row = s.executeUpdate(queryInsert);
		return row > 0;
	}

}
