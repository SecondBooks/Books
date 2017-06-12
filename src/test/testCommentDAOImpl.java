package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.CommentDAO;
import dao.daoImpl.CommentDAOImpl;
import entity.Comment;

public class testCommentDAOImpl {
    
    CommentDAO cmDAO = new CommentDAOImpl();
    
    @Test
    public void testAddComment() {
        Comment cm = new Comment("748@gmail.com", 1, "什么辣鸡玩意");
        cmDAO.addComment(cm);
        cm = new Comment("2212@gmail.com", 1, "真鸡儿丢人");
        cmDAO.addComment(cm);
        cm = new Comment("748@gmail.com", 2, "劲爆大象部落");
        cmDAO.addComment(cm);
    }

    //@Test
    public void testGetCommentsOfBook() {
        fail("尚未实现");
    }

    //@Test
    public void testGetCommentOfCoustomer() {
        fail("尚未实现");
    }

}
