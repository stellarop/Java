package generic;

// 제네릭 메서드 호출 
public class compareMethodExample {
	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");

		// 1
		int p1Key = p1.getKey();
		// "사과"
		String p1Value = p1.getValue();

		// Pair 필드에 있는 값 가져오기
		int p2Key = p2.getKey();
		String p2Value = p2.getValue();

		System.out.println("p1 key : " + p1Key + "   " +  "p1 value : " + p1Value);
		System.out.println("p2 key : " + p2Key + "   "  + "p2 value : " + p2Value);

		// 구체적인 타입을 명시적으로 지정
		// Pair 제네릭 타입이 key, value이기 때문에 p1, p2 객체 넣어줌
		boolean result1 = Utill.<Integer, String>compare(p1, p2);

		// true일 시
		if(result1) {
			System.out.println("동등한 객체");
			// false일 시
		}else {
			System.out.println("다른 객체");
		}
		
		// 구체적인 타입을 추정
		
		// Pair 클래스에 제네릭 타입을 지정 후 객체 생성 후 필드에 해당 값 넣기
		Pair<String, String> p3 = new Pair<String, String>("user1", "test");
		Pair<String, String> p4 = new Pair<String, String>("user2", "test");
		
		String p3Key = p3.getKey();
		String p3Value = p3.getValue();
		
		String p4Key = p4.getKey();
		String p4Value = p4.getValue();
		
		// Utill클래스 안 compare 메서드에 해당 타입에 대한 변수 넣기
		boolean result2 = Utill.compare(p3, p4);
		
		System.out.println("p3 key : " + p3Key + "   " +  "p3 value : " + p3Value);
		System.out.println("p4 key : " + p4Key + "   "  + "p4 value : " + p4Value);
		
		if(result2) {
			System.out.println("동등한 객체");
		}else {
			System.out.println("다른 객체");
		}
	}
}
