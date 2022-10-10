package multithreaded;

// 실행 클래스
public class ThreadStartExample {
	public static void main(String[] args) {
		// StartPrintThread 클래스에 TargetThread 스레드 타입 객체 
		StartPrintThread startPrintThread
		= new StartPrintThread(new TargetThread());
		// startPrintThread 스레드 시작
		startPrintThread.start();
	}
}
