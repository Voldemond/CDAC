package com.student.dao;

import com.student.models.Student;
import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(int id);
    Student searchStudentByName(String name);
    Student searchStudentByEmail(String email);
}
