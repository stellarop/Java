package Inheritance;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle ����");
		return Math.PI * r * r;
	}
	
	
	@Override
	boolean test(String a) {
		System.out.println("�ڽ� Ŭ�������� ����");
		if(a != null) {
			return true;
		}
		return false;
	}
	
}
