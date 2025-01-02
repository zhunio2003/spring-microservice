package com.micorserve.course.client;

import com.micorserve.course.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// Colocamos el nombre de nuesto microservicio que nos queremos comunicar (esta en le archivo properties.yml)
@FeignClient(name = "msvc-student", url = "localhost:8092/api/student") // La URL que nosotros vamos a consultar
public interface IStudentClient {

    // Consumimos el servicio especifico
    @GetMapping("/search/search-my-courses/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);


}


