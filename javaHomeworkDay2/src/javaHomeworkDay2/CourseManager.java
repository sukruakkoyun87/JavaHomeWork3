package javaHomeworkDay2;

public class CourseManager {

	
	public void add(Course course) {
		System.out.println("Eklenen Kurs : "+course.courseName);
		
	}
	
	public void getAll(Course[]  courses) {
		
		for (Course course : courses) {
			
			System.out.println(" Id : "+course.id+" Kurs Adý : "+course.courseName+" Açýklama : "+course.description);
		}
	}
	
	
}
