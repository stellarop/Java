package polymorphism;

public class Tire {
	// �ʵ�
	
	// �ִ� ȸ�� ��
	public int maxRotation;
	// ���� ȸ�� �� 
	public int accmulatedRootation;
	// Ÿ�̾� ��ġ
	public String location;
	
	// ��ü ���� �� �Ķ���ͷ� ���� �� �޾���
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// �ѱ� Ÿ�̾�, ��ȣ Ÿ�̾� ���� �� �θ� Ŭ������ roll() �޼��� ����
	// ������ Ÿ�̾ ��ü �� �� Ÿ�̾� Ŭ���� �ȿ� �ִ� �������̵��� roll() �޼��带 �����Ѵ�
	public boolean roll() {
		++accmulatedRootation;
		
		// ���� ȸ�� �� < �ִ� ȸ����
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "Ÿ�̾� ���� : " + (maxRotation-
					accmulatedRootation)+ "ȸ");
			// Ÿ�̾ ��ũ ���� ���� �� true
			return true;
		}else {
			System.out.println(location + "Ÿ�̾� ��ũ");
			// Ÿ�̾� ��ũ �� false
			return false;
		}
	}
}
