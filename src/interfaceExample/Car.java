package interfaceExample;

// �ʵ� ������
public class Car {
	
	// �������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	/*
	Tire frontLeft = new Atire();
	Tire frontRight = new Atire();
	Tire backLeft = new Btire();
	Tire backRight = new Btire();
	*/
	
	// �������̽��� ���� ��ü�� �迭�� ó��
	Tire[] tire = {
		new Atire(),
		new Atire(),
		new Btire(),
		new Btire()
	};
	
	// main���� run() �޼��� ȣ�� �� Ÿ�̾� �޼��� ���� ����
	void run() {
		// Tire �������̽��� �� ��ŭ �ݺ�
		for(Tire tires : tire) {
			tires.roll();
		}
	}
}
