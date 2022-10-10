package Inheritance;

// �θ� �޼��� ȣ�� 

// �ڽ� Ŭ�������� �θ� Ŭ������ �޼��带 �������̵� �ϸ� �θ� Ŭ������ �޼���� ��������
// �������̵��� �ڽ� �޼��常 call ���� �ϴ� 
// �ڽ� Ŭ���� ���ο��� �������̵��� �θ� Ŭ������ �޼��带 ȣ�� �Ϸ���
// ��������� super Ű���带 ������ �θ� �޼��� ȣ�� ����
// super Ű����� �θ� ��ü�� �����ϰ� �ֱ� ������ �θ� �޼��忡 ���� ������ �� �ִ�.
public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ����");
		}else {
			super.fly();
		}
	}
	
	// �������̵��� �ڽ� �޼���
	@Override
	public void name() {
		System.out.println("�ڽ�  Ŭ����");
		// super Ű����� �θ� �޼��� ȣ��
		super.name();
	}
}
