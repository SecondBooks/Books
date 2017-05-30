package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.BookDAO;
import dao.PictureDAO;
import entity.Book;
import entity.Order;
import entity.Picture;
import util.DBHelper;
import util.DateHelper;

public class BookDAOImpl implements BookDAO {

    //DBHelper dbh = new DBHelper();

    @Override
    public boolean addBook(Book book) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into books (name, author, introduction, price) values (?,?,?,?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, book.getName());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getIntroduction());
            pstmt.setFloat(4, book.getPrice());
            pstmt.execute();

            if (book.getPictures() != null) {
                for (Picture pic : book.getPictures()) {
                    sql = "insert into pictures (bookid, id, address) values (?,?,?);";
                    pstmt = (PreparedStatement) conn.prepareStatement(sql);
                    pstmt.setInt(1, book.getId());
                    pstmt.setInt(2, pic.getPicId());
                    pstmt.setString(3, pic.getPicAddress());
                    pstmt.execute();
                }
            }

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delBook(int bookId) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from books where id = " + bookId + ";";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.executeUpdate();
  
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean changePrice(int bookId, float price) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update books set price=? where id=?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setFloat(1, price);
            pstmt.setInt(2, bookId);
            pstmt.executeUpdate();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public int getBookNumber(int bookId, int schoolId) {
        // TODO 自动生成的方法存根
        int num = -1;
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select number from warehouse where bookid = ? and schoolid = ?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            pstmt.setInt(2, schoolId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                num = rs.getInt(1);
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return num;
    }

    @Override
    public boolean changeInfomation(Book book) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update books set name = ?, author = ? ,introduction = ? where id = ?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, book.getName());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getIntroduction());
            pstmt.setInt(4, book.getId());
            pstmt.executeUpdate();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean buyBooks(int schoolId, int bookId, int number) {
        // TODO 自动生成的方法存根

        int num = getBookNumber(bookId, schoolId);
        num = num - number;
        if (num < 0) {
            return false;
        } else {
            try {
                Connection conn = DBHelper.getConnection();
                String sql = "update warehouse set number = ? where bookid = ? and schoolid = ?;";

                PreparedStatement pstmt;
                pstmt = (PreparedStatement) conn.prepareStatement(sql);
                pstmt.setInt(1, num);
                pstmt.setInt(2, bookId);
                pstmt.setInt(3, schoolId);
                pstmt.executeUpdate();

                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
    }

    @Override
    public Book getBookInfomation(int bookId) {
        // TODO 自动生成的方法存根
        PictureDAO pictureDAO = new PictureDAOImpl();
        Book book = new Book();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from books where id = ?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                book.setId(rs.getInt(1));
                book.setName(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setIntroduction(rs.getString(4));
                book.setPrice(rs.getFloat(5));
                ArrayList<Picture> pictures = new ArrayList<Picture>();
                pictures = pictureDAO.getPicOfBook(rs.getInt(1));
                if (pictures != null) {
                    book.setPictures(pictures);
                }
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return book;
    }

    @Override
    public ArrayList<Book> searchBook(String words) {
        // TODO 自动生成的方法存根
        ArrayList<Book> books = new ArrayList<Book>();
        PictureDAO pictureDAO = new PictureDAOImpl();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from books where ( name like '%"+words+"%' or author like '%"+words+"%' or introduction like '%"+words+"%');";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt(1));
                book.setName(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setIntroduction(rs.getString(4));
                book.setPrice(rs.getFloat(5));
                ArrayList<Picture> pictures = new ArrayList<Picture>();
                pictures = pictureDAO.getPicOfBook(rs.getInt(1));
                if(pictures!=null){
                    book.setPictures(pictures);
                    books.add(book);
                }
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return books;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        // TODO 自动生成的方法存根
        ArrayList<Book> books = new ArrayList<Book>();
        PictureDAO pictureDAO = new PictureDAOImpl();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from books;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt(1));
                book.setName(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setIntroduction(rs.getString(4));
                book.setPrice(rs.getFloat(5));
                ArrayList<Picture> pictures = new ArrayList<Picture>();
                pictures = pictureDAO.getPicOfBook(rs.getInt(1));
                if (pictures != null) {
                    book.setPictures(pictures);
                }
                books.add(book);
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return books;
    }

}
