package objectOriented;

public class Car {
	// 필드
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	
	// 생성자 선언
	// 외부에서 제공하는 다양한 데이터들을 이용해서 객체를 초기화 시키려면 생성자도 다양해야함
	// car 객체 생성 시 외부에서 제공하는 데이터가 없다면 기본 생성자로 car 객체 생성
	// 외부에서 model 데이터가 제공되거나 model,color가 제공될 경우에도 car 객체를 생성해야한다 
	// 생성자가 하나뿐이라면 이런 요구조건을 수용할 수 없기 때문에 외부에서 요구하는 데이터에 따라
	// 생성자 오버로딩을 해야함
	Car(){
	}
	Car(String model){
		this(model, "은색", 250);
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
