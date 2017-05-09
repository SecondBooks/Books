package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.BookDAO;
import dao.OrderDAO;
import entity.Item;
import entity.Order;
import util.DBHelper;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean makeOrder(Order order) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into orders (id, userid, totalprice, date) values (?,?,?,?);";
            
            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, order.getId());
            pstmt.setString(2, order.getUserId());
            pstmt.setFloat(3, order.getTotalPrice());
            pstmt.setString(4, order.getDate());
            pstmt.execute();
            
            for(Item item : order.getItems()){
                sql = "insert into items (orderid, userid, bookid, number, totalprice) values (?,?,?,?,?);";
                pstmt = (PreparedStatement) conn.prepareStatement(sql);
                pstmt.setString(1, order.getId());
                pstmt.setString(2, item.getAccount());
                pstmt.setInt(3, item.getBook().getId());
                pstmt.setInt(4, item.getNumber());
                pstmt.setFloat(5, item.getTotalPrice());
                pstmt.execute();
            }
        
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Order getOrder(String orderId) {
        // TODO 自动生成的方法存根
        Order order = new Order();
        BookDAO bookDAO = new BookDAOImpl();
        
        try {
            Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt;
            
            String sql = "select * from orders where id= ? ;";
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, orderId);
            ResultSet rs = pstmt.executeQuery();
  
            while (rs.next()) {
                order.setId(rs.getString(1));
                order.setUserId(rs.getString(2));
                order.setTotalPrice(rs.getFloat(3));
                order.setDate(rs.getString(4));
            }
            
            sql = "select * from items where orderid = ? ;";
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, orderId);
            rs = pstmt.executeQuery();
            
            ArrayList<Item> items = new ArrayList<Item>();
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt(1));
                item.setAccount(rs.getString(3));
                item.setBook(bookDAO.getBookInfomation(rs.getInt(4)));
                item.setNumber(rs.getInt(5));
                item.setTotalPrice(rs.getFloat(6));
                items.add(item);
            }
            
            order.setItems(items);
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return order;
    }

    @Override
    public ArrayList<Order> getOrderOfCustomer(String account) {
        // TODO 自动生成的方法存根
        ArrayList<Order> orders = new ArrayList<Order>();
        
        try {
            Connection conn = DBHelper.getConnection();
            PreparedStatement pstmt;
            
            String sql = "select id from orders where userid= ? ;";
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Order order = getOrder(rs.getString(1));
                orders.add(order);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return orders;
    }

}
