package dao;

import java.util.ArrayList;

/**
 * �û����ݿ�dao�ӿ�
 * @author Gavin
 *
 */
public interface UserDAO {
    //�û��޸�����
	public boolean changePassword(String account, String newPassword);
	//����ջ���ַ
	public boolean addAddress(String account, String address); 
	//��ȡ�ջ���ַ
	public ArrayList<String> getAddress(String account);
	//ɾ���ջ���ַ
	public boolean delAddress(String account, String address);
	
}
