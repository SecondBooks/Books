package dao;

import java.util.ArrayList;

import entity.Book;
import entity.Order;

public interface BookDAO {
	
	public boolean addBook(Book book);
	public boolean changeInfomation(Book book);
	public boolean buyBooks(String id, Order order);
	public Book getBookInfomation(String id);
	public ArrayList<Book> searchBook(String name);
	public ArrayList<Book> getAllBooks();
	
}
