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
			System.out.println("로그인 되었습니다.");
			
			System.out.println("찾으시는 책 이름을 입력해주세요.");
			String book = scan.nextLine();
			System.out.println("test : " + id.bookList(book));
			String bookName = id.bookList(book);
			
			if(bookName.equals("x")) {
				System.out.println("입력한 책이 존재하지 않습니다.");
			}else {
				System.out.println("입력한 책이 존재합니다.");
				System.out.println("책이름 : " + bookName);
			}
			
			id.logout();
		}else {
			System.out.println("아이디 혹은 패스워드가 틀렸습니다 다시 시도 하세요.");
		}
	}
}
