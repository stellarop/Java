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
		System.out.println("�α׾ƿ�");
	}
	
	public String bookList(String bookName) {
		
		String arr[] = {"����ᳪ��","�빫���Դϴ�","��������ϴ�","�ڹ�������","���л�"};
		
		for(int i = 0; i< arr.length; i++) {

			if(bookName.equals(arr[i])) {
				return bookName;
			}
		}
		String no = "x";
		return no;
	}
}
