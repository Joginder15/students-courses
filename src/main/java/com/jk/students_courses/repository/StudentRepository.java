package com.jk.students_courses.repository;

import com.jk.students_courses.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
