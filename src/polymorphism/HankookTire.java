package polymorphism;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		// �θ� Ŭ���� �����ڷ� �Ķ���� �Ѱ���
		super(location, maxRotation);
	}
	
	// roll() �޼��� ������ �ٲٱ� ���� ������
	// Ÿ�̾� ��ũ �� 
	@Override
	public boolean roll() {
		++accmulatedRootation;
		
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "�ѱ� Ÿ�̾� ���� : " + (maxRotation-
					accmulatedRootation)+ "ȸ");
			return true;
		}else {
			System.out.println(location + "�ѱ� Ÿ�̾� ��ũ");
			return false;
		}
	}

}
