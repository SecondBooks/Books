package dao;


/**
 * 用户数据库dao接口
 * @author Gavin
 *
 */
public interface UserDAO {

	public boolean changePassword(String id, String newPassword);
	public boolean changeType(String id);
	
}
