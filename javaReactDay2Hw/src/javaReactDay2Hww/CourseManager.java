package javaReactDay2Hww;

public class CourseManager {
	
	public void Start(Course course) {
		System.out.println("Kursa başlandı : " + course.name);
	}
	
	public void Continue(Course course) {
		System.out.println("Kursa devam ediliyor : " + course.name);
	}

	public void Finish(Course course1) {
		System.out.println("Kursun süresi bitti : " + course1.name);
	}
}
