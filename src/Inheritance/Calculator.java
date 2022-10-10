package Inheritance;

// 부모 클래스
// 메서드 오버라이딩(재정의)
// 부모 클래스의 모든 메서드가 자식 클래스에게 맞게 설계되어 있다면 이상적인 상속이다.
// 어떤 메서드는 자식 클래스가 사용하기에 적합하지 않을 수 도 있다. 이 경우 상속된 일부 메서드는 자식 클래스에서 다시 수정
// 후 사용해야 한다 이런 경우를 대비해 메서드 오버라이딩 이란 기능을 제공한다.

// 메서드 오버라이딩은 상속된 메서드의 내용이 자식 클래스에 맞지 않을 경우 자식 클래스에서 동일한 메서드를 재정의 하는것
// 메서드가 오버라이딩 되었다면 부모 객체의 메서드는 숨겨지기 때문에 자식 객체에서 메서드를 호출하면 오버라이딩됨
// 자식 메서드가 호출됨

// 메서드 오버라이딩 주의점
// 1. 부모의 메서드와 동일한 시그너처(리턴 타입, 메서드 이름, 매개 변수 리스트)를 가져야 한다.
// 2. 접근 제한을 더 강하게 오버라이딩 할 수 없다.
// 3. 새로운 예외 를 throws 할 수 없다.

// 부모 클래스에서 
public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return 3.14159 * r * r;
	}
	
	boolean test(String a) {
		System.out.println("부모 클래스에서 실행");
		if(a != null) {
			return true;
		}
		return false;
	}
}
