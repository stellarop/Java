package polymorphism;

// ������ 
// ��ü ���� ���α׷����� ��ü���� ���� ����ǰ� ������ ��Ȱ�� �ϰ� �ȴ�.
// �� ��ü���� �ٸ� ��ü�� ��ü�� �� �־���Ѵ�. 
// �������� �̿��Ͽ� ���α׷��� �����ϴ°��� ��Ӱ� �������̵� Ÿ�Ժ�ȯ �� ������ �̴�.
public class CarExample {
	public static void main(String[] args) {
		// car Ŭ���� ��ü ����
		Car car = new Car();
		
		
		for(int i = 1; i<5; i++) {
			// run() �޼��� 5�� ����
			int problemLocation = car.run();
		
			switch (problemLocation) {
			case 1:
				System.out.println("�� ���� �ѱ� Ÿ�̾�� ��ü");
				// �� ���� Ÿ�̾� ��ũ �� �ѱ� Ÿ�̾� ��ü�� ����
				car.frontLeftTier = new HankookTire("�� ����", 15);
				break;
			case 2:
				System.out.println("�� ������ ��ȣ Ÿ�̾�� ��ü");
				car.frontRightTier = new KumhoTire("�� ������", 13);
				break;
			case 3:
				System.out.println("�� ���� �ѱ� Ÿ�̾�� ��ü");
				car.backLeftTier = new HankookTire("�� ����", 14);
				break;
			case 4:
				System.out.println("�� ������ ��ȣ Ÿ�̾�� ��ü");
				car.backRightTier = new KumhoTire("�� ������", 17);
				break;
			}
			
			System.out.println("===================================");
		}
	}
}
