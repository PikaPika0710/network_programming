package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.BEAN.VacXin;
import utils.DBConnection;

public class CheckUpdateDAO {

	public static boolean update(VacXin x) throws SQLException {
		boolean check = false;
		Connection con = DBConnection.getConnection();
		String query = "Update vacxin set TenVacXin = ?, SoMui= ?, MoTa = ?, GiaVacXin = ?, TenHangSX= ? where MaVacXin = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, x.getTenVacXin());
		ps.setInt(2, x.getSoMui());
		ps.setString(3, x.getMoTa());
		ps.setDouble(4, x.getGiaVacXin());
		ps.setString(5, x.getTenHangSX());
		ps.setString(6, x.getMaVacXin());
		check = ps.executeUpdate() > 0 ? true : false;
		return check;
	}

}
