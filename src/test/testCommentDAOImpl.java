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
        Comment cm = new Comment("748@gmail.com", 1, "ʲô��������");
        cmDAO.addComment(cm);
        cm = new Comment("2212@gmail.com", 1, "�漦������");
        cmDAO.addComment(cm);
        cm = new Comment("748@gmail.com", 2, "����������");
        cmDAO.addComment(cm);
    }

    //@Test
    public void testGetCommentsOfBook() {
        fail("��δʵ��");
    }

    //@Test
    public void testGetCommentOfCoustomer() {
        fail("��δʵ��");
    }

}
