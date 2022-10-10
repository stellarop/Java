package multithreaded;

import java.awt.Toolkit;

// 비프음을 들려주는 쓰레드
// Thread 상속 받음
public class BeepThread extends Thread{
	
	// run 메서드 재정의
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			// 비프음 
			toolkit.beep();
			try {
				// 0.5초 마다 실행
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
