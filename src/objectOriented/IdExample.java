package objectOriented;

import java.util.Scanner;

public class IdExample {
	public static void main(String[] args) {
		Id id = new Id();
		Scanner scan = new Scanner(System.in);
		String a = "lee";
		String b = "1234";
		boolean result = id.login(a, b);
		if(result == true) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			
			System.out.println("ã���ô� å �̸��� �Է����ּ���.");
			String book = scan.nextLine();
			System.out.println("test : " + id.bookList(book));
			String bookName = id.bookList(book);
			
			if(bookName.equals("x")) {
				System.out.println("�Է��� å�� �������� �ʽ��ϴ�.");
			}else {
				System.out.println("�Է��� å�� �����մϴ�.");
				System.out.println("å�̸� : " + bookName);
			}
			
			id.logout();
		}else {
			System.out.println("���̵� Ȥ�� �н����尡 Ʋ�Ƚ��ϴ� �ٽ� �õ� �ϼ���.");
		}
	}
}
