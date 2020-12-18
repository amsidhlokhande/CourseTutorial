package com.amsidh.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.domain.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
