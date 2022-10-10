package polymorphism;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		// 부모 클래스 생성자로 파라메터 넘겨줌
		super(location, maxRotation);
	}
	
	// roll() 메서드 내용을 바꾸기 위해 재정의
	// 타이어 펑크 시 
	@Override
	public boolean roll() {
		++accmulatedRootation;
		
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "한국 타이어 수명 : " + (maxRotation-
					accmulatedRootation)+ "회");
			return true;
		}else {
			System.out.println(location + "한국 타이어 펑크");
			return false;
		}
	}

}
