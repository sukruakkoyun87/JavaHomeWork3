package javaHomeworkDay2;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen Adý : "+instructor.firstName+" "+instructor.lastName);
		
	}
	
	public void getAll(Instructor[]  instructors) {
		
		for (Instructor instructor : instructors) {
			System.out.println("Id : "+instructor.id+" Eðitmen Adý : "+instructor.firstName+" "+instructor.lastName);
		}
	}
	

}
