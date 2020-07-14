package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@Controller
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String defaultMessage() {
		return "hello!!!??...";
	}
	
	@GetMapping("/")
	public ModelAndView homePage() {
		
		ModelAndView mnv = new ModelAndView(); 
		mnv.setViewName("home");
		return mnv;
		
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	
	@PostMapping("/addCourses")
	public List<Course> addCourses(@RequestBody List<Course> courses) {
		return service.saveCourses(courses);
	}
	
	@GetMapping("/courseById/{courseId}")
	public Course getCourseById(@PathVariable int courseId) {
		return service.getCourseByCourseId(courseId);
	}
	
	@GetMapping("/course/{courseName}")
	public Course getCourseByName(@PathVariable String courseName) {
		return service.getCourseByCourseName(courseName);
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return service.getCourses();
	}
	
	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return service.updateCourse(course);
	}
	
	@DeleteMapping("/delete/{courseId}")
	public String deleteCourse(@PathVariable int courseId) {
		return service.deleteCourse(courseId);
	}
	

	@RequestMapping("/allCourses")
	public ModelAndView courses() {
		
//		HttpSession session = request.getSession();
		
		
		List<Course> allCourses = service.getCourses();
		// System.out.println(allCourses);
		
		// model.addAttribute("allCourses", allCourses);
		// return "courses";
		
		ModelAndView mnv = new ModelAndView(); 
		mnv.addObject("allCourses", allCourses);
		mnv.setViewName("courses");
		return mnv;
		
	}

	
//	@RequestMapping("/courses")
//	public String courses(String name, HttpSession session) {
//		session.setAttribute("name", name);
//		return "courses";
//	}
	
//	@RequestMapping("/courses")
//	public String courses(@RequestParam("name")String courseName, HttpSession session) {
//		session.setAttribute("name", courseName);
//		return "courses";
//	}
	
//	@RequestMapping("/courses")
//	public ModelAndView courses(@RequestParam("name") String courseName) {
//		
//		ModelAndView mnv = new ModelAndView(); 
//		mnv.addObject("name", courseName);
//		mnv.setViewName("courses");
//		return mnv;
//	}
	
}
