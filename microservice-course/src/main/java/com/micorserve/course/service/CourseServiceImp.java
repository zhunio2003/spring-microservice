package com.micorserve.course.service;

import com.micorserve.course.entities.Course;
import com.micorserve.course.repository.ICourseRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements ICourseIService{

    @Autowired
    ICourseRepostory courseRepostory;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepostory.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepostory.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepostory.save(course);
    }
}
