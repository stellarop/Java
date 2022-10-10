package multithreaded;

// 멀티 스레드 프로그램에선 스레드들이 객체를 공유해서 작업 해야 하는 경우가 있음 


// 메인 스레드가 실행하는 코드
public class MainThreadExample {
	public static void main(String[] args) {
		
		// user1 스레드가 100 메모리를 집어넣고 2초 멈춤 
		// user2 스레드가 100이 저장된 공유 메모리에 50 메모리를 집어넣고 2초 멈춤
		// 결과적으로 공유 메모리엔 50에 값이 저장되어 있기 때문에 use r1 스레드를 호출하면 50 메모리가 저장됨
		
		// 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 스레드 작업이 끝날 때까지 객체에 
		// 잠금을 걸어 다른 스레드가 사용할 수 없도록 해야함 멀티 스레드 프로그램에서 단 하나의 스레드만 실행 할
		// 수 있는 코드 영역을 임계 영역 이라 한다.자바는 임계 영역을 지정하기 위해 synchronized 메서드, 동기화 블록 제공
		// 스레드가 객체 내부에 동기화 메서드, 동기화 블록에 들어가면 객체에 잠금을 걸어 다른 스레드가 임계 영역 코드를 
		// 실행하지 못하게 함.
		
		// 객체 생성
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		// user1 스레드 시작
		user1.setCalculator(calculator);
		// user1 스레드 시작
		user1.start();
		
		User2 user2 = new User2();
		// user2 스레드 시작
		user2.setCalculator(calculator);
		// user2 스레드 시작
		user2.start();
		
		
	
	}
}
