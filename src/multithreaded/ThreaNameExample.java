package multithreaded;

// ���� �����忡�� �̸� ���
public class ThreaNameExample {
	public static void main(String[] args) {
		// �� �ڵ带 �����ϴ� ������ ��ü ���
		Thread mainThrea = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThrea.getName());
		
		// ThreadA ��ü ����
		ThreaA threaA = new ThreaA();
		// setName���� �� ������ �̸� getName���� ��������
		System.out.println("�۾� ������ �̸� : " + threaA.getName());
		// ThreadA ����
		threaA.start();
		
		ThreaB threaB = new ThreaB();
		// ������ �̸��� �ο����� ���� ��� Thread-1, Thread-2�� ����Ʈ ���� 
		System.out.println("�۾� ������ �̸� : " + threaB.getName());
		threaB.start();
		
		ThreaC threaC = new ThreaC();
		
		System.out.println("�۾� ������ �̸� : " + threaC.getName());
		threaC.start();
	}
}
