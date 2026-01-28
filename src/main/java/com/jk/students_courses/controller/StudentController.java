package com.jk.students_courses.controller;

import com.jk.students_courses.entity.Student;
import com.jk.students_courses.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PostMapping("/{studentId}/courses/{courseId}")
    public Student addCourseToStudent(@PathVariable Long studentId,
                                      @PathVariable Long courseId){
        return studentService.assignCourse(studentId, courseId);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }
}
