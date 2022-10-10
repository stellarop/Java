package multithreaded;

// 상태 	/ 열거 상수   /설명
// 객체 생성 / NEW / 스레드 객체가 생성. 아직 Start()메서드가 호출되지 않은 상태
// 실행 대기 / RUNNABLE / 실행 상태로 언제든지 갈 수 있는 상태
// 일시정지 / WAITING / 다른 스레드가 통지할 때까지 기다리는 상태
// 일시정지 / TIMED_WAITING / 주어진 시간 동안 기다리는 상태
// 일시정지 / TERMINATED / 실행을 마친 상태


// 타켓 스레드의 상태를 출력하는 스레드
public class StartPrintThread extends Thread{
	private Thread targetTherad;
	
	public StartPrintThread(Thread targetTherad) {
		this.targetTherad = targetTherad;
	}
	
	public void run() {
		while(true) {
			// 스레드 상태 얻기
			Thread.State start = targetTherad.getState();
			System.out.println("타켓 스레드 상태 : " + start);
			// 객체 생성  상태일 경우 실행 대기 상태로 만든다.
			if(start == Thread.State.NEW) {
				targetTherad.start();
			}
			// 스레드 실행을 마치면 while문 종료.
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
