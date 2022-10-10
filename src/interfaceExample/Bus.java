package interfaceExample;

// 구현 클래스 
public class Bus implements Vehile{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void check() {
		System.out.println("승차 인원을 체크합니다.");
	}

}
