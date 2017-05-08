package dao;

import java.util.ArrayList;

import entity.Customer;

public interface CustomerDAO {
        //�û�ע��
		public boolean register(Customer customer);
		//�û���Ϣ�޸�
		public boolean changeInformation(Customer customer);
		//��ȡ�û�
		public Customer getCustomer(String account);
		//��ȡ�����û�
		public ArrayList<Customer> getAllCustomer();
		
}
