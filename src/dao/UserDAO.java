package dao;


/**
 * �û����ݿ�dao�ӿ�
 * @author Gavin
 *
 */
public interface UserDAO {

	public boolean changePassword(String id, String newPassword);
	public boolean changeType(String id);
	
}
