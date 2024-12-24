package com.micorserve.student.microservice_student.controller;

import com.micorserve.student.microservice_student.entities.Student;
import com.micorserve.student.microservice_student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que la clase es un controlador que maneja solicitudes REST y devuelve respuestas en formato JSON.
@RequestMapping("/api/student") // Establece la URL base para todas las solicitudes en el controlador.
public class StudentController { // Aquí creamos nuestro Endpoints

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create") // Maneja solicitudes POST, generalmente para crear nuevos recursos.
    @ResponseStatus(HttpStatus.CREATED) // Indica que cuando el método se ejecute correctamente
    public void saveStudent(@RequestBody Student student) { // Mapea el cuerpo de la solicitud a un objeto Java (en este caso, un Student).
        studentService.save(student);
    }

    @GetMapping("/search/{id}") // Maneja solicitudes GET, generalmente para recuperar recursos.
    public ResponseEntity<?> findById(@PathVariable Long id) { // @PathVariable Extrae parámetros de la URL y los pasa al método.
        return ResponseEntity.ok(studentService.findById(id));
    }

    // ReponseEntity -> Permite personalizar la respuesta, incluyendo el cuerpo, los encabezados y el código de estado.
    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(studentService.findAll());
    }

}


