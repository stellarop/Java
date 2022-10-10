package multithreaded;

public class ThreaC extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 메시지");
	}
}
