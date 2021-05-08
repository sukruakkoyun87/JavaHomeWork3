package javaHomeWorkDay3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Student student1=new Student();
	student1.setId(1);
	student1.setFirstName("Şükrü");
	student1.setLastName("Akkoyun");
	student1.setStudentNo("12345");
	student1.setEmail("sukru@mail.com");

	
	Student[] students= {student1};
	
	StudentManager studentManager=new StudentManager();
	
	System.out.println("-------------- Öğrenci Ekleme ---------------");
	studentManager.add(student1);

	System.out.println("-------------- Öğrenci Listeleme ---------------");
	studentManager.getAll(students);
	
	

	Instrustor instrustor1=new Instrustor();
	instrustor1.setId(2);
	instrustor1.setFirstName("Engin");
	instrustor1.setLastName("Demiroğ");
	instrustor1.setInstructorNo("98765");
	instrustor1.setEmail("engin@engin.com");
	
	InstructorManager instructorManager=new InstructorManager();
	
	System.out.println("-------------- Eğitmen Ekleme ---------------");
	instructorManager.add(instrustor1);

	Instrustor[] instrustors= {instrustor1};
	
	System.out.println("-------------- Eğitmen Listeleme ---------------");
	instructorManager.getAll(instrustors);
		
	UserManager userManager=new UserManager();
	
	System.out.println("-------------- User Ekleme ---------------");
	userManager.add(instrustor1);
	userManager.add(student1);
	
	System.out.println("-------------- User Listeleme ---------------");
	userManager.getAll(instrustors);
	userManager.getAll(students);
	
	
	
	}

}
