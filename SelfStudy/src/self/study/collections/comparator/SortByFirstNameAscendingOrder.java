package self.study.collections.comparator;

import java.util.Comparator;

public class SortByFirstNameAscendingOrder implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		
		return student1.getFirstName().compareTo(student2.getFirstName());
	}

}
