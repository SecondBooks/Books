package service;

import entity.Customer;

public interface UserService {
	
	public boolean register(String account, String password);//����ע���ҵ���߼�
	public boolean register(Customer customer);
	public boolean login(String account, String password);//�����½��ҵ���߼�
    public boolean payment();//�û�֧��
    public boolean collectBooks();//�鼮�ղ�
    public boolean carOfItems();//���ﳵ
    public boolean comment();//����
    public boolean searchingBooks(String keyWord);//�ؼ�������
}
