package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Zeynep");
		student1.setLastName("TOPRAK");
		student1.setEmail("zeynep@hotmail.com");
		student1.setPassword(12345);
		student1.setCourseCompletionRate("% 50'si tamamlandı");
		
		Instructor ınstructor1=new Instructor();
		ınstructor1.setId(1);
		ınstructor1.setFirstName("Engin");
		ınstructor1.setLastName("DEMİROĞ");
		ınstructor1.setEmail("engin@hotmail.com");
		ınstructor1.setPassword(678910);
		ınstructor1.setCourseGiven("Kurs verildi");
		
		
		
		UserManager userManager=new UserManager();
		userManager.add(student1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.completedCourse();
		
		
		InstructorManager ınstructorManager=new InstructorManager(); 
		ınstructorManager.deletedCourse();
		
		
	

	
	}

	

}
