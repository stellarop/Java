package Inheritance;

// �ڽ� Ŭ����
public class Student extends People{
	// �ʵ� 
	public int student_seq;
	
	// ������
	// People Ŭ�������� �⺻ �����ڰ� ���� �ΰ��� �Ķ���͸� �޾� ��ü�� �����ϴ� �����ڸ� �ִ�
	// => People�� ����ϴ� Student Ŭ������ �����ڿ��� super(name, ssn)�� People Ŭ������
	// �����ڸ� ȣ���ؾ� ��
	public Student(String name, String ssn, int student_seq) {
		// People() �θ������ ȣ��
		super(name, ssn);
		this.student_seq = student_seq;
	}
}
