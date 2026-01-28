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

}
