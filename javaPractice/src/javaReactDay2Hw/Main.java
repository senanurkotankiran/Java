package javaReactDay2Hw;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id=1;
		course1.name = "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";
		course1.teacher = "Engin Demiroğ";
		course1.percent = 36;
		
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";
		course2.teacher = "Engin Demiroğ";
		course2.percent = 44;
		
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses ) {
			
			System.out.println(course.name + " "  + course.id + " "  + course.teacher + " "  + course.percent);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.Finish(course1);
		courseManager.Start(course2);
		courseManager.Continue(course2);
		
		
	}

}
