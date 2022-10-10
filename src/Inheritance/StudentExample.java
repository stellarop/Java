package Inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ÀÌ¿¬Àç", "010-5152-2203", 3);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		System.out.println("student_seq : " + student.student_seq);
	}
}
