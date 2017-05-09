package dao;

import java.util.ArrayList;

import entity.Picture;

public interface PictureDAO {
    //�����ݿ����ͼƬ
    public Boolean addPic(int bookId, Picture picture);
    //ɾ��ͼƬ
    public Boolean delPic(int picId);
    //���ͼƬ
    public Picture getPic(int picId);
    //��ȡָ�����ͼƬ
    public ArrayList<Picture> getPicOfBook(int bookId);
}
