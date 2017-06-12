package entity;

public class School {
	
	private int schoolId;
	private String schoolName;
	
	public School(){}
	
	public School(String name){
	    schoolName = name;
	}
	
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
