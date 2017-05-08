package dao;

import java.util.ArrayList;

import entity.Book;
import entity.Order;

public interface BookDAO {
	//�����ݿ������
	public boolean addBook(Book book);
	//�����ݿ�ɾ����
	public boolean delBook(int bookId);
	//�޸ļ۸�
	public boolean changePrice(int bookId, float price);
	//��ȡ��Ŀ��
	public boolean getBookNumber(int bookId, int schoolId);
	//�޸������Ϣ
	public boolean changeInfomation(Book book);
	//������
	public boolean buyBooks(String id, Order order);
	//��ȡ�����Ϣ
	public Book getBookInfomation(String bookId);
	//�ؼ���������
	public ArrayList<Book> searchBook(String words);
	//��ȡ���е���
	public ArrayList<Book> getAllBooks();
	
}
