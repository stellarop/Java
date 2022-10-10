package generic;


// 제네릭 타입 이용
public class BoxExampl {
	public static void main(String[] args) {
	
		// 제네릭 사용
		// 타입 T는 String 타입으로 변경되어 Box 클래스 타입을 String으로 변환함.
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int num = box2.get();
		
		System.out.println(num);
		
	}
}
