package Inheritance;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		// �θ� Ŭ���� ��ü ����
		Calculator cal = new Calculator();
		// �θ� Ŭ���� areaCircle �޼��� ȣ��
		System.out.println("�� ���� : " + cal.areaCircle(r));
		
		// �ڽ� Ŭ���� ��ü ����
		Computer com = new Computer();
		// �ڽ� Ŭ�������� �������̵��� areaCircle �޼��� ȣ��
		System.out.println("�� ���� : " + com.areaCircle(r));
		
		// �ڽ� Ŭ�������� �޼��� ȣ�� �� �������̵� �� �޼��尡 ������ ������ �������̵� �޼��带 ���� ȣ����
		System.out.println("�������̵� �׽�Ʈ" + com.test("�������̵� �׽�Ʈ"));
	}
}
