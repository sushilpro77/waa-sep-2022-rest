package edu.miu.restfulday2.controller;

import edu.miu.restfulday2.entity.Course;
import edu.miu.restfulday2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //get
    @GetMapping
    public List<Course> findAll(){
        return courseService.getAll();
    }

    //post
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseService.save(course);
    }

    //update
    @PutMapping
    public Course updateCourse(@RequestBody Course course){
        return courseService.update(course);
    }

    //delete
    @DeleteMapping("/{id}")
    public boolean deleteCourse(@PathVariable Integer id){
        courseService.delete(id);
        return true;
    }



}
