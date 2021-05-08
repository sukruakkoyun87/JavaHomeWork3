package javaHomeWorkDay3;

public class Instrustor  extends User{

	private String instructorNo;
	private String firstName;
	private String lastName;
	
	public Instrustor() {
		// TODO Auto-generated constructor stub
	}
	
	public Instrustor(String instructorNo,String firstName, String lastName) {
		super();
		this.instructorNo=instructorNo;
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

	public String getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(String instructorNo) {
		this.instructorNo = instructorNo;
	}
	
}
