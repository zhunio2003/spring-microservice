package com.micorserve.course.controller;

import com.micorserve.course.entities.Course;
import com.micorserve.course.repository.ICourseRepostory;
import com.micorserve.course.service.ICourseIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICourseIService courseService;

    @PostMapping("/create") // Maneja solicitudes POST, generalmente para crear nuevos recursos.
    @ResponseStatus(HttpStatus.CREATED) // Indica que cuando el método se ejecute correctamente
    public void saveCourse(@RequestBody Course course) { // Mapea el cuerpo de la solicitud a un objeto Java (en este caso, un Student).
        courseService.save(course);

    }

    @GetMapping("/search/{id}") // Maneja solicitudes GET, generalmente para recuperar recursos.
    public ResponseEntity<?> findById(@PathVariable Long id) { // @PathVariable Extrae parámetros de la URL y los pasa al método.
        return ResponseEntity.ok(courseService.findById(id));
    }

    // ReponseEntity -> Permite personalizar la respuesta, incluyendo el cuerpo, los encabezados y el código de estado.
    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(courseService.findStudentByIdCourse(idCourse));
    }
}

