package interfaceExample;import javax.xml.bind.ValidationEvent;

// 개발 코드가 인터페이스 메서드를 호출하면 인터페이스는 객체의 메서드를 호출한다.
// 객체는 인터페이스에서 정의된 추상 메서드와 동일한 메서드 이름 매개타입 리턴 타입을 가진 실체 메서드를 가지고 있어야 함 
// 이러한 객체를 인터페이스의 구현 객체라고 하고 구현 객체를 생성하는 클래스를 구현 클래스라고 한다

// 인터페이스 타입으로 사용할 수 있음을 알려주기 위해 클래스 선언부에 implements 키워드 추가 후 인터페이스 이름 명시
public class Television implements RemotoConrol{
	
	// setVolume() 파라미터로 넘겨줄 필드 선언
	private int volume;
	
	// 인터페이스에 선언된 추상 메서드의 실체 메서드를 선언해야한다.
	@Override
	public void turnOn() {
		System.out.println("Television 객체 : TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television 객체 : TV를 끕니다.");
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
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("Television 무음 처리 합니다.");
		}else {
			System.out.println("Television 무음 해체 합니다.");
		}
	}

}
