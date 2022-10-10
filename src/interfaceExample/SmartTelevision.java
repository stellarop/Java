package interfaceExample;

// 다중 인터페이스 구현
public class SmartTelevision implements RemotoConrol, SearchChable{
	// 필드
	private int volume;
	
	// 
	
	// 인터페이스 B에 선언된 추상 메서드의 실체 메서드 선언
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	// 인터페이스 A에 선언된 추상 메서드의 실체 메서드 선언 
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemotoConrol.MAX_VOLUME) {
			this.volume = RemotoConrol.MAX_VOLUME;
		}else if(volume < RemotoConrol.MIN_VOLUME) {
			this.volume = RemotoConrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}

}
