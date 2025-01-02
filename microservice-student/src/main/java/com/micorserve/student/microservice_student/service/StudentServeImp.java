package com.micorserve.student.microservice_student.service;

import com.micorserve.student.microservice_student.entities.Student;
import com.micorserve.student.microservice_student.persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Esta clase contiene lógica de negocio y debe ser gestionada automáticamente como un bean.
public class StudentServeImp implements IStudentService{

    // Inyectamos un objeto o bean del repositorio.
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findAllByCourseId(idCourse);
    }
}
