package com.kado.template.springmybatis.service;

import com.kado.template.springmybatis.controller.model.Student;

public interface StudentService {
    void insertStudent(Student student);
    boolean getStudentByLogin(String userName, String password);
    boolean getStudentByUserName(String userName);
}
