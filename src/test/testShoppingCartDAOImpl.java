package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.BookDAO;
import dao.ShoppingCartDAO;
import dao.daoImpl.BookDAOImpl;
import dao.daoImpl.ShoppingCartDAOImpl;
import entity.Item;

public class testShoppingCartDAOImpl {
    
    ShoppingCartDAO scDAO = new ShoppingCartDAOImpl();
    BookDAO bookDAO = new BookDAOImpl();
    
    //@Test
    public void testAddToShoppingCart() {
        Item item = new Item("438@gmail.com", bookDAO.getBookInfomation(1) , 10);
        scDAO.addToShoppingCart(item);
        item = new Item("438@gmail.com", bookDAO.getBookInfomation(2) , 23);
        scDAO.addToShoppingCart(item);
    }

   //@Test
    public void testDelFormShoppingCart() {
        scDAO.delFormShoppingCart(7);
        scDAO.delFormShoppingCart(8);
        
        ArrayList<Item> items = new ArrayList<Item>();
        items = scDAO.getShoppingCartOfCustomer("438@gmail.com");
        for(Item item : items){
            System.out.println(item.toString());
        }
    }
    
    //@Test
    public void testGetShoppingCartOfCustomer(){
        ArrayList<Item> items = new ArrayList<Item>();
        items = scDAO.getShoppingCartOfCustomer("438@gmail.com");
        for(Item item : items){
            System.out.println(item.toString());
        }
    }

}
