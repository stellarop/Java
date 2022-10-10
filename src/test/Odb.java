package test;

public class Odb implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle db에서 조회를 합니다.");
	}

	@Override
	public void update() {
		System.out.println("Oracle db에서 수정을 합니다.");
	}

	@Override
	public void insert() {
		System.out.println("Oracle db에서 삽입 합니다.");
	}

	@Override
	public void delete() {
		System.out.println("Oracle db에서 삭제를 합니다.");
	}

}
