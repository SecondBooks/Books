package entity;

import java.util.ArrayList;

import util.DateHelper;
import util.OrderIdHelper;

public class Order {

    private String id;
    private String account;
    private ArrayList<Item> items;
    private float totalPrice;
    private String date;

    public Order() {

    }

    public Order(String account, ArrayList<Item> items) {
        setUserId(account);
        setItems(items);
        totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        date = DateHelper.getDate();
        id = OrderIdHelper.getOrderId(account, date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return account;
    }

    public void setUserId(String account) {
        this.account = account;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String toString(){
        String str = "";
        str = "Id: " + id + "\n" +
                  "Account: " + account + "\n" +
                "==============" + "\n";
        
        for(Item item : items){
            str += "        Book: " + item.getBook().getName() + "\n" +
                        "        Number: " + item.getNumber() + "\n" +
                        "        Total price: " + item.getTotalPrice() + "\n" +
                        "---------------------------------------" + "\n";
        }
        
        str +=  "==============" + "\n" + 
                     "Total price: " + totalPrice + "\n" +
                     "Date: " + date + "\n";
                  
        return str;
    }
}
