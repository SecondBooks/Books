package dao;

import java.util.ArrayList;

import entity.Comment;

public interface CommentDAO {
    //д����
    public boolean addComment(Comment comment);
    //��ȡָ���������
    public ArrayList<Comment> getCommentsOfBook(int bookId);
    //��ȡ�ƶ��û�������
    public ArrayList<Comment> getCommentOfCoustomer(String account);
}
