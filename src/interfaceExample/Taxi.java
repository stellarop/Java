package interfaceExample;

//구현 클래스 
public class Taxi implements Vehile{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}
