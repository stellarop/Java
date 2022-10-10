package Inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone 클래스 객체 생성 / 생성자 매개변수에 해당하는 속성 보내줌
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "그린", 10);
		
		// 부모 클래스인 CellPhoone 클래스로 상속 받은 필드
		System.out.println("핸드폰 모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		// 자식 클래스인 DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// CellPhon로부터 상속 받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("야이 개새끼야");
		dmbCellPhone.receiveVoice("뭐 이 십새끼야");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.channgeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
