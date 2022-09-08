package edu.miu.restfulday2.service.impl;

import edu.miu.restfulday2.entity.Student;
import edu.miu.restfulday2.entity.dto.StudentDTO;
import edu.miu.restfulday2.repo.StudentRepo;
import edu.miu.restfulday2.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> student = studentRepo.getStudentList();
        return student.stream().map(student1 -> modelMapper.map(student1, StudentDTO.class)).collect(Collectors.toList());
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
