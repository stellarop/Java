package Inheritance;

// �ڽ� Ŭ����
public class DmbCellPhone extends CellPhone{
	int channel;
	
	// ������
	// ���ο��� ���� �Ķ���� �޾��� => channel�� DmbCellPhone Ŭ������ model, color�� �θ�Ŭ������
	// CellPhone Ŭ������ ������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = model;
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ���� ����");
	}
	
	public void channgeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �����մϴ�.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
 