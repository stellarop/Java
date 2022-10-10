package Inheritance;

// 부모 메서드 호출 

// 자식 클래스에서 부모 클래스의 메서드를 오버라이딩 하면 부모 클래스에 메서드는 숨겨지고
// 오버라이딩된 자식 메서드만 call 가능 하다 
// 자식 클래스 내부에서 오버라이딩된 부모 클래스의 메서드를 호출 하려면
// 명시적으로 super 키워드를 붙혀서 부모 메서드 호출 가능
// super 키워드는 부모 객체를 참조하고 있기 때문에 부모 메서드에 직접 접근할 수 있다.
public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		}else {
			super.fly();
		}
	}
	
	// 오버라이딩된 자식 메서드
	@Override
	public void name() {
		System.out.println("자식  클래스");
		// super 키워드로 부모 메서드 호출
		super.name();
	}
}
