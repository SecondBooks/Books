package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.HistoryDAO;
import dao.daoImpl.HistoryDAOImpl;
import entity.History;

public class testHistoryDAOImpl {
    
    HistoryDAO historyDAO = new HistoryDAOImpl();
    
    //@Test
    public void testAddToHistory() {
        History history = new History("748@gmail.com", 1);
        historyDAO.addToHistory(history);
        history = new History("748@gmail.com", 2);
        historyDAO.addToHistory(history);
    }

    //@Test
    public void testGetHistoryOfCustomer() {
        ArrayList<History> historyList = historyDAO.getHistoryOfCustomer("748@gmail.com");
        for(History history : historyList){
            System.out.println(history.toString());
        }
    }

}
