package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.BookDAO;
import dao.ShoppingCartDAO;
import entity.Item;
import entity.Picture;
import util.DBHelper;

public class ShoppingCartDAOImpl implements ShoppingCartDAO {

    @Override
    public boolean addToShoppingCart(Item item) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into items (orderid, userid, bookid, number, totalprice) values (0,?,?,?,?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, item.getAccount());
            pstmt.setInt(2, item.getBook().getId());
            pstmt.setInt(3, item.getNumber());
            pstmt.setFloat(4, item.getTotalPrice());
            pstmt.execute();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delFormShoppingCart(int itemId) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from items where id = ?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, itemId);
            pstmt.execute();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Item> getShoppingCartOfCustomer(String account) {
        // TODO 自动生成的方法存根
        BookDAO bookDAO = new BookDAOImpl();
        ArrayList<Item> items = new ArrayList<Item>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select id, userid, bookid, number, totalprice from items where userid = ? and orderid = 0;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt(1));
                item.setAccount(rs.getString(2));
                item.setBook(bookDAO.getBookInfomation(rs.getInt(3)));
                item.setNumber(rs.getInt(4));
                item.setTotalPrice(rs.getFloat(5));
                items.add(item);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return items;
    }

}
