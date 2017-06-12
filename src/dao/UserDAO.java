package dao;

import java.util.ArrayList;

/**
 * 用户数据库dao接口
 * @author Gavin
 *
 */
public interface UserDAO {
    //用户修改密码
	public boolean changePassword(String account, String newPassword);
	//添加收货地址
	public boolean addAddress(String account, String address); 
	//获取收货地址
	public ArrayList<String> getAddress(String account);
	//删除收货地址
	public boolean delAddress(String account, String address);
	
}
