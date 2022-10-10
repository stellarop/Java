package multithreaded;

// 타켓 스레드
public class TargetThread extends Thread{
	public void run() {
		// 10억번 루핑을 돌게 해서 RUNNABLE 상태 유지
		for(long i=0; i<1000000000; i++) {
			
		}
		try {
			// 1.5초간 멈춤
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 10억번 루핑을 돌게 해서 RUNNABLE 상태 유지
		for(long i=0; i<1000000000; i++) {
			
		}
	}
}
