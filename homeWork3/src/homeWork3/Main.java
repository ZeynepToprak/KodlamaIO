package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Zeynep");
		student1.setLastName("TOPRAK");
		student1.setEmail("zeynep@hotmail.com");
		student1.setPassword(12345);
		student1.setCourseCompletionRate("% 50'si tamamlandý");
		
		Instructor ýnstructor1=new Instructor();
		ýnstructor1.setId(1);
		ýnstructor1.setFirstName("Engin");
		ýnstructor1.setLastName("DEMÝROÐ");
		ýnstructor1.setEmail("engin@hotmail.com");
		ýnstructor1.setPassword(678910);
		ýnstructor1.setCourseGiven("Kurs verildi");
		
		
		
		UserManager userManager=new UserManager();
		userManager.add(student1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.completedCourse();
		
		
		InstructorManager ýnstructorManager=new InstructorManager(); 
		ýnstructorManager.deletedCourse();
		
		
	

	
	}

	

}
