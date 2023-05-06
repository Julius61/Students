package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(String student);
    Optional<Student> getStudentById(Long StudentId);

    //Object getStudent(Long StudentId);

    List<Student> getAllStudent();
    Student updateStudent(Student student);
    void deleteStudent(Long StudentId);
}
