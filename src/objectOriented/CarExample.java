package objectOriented;

public class CarExample {
	public static void main(String[] args) {
		// car 클래스 객체 생성
		// 기본 생성자 => car 클래스에 생성자를 생략할 시 기본 생성자가 생성됨
		// 클래스에 생성자를 선언하지 않아도 기본 생성자를 호출하여 객체를 생성시킬 수 있음
		// 클래스에 생성자가 한 개라도 있을 시 기본 생성자는 x
		// 생성자를 선언하는 이유 => 객체를 다양하게 초기화하기 위해서임
		
		/*
		Car car = new Car();
		System.out.println("제조회사 : " + car.company);
		System.out.println("모델 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최고 속력 : " + car.maxSpeed);
		System.out.println("현재 속력 : " + car.speed);
		// 필드값 변경
		car.speed = 60;
		System.out.println("수정된 속력 : " + car.speed);
		*/
		
		// 클래스에 생성자가 명시적으로 선언되어 있을 경우 반드시 선언된 생성자를 호출해서 객체를 생성해야함
		//Car car2 = new Car("기아자동차", "스포티지", "빨간색", 200, 80);
		//System.out.println(car2.company);
		
		Car car1 = new Car();
		System.out.println("car1 제조사 : " + car1.company);
		System.out.println("=============================");
		
		Car car2 = new Car("아반떼");
		System.out.println("car2 제조사 : " + car2.company);
		System.out.println("car2 모델 : " + car2.model);
		System.out.println("=============================");
		
		Car car3 = new Car("투싼", "회색");
		System.out.println("car3 제조사 : " + car3.company);
		System.out.println("car3 모델 : " + car3.model);
		System.out.println("car3 컬러 : " + car3.color);
		System.out.println("=============================");
		
		Car car4 = new Car("팰리세이드", "검정색", 250);
		System.out.println("car4 제조사 : " + car4.company);
		System.out.println("car4 모델 : " + car4.model);
		System.out.println("car4 컬러 : " + car4.color);
		System.out.println("car4 최고 속력 : " + car4.maxSpeed);
		System.out.println("=============================");
	}
}
