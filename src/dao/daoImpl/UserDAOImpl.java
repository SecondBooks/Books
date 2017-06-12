package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import dao.UserDAO;
import util.DBHelper;

public class UserDAOImpl implements UserDAO{
    
    //DBHelper dbh = new DBHelper();
    
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

    @Override
    public boolean addAddress(String account, String address) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into address (account, address) values (?,?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            pstmt.setString(2, address);
            pstmt.execute();

            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<String> getAddress(String account) {
        // TODO 自动生成的方法存根
        ArrayList<String> address = new ArrayList<String>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select address from address where account=?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                address.add(rs.getString(1));
            }
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return address;
    }

    @Override
    public boolean delAddress(String account, String address) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from address where account=? and address=?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            pstmt.setString(2, address);
            pstmt.execute();

            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
