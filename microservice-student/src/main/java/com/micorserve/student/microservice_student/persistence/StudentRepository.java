package com.micorserve.student.microservice_student.persistence;

import com.micorserve.student.microservice_student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    // Sentencias personalizadas
    // Estandar de JPA
    List<Student> findAllByCourseId(Long idCourse);

    // Si no queremos seguir el estandar del nombre del metodo, podemos utilizar la anotación @Query
    @Query("SELECT s FROM Student s WHERE s.course_id = :idCourse")
    List<Student> findAllStudent(Long idCourse);
}
