package interfaceExample;

// 필드 다형성 테스트
public class TireExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		// car 클래스에 구현된 backLeft 타이어 필드를 A타이어 객체로 대입
		car.tire[2] = new Atire();
		car.tire[3] = new Atire();
		System.out.println("=======================");
		car.run(); 
	}
}
