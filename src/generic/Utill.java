package generic;

// 제네릭 메서드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메서드
// 리턴 타입 앞에 <> 추가 후 타입 파라미터 기술, 리턴 타입과 매개ㅐ 타입으로 타입 파라미터를 사용함

// 제네릭 메서드
public class Utill {
	public static <T> Box<T> boxing(T t){
		// 객체 생성 후 받은 제네릭 타입 설정
		Box<T> box = new Box<T>();
		// box.set 메서드 안 제네렉 데이터 넣기
		box.set(t);
		// 받은 데이터 리턴
		return box;
	}
	
	// 메인 클래스에서 해당 타입 파라미터 받아주고 문자열 비교 후 리턴
	public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {

		// p1의 key 값을 p2 key 값과 문자열 비교
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// p1의 value 값을 p2 value 값과 문자열 비교
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		// 두 boolean 값 and 연산 리턴
		return keyCompare && valueCompare;
	}

	// 제한된 타입 파라미터<T extends 최상위 타입>
	// 타입 파라미터에 지정되는 구체적인 타입은 상위 타입이거나 상위 타입의 하위, 구현클래스만 가능
	// 메서드 {} 안 타입 파라미터 변수로 사용 가능한건 상위 타입 멤버(필드, 메서드)로 제한됨
	public static <T extends Number> int intCompare(T t1, T t2) {

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		// v1 < v1 = -1
		// v1 > v1 = 1
		return Double.compare(v1, v2);
	}


}
