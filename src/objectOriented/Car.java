package objectOriented;

public class Car {
	// �ʵ�
	
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	
	// ������ ����
	// �ܺο��� �����ϴ� �پ��� �����͵��� �̿��ؼ� ��ü�� �ʱ�ȭ ��Ű���� �����ڵ� �پ��ؾ���
	// car ��ü ���� �� �ܺο��� �����ϴ� �����Ͱ� ���ٸ� �⺻ �����ڷ� car ��ü ����
	// �ܺο��� model �����Ͱ� �����ǰų� model,color�� ������ ��쿡�� car ��ü�� �����ؾ��Ѵ� 
	// �����ڰ� �ϳ����̶�� �̷� �䱸������ ������ �� ���� ������ �ܺο��� �䱸�ϴ� �����Ϳ� ����
	// ������ �����ε��� �ؾ���
	Car(){
	}
	Car(String model){
		this(model, "����", 250);
	}
	Car(String model, String color){
		this(model,color,250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
