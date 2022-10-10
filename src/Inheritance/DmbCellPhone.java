package Inheritance;

// 자식 클래스
public class DmbCellPhone extends CellPhone{
	int channel;
	
	// 생성자
	// 메인에서 보낸 파라미터 받아줌 => channel은 DmbCellPhone 클래스에 model, color는 부모클래스인
	// CellPhone 클래스로 보내줌
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = model;
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신 시작");
	}
	
	public void channgeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
 