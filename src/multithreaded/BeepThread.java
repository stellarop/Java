package multithreaded;

import java.awt.Toolkit;

// �������� ����ִ� ������
// Thread ��� ����
public class BeepThread extends Thread{
	
	// run �޼��� ������
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			// ������ 
			toolkit.beep();
			try {
				// 0.5�� ���� ����
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
