package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dao.CustomerDAO;
import dao.daoImpl.CustomerDAOImpl;
import entity.Customer;

public class CustomerDAOTest {
private CustomerDAO customerDAO= new CustomerDAOImpl();
	
	@Before
	public void setUp() throws Exception {
    
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegister() {
		Customer customer = new Customer();
		customer.setName("李俊东");
		customer.setSchool("北京交通大学");
		customer.setAccount("james123");
		customer.setPassword("123123");
		assertEquals(true, customerDAO.register(customer));
		//customerDAO.register(customer);
		//fail("Not yet implemented");
	}

	@Test
	public void testChangeInformation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllCustomer() {
		fail("Not yet implemented");
	}

}
