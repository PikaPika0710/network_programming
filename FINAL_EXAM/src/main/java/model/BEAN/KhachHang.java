package model.BEAN;

import java.sql.Date;

public class KhachHang {
	private String MaKH;
	private String HoTenKH;
	private String SoDienThoai;
	private String DiaChiKH;
	private Date NgaySinh;
	private String GioiTinh;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKH, String hoTenKH, String soDienThoai, String diaChiKH, Date ngaySinh, String gioiTinh) {
		super();
		MaKH = maKH;
		HoTenKH = hoTenKH;
		SoDienThoai = soDienThoai;
		DiaChiKH = diaChiKH;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
	}

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getHoTenKH() {
		return HoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		HoTenKH = hoTenKH;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getDiaChiKH() {
		return DiaChiKH;
	}

	public void setDiaChiKH(String diaChiKH) {
		DiaChiKH = diaChiKH;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

}
