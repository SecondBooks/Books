package dao;


/**
 * 用户数据库dao接口
 * @author Gavin
 *
 */
public interface UserDAO {
    //用户修改密码
	public boolean changePassword(String account, String newPassword);
	
}
