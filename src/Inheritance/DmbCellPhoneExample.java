package Inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone Ŭ���� ��ü ���� / ������ �Ű������� �ش��ϴ� �Ӽ� ������
		DmbCellPhone dmbCellPhone = new DmbCellPhone("������", "�׸�", 10);
		
		// �θ� Ŭ������ CellPhoone Ŭ������ ��� ���� �ʵ�
		System.out.println("�ڵ��� �� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		// �ڽ� Ŭ������ DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// CellPhon�κ��� ��� ���� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("���� ��������");
		dmbCellPhone.receiveVoice("�� �� �ʻ�����");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.channgeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
