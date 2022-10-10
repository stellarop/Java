package generic;

// 제네렉 타입을 이용함으로써 잘못된 타입에 사용될 수 있는 문제를 컴파일 과정에서 제거
// 제네릭은 컬렉션, 람다식, 스트림, NIO에서 널리 사용됨
// 제네릭은 클래스와 인터페이스 메서드를 정의할 때 타입을 파라미터로 사용할 수 있도록 한다

// 제네릭의 이점
// 컴파일시 강한 타입 체크를 할 수 있음
// 타입 변환을 제거 한다

// 제네릭 타입
public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}



