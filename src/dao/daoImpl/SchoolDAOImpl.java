package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.PictureDAO;
import dao.SchoolDAO;
import entity.Book;
import entity.Picture;
import entity.School;
import util.DBHelper;

public class SchoolDAOImpl implements SchoolDAO {

    @Override
    public boolean addSchool(School school) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into schools (school) values (?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, school.getSchoolName());
            pstmt.execute();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delSchool(int schoolId) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "delete from schools where id = " + schoolId + ";";
            PreparedStatement pstmt;
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.executeUpdate();
  

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String getSchoolName(int schoolId) {
        // TODO 自动生成的方法存根
        School school = new School();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from schools where id = "+ schoolId +";";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                school.setSchoolId(rs.getInt(1));
                school.setSchoolName(rs.getString(2));
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return school.getSchoolName();
    }

    @Override
    public ArrayList<School> getAllSchool() {
        // TODO 自动生成的方法存根        
        ArrayList<School> schools = new ArrayList<School>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from schools;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                School school = new School();
                school.setSchoolId(rs.getInt(1));
                school.setSchoolName(rs.getString(2));
                schools.add(school);
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return schools;
    }

}
