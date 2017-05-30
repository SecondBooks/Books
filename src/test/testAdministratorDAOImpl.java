package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.AdministratorDAO;
import dao.daoImpl.AdministratorDAOImpl;

public class testAdministratorDAOImpl {
    
    AdministratorDAO aDAO = new AdministratorDAOImpl();
    @Test
    public void testDelUser() {
        aDAO.delUser("zzasw");
    }

}
