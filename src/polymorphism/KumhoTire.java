package polymorphism;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accmulatedRootation;
		
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "금호 타이어 수명 : " + (maxRotation-
					accmulatedRootation)+ "회");
			return true;
		}else {
			System.out.println(location + "금호 타이어 펑크");
			return false;
		}
	}

}
