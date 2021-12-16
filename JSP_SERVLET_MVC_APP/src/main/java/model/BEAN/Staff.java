package model.BEAN;

public class Staff {
	private String id;
	private String name;
	private String departmentID;
	private String address;

	public Staff() {
	}

	public Staff(String id, String name, String departmentID, String address) {
		this.id = id;
		this.name = name;
		this.departmentID = departmentID;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
