package polymorphism;

public class Car {
	// �ʵ�
	
	Tire frontLeftTier = new Tire("�� ����", 6);
	Tire frontRightTier = new Tire("�� ������", 2);
	Tire backLeftTier = new Tire("�� ����", 3);
	Tire backRightTier = new Tire("�� ������", 4);
	
	
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		
		
		// Tire Ŭ���� roll �޼��� ���� 
		if(frontLeftTier.roll() == false) {
			// false ��ȯ �� stop();
			stop();
			// ���� Ŭ������ 1 return
			return 1;
		}else if(frontRightTier.roll() == false) {
			stop();
			return 2;
		}else if(backLeftTier.roll() == false) {
			stop();
			return 3;
		}else if(backRightTier.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
		
		
	}
	
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
