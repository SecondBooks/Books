package entity;

public class Customer extends User{
	
	private String name;
	private String phone;
	private String email;
	private School school;
	
	public Customer(String account, String password) {
		super();
		this.setAccount(account);
		this.setPassword(password);
		this.setType("customer");
		this.name = "empty";
		this.phone = "empty";
		this.email = "empty";
		this.school = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
	
}
