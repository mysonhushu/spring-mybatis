package com.kado.template.springmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kado.template.springmybatis.dao.StudentDao;
import com.kado.template.springmybatis.controller.model.Student;
import com.kado.template.springmybatis.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    public boolean getStudentByLogin(String userName, String password) {
        Student student = studentDao.getStudentByUserName(userName);

        if(student != null && student.getPassword().equals(password)) {
            return true;
        }

        return false;
    }

    public boolean getStudentByUserName(String userName) {
        Student student = studentDao.getStudentByUserName(userName);

        if(student != null) {
            return true;
        }

        return false;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

}