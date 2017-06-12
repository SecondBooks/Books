package entity;

import util.DateHelper;

public class History {

    private int id;
    private String account;
    private int bookId;
    private String date;

    public History() {
        super();
    }

    public History(String account, int bookId) {
        this.account = account;
        this.bookId = bookId;
        date = DateHelper.getDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String toString(){
        String str = "Id: " + id + "   Account: " + account + "   Book id: " + bookId + "\n" +
                             "Date: " + date;
        return str;
    }
}
