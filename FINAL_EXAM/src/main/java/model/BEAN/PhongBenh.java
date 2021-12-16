package model.BEAN;

public class PhongBenh {
	private String MaVacXin;
	private String MaBenh;
	private String GhiChu;

	public PhongBenh(String maVacXin, String maBenh, String ghiChu) {
		super();
		MaVacXin = maVacXin;
		MaBenh = maBenh;
		GhiChu = ghiChu;
	}

	public PhongBenh() {
		super();
	}

	public String getMaVacXin() {
		return MaVacXin;
	}

	public void setMaVacXin(String maVacXin) {
		MaVacXin = maVacXin;
	}

	public String getMaBenh() {
		return MaBenh;
	}

	public void setMaBenh(String maBenh) {
		MaBenh = maBenh;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}

}
