package generic;


// ���׸� Ÿ�� �̿�
public class BoxExampl {
	public static void main(String[] args) {
	
		// ���׸� ���
		// Ÿ�� T�� String Ÿ������ ����Ǿ� Box Ŭ���� Ÿ���� String���� ��ȯ��.
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int num = box2.get();
		
		System.out.println(num);
		
	}
}
