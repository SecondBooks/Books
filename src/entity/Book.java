package entity;

import java.util.ArrayList;

/**
 * 
 * @author Gavin
 *
 */
public class Book {
	
	private String id;
	private String name;
	private String price;
	private ArrayList<Picture> pictures;
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public ArrayList<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(ArrayList<Picture> pictures) {
		this.pictures = pictures;
	}

	
}
