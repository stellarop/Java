package objectOriented;

public class Korea {
	// �ʵ�
	// ���ѹα����� �ʱ갪�� �� ��� => k1, k2 ��ü�� nation �ʵ忣 ���ѹα��� �����
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	// ������ ����
	// ��ü ���� ������ �ܺο��� �����Ǵ� �پ��� ������ �ʱ�ȭ�� �Ǿ�� �Ѵٸ� �����ڿ��� �ʱ�ȭ ����
	// ��ü �Ķ���� ����
	public Korea(String name, String ssn) {
		// ������ �Ķ���ͷ� ���� �� ���� �޾� �ʱ�ȭ ����
		// �Ķ���� �̸��� �ʵ� �̸��� ���� ������ �� this�� �ʵ� ȣ�� 
		this.name = name;
		this.ssn = ssn;
	}
}
