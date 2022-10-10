package objectOriented;

public class Id {
	
	public boolean login(String ids, String passwords) {
		String id ="lee";
		String password = "1234";
		
		if(id.equals(ids) && password.equals(passwords)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void logout() {
		System.out.println("로그아웃");
	}
	
	public String bookList(String bookName) {
		
		String arr[] = {"잭과콩나무","노무현입니다","기분좋습니다","자바의정석","독학사"};
		
		for(int i = 0; i< arr.length; i++) {

			if(bookName.equals(arr[i])) {
				return bookName;
			}
		}
		String no = "x";
		return no;
	}
}
