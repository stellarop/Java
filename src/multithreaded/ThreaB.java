package multithreaded;

public class ThreaB extends Thread{
	
	@Override
	public void run() {
		// ������ �̸��� �������� �ʾҴٸ� ������ ������ Thread-1, Thread-2�� ������ 
		System.out.println(getName() + "�� ����� �޽���");
	}
}
