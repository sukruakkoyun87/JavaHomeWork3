package javaHomeWorkDay3;

public class Student extends User{

	private String studentNo;
	private String firstName;
	private String lastName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sutudentNo,String firstName, String lastName) {
		super();
		this.studentNo=sutudentNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	
	
	
}
