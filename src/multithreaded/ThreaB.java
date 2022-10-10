package multithreaded;

public class ThreaB extends Thread{
	
	@Override
	public void run() {
		// 스레드 이름을 지정하지 않았다면 디폴드 값으로 Thread-1, Thread-2로 지정됨 
		System.out.println(getName() + "가 출력한 메시지");
	}
}
