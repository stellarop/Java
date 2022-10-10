package interfaceExample;

import java.util.Scanner;

class coffee implements Testin{

	@Override
	public void menu() {
		System.out.println("아메리카노");
	}

	@Override
	public void menu2() {
		System.out.println("마끼아또");
	}

	@Override
	public void menu3() {
		System.out.println("바닐라라떼");
	}
}

 class dr implements Testin{

	@Override
	public void menu() {
		System.out.println("콜라");
	}

	@Override
	public void menu2() {
		System.out.println("사이다");
	}

	@Override
	public void menu3() {
		System.out.println("환타");
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Testin in = null;
		System.out.println("1번. 커피\n2번. 음료수");
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
