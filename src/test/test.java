package test;

import java.util.ArrayList;

import dao.CustomerDAO;
import dao.UserDAO;
import dao.daoImpl.CustomerDAOImpl;
import dao.daoImpl.UserDAOImpl;
import entity.Customer;

public class test {

    static CustomerDAO customerDAO = new CustomerDAOImpl();
    static UserDAO userDAO = new UserDAOImpl();
    
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
//        testGetInfomation();
//        testChangeInfomation();
//        testGetInfomation();
//        testGetAllUser();
        testChangePassword();
    }

    private static void testRegister() {
        Customer customer = new Customer("asdfg", "123456");
        customerDAO.register(customer);
        customer = new Customer("eesaw", "123456");
        customerDAO.register(customer);
    }
    
    private static void testGetInfomation(String account){
         Customer customer = customerDAO.getCustomer(account);
         System.out.println(customer.toString());
         System.out.println("--------------------------------");
    }
    
    private static void testChangeInfomation(){
        Customer customer = customerDAO.getCustomer("asdfg");
        customer.setName("Tom");
        customer.setPhone("800-820-8820");
        customerDAO.changeInformation(customer);
    }
    
    private static void testGetAllUser(){
        ArrayList<Customer> customers = customerDAO.getAllCustomer();
        for(Customer customer : customers){
            System.out.println("Account:"+customer.getAccount()+"   Password:"+customer.getPassword());
        }
        System.out.println("--------------------------------");
    }
    
    private static void testChangePassword(){
        userDAO.changePassword("asdfg", "666666");
        testGetInfomation("asdfg");
    }
}
