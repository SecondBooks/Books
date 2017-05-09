package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.BookDAO;
import dao.daoImpl.BookDAOImpl;
import entity.Book;

public class testBookDAOImpl {

    BookDAO bookDAO = new BookDAOImpl();
    
    //@Test
    public void testAddBook() {
        String name = "C++:�����ŵ�����";
        String author = "��үү";
        String introduction = "����������������������������������������������������";
        Book book = new Book(name, author, introduction, 998);
        bookDAO.addBook(book);
    }

   @Test
    public void testDelBook() {
        fail("��δʵ��");
    }

    //@Test
    public void testChangePrice() {
       bookDAO.changePrice(1, 66);
    }

    //@Test
    public void testGetBookNumber() {
       int num = bookDAO.getBookNumber(1, 1);
       System.out.println(num);
    }

    //@Test
    public void testChangeInfomation() {
        Book book = bookDAO.getBookInfomation(1);
        book.setAuthor("������");
        bookDAO.changeInfomation(book);
        book = bookDAO.getBookInfomation(1);
        System.out.println(book.toString());
    }

    //@Test
    public void testBuyBooks() {
        int num = bookDAO.getBookNumber(1, 1);
        System.out.println("Number: "+num);
        bookDAO.buyBooks(1, 1, 4);
        num = bookDAO.getBookNumber(1, 1);
        System.out.println("Number after buying: "+num);
    }

    //@Test
    public void testGetBookInfomation() {
        Book book = bookDAO.getBookInfomation(1);
        System.out.println(book.toString());
    }

   //@Test
    public void testSearchBook() {
        ArrayList<Book> books = new ArrayList<Book>();
        books = bookDAO.searchBook("��");
        for(Book book : books){
            System.out.println(book.toString());
        }
        System.out.println("========================");
        books = bookDAO.searchBook("J");
        for(Book book : books){
            System.out.println(book.toString());
        }
    }

    //@Test
    public void testGetAllBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books = bookDAO.getAllBooks();
        for(Book book : books){
            System.out.println(book.toString());
        }
    }

}
