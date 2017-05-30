package dao;

import java.util.ArrayList;

import entity.History;

public interface HistoryDAO {
    //写入浏览历史
    public boolean addToHistory(History history);
    //查询指定用户浏览历史
    public ArrayList<History> getHistoryOfCustomer(String account);
}
