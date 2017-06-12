package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.UserDAO;
import dao.daoImpl.UserDAOImpl;

public class testUserDAOImpl {

    UserDAO userDAO = new UserDAOImpl();
    
    //@Test
    public void testChangePassword() {
       userDAO.changePassword("asda", "10086");
    }

    //@Test
    public void testAddAddress() {
        userDAO.addAddress("zxc123", "asdewqwe");
        userDAO.addAddress("qwe123", "ssssqqwes");
    }

    //@Test
    public void testGetAddress() {
        for(String str : userDAO.getAddress("asd123")){
            System.out.println("asd123's address :" + str);
        }
    }
    
    //@Test
    public void testDelAddress(){
        for(String str : userDAO.getAddress("asd123")){
            System.out.println("asd123's address :" + str);
        }
        userDAO.delAddress("asd123", "222222222");
        System.out.println("========================");
        for(String str : userDAO.getAddress("asd123")){
            System.out.println("asd123's address :" + str);
        }
    }

}
