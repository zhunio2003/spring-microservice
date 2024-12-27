package com.micorserve.course.repository;

import com.micorserve.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepostory extends CrudRepository<Course, Long> {

}
