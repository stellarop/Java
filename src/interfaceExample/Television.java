package interfaceExample;import javax.xml.bind.ValidationEvent;

// ���� �ڵ尡 �������̽� �޼��带 ȣ���ϸ� �������̽��� ��ü�� �޼��带 ȣ���Ѵ�.
// ��ü�� �������̽����� ���ǵ� �߻� �޼���� ������ �޼��� �̸� �Ű�Ÿ�� ���� Ÿ���� ���� ��ü �޼��带 ������ �־�� �� 
// �̷��� ��ü�� �������̽��� ���� ��ü��� �ϰ� ���� ��ü�� �����ϴ� Ŭ������ ���� Ŭ������� �Ѵ�

// �������̽� Ÿ������ ����� �� ������ �˷��ֱ� ���� Ŭ���� ����ο� implements Ű���� �߰� �� �������̽� �̸� ���
public class Television implements RemotoConrol{
	
	// setVolume() �Ķ���ͷ� �Ѱ��� �ʵ� ����
	private int volume;
	
	// �������̽��� ����� �߻� �޼����� ��ü �޼��带 �����ؾ��Ѵ�.
	@Override
	public void turnOn() {
		System.out.println("Television ��ü : TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television ��ü : TV�� ���ϴ�.");
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
			System.out.println("Television ���� ó�� �մϴ�.");
		}else {
			System.out.println("Television ���� ��ü �մϴ�.");
		}
	}

}
