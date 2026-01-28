package com.jk.students_courses.service;

import com.jk.students_courses.entity.Course;
import com.jk.students_courses.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourse(Long id){
        return courseRepository.findById(id).orElse(null);
    }

}
