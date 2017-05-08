package entity;

public class Customer extends User{
	
	private String name;
	private String phone;
	private String email;
	private String school;
	
	public Customer() {
        super();
    }
	
    public Customer(String account, String password) {
		super();
		this.setAccount(account);
		this.setPassword(password);
		this.setType("customer");
		this.name = "empty";
		this.phone = "empty";
		this.email = "empty";
		this.school = "empty";
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String toString(){
        return "Account:"+this.getAccount()+"\n"+
                    "Password:"+this.getPassword()+"\n"+
                    "Name:"+this.name+"\n"+
                    "Phone:"+this.phone+"\n"+
                    "Email:"+this.email+"\n"+
                    "School:"+this.school;
	}
	
}
