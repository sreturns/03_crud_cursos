package com.sinensia.service;

import java.util.List;
import java.util.Optional;

import com.sinensia.model.Course;

/**
 * Interfaz que implementaremos en nuestro Servicio CourseServiceImpl
 * 
 * @see com.sinensia.service.CourseServiceImpl
 */
public interface CourseService {

	List<Course> addCourse(Course course);
	
	List<Course> deleteCourse(int id);
	
	Optional<Course> getCourseById(int id);
	
	void updateDuration(int id, int duration);
	
}
