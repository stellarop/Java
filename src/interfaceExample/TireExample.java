package interfaceExample;

// �ʵ� ������ �׽�Ʈ
public class TireExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		// car Ŭ������ ������ backLeft Ÿ�̾� �ʵ带 AŸ�̾� ��ü�� ����
		car.tire[2] = new Atire();
		car.tire[3] = new Atire();
		System.out.println("=======================");
		car.run(); 
	}
}
