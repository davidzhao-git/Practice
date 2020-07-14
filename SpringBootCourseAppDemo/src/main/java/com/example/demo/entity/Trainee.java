package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainee {
	
	private int traineeId;
	private String traineeName;
	
	@Autowired
	private Course course; 
	
	public Trainee() {
		
	}
	

	
	public int getTraineeId() {
		return traineeId;
	}
	
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	
	public String getTraineeName() {
		return traineeName;
	}
	
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("Trainee has the following course:");
		System.out.println(course.toString());
	}

}
