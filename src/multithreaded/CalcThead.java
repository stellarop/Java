package multithreaded;

// �۾� ������
public class CalcThead extends Thread{
	public CalcThead(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20000000; i++) {
			
		}
		System.out.println(getName());
	}
}
