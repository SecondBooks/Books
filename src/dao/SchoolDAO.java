package dao;

import java.util.ArrayList;

import entity.School;

public interface SchoolDAO {
    //增加学校
    public boolean addSchool(School school);
    //删除学校
    public boolean delSchool(int schoolId);
    //查询学校名称
    public String getSchoolName(int schoolId);
    //获取所有学校
    public ArrayList<School> getAllSchool();
}
