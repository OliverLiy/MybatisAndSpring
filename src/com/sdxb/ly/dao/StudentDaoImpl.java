package com.sdxb.ly.dao;

import com.sdxb.ly.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao{
    @Override
    public List<Student> selectstudent() throws Exception {
        SqlSession session=this.getSqlSession();
        List<Student> student=session.selectList("selectstudent");
        return student;
    }
}
