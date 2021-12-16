package model.BEAN;

import java.sql.Date;

public class LichSuTiemPhong {
	private String MaKH;
	private String MaVacXin;
	private int STTMui;
	private Date NgayTiemPhong;
	private Date NgayHenTiepTheo;

	public LichSuTiemPhong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LichSuTiemPhong(String maKH, String maVacXin, int sTTMui, Date ngayTiemPhong, Date ngayHenTiepTheo) {
		MaKH = maKH;
		MaVacXin = maVacXin;
		STTMui = sTTMui;
		NgayTiemPhong = ngayTiemPhong;
		NgayHenTiepTheo = ngayHenTiepTheo;
	}

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getMaVacXin() {
		return MaVacXin;
	}

	public void setMaVacXin(String maVacXin) {
		MaVacXin = maVacXin;
	}

	public int getSTTMui() {
		return STTMui;
	}

	public void setSTTMui(int sTTMui) {
		STTMui = sTTMui;
	}

	public Date getNgayTiemPhong() {
		return NgayTiemPhong;
	}

	public void setNgayTiemPhong(Date ngayTiemPhong) {
		NgayTiemPhong = ngayTiemPhong;
	}

	public Date getNgayHenTiepTheo() {
		return NgayHenTiepTheo;
	}

	public void setNgayHenTiepTheo(Date ngayHenTiepTheo) {
		NgayHenTiepTheo = ngayHenTiepTheo;
	}

}
