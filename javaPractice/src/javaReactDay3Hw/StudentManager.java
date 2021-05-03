package javaReactDay3Hw;

public class StudentManager  extends UserManager{

	public void upload(Student student) {
		
		System.out.println("Comment uploaded: " + student.getComment());
	}
	
	public void list(Student student) {
		System.out.println("Course contents listed: "+ student.getCourse());
	}
	
}
