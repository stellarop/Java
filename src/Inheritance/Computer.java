package Inheritance;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
	
	
	@Override
	boolean test(String a) {
		System.out.println("자식 클래스에서 실행");
		if(a != null) {
			return true;
		}
		return false;
	}
	
}
