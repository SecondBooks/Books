package entity;


public class Picture {
	
	private int picId;
	private String picAddress;
	
	public Picture(){}
	public Picture(String address){
	    picAddress = address;
	}
	
	public int getPicId() {
		return picId;
	}
	public void setPicId(int picId) {
		this.picId = picId;
	}
	public String getPicAddress() {
		return picAddress;
	}
	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}
	
	
}
