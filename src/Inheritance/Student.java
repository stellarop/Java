package Inheritance;

// 자식 클래스
public class Student extends People{
	// 필드 
	public int student_seq;
	
	// 생성자
	// People 클래스에는 기본 생성자가 없고 두개의 파라메터를 받아 객체를 생성하는 생성자만 있다
	// => People을 상속하는 Student 클래스는 생성자에서 super(name, ssn)로 People 클래스의
	// 생성자를 호출해야 함
	public Student(String name, String ssn, int student_seq) {
		// People() 부모생성자 호출
		super(name, ssn);
		this.student_seq = student_seq;
	}
}
