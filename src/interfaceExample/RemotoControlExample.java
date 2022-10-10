package interfaceExample;

public class RemotoControlExample {
	public static void main(String[] args) {
		// 인터페이스로 구현 객체를 사용하려면 인터페이스 변수를 선언하고 구현 객체를 대입
		// 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입될 경우 구현 객체의 번지를 저장한다
		
		// 인터페이스 변수에 구현 객체 대입
		
		// 인터페이스 변수를 선언하고
//		RemotoConrol rc;
		// 변수에 구현 객체를 대입해야함.
//		rc = new Television();
//		rc = new Audio();
		
		
		// 익명 구현 객체
		// 구현 클래스를 만들어 사용하는 것이 일반적이고 클래스를 재사용할 수 있기 때문에 편리하다.
		// 하지만 일회성의 구현 객체를 만들기 위해 소스 파일을 만들고 클래스를 선언하는 것은 비효율적
		// 소스 파일을 만들지 않고 구현 객체를 만들 수 있는 방법을 제공한다 그것이 익명 구현 객체이다.
		
		// 인터페이스 변수 = new 인터페이스(){
		// {} 중괄호 안은 인터페이스에 선언된 모든 추상 메서드 들의 실체 메서드를 작성해야 한다
		// 인터페이스에 선언된 추상 메서드의 실체 메서드 선언
		// { 
		
		/*
		RemotoConrol rc1 = new RemotoConrol(){

			@Override
			public void turnOn() {
			
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
		};
		*/
		
		// 인터페이스의 정적메서드(기본 메서드)는 인터페이슬로 바로 호출이 가능하다
		RemotoConrol.Change();
		
		RemotoConrol rc = null;
		// Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
	// default 메서드는 인터페이스의 모든 구현 객체가 가지고 있는 기본 메서드
	// 디폴트 메서드를 재정의(오버라이딩)해서 자신에게 맞게 수정하면 데폴트 메서드가 호출 될때
	// 재정의한 메서드가 호출된다
		
	// Television와 Audio 중 어떤 객체가 인터페이스에 대입되느냐에 따라서 setMute() 메서드에 실행결과가 달라짐 
		rc.setMute(true);
		// Audio 객체를 인터페이스 타입에 대입
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		
		
	}
}
