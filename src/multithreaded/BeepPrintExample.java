package multithreaded;

import java.awt.Toolkit;

import javax.sound.midi.Track;

// ���� �����常 �̿��� ���
public class BeepPrintExample {
	public static void main(String[] args) {
		
		// BeepTask ��ü ����
//		Runnable beepTask = new BeepTask();
		// �۾� ������ ����, 
//		Thread thread = new Thread(beepTask);
		// �۾� �������� start()�޼��� ȣ���ϸ� �۾� �����忡 ���� beepTask ��ü�� run()�޼��� ����
//		thread.start();
		
		// Thread Ÿ�� Ŭ������ BeepThread ��ü ����
		Thread thread = new BeepThread();
		// ������ ����
		thread.start();
		
		// ���� �����忡�� ����
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		// ������ �߻��� �������� ���� �ٸ� �۾��̿��� ���� �����忡�� ���ÿ� �� ���� �۾��� ó���� �� ���� 
		// �������� �߻���Ű�鼭 ���ÿ� �������� �Ϸ��� �� �۾� �� �ϳ��� ���� �����尡 �ƴ� �ٸ� �����忡��
		// �����ؾ���
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			// ������ 
			toolkit.beep();
			try {
				// 0.5 �ʸ��� ������ ����
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		*/
		
	}
}
