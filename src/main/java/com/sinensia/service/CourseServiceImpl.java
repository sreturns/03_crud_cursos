package com.sinensia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sinensia.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	private List<Course> courseList;

	public CourseServiceImpl() {
		courseList = new ArrayList<>();
		courseList.add(new Course(1, "Java Course", 100, 120));
		courseList.add(new Course(2, "Kotlin Course", 80, 100));
		courseList.add(new Course(3, "C++ Course", 130, 150));
		courseList.add(new Course(4, "JavaScript Course", 100, 50));
		courseList.add(new Course(5, "Go Course", 90, 130));
	}

	@Override
	public List<Course> addCourse(Course course) {
		boolean courseDuplicated = courseList.stream().anyMatch(c -> c.getId() == course.getId());
		
		if(!courseDuplicated) {
			courseList.add(course);
		}

		return courseList;
	}

	@Override
	public List<Course> deleteCourse(int id) {
		courseList.removeIf(course -> course.getId() == id);
		return courseList;
	}

	@Override
	public Optional<Course> getCourseById(int id) {
		return courseList.stream().filter(course -> course.getId() == id).findFirst();
	}

	@Override
	public void updateDuration(int id, int newDuration) {
		Optional<Course> courseFounder = courseList.stream().filter(course -> course.getId() == id).findFirst();
		courseFounder.ifPresent(course -> course.setDuration(newDuration));
	}

}
