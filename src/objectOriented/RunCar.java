package objectOriented;

public class RunCar {
	// �ʵ�
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i <= 50; i+=10) {
			speed = i;
			System.out.println("�ڵ����� �޸��ϴ�. �ӵ� : " + speed + "�Դϴ�.");
		}
	}
}
