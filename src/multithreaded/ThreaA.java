package multithreaded;

public class ThreaA extends Thread{
	public ThreaA() {
		setName("ThreaA");
	}
	
	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 메시지");
	}
}
