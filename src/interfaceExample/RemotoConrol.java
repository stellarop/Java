package interfaceExample;

// �������̽� 
// �������̽��� ��ü�� ��� ����� ������ Ÿ���̴�. ��ü�� ��ȯ���� �����ֱ� ������
// �������� �����ϴ� �ſ� �߿��� ��Ȱ�� �Ѵ� �������̽��� ���� �ڵ�� ��ü�� ���� ����ϴ� ���� ��Ȱ�� �Ѵ�
// ���� �ڵ尡 �������̽��� �޼��带 ȣ���ϸ� �������̽��� ��ü�� �޼��带 ȣ���Ų�� 
// ��ü�� ���� ������ �� �ʿ䰡 ���� �������̽��� �޼��常 �˰� ������ �ȴ�
public interface RemotoConrol {
	// ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼���
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ��ü �մϴ�.");
		}
	}
	
	// ���� �޼��� 
	static void Change() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
}
