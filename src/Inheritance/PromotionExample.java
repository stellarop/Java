package Inheritance;



// 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용 할 수 있는 성질
// 다형성은 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해줌
// 부모 클래스로 타입 변환 허용 => 부모 타입에 모든 자식 객체를 대입 가능

// 자동 타입 변환
// 자동 타입 변환은 프로그램 실행 도중 자동적으로 타입 변환이 일어나는 것

// ex) 부모 클래스   변수   자식클래스타입;

// 부모 클래스
class A{
	
}

class C extends A{

}
class B extends A{

}
class D extends B{

}
class E extends C{

}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// A 부모 클래스로 형변환 시킬 수 있는것은 A 부모 클래스가 b,c,d,e 클래스가 A클래스를 상속 받고 있기 때문
		// 상속 관계가 아니면 형변환이 불가능 하다
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		
	}
}
