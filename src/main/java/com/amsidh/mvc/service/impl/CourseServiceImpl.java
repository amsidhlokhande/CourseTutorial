package com.amsidh.mvc.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.domain.Course;
import com.amsidh.mvc.repository.CourseRepository;
import com.amsidh.mvc.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course createCourse(Course course) {
		log.info("Saving Course!!!");
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		log.info("Updating Course!!!");
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Integer courseId) {
		log.info("Getting Course by courseId "+ courseId);
		return courseRepository.findById(courseId).orElse(null);
	}

	@Override
	public List<Course> getAllCourses() {
		log.info("Fetching all courses!!!");
		return StreamSupport.stream(courseRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public void deleteCourse(Integer courseId) {
		log.info("Deleting course by courseId "+ courseId);
		courseRepository.deleteById(courseId);
	}

}
