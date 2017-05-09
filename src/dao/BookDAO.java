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
	public int getBookNumber(int bookId, int schoolId);
	//�޸������Ϣ
	public boolean changeInfomation(Book book);
	//������ʱ����Ŀ����в���
	public boolean buyBooks(int schoolId, int bookId, int number);
	//��ȡ�����Ϣ
	public Book getBookInfomation(int bookId);
	//�ؼ��������飨�������������ߣ����ܣ�
	public ArrayList<Book> searchBook(String words);
	//��ȡ���е���
	public ArrayList<Book> getAllBooks();
	
}
