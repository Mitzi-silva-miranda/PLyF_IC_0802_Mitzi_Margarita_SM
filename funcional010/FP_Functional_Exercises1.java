import java.util.List;

/*Structured Functional */

public class FP_Functional_Exercises1{
	public static void main(String[] args){
	List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


	System.out.println("printAllCoursesInList: ");
	printAllCourses(courses);
	System.out.println("");
	}

	private static void printl(String course){
		System.out.println(course + ",");
	}

	private static void printAllCourses(List<String> courses){
		courses.stream()
		.forEach(System.out::println);
		System.out.println("");
	}
}
