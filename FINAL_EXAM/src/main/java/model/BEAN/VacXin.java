package model.BEAN;

public class VacXin {
	private String MaVacXin;
	private String TenVacXin;
	private int SoMui;
	private String MoTa;
	private double GiaVacXin;
	private String TenHangSX;

	public VacXin(String maVacXin, String tenVacXin, int soMui, String moTa, double giaVacXin, String tenHangSX) {
		MaVacXin = maVacXin;
		TenVacXin = tenVacXin;
		SoMui = soMui;
		MoTa = moTa;
		GiaVacXin = giaVacXin;
		TenHangSX = tenHangSX;
	}

	public VacXin() {
	}

	public String getMaVacXin() {
		return MaVacXin;
	}

	public void setMaVacXin(String maVacXin) {
		MaVacXin = maVacXin;
	}

	public String getTenVacXin() {
		return TenVacXin;
	}

	public void setTenVacXin(String tenVacXin) {
		TenVacXin = tenVacXin;
	}

	public int getSoMui() {
		return SoMui;
	}

	public void setSoMui(int soMui) {
		SoMui = soMui;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	public double getGiaVacXin() {
		return GiaVacXin;
	}

	public void setGiaVacXin(double giaVacXin) {
		GiaVacXin = giaVacXin;
	}

	public String getTenHangSX() {
		return TenHangSX;
	}

	public void setTenHangSX(String tenHangSX) {
		TenHangSX = tenHangSX;
	}

}
