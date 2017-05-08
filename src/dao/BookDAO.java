package dao;

import java.util.ArrayList;

import entity.Book;
import entity.Order;

public interface BookDAO {
	//向数据库添加书
	public boolean addBook(Book book);
	//从数据库删除书
	public boolean delBook(int bookId);
	//修改价格
	public boolean changePrice(int bookId, float price);
	//获取书的库存
	public boolean getBookNumber(int bookId, int schoolId);
	//修改书的信息
	public boolean changeInfomation(Book book);
	//购买书
	public boolean buyBooks(String id, Order order);
	//获取书的信息
	public Book getBookInfomation(String bookId);
	//关键字搜索书
	public ArrayList<Book> searchBook(String words);
	//获取所有的书
	public ArrayList<Book> getAllBooks();
	
}
