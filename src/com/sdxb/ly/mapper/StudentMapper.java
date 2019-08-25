package com.sdxb.ly.mapper;

import com.sdxb.ly.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentMapper")
public interface StudentMapper{
    @Select("select * from student")
    List<Student> selectStudent() throws Exception;
}
