package test;

import dao.CustomerDAO;
import dao.daoImpl.CustomerDAOImpl;
import entity.Customer;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//Customer customer = new Customer("asdfg", "123456");
		CustomerDAO customerDAO = new CustomerDAOImpl();
		//Boolean result = customerDAO.register(customer);
		//System.out.println("result " + result);
		Customer customer = customerDAO.getCustomer("asdfg");
		System.out.println("account:"+customer.getAccount()+"\npassword:"+customer.getPassword());
	}

}
