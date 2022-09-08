package edu.miu.restfulday2.service.impl;

import edu.miu.restfulday2.entity.Student;
import edu.miu.restfulday2.repo.StudentRepo;
import edu.miu.restfulday2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepo.getStudentList();
    }

    @Override
    public Student update(Student student) {
        return studentRepo.update(student);
    }

    @Override
    public boolean delete(Integer id) {
        return studentRepo.delete(id);
    }
}
