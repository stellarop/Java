package test;

class an{
	String old;
	String name;
	
	an(String old, String name){
		this.old = old;
		this.name = name;
	}
	
	void hwo() {
		System.out.println("�����Ҹ�");
	}
	
	void a() {
		System.out.println("test");
	}
	
}

class d extends an{

	d(String old, String name) {
		super(old, name);
		// TODO Auto-generated constructor stub
	}
	
	void hwo() {
		System.out.println("�۸�");
		System.out.println(old + name);
	}
}

class c extends an{

	
	
	c(String old, String name) {
		super(old, name);
		// TODO Auto-generated constructor stub
	}

	void hwo() {
		System.out.println("�߿�");
		System.out.println(this.old + this.name);
	}
}
public class Yea {
	public static void main(String[] args) {
		d dog = new d("22", "������");
		c cat = new c("10", "����");
		
		dog.hwo();
		cat.hwo();
	}
}
