package dao;

import java.util.ArrayList;

import entity.Comment;

public interface CommentDAO {
    
    public ArrayList<Comment> getCommentsOfBook(String bookId);
    public ArrayList<Comment> getCommentOfCoustomer(String userId);
}
