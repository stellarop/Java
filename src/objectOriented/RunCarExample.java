package objectOriented;

public class RunCarExample {
	public static void main(String[] args) {
		// 객체 외부에서 호출
		// 외부 클래스에서 메서드 호출 시 객체를 우선 생성해야함 => 메서드는 객체에 소속된 멤버이기 때문 
		RunCar runCar = new RunCar();
		// 메서드 호출시 객체변수.메서드이름 으로 호출
		runCar.keyOn();
		runCar.run();
	}
}
