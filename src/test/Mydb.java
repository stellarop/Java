package test;

public class Mydb implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Mysql db���� ��ȸ�� �մϴ�.");
	}

	@Override
	public void update() {
		System.out.println("Mysql db���� ������ �մϴ�.");
	}

	@Override
	public void insert() {
		System.out.println("Mysql db���� ���� �մϴ�.");
	}

	@Override
	public void delete() {
		System.out.println("Mysql db���� ������ �մϴ�.");
	}

}
