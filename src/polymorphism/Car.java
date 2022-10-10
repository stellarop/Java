package polymorphism;

public class Car {
	// 필드
	
	Tire frontLeftTier = new Tire("앞 왼쪽", 6);
	Tire frontRightTier = new Tire("앞 오른쪽", 2);
	Tire backLeftTier = new Tire("뒤 왼쪽", 3);
	Tire backRightTier = new Tire("뒤 오른쪽", 4);
	
	
	
	int run() {
		System.out.println("자동차가 달립니다.");
		
		
		// Tire 클래스 roll 메서드 실행 
		if(frontLeftTier.roll() == false) {
			// false 반환 시 stop();
			stop();
			// 실행 클래스로 1 return
			return 1;
		}else if(frontRightTier.roll() == false) {
			stop();
			return 2;
		}else if(backLeftTier.roll() == false) {
			stop();
			return 3;
		}else if(backRightTier.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
		
		
	}
	
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
