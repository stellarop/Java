package polymorphism;

// 다형성 
// 객체 지향 프로그램에선 객체들이 서로 연결되고 각자의 역활은 하게 된다.
// 이 객체들은 다른 객체로 교체될 수 있어야한다. 
// 다형성을 이용하여 프로그램을 구성하는것이 상속과 오버라이딩 타입변환 이 세가지 이다.
public class CarExample {
	public static void main(String[] args) {
		// car 클래스 객체 생성
		Car car = new Car();
		
		
		for(int i = 1; i<5; i++) {
			// run() 메서드 5번 실행
			int problemLocation = car.run();
		
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 한국 타이어로 교체");
				// 앞 왼쪽 타이어 펑크 시 한국 타이어 객체로 변경
				car.frontLeftTier = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 금호 타이어로 교체");
				car.frontRightTier = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 한국 타이어로 교체");
				car.backLeftTier = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 금호 타이어로 교체");
				car.backRightTier = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			
			System.out.println("===================================");
		}
	}
}
