package dao;

import java.util.ArrayList;

import entity.Order;

public interface OrderDAO {
    //��������
    public boolean makeOrder(Order order);
    //������ID��ѯ����
    public Order getOrder(String orderId);
    //��ѯָ���û�����
    public ArrayList<Order> getOrderOfCustomer(String account);
}
