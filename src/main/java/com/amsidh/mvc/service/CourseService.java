package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.domain.Course;

public interface CourseService {

	Course createCourse(Course course);

	Course updateCourse(Course course);

	Course getCourseById(Integer courseId);

	List<Course> getAllCourses();

	void deleteCourse(Integer courseId);

}
