package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.PictureDAO;
import dao.daoImpl.PictureDAOImpl;
import entity.Picture;

public class testPictureDAOImpl {
    
    PictureDAO pictureDAO = new PictureDAOImpl();
    
    //@Test
    public void testAddPic() {
//        Picture a = new Picture("11111");
//        Picture b = new Picture("22222");
//        Picture c = new Picture("33333");
//        
//        pictureDAO.addPic(1, a);
//        pictureDAO.addPic(1, b);
//        pictureDAO.addPic(2, c);
        
          Picture a = new Picture("42123");          
          pictureDAO.addPic(2, a);
    }

    //@Test
    public void testDelPic() {
        pictureDAO.delPic(3);
    }

    //@Test
    public void testGetPic() {
        System.out.println(pictureDAO.getPic(1).getPicAddress());
    }

    //@Test
    public void testGetPicOfBook() {
        for(Picture pic : pictureDAO.getPicOfBook(1)){
            System.out.println(pic.getPicAddress());
        }
    }

}
