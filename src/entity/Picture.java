package entity;


public class Picture {
	
	private String picId;
	private String picAddress;
	
	public Picture(String picId, String picAddress) {
		super();
		this.picId = picId;
		this.picAddress = picAddress;
	}
	
	public String getPicId() {
		return picId;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	public String getPicAddress() {
		return picAddress;
	}
	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}
	
	
}
