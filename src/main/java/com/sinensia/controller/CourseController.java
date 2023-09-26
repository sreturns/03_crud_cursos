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

/**
 * Nuestro restcontroller desde el cual manejamos las peticiones de los metodos
 * 
 * @see com.sinensia.service.CourseServiceImpl
 * @see com.sinensia.service.CourseService
 */
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	/**
	 * Pasamos el id, y mostramos el curso que corresponde a dicho id, pasamos el id
	 * a traves d un PathVariable
	 * 
	 * @param id
	 * @return Course
	 */
	@GetMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Course> getCourseById(@PathVariable("id") int id) {
		return courseService.getCourseById(id);
	}

	/**
	 * Usamos el metodo post para añadir un nuevo curso, indicamos que consumes un
	 * JSON, para poder enviarle un objeto JSON en el Postman.
	 * Cuando mandamos un objeto tenemos que utilizar la anotacion @RequestBody
	 * 
	 * @param course
	 * @return List<Course>
	 */
	@PostMapping(value = "course", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	/**
	 * Hacemos un delete a traves del id
	 * 
	 * @param id
	 * @return List<Course>
	 */
	@DeleteMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> deleteCourse(@PathVariable("id") int id) {
		return courseService.deleteCourse(id);
	}

	/**
	 * A traves del Put actualizamos un curso con una nueva duracion, pasamos el id a traves de un PathVariable y la duracion con un @RequestParam -> /course/1?d=60
	 * 
	 * @param id
	 * @param duration
	 */
	@PutMapping(value = "course/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateDuration(@PathVariable("id") int id, @RequestParam("d") int duration) {
		courseService.updateDuration(id, duration);
	}

}
