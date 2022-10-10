package interfaceExample;

// 인터페이스 
// 인터페이스는 객체의 사용 방법을 정의한 타입이다. 객체의 교환성을 높혀주기 때문에
// 다형성을 구현하는 매우 중요한 역활을 한다 인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역활을 한다
// 개발 코드가 인터페이스의 메서드를 호출하면 인터페이스는 객체의 메서드를 호출시킨다 
// 객체의 내부 구조를 알 필요가 없고 인터페이스의 메서드만 알고 있으면 된다
public interface RemotoConrol {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해체 합니다.");
		}
	}
	
	// 정적 메서드 
	static void Change() {
		System.out.println("배터리를 교환합니다.");
	}
	
}
