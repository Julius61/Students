package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Long> {
}
