package edu.miu.restfulday2.service;

import edu.miu.restfulday2.entity.Student;

import java.util.List;

public interface StudentService {

    public Student save(Student student);

    public List<Student> getAll();

    public Student update(Student student);

    boolean delete(Integer id);
}
