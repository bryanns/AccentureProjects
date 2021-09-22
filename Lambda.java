package Testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Students> students = new ArrayList<>();
		
		students.add(new Students(1001, "Anna", "Smith", 23));
		students.add(new Students(1002, "Jack", "Ryan", 20));
		students.add(new Students(1003, "Myles", "Skyler", 20));
		students.add(new Students(1004, "Nikki", "Mill", 22));
		students.add(new Students(2012, "Andrea", "Riaz", 21));
		students.add(new Students(2013, "Alma", "Sanchez", 23));
		students.add(new Students(2014, "Bess", "Suarez", 25));
		students.add(new Students(2015, "Aliyah", "Dela Cruz", 26));
		
		
	
	List<Students> filteredbyFirstName = students.stream().filter(student -> (student.getFirstName().charAt(0)=='A'))
			.collect(Collectors.toList());
	
	for(Students s : filteredbyFirstName) {
		System.out.println("FirstName: " + s.getFirstName());
	}
	List<Students> filteredbyLastName = students.stream().filter(student -> (student.getLastName().charAt(0)=='S'))
			.collect(Collectors.toList());
	
	for(Students s : filteredbyLastName) {
		System.out.println("LastName: " + s.getLastName());
	}
	List<Students> filteredByAge = students.stream().filter(student -> (student.getAge()>21))
			.collect(Collectors.toList());
	
	for(Students s : filteredByAge) {
		System.out.println("Age: " + s.getAge() + " Name: "+s.getFirstName());
	}
	
	students.sort((o1, o2) -> {
		return o1.getFirstName().compareTo(o2.getFirstName());
	});
	students.forEach(s -> {
		System.out.println(" , Name: " + s.getFirstName());
	});
	
	}
}
