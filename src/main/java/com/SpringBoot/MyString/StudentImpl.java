package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service

public class StudentServicetImplimplementsStudentService {

    private StudentRespository studentRespository;
    @Override
    public Student createStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long StudentId) {
        //private studentRepository StudentRepository;
        @Override
        public Student createUser(Student student) {
            return StudentRepository.save(student);
        }

        @Override
        public Optional<Student> getStudentById(Long studentId) {
            Optional<Student> optionalStudent=StudentRepository.findById(studentId);
            return optionalStudent;
    }

    @Override
    public List<Student> getAllStudent() {
            return StudentRepository.findAll();
        }


    }

    @Override
    public Student updateStudent(Student student) {
        //ReactiveCrudRepository StudentRepository;
        Student existingStudent=studentRepository.findById(student.getId()).get();
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        Student updatedStudent=studentRepository.save(existingStudent);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Long StudentId) {

    }
}
