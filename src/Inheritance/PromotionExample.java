package Inheritance;



// �������� ���� Ÿ�������� ���� ����� �پ��� ��ü�� �̿� �� �� �ִ� ����
// �������� �ϳ��� Ÿ�Կ� ���� ��ü�� ���������ν� �پ��� ����� �̿��� �� �ֵ��� ����
// �θ� Ŭ������ Ÿ�� ��ȯ ��� => �θ� Ÿ�Կ� ��� �ڽ� ��ü�� ���� ����

// �ڵ� Ÿ�� ��ȯ
// �ڵ� Ÿ�� ��ȯ�� ���α׷� ���� ���� �ڵ������� Ÿ�� ��ȯ�� �Ͼ�� ��

// ex) �θ� Ŭ����   ����   �ڽ�Ŭ����Ÿ��;

// �θ� Ŭ����
class A{
	
}

class C extends A{

}
class B extends A{

}
class D extends B{

}
class E extends C{

}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// A �θ� Ŭ������ ����ȯ ��ų �� �ִ°��� A �θ� Ŭ������ b,c,d,e Ŭ������ AŬ������ ��� �ް� �ֱ� ����
		// ��� ���谡 �ƴϸ� ����ȯ�� �Ұ��� �ϴ�
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		
	}
}
