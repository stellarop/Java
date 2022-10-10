package multithreaded;

// 메인 스레드에서 이름 출력
public class ThreaNameExample {
	public static void main(String[] args) {
		// 이 코드를 실행하는 쓰레드 객체 얻기
		Thread mainThrea = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드 이름 : " + mainThrea.getName());
		
		// ThreadA 객체 생성
		ThreaA threaA = new ThreaA();
		// setName으로 준 쓰레드 이름 getName으로 가져오기
		System.out.println("작업 쓰레드 이름 : " + threaA.getName());
		// ThreadA 실행
		threaA.start();
		
		ThreaB threaB = new ThreaB();
		// 쓰레드 이름을 부여하지 않은 경우 Thread-1, Thread-2가 디폴트 값임 
		System.out.println("작업 쓰레드 이름 : " + threaB.getName());
		threaB.start();
		
		ThreaC threaC = new ThreaC();
		
		System.out.println("작업 쓰레드 이름 : " + threaC.getName());
		threaC.start();
	}
}
