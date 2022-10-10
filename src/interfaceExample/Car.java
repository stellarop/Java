package interfaceExample;

// 필드 다형성
public class Car {
	
	// 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	/*
	Tire frontLeft = new Atire();
	Tire frontRight = new Atire();
	Tire backLeft = new Btire();
	Tire backRight = new Btire();
	*/
	
	// 인터페이스에 대입 객체를 배열로 처리
	Tire[] tire = {
		new Atire(),
		new Atire(),
		new Btire(),
		new Btire()
	};
	
	// main에서 run() 메서드 호출 시 타이어 메서드 전부 실행
	void run() {
		// Tire 인터페이스에 수 만큼 반복
		for(Tire tires : tire) {
			tires.roll();
		}
	}
}
