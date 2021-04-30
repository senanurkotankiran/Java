package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setFirstName("Senanur");
		user.setLastName("Kotankiran");
		user.setPassword("12345");

		Student student = new Student();
		student.setFirstName("Furkan");
		student.setLastName("Besirli");
		student.setPassword("54872");
		student.setComment("Çok eğitici bir kurs");
		student.setCourse("Java + REACT");
		
		Instructor ınstructor = new Instructor();
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setPassword("21457");
		ınstructor.setHomeWork("Odev_3 verildi");
		ınstructor.setCourseInformation("Java + REACT Kursu");
		
		UserManager userManager = new UserManager();
		InstructorManager ınstructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		User[] users = {user, student, ınstructor};
		userManager.loginMultiple(users);
	
		ınstructorManager.add(ınstructor);
		ınstructorManager.update(ınstructor);
		
		studentManager.upload(student);
		studentManager.list(student);
	
	}

}
