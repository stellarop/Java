package multithreaded;

// ���� Ŭ����
public class ThreadStartExample {
	public static void main(String[] args) {
		// StartPrintThread Ŭ������ TargetThread ������ Ÿ�� ��ü 
		StartPrintThread startPrintThread
		= new StartPrintThread(new TargetThread());
		// startPrintThread ������ ����
		startPrintThread.start();
	}
}
