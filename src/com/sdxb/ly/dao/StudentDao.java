package com.sdxb.ly.dao;

import com.sdxb.ly.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectstudent() throws Exception;
}
