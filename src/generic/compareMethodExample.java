package generic;

// ���׸� �޼��� ȣ�� 
public class compareMethodExample {
	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");

		// 1
		int p1Key = p1.getKey();
		// "���"
		String p1Value = p1.getValue();

		// Pair �ʵ忡 �ִ� �� ��������
		int p2Key = p2.getKey();
		String p2Value = p2.getValue();

		System.out.println("p1 key : " + p1Key + "   " +  "p1 value : " + p1Value);
		System.out.println("p2 key : " + p2Key + "   "  + "p2 value : " + p2Value);

		// ��ü���� Ÿ���� ��������� ����
		// Pair ���׸� Ÿ���� key, value�̱� ������ p1, p2 ��ü �־���
		boolean result1 = Utill.<Integer, String>compare(p1, p2);

		// true�� ��
		if(result1) {
			System.out.println("������ ��ü");
			// false�� ��
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		// ��ü���� Ÿ���� ����
		
		// Pair Ŭ������ ���׸� Ÿ���� ���� �� ��ü ���� �� �ʵ忡 �ش� �� �ֱ�
		Pair<String, String> p3 = new Pair<String, String>("user1", "test");
		Pair<String, String> p4 = new Pair<String, String>("user2", "test");
		
		String p3Key = p3.getKey();
		String p3Value = p3.getValue();
		
		String p4Key = p4.getKey();
		String p4Value = p4.getValue();
		
		// UtillŬ���� �� compare �޼��忡 �ش� Ÿ�Կ� ���� ���� �ֱ�
		boolean result2 = Utill.compare(p3, p4);
		
		System.out.println("p3 key : " + p3Key + "   " +  "p3 value : " + p3Value);
		System.out.println("p4 key : " + p4Key + "   "  + "p4 value : " + p4Value);
		
		if(result2) {
			System.out.println("������ ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
	}
}
