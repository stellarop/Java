package objectOriented;

public class Korea {
	// 필드
	// 대한민국으로 초깃값을 준 경우 => k1, k2 객체에 nation 필드엔 대한민국이 저장됨
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 선언
	// 객체 생성 시점에 외부에서 제공되는 다양한 값으로 초기화가 되어야 한다면 생성자에서 초기화 진행
	// 객체 파라미터 선언
	public Korea(String name, String ssn) {
		// 생성자 파라미터로 받은 두 값을 받아 초기화 진행
		// 파라미터 이름과 필드 이름을 같이 진행할 땐 this로 필드 호출 
		this.name = name;
		this.ssn = ssn;
	}
}
