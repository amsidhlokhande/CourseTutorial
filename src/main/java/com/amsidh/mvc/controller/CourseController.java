package com.amsidh.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amsidh.mvc.domain.Course;
import com.amsidh.mvc.service.CourseService;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = {"*"})
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/{courseId}")
	public Course getCourseWithCourseId(@PathVariable("courseId") Integer courseId) {
		return courseService.getCourseById(courseId);
	}

	@GetMapping
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@PostMapping
	public Course createPost(@RequestBody Course course) {
		return courseService.createCourse(course);
	}

	@PutMapping
	public Course updatePost(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}

	@DeleteMapping("/{courseId}")
	public void deletePost(@PathVariable Integer courseId) {
		courseService.deleteCourse(courseId);
	}

}
