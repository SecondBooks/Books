package service.serviceImpl;

import dao.CustomerDAO;
import dao.daoImpl.CustomerDAOImpl;
import entity.Customer;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public boolean register(String account, String password) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(account, password);
		CustomerDAO customerDAOImpl = new CustomerDAOImpl();
		return customerDAOImpl.register(customer);
	}

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean collectBooks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carOfItems() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchingBooks(String keyWord) {
		// TODO Auto-generated method stub
		return false;
	}

}
