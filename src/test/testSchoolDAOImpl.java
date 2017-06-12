package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.SchoolDAO;
import dao.daoImpl.SchoolDAOImpl;
import entity.School;

public class testSchoolDAOImpl {
    
    SchoolDAO schoolDAO = new SchoolDAOImpl();
    
    //@Test
    public void testAddSchool() {
        School a = new School("������ͨ��ѧ");
        School b = new School("�Ϻ���ͨ��ѧ");
        School c = new School("������ͨ��ѧ");
        School d = new School("����ͨ��ѧ");
        
        schoolDAO.addSchool(a);
        schoolDAO.addSchool(b);
        schoolDAO.addSchool(c);
        schoolDAO.addSchool(d);
    }

    //@Test
    public void testDelSchool() {
        schoolDAO.delSchool(4);
    }

    //@Test
    public void testGetSchoolName() {
        System.out.println(schoolDAO.getSchoolName(1));
    }

    //@Test
    public void testGetAllSchool() {
        for(School school : schoolDAO.getAllSchool()){
            String str = "Id: " + school.getSchoolId() + "  Name: " + school.getSchoolName();
            System.out.println(str);
        }
    }

}
