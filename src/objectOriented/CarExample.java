package objectOriented;

public class CarExample {
	public static void main(String[] args) {
		// car Ŭ���� ��ü ����
		// �⺻ ������ => car Ŭ������ �����ڸ� ������ �� �⺻ �����ڰ� ������
		// Ŭ������ �����ڸ� �������� �ʾƵ� �⺻ �����ڸ� ȣ���Ͽ� ��ü�� ������ų �� ����
		// Ŭ������ �����ڰ� �� ���� ���� �� �⺻ �����ڴ� x
		// �����ڸ� �����ϴ� ���� => ��ü�� �پ��ϰ� �ʱ�ȭ�ϱ� ���ؼ���
		
		/*
		Car car = new Car();
		System.out.println("����ȸ�� : " + car.company);
		System.out.println("�� : " + car.model);
		System.out.println("���� : " + car.color);
		System.out.println("�ְ� �ӷ� : " + car.maxSpeed);
		System.out.println("���� �ӷ� : " + car.speed);
		// �ʵ尪 ����
		car.speed = 60;
		System.out.println("������ �ӷ� : " + car.speed);
		*/
		
		// Ŭ������ �����ڰ� ��������� ����Ǿ� ���� ��� �ݵ�� ����� �����ڸ� ȣ���ؼ� ��ü�� �����ؾ���
		//Car car2 = new Car("����ڵ���", "����Ƽ��", "������", 200, 80);
		//System.out.println(car2.company);
		
		Car car1 = new Car();
		System.out.println("car1 ������ : " + car1.company);
		System.out.println("=============================");
		
		Car car2 = new Car("�ƹݶ�");
		System.out.println("car2 ������ : " + car2.company);
		System.out.println("car2 �� : " + car2.model);
		System.out.println("=============================");
		
		Car car3 = new Car("����", "ȸ��");
		System.out.println("car3 ������ : " + car3.company);
		System.out.println("car3 �� : " + car3.model);
		System.out.println("car3 �÷� : " + car3.color);
		System.out.println("=============================");
		
		Car car4 = new Car("�Ӹ����̵�", "������", 250);
		System.out.println("car4 ������ : " + car4.company);
		System.out.println("car4 �� : " + car4.model);
		System.out.println("car4 �÷� : " + car4.color);
		System.out.println("car4 �ְ� �ӷ� : " + car4.maxSpeed);
		System.out.println("=============================");
	}
}
