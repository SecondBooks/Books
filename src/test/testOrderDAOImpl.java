package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.BookDAO;
import dao.OrderDAO;
import dao.daoImpl.BookDAOImpl;
import dao.daoImpl.OrderDAOImpl;
import entity.Book;
import entity.Item;
import entity.Order;

public class testOrderDAOImpl {
    
    BookDAO bookDAO = new BookDAOImpl();
    OrderDAO orderDAO = new OrderDAOImpl();
    
    //@Test
    public void testMakeOrder() {
        Book book_1 = bookDAO.getBookInfomation(1);
        Book book_2 = bookDAO.getBookInfomation(2);
        
        ArrayList<Item> items = new ArrayList<Item>();
        Item item_1 = new Item("333@qq.com", book_1, 1);
        Item item_2 = new Item("333@qq.com", book_2, 2);
        items.add(item_1);
        items.add(item_2);
        
        Order order = new Order("333@qq.com", items);
        
        orderDAO.makeOrder(order);
        
        items = new ArrayList<Item>();
        item_1 = new Item("333@qq.com", book_1, 3);
        item_2 = new Item("333@qq.com", book_2, 5);
        items.add(item_1);
        items.add(item_2);
        
        order = new Order("333@qq.com", items);
        
        orderDAO.makeOrder(order);
        
    }

    //@Test
    public void testGetOrder() {
        String orderId = "333@qq.com@2017-05-09 22:03:10@28161";
        System.out.println(orderDAO.getOrder(orderId));
    }

    @Test
    public void testGetOrderOfCustomer() {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders = orderDAO.getOrderOfCustomer("333@qq.com");
        
        for(Order order : orders){
            System.out.println(order.toString());
            System.out.println("");
        }
    }

}
