package Inheritance;

/*
 	상속은 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 코드에 중복을 줄여준다.
 	상속을 이용하면 클래스의 수정을 최소화 시킬 수 있다.
 	부모 클래스의 수정으로 모든 자식 클래스들의 수정 효과를 가져오기 때문에 유지 보수를 최소화 시켜준다.
 	ex) C, B class를 A class에 상속함
 	=> A class에  필드와 메서드를 수정함으로써 C, B class를 수정하지 않아도 A의 필드와 메서드를 이용할 수 있음.
	프로그램에선 자식이 부모를 선택 => 자식 클래스를 선언할 때 어떤 부모 클래스를 상속받을 건지 extends 뒤에 기술
 */
// 부모 클래스
public class CellPhone {
	// 필드
	String model;
	String color;

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 켭니다.");
	}

	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
