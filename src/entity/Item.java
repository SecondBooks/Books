package entity;

public class Item {
	
    private int id;
	private String account;
	private Book book;
	private int number;
	private float totalPrice;
	
	public Item(){
	    
	}
	
	public Item(String account, Book book, int number) {
	    setAccount(account);
	    setBook(book);
	    setNumber(number);
	    totalPrice = getNumber() * book.getPrice();
    }
	
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
}
