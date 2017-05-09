package entity;

import java.util.ArrayList;

/**
 * 
 * @author Gavin
 *
 */
public class Book {

    private int id;
    private String name;
    private String author;
    private String introduction;
    private float price;
    private ArrayList<Picture> pictures;
    
    public Book(){
        
    }
    
    public Book(String name, String author, String introduction, float price) {
       setName(name);
       setAuthor(author);
       setIntroduction(introduction);
       setPrice(price);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }
    
    public String toString(){
        return "Id: "+ id +"\nName: " + name + "\nAuthor: " + author + "\nIntroduction: " + introduction + "\nPrice: " + price + "\n-----------------------------------\n";
    }
}
