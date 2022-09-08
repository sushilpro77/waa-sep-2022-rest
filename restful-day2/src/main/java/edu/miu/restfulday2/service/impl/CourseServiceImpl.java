package edu.miu.restfulday2.service.impl;

import edu.miu.restfulday2.entity.Course;
import edu.miu.restfulday2.repo.CourseRepo;
import edu.miu.restfulday2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Course save(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public List<Course> getAll() {
        return courseRepo.getCourseList();
    }

    @Override
    public Course update(Course course) {
        return courseRepo.update(course);
    }

    @Override
    public void delete(Integer id) {
        courseRepo.deleteById(id);
    }
}
