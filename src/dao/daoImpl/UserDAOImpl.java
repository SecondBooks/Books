package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.UserDAO;
import util.DBHelper;

public class UserDAOImpl implements UserDAO{
    
    DBHelper dbh = new DBHelper();
    
    @Override
    public boolean changePassword(String account, String newPassword) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "update users set password='"+newPassword+ "' where account='"+account+"';";
          
            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.executeUpdate();
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
