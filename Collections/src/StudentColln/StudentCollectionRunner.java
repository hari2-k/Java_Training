package StudentColln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {
	
	public static void main(String[] args) {
	List<Student> students = List.of(new Student(1,"Tom"),
			new Student(100,"John"),
			new Student(2,"Adam"));
	
	ArrayList<Student> studentsAl = new ArrayList(students);
	
	System.out.println(students);
	
	Collections.sort(studentsAl);
	System.out.println(studentsAl);
}
}