package service;

public interface CustomerService {
	
	public boolean register(String account, String password);//����ע���ҵ���߼�
	public boolean login(String account, String password);//�����½��ҵ���߼�
    public boolean payment();//�û�֧��
    public boolean collectBooks();//�鼮�ղ�
    public boolean carOfItems();//���ﳵ
    public boolean comment();//����
    public boolean searchingBooks(String keyWord);//�ؼ�������
}
