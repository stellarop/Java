package interfaceExample;

import java.util.Scanner;

class coffee implements Testin{

	@Override
	public void menu() {
		System.out.println("�Ƹ޸�ī��");
	}

	@Override
	public void menu2() {
		System.out.println("�����ƶ�");
	}

	@Override
	public void menu3() {
		System.out.println("�ٴҶ��");
	}
}

 class dr implements Testin{

	@Override
	public void menu() {
		System.out.println("�ݶ�");
	}

	@Override
	public void menu2() {
		System.out.println("���̴�");
	}

	@Override
	public void menu3() {
		System.out.println("ȯŸ");
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Testin in = null;
		System.out.println("1��. Ŀ��\n2��. �����");
		int a = scan.nextInt();
		if(a == 1) {
			in = new coffee();
		}else if(a == 2) {
			in = new dr();
		}
		
		
		in.menu();
		in.menu2();
		in.menu3();
	}
}
