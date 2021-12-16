package model.BEAN;

public class Account {
	private String id;
	private String pass;
	private String name;
	private String sex;
	private String hobby;

	public Account() {
	}

	public Account(String id, String pass, String name, String sex, String hobby) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.sex = sex;
		this.hobby = hobby;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pass=" + pass + ", name=" + name + ", sex=" + sex + ", hobby=" + hobby + "]";
	}
	
}
