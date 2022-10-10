package Inheritance;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		// 부모 클래스 객체 생성
		Calculator cal = new Calculator();
		// 부모 클래스 areaCircle 메서드 호출
		System.out.println("원 면적 : " + cal.areaCircle(r));
		
		// 자식 클래스 객체 생성
		Computer com = new Computer();
		// 자식 클래스에서 오버라이딩한 areaCircle 메서드 호출
		System.out.println("원 면적 : " + com.areaCircle(r));
		
		// 자식 클래스에서 메서드 호출 시 오버라이딩 된 메서드가 있으면 무조건 오버라이딩 메서드를 먼저 호출함
		System.out.println("오버라이딩 테스트" + com.test("오버라이딩 테스트"));
	}
}
