package dao;


/**
 * �û����ݿ�dao�ӿ�
 * @author Gavin
 *
 */
public interface UserDAO {
    //�û��޸�����
	public boolean changePassword(String account, String newPassword);
	
}
