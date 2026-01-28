package com.jk.students_courses.service;

import com.jk.students_courses.entity.Course;
import com.jk.students_courses.entity.Student;
import com.jk.students_courses.repository.CourseRepository;
import com.jk.students_courses.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student assignCourse(Long studentId, Long courseId){
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not founf"));

        student.addCourse(course);
        return studentRepository.save(student);
    }

    public Student getStudent(Long id){
        return studentRepository.findById(id).orElse(null);
    }



}
