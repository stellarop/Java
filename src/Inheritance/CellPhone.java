package Inheritance;

/*
 	����� �� ���ߵ� Ŭ������ �����ؼ� ���ο� Ŭ������ ����� ������ �ڵ忡 �ߺ��� �ٿ��ش�.
 	����� �̿��ϸ� Ŭ������ ������ �ּ�ȭ ��ų �� �ִ�.
 	�θ� Ŭ������ �������� ��� �ڽ� Ŭ�������� ���� ȿ���� �������� ������ ���� ������ �ּ�ȭ �����ش�.
 	ex) C, B class�� A class�� �����
 	=> A class��  �ʵ�� �޼��带 ���������ν� C, B class�� �������� �ʾƵ� A�� �ʵ�� �޼��带 �̿��� �� ����.
	���α׷����� �ڽ��� �θ� ���� => �ڽ� Ŭ������ ������ �� � �θ� Ŭ������ ��ӹ��� ���� extends �ڿ� ���
 */
// �θ� Ŭ����
public class CellPhone {
	// �ʵ�
	String model;
	String color;

	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	public void powerOff() {
		System.out.println("������ �մϴ�.");
	}

	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	public void sendVoice(String message) {
		System.out.println("���� : " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}

	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
