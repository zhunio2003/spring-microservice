package com.micorserve.course.service;

import com.micorserve.course.client.IStudentClient;
import com.micorserve.course.controller.dto.StudentDTO;
import com.micorserve.course.entities.Course;
import com.micorserve.course.http.response.StudentByCourseResponse;
import com.micorserve.course.repository.ICourseRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements ICourseIService{

    @Autowired
    ICourseRepostory courseRepository;

    @Autowired
    private IStudentClient studentClient;


    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {

        // Consultar el curso
        Course course = courseRepository.findById(idCourse).orElse(new Course());

        // Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }


}
