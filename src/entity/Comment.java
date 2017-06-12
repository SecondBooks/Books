package entity;

import util.DateHelper;

public class Comment {

    private int id;
    private String account;
    private int bookId;
    private String content;
    private String date;

    public Comment() {

    }

    public Comment(String account, int bookId, String content) {
        super();
        this.account = account;
        this.bookId = bookId;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String toString(){
        String str = "Account: " + account + "      Book Id: " + bookId + "\n" + 
                             "Content: " + content + "\n" +
                             "Date: " + date + "\n";
        return str;
    }
}
