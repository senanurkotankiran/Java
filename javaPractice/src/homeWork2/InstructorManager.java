package homeWork2;

public class InstructorManager  extends UserManager{

	public void add(Instructor ınstructor) {
		System.out.println("New assignments have been added to the site: " + ınstructor.getHomeWork());
	}
	
	public void update(Instructor ınstructor) {
		System.out.println("Course information uploaded: " + ınstructor.getCourseInformation());
	}
}
