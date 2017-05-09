package dao;

import java.util.ArrayList;

import entity.School;

public interface SchoolDAO {
    //����ѧУ
    public boolean addSchool(School school);
    //ɾ��ѧУ
    public boolean delSchool(int schoolId);
    //��ѯѧУ����
    public String getSchoolName(int schoolId);
    //��ȡ����ѧУ
    public ArrayList<School> getAllSchool();
}
