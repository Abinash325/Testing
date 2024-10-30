package Massmutual;

public class Company {

	
	private void comId() {

		System.out.println("456");
	}
	public static void main(String[] args) {
		
		Company c=new Company();
		c.comId();
		
//created object in same package
		
		CourseDetails cd=new CourseDetails();
		
		cd.javaCourse();
		cd.pythonCourse();
		

	}

}
