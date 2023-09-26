package com.sinensia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.model.Course;
import com.sinensia.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Course> getCourseById(@PathVariable("id") int id) {
		return courseService.getCourseById(id);
	}

	@PostMapping(value = "course", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	@DeleteMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> deleteCourse(@PathVariable("id") int id) {
		return courseService.deleteCourse(id);
	}
	
	@PutMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateDuration(@PathVariable("id") int id, @RequestParam("d") int duration) {
		courseService.updateDuration(id, duration);
	}

}
