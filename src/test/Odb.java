package test;

public class Odb implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle db���� ��ȸ�� �մϴ�.");
	}

	@Override
	public void update() {
		System.out.println("Oracle db���� ������ �մϴ�.");
	}

	@Override
	public void insert() {
		System.out.println("Oracle db���� ���� �մϴ�.");
	}

	@Override
	public void delete() {
		System.out.println("Oracle db���� ������ �մϴ�.");
	}

}
