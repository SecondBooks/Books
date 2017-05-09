package dao;

import java.util.ArrayList;

import entity.Comment;

public interface CommentDAO {
    //获取指定书的评论
    public ArrayList<Comment> getCommentsOfBook(String bookId);
    //获取制定用户的评论
    public ArrayList<Comment> getCommentOfCoustomer(String account);
}
