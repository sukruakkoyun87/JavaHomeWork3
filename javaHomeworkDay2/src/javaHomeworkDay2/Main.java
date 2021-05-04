package javaHomeworkDay2;


public class Main {

	public static void main(String[] args) {
		System.out.println("#################### Kurslar ##########################");
			
		Course course1=new Course(1, "C# + Angular", "Yazýlým Geliþtirici Yetiþtirme Kampý ");
		Course course2=new Course(2, "Java + React", "Yazýlým Geliþtirici Yetiþtirme Kampý ");
		Course course3=new Course(3, "Pyhton", "Programlamaya Giriþ için Temel Kurs");
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		System.out.println("----------------------------------------------");
		
		Course[] courses= {course1,course2,course3};
		
		courseManager.getAll(courses);
		
		System.out.println("#################### Eðitmen ##########################");
		
		
		Instructor instructor1=new Instructor(1, "Engin", "Demiroð");
		Instructor instructor2=new Instructor(2, "Kerem", "Varýþ");
		Instructor instructor3=new Instructor(3, "Berkay", "Bilgin");
		
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);

		System.out.println("----------------------------------------------");
		
		Instructor[] instructors= {instructor1,instructor2,instructor3};
		
		
		instructorManager.getAll(instructors);
		
		
	}

}
