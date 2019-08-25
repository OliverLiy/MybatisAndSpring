package com.sdxb.ly.test;

import com.sdxb.ly.dao.StudentDao;
import com.sdxb.ly.mapper.StudentMapper;
import com.sdxb.ly.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringMybatis {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:com/sdxb/ly/config/spring/applicationContext.xml");
        StudentDao studentDao= (StudentDao) applicationContext.getBean("studentDao");
        List<Student> students=studentDao.selectstudent();
        for (Student student:students){
            System.out.println(student.getName());
        }
    }

    @Test
    public void test2() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:com/sdxb/ly/config/spring/applicationContext.xml");
        StudentMapper studentMapper= (StudentMapper) applicationContext.getBean("Student");
        List<Student> students=studentMapper.selectStudent();
        for (Student student:students){
            System.out.println(student.getName());
        }
    }
}
