package dao;

import java.util.ArrayList;

import entity.Comment;

public interface CommentDAO {
    //��ȡָ���������
    public ArrayList<Comment> getCommentsOfBook(String bookId);
    //��ȡ�ƶ��û�������
    public ArrayList<Comment> getCommentOfCoustomer(String account);
}
