package dao;

import entity.Item;

public interface ShoppingCartDAO {
    //���빺�ﳵ
    public boolean addToShoppingCart(Item item);
    //�ӹ��ﳵɾ��
    public boolean delFormShoppingCart(int itemId);
}
