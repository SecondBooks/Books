package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.CommentDAO;
import entity.Comment;
import entity.Item;
import util.DBHelper;

public class CommentDAOImpl implements CommentDAO {

    @Override
    public boolean addComment(Comment comment) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into comments (userid, bookid, content, date) values (?,?,?,?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, comment.getAccount());
            pstmt.setInt(2, comment.getBookId());
            pstmt.setString(3, comment.getContent());
            pstmt.setString(4, comment.getDate());
            pstmt.execute();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Comment> getCommentsOfBook(int bookId) {
        // TODO 自动生成的方法存根
        ArrayList<Comment> comments = new ArrayList<Comment>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from comments where bookid = ? ;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Comment comment = new Comment();
                comment.setId(rs.getInt(1));
                comment.setAccount(rs.getString(2));
                comment.setBookId(rs.getInt(3));
                comment.setContent(rs.getString(4));
                comment.setDate(rs.getString(5));
                comments.add(comment);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return comments;
    }

    @Override
    public ArrayList<Comment> getCommentOfCoustomer(String account) {
        // TODO 自动生成的方法存根
        ArrayList<Comment> comments = new ArrayList<Comment>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from comments where userid = ? ;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Comment comment = new Comment();
                comment.setId(rs.getInt(1));
                comment.setAccount(rs.getString(2));
                comment.setBookId(rs.getInt(3));
                comment.setContent(rs.getString(4));
                comment.setDate(rs.getString(5));
                comments.add(comment);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return comments;
    }

}
