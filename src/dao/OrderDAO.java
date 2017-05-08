package dao;

import java.util.ArrayList;

import entity.Order;

public interface OrderDAO {
    //建立订单
    public boolean makeOrder(Order order);
    //按订单ID查询订单
    public Order getOrder(int orderId);
    //查询指定用户订单
    public ArrayList<Order> getOrderOfCustomer(String account);
}
