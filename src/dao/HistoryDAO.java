package dao;

import java.util.ArrayList;

import entity.History;

public interface HistoryDAO {
    //д�������ʷ
    public boolean addToHistory(History history);
    //��ѯָ���û������ʷ
    public ArrayList<History> getHistoryOfCustomer(String account);
}
