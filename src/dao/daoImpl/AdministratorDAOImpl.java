package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.AdministratorDAO;
import util.DBHelper;

public class AdministratorDAOImpl implements AdministratorDAO {

    @Override
    public boolean delUser(String account) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from users where account = '" + account + "';";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.executeUpdate();
  
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
