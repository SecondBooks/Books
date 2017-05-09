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
		 * ע����Ϣ��¼��(�򵥰汾�ģ�δ�ж��û����Ƿ��ء�������׳̶�)
		 * 
		 * �ɹ�:����true
		 * 
		 * ʧ��:����false
		 */
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
		if(customerDAO.register(customer)){
			return true;
		}else {
			return false;
		}
		
	
	}

}
