package dao;

import entity.Item;

public interface ShoppingCartDAO {
    //加入购物车
    public boolean addToShoppingCart(Item item);
    //从购物车删除
    public boolean delFormShoppingCart(int itemId);
}
