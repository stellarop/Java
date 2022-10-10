package objectOriented;

public class RunCar {
	// 필드
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i <= 50; i+=10) {
			speed = i;
			System.out.println("자동차가 달립니다. 속도 : " + speed + "입니다.");
		}
	}
}
