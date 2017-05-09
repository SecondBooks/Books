package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.CustomerDAO;
import entity.Customer;
import util.DBHelper;

public class CustomerDAOImpl implements CustomerDAO {

    DBHelper dbh = new DBHelper();

    @Override
    public boolean register(Customer customer) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into users (account, password, type, name, phone, email, school) values (?,?,?,?,?,?,?)";
            PreparedStatement pstmt;

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, customer.getAccount());
            pstmt.setString(2, customer.getPassword());
            pstmt.setString(3, customer.getType());
            pstmt.setString(4, customer.getName());
            pstmt.setString(5, customer.getPhone());
            pstmt.setString(6, customer.getEmail());
            pstmt.setString(7, customer.getSchool());
            System.out.println("insert "+ pstmt.executeUpdate() + "line");

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean changeInformation(Customer customer) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into customers (account, password, type, name, phone, email, school) values (?,?,?,?,?,?,?)";
            PreparedStatement pstmt;

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, customer.getAccount());
            pstmt.setString(2, customer.getPassword());
            pstmt.setString(3, customer.getType());
            pstmt.setString(4, customer.getName());
            pstmt.setString(5, customer.getPhone());
            pstmt.setString(6, customer.getEmail());
            pstmt.setString(7, customer.getSchool());
            System.out.println("insert "+ pstmt.executeUpdate() + "line");

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Customer getCustomer(String account) {
        // TODO 自动生成的方法存根
        Customer customer = new Customer();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select account, password, type, name, phone, email, school from customers where account = '" + account + "';";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
  
            while (rs.next()) {
                customer.setAccount(rs.getString(1));
                customer.setPassword(rs.getString(2));
                customer.setType(rs.getString(3));
                customer.setName(rs.getString(4));
                customer.setPhone(rs.getString(5));
                customer.setEmail(rs.getString(6));
                customer.setSchool(rs.getString(7));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return customer;
    }

    @Override
    public ArrayList<Customer> getAllCustomer() {
        // TODO 自动生成的方法存根
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select account, password, type, name, phone, email, school from customers;";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
  
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setAccount(rs.getString(1));
                customer.setPassword(rs.getString(2));
                customer.setType(rs.getString(3));
                customer.setName(rs.getString(4));
                customer.setPhone(rs.getString(5));
                customer.setEmail(rs.getString(6));
                customer.setSchool(rs.getString(7));
                customers.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return customers;
    }

}
