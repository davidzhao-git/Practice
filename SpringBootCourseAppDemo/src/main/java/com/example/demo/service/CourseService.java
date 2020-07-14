package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	public Course saveCourse(Course course) {
		return repository.save(course);
	}
	
	public List<Course> saveCourses(List<Course> courses) {
		return repository.saveAll(courses);
	}
	
	public Course getCourseByCourseId(int courseId) {
		return repository.findById(courseId).orElse(null);
	}
	
	public List<Course> getCourses() {
		return repository.findAll();
	}
	
	public Course getCourseByCourseName(String courseName) {
		return repository.findByCourseName(courseName);
	}
	
	public Course updateCourse(Course course) {
		Course retrievedCourse = repository.findById(course.getCourseId()).orElse(null);
		retrievedCourse.setCourseName(course.getCourseName());
		return repository.save(retrievedCourse);
	}
	
	public String deleteCourse(int courseId) {
		repository.deleteById(courseId);
		return "Course removed: " + courseId; 
	}
}
