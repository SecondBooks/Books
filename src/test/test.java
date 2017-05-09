package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dao.BookDAO;
import dao.CustomerDAO;
import dao.UserDAO;
import dao.daoImpl.BookDAOImpl;
import dao.daoImpl.CustomerDAOImpl;
import dao.daoImpl.UserDAOImpl;
import entity.Book;
import entity.Customer;
import entity.Order;
import util.DBHelper;
import util.DateHelper;
import util.OrderIdHelper;

public class test {

    static CustomerDAO customerDAO = new CustomerDAOImpl();
    static UserDAO userDAO = new UserDAOImpl();

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        // testGetInfomation();
        // testChangeInfomation();
        // testGetInfomation();
        // testGetAllUser();
        // testChangePassword();
       //Book book
//        Book book = new Book();
//        System.out.println(book==null);
        System.out.println(OrderIdHelper.getOrderId("aaasd", DateHelper.getDate()));
    }

    private static void testRegister() {
        Customer customer = new Customer("asdfg", "123456");
        customerDAO.register(customer);
        customer = new Customer("eesaw", "123456");
        customerDAO.register(customer);
    }

    private static void testGetInfomation(String account) {
        Customer customer = customerDAO.getCustomer(account);
        System.out.println(customer.toString());
        System.out.println("--------------------------------");
    }

    private static void testChangeInfomation() {
        Customer customer = customerDAO.getCustomer("asdfg");
        customer.setName("Tom");
        customer.setPhone("800-820-8820");
        customerDAO.changeInformation(customer);
    }

    private static void testGetAllUser() {
        ArrayList<Customer> customers = customerDAO.getAllCustomer();
        for (Customer customer : customers) {
            System.out.println("Account:" + customer.getAccount() + "   Password:" + customer.getPassword());
        }
        System.out.println("--------------------------------");
    }

    private static void testChangePassword() {
        userDAO.changePassword("asdfg", "666666");
        testGetInfomation("asdfg");
    }
}
