package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.Student;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/Student")
public class StudentController {
    private StudentService StudentService;

    //build create Student
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBodyStudent Student){
        Student savedStudent = StudentService.createStudent("student");
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long StudentId){
        Object StudentId;
        Student student = (Student) StudentService.getStudent("StudentId");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> student = StudentService.getAllStudent();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student Student, @PathVariable("id") Long studentId) {
        Student.setId(studentId);
        Student updatedStudent = StudentService.updateStudent(Student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long StudentId) {
        StudentService.deleteStudent(StudentId);
        return new ResponseEntity<>("Student deleted successfully!", HttpStatus.OK);
    }
}