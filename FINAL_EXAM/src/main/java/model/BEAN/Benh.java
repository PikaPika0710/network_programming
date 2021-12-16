package model.BEAN;

public class Benh {
	private String MaBenh;
	private String TenBenh;
	private String MoTa;

	public Benh() {
	}

	public Benh(String maBenh, String tenBenh, String moTa) {
		MaBenh = maBenh;
		TenBenh = tenBenh;
		MoTa = moTa;
	}

	public String getMaBenh() {
		return MaBenh;
	}

	public void setMaBenh(String maBenh) {
		MaBenh = maBenh;
	}

	public String getTenBenh() {
		return TenBenh;
	}

	public void setTenBenh(String tenBenh) {
		TenBenh = tenBenh;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	@Override
	public String toString() {
		return "Benh [MaBenh=" + MaBenh + ", TenBenh=" + TenBenh + ", MoTa=" + MoTa + "]";
	}
	
}
