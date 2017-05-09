package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.PictureDAO;
import entity.Customer;
import entity.Picture;
import util.DBHelper;

public class PictureDAOImpl implements PictureDAO {
    
    DBHelper dbh = new DBHelper();
    
    @Override
    public Boolean addPic(int bookId, Picture picture) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into pictures (bookid, id, address) values (?,?,?)";
            PreparedStatement pstmt;

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            pstmt.setInt(2, picture.getPicId());
            pstmt.setString(3, picture.getPicAddress());
            
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Boolean delPic(int picId) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from pictures where id = '" + picId + "';";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.executeUpdate();
  

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return true;
    }

    @Override
    public Picture getPic(int picId) {
        // TODO 自动生成的方法存根
        Picture pic = new Picture();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select id, address from pictures where id = '" + picId + "';";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
  
            while (rs.next()) {
                pic.setPicId(rs.getInt(1));
                pic.setPicAddress(rs.getString(2));
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pic;
    }

    @Override
    public ArrayList<Picture> getPicOfBook(int bookId) {
        // TODO 自动生成的方法存根
        ArrayList<Picture> pics = new ArrayList<Picture>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select id, address from pictures;";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
  
            while (rs.next()) {
                Picture pic = new Picture();
                pic.setPicId(rs.getInt(1));
                pic.setPicAddress(rs.getString(2));
                pics.add(pic);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pics;
    }

}
