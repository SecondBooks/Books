package dao;

import java.util.ArrayList;

import entity.Item;

public interface ShoppingCartDAO {
    //加入购物车
    public boolean addToShoppingCart(Item item);
    //从购物车删除
    public boolean delFormShoppingCart(int itemId);
    //获得指定用户购物车内容
    public ArrayList<Item> getShoppingCartOfCustomer(String account);
}
