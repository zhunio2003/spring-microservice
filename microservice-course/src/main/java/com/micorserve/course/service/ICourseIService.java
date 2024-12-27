package com.micorserve.course.service;

import com.micorserve.course.entities.Course;

import java.util.List;

public interface ICourseIService {
    // Los servicios que van a manejar nuestro servicio.
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);
}
