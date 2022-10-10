package multithreaded;

// 공유 객체
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// synchronized 동기화 메서드(스레드 작업이 끝날 때 까지 객체에 잠금을 걸어 다른 스레드가 사용 못하게 함.)
	// 동기화 메서드는 메서드 전체 내용이 임계 영역 메서드 실행 시 잠금, 메서드 종료될 시 잠금 풀림
	// 메서드 전체가 아닌 일부분만 임계 영역으로 만들고 싶다면 동기화 블록을 만들면 됨
	public synchronized void setMemory(int memory) {
		
		/* 동기화 블록
		synchronized(공유객체) {
			임계 영역(단 하나의 스레드만 실행)
		}
		*/
		
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}


