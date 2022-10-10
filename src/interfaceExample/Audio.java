package interfaceExample;

public class Audio implements RemotoConrol {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio 객체 : 오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 객체 : 오디오를 끕니다");
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
			System.out.println("Audio 무음 처리 합니다.");
		}else {
			System.out.println("Audio 무음 해체 합니다.");
		}
	}
	

}
