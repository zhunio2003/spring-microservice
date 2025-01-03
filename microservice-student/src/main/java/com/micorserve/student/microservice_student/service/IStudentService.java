package com.micorserve.student.microservice_student.service;

import com.micorserve.student.microservice_student.entities.Student;

import java.util.List;

 // La interfaz asegura que cualquier implementación (StudentServiceImpl, por ejemplo)
 // proporcione los métodos que necesita tu aplicación para trabajar con estudiantes.
public interface IStudentService {

    // Vamos a definir algunos metodos
    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

     // Implementar un metodo para que consuma el microservcio Course
    List<Student> findByIdCourse(Long idCourse);

}


