package polymorphism;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accmulatedRootation;
		
		if(accmulatedRootation<maxRotation) {
			System.out.println(location + "��ȣ Ÿ�̾� ���� : " + (maxRotation-
					accmulatedRootation)+ "ȸ");
			return true;
		}else {
			System.out.println(location + "��ȣ Ÿ�̾� ��ũ");
			return false;
		}
	}

}
