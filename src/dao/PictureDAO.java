package dao;

import java.util.ArrayList;

import entity.Picture;

public interface PictureDAO {
    //向数据库添加图片
    public Boolean addPic(int bookId, Picture picture);
    //删除图片
    public Boolean delPic(int picId);
    //获得图片
    public Picture getPic(int picId);
    //获取指定书的图片
    public ArrayList<Picture> getPicOfBook(int bookId);
}
