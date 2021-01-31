package bean;

public class PersonBean implements java.io.Serializable {

	private String name;
	private String add;
	private String tel;

	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
