package dao;

import java.util.ArrayList;

import entity.Customer;

public interface CustomerDAO {

		public boolean register(Customer customer);
		public boolean changeInformation(Customer customer);
		public Customer getCustomer(String account);
		public ArrayList<Customer> getAllCustomer();
		
}
