package com.micorserve.course.http.response;

// Esta es la clase que va a mapear las respuestas que le vamos a dar al cliente que consuma uestor servicio.

import com.micorserve.course.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    // Colocamos todo lo que queremos devolver al cliente
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}

