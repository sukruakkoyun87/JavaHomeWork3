package javaHomeWorkDay3;



public class UserManager {

	public void add(User user) {
		
		System.out.println("Id : "+user.getId()+" Mail  Adresi :"+user.getEmail()+" Kaydedildi");
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			
			add(user);
		}
		
	}
	
public void getAll(User[] users) {
		
		for (User user:users) {
			
			System.out.println("Id : "+user.getId()+" Email : "+user.getEmail() +" Listelendi ");
		
		}
}
}
