package polymorphism;

// 매개변수의 다형성
// 자동 타입 변환은 필드에 값을 대입할 때에도 발생하지만 주로 메서드를 호출할때 많이 발생한다
// 매개값을 다양화 하기위해 매개 변수에 자식 타입 객체를 지정할 수도 있다
// 매개 변수의 타입이 클래스인경우 해당 클래스의 객체와 자식 객체까지 매개값으로 활용 가능
// 매개값으로 어떤 자식 객체가 제공 되냐에 따라 메서드의 실행 결과가 달라짐(매개변수의 다형성)
// 자식 객체가 부모의 메서드를 오버라이딩(재정의) 하였다면 실행 결과는 다양해진다
public class DriverExample {
	public static void main(String[] args) {
		Driver dri = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		// 자동 타입 변환
		// Vehicle vehicle = bus;
		// Vehicle vehicle = taxi;
		// 파라미터로 자식 클래스 변수를 넣어준다
	
		
		dri.drive(bus);
		dri.drive(taxi);
	}
}
