package polymorphism;

public class Tire {
	// 필드
	
	// 최대 회전 수
	public int maxRotation;
	// 누적 회전 수 
	public int accmulatedRootation;
	// 타이어 위치
	public String location;
	
	// 객체 생성 시 파라미터로 던진 값 받아줌
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 한국 타이어, 금호 타이어 대입 전 부모 클래스에 roll() 메서드 실행
	// 각각의 타이어를 교체 시 각 타이어 클래스 안에 있는 오버라이딩된 roll() 메서드를 실행한다
	public boolean roll() {
		++accmulatedRootation;
		
		// 누적 회전 수 < 최대 회전수
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "타이어 수명 : " + (maxRotation-
					accmulatedRootation)+ "회");
			// 타이어가 펑크 나지 않을 시 true
			return true;
		}else {
			System.out.println(location + "타이어 펑크");
			// 타이어 펑크 시 false
			return false;
		}
	}
}
