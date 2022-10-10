package multithreaded;

// 우선순위를 설정해서 스레드 실행
public class PriorityExample {
	// 자바에 스레드 스케줄링은 우선순위 방식과 순환 할당 방식을 사용
	// 우선순위 방식 : 우선순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링 하는것
	// 우선순위 방식은 스레드 객체에 우선순위 번호를 부여할 수 있기 때문에 코드로 제어 가능
	// 우선순위 => 1~10 까지 부여, 1이 낮고 10이 높음 우선순위 부여x 시 디폴트 5
	// 우선순위 변경 => Thread 클래스가 제공하는 setPriority 메서드 이용
	
	// 순환 할당 방식 : 시간 할당량을 정해서 하나의 스레드를 정해진 시간만큼 실행하고 다시 다른 스레드를 실행하는것
	// 순환 할당 방식은 자바 가상 기계에 의해서 정해지기 때문에 코드로 제어 불가능
	
	public static void main(String[] args) {
		for(int i = 1; i <=10; i++) {
			// 스레드 이름 파라미터로 넘겨줌
			Thread thread = new CalcThead("thread" + i);
			// i가 10미만이면 우선순위 1 
			if(i != 10) {
				// 우선순위 1
				thread.setPriority(thread.MIN_PRIORITY);
			}else {
				// 우선순위 10
				thread.setPriority(thread.MAX_PRIORITY);
			}
			// 스레드 시작
			thread.start();
		}
	}
}
