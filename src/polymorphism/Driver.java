package polymorphism;

public class Driver {
	// bus, taxi 클래스 변수를 파라미터로 받는다 두 클래스들은 vehicle 클래스에 자식 클래스 이기 때문이다
	public void drive(Vehicle vehicle) {
		// 
		vehicle.run();
	}
}
