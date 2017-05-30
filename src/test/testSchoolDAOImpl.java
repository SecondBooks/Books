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
        School a = new School("北京交通大学");
        School b = new School("上海交通大学");
        School c = new School("西安交通大学");
        School d = new School("新竹交通大学");
        
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
