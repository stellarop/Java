package interfaceExample;

public class Audio implements RemotoConrol {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio ��ü : ������� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ��ü : ������� ���ϴ�");
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
		System.out.println("���� ����� ���� : " + this.volume);
	}
	
	
	@Override
	public void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("Audio ���� ó�� �մϴ�.");
		}else {
			System.out.println("Audio ���� ��ü �մϴ�.");
		}
	}
	

}
