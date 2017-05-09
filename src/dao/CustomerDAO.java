package dao;

import java.util.ArrayList;

import entity.Customer;

public interface CustomerDAO {
        //用户注册
		public boolean register(Customer customer);
		//用户信息修改
		public boolean changeInformation(Customer customer);
		//获取用户
		public Customer getCustomer(String account);
		//获取所有用户
		public ArrayList<Customer> getAllCustomer();
		
}
