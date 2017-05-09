package service.serviceImpl;

import dao.CustomerDAO;
import dao.daoImpl.CustomerDAOImpl;
import entity.Customer;
import service.UserService;

/**
 * 
 * @author Gavin
 *
 */
public class UserServiceImpl implements UserService {

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


	
	
	@Override
	public boolean register(Customer customer) {
		// TODO Auto-generated method stub
 
		
		/*
		 * 注册信息的录入(简单版本的，未判断用户名是否重、密码简易程度)
		 * 
		 * 成功:返回true
		 * 
		 * 失败:返回false
		 */
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
		if(customerDAO.register(customer)){
			return true;
		}else {
			return false;
		}
		
	
	}

}
