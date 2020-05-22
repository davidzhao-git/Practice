package self.study.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>(); 
		
		studentList.add(new Student("Rich", "Zack", 19));
		studentList.add(new Student("Ken", "Lin", 19));
		studentList.add(new Student("Jack", "Man", 8));
		studentList.add(new Student("Mike", "Chen", 76));
		studentList.add(new Student("Lisa", "Yun", 30));
		
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
		Collections.sort(studentList, new SortByFirstNameAscendingOrder());
		
		System.out.println("\nSorted By First Name in ascending order");
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
		System.out.println("\nSorted By First Name in descending order");
		studentList.sort((Student student1, Student student2) -> student2.getFirstName().compareTo(student1.getFirstName()));
		
		
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
		
		studentList.sort((Student s1, Student s2) -> s1.getAge() - s2.getAge());
		
		System.out.println("\nSorted By Age");
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
		studentList.sort((Student s1, Student s2) -> s1.getLastName().compareTo(s2.getLastName()));
		System.out.println("\nSorted By Last Name");
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
		studentList.sort((Student s1, Student s2) -> s2.getLastName().compareTo(s1.getLastName()));
		System.out.println("\nSorted By Last Name in descending order");
		for (Student student : studentList) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
		}
		
	}

}
