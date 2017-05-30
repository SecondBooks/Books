package dao;

import java.util.ArrayList;

import entity.Item;

public interface ShoppingCartDAO {
    //���빺�ﳵ
    public boolean addToShoppingCart(Item item);
    //�ӹ��ﳵɾ��
    public boolean delFormShoppingCart(int itemId);
    //���ָ���û����ﳵ����
    public ArrayList<Item> getShoppingCartOfCustomer(String account);
}
