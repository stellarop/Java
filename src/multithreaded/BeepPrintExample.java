package multithreaded;

import java.awt.Toolkit;

import javax.sound.midi.Track;

// 메인 쓰레드만 이용한 경우
public class BeepPrintExample {
	public static void main(String[] args) {
		
		// BeepTask 객체 대입
//		Runnable beepTask = new BeepTask();
		// 작업 쓰레드 생성, 
//		Thread thread = new Thread(beepTask);
		// 작업 쓰레드의 start()메서드 호출하면 작업 쓰레드에 의해 beepTask 객체의 run()메서드 실행
//		thread.start();
		
		// Thread 타입 클래스에 BeepThread 객체 대입
		Thread thread = new BeepThread();
		// 쓰레드 실행
		thread.start();
		
		// 메인 쓰레드에서 실행
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		// 비프음 발생과 프린팅은 서로 다른 작업이여서 메인 쓰레드에서 동시에 두 가지 작업을 처리할 수 없음 
		// 비프음을 발생시키면서 동시에 프린팅을 하려면 두 작업 중 하나를 메인 쓰레드가 아닌 다른 쓰레드에서
		// 실행해야함
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			// 비프음 
			toolkit.beep();
			try {
				// 0.5 초마다 비프음 실행
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		*/
		
	}
}
