package multithreaded;

// ���� ��ü
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// synchronized ����ȭ �޼���(������ �۾��� ���� �� ���� ��ü�� ����� �ɾ� �ٸ� �����尡 ��� ���ϰ� ��.)
	// ����ȭ �޼���� �޼��� ��ü ������ �Ӱ� ���� �޼��� ���� �� ���, �޼��� ����� �� ��� Ǯ��
	// �޼��� ��ü�� �ƴ� �Ϻκи� �Ӱ� �������� ����� �ʹٸ� ����ȭ ����� ����� ��
	public synchronized void setMemory(int memory) {
		
		/* ����ȭ ���
		synchronized(������ü) {
			�Ӱ� ����(�� �ϳ��� �����常 ����)
		}
		*/
		
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}


