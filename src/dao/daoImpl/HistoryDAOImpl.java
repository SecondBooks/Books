package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.BookDAO;
import dao.HistoryDAO;
import entity.History;
import entity.Item;
import util.DBHelper;

public class HistoryDAOImpl implements HistoryDAO {

    @Override
    public boolean addToHistory(History history) {
        // TODO 自动生成的方法存根
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "insert into history (userid, bookid, date) values (?,?,?);";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, history.getAccount());
            pstmt.setInt(2, history.getBookId());
            pstmt.setString(3, history.getDate());
            pstmt.execute();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<History> getHistoryOfCustomer(String account) {
        // TODO 自动生成的方法存根
        ArrayList<History> historyList = new ArrayList<History>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "select * from history where userid = ?;";

            PreparedStatement pstmt;
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, account);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                History history = new History();
                history.setId(rs.getInt(1));
                history.setAccount(rs.getString(2));
                history.setBookId(rs.getInt(3));
                history.setDate(rs.getString(4));
                historyList.add(history);
            }
            
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return historyList;
    }

}
