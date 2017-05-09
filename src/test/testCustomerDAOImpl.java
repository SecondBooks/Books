package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.CustomerDAO;
import dao.daoImpl.CustomerDAOImpl;
import entity.Customer;

public class testCustomerDAOImpl {
    
    CustomerDAO customerDAO = new CustomerDAOImpl();
    
    @Test
    public void testRegister() {
        Customer customer = new Customer("","");
        customerDAO.register(customer);
    }

    @Test
    public void testChangeInformation() {
        Customer customer = customerDAO.getCustomer("asdfg");
        customer.setEmail("123@qq.com");
        customerDAO.changeInformation(customer);
    }

    @Test
    public void testGetCustomer() {
        customerDAO.getCustomer("2222");
    }

    @Test
    public void testGetAllCustomer() {
        customerDAO.getAllCustomer();
    }

}
