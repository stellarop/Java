package multithreaded;

// ���� 	/ ���� ���   /����
// ��ü ���� / NEW / ������ ��ü�� ����. ���� Start()�޼��尡 ȣ����� ���� ����
// ���� ��� / RUNNABLE / ���� ���·� �������� �� �� �ִ� ����
// �Ͻ����� / WAITING / �ٸ� �����尡 ������ ������ ��ٸ��� ����
// �Ͻ����� / TIMED_WAITING / �־��� �ð� ���� ��ٸ��� ����
// �Ͻ����� / TERMINATED / ������ ��ģ ����


// Ÿ�� �������� ���¸� ����ϴ� ������
public class StartPrintThread extends Thread{
	private Thread targetTherad;
	
	public StartPrintThread(Thread targetTherad) {
		this.targetTherad = targetTherad;
	}
	
	public void run() {
		while(true) {
			// ������ ���� ���
			Thread.State start = targetTherad.getState();
			System.out.println("Ÿ�� ������ ���� : " + start);
			// ��ü ����  ������ ��� ���� ��� ���·� �����.
			if(start == Thread.State.NEW) {
				targetTherad.start();
			}
			// ������ ������ ��ġ�� while�� ����.
			if(start == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
