package edu.miu.restfulday2.service;

import edu.miu.restfulday2.entity.Course;
import edu.miu.restfulday2.entity.Student;

import java.util.List;

public interface CourseService {
    Course save(Course course);

    List<Course> getAll();

    Course update(Course course);

    void delete(Integer id);
}
