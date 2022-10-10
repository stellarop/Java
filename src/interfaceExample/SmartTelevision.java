package interfaceExample;

// ���� �������̽� ����
public class SmartTelevision implements RemotoConrol, SearchChable{
	// �ʵ�
	private int volume;
	
	// 
	
	// �������̽� B�� ����� �߻� �޼����� ��ü �޼��� ����
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	// �������̽� A�� ����� �߻� �޼����� ��ü �޼��� ���� 
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
