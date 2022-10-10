package test;

class an{
	String old;
	String name;
	
	an(String old, String name){
		this.old = old;
		this.name = name;
	}
	
	void hwo() {
		System.out.println("匡澜家府");
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
		System.out.println("港港");
		System.out.println(old + name);
	}
}

class c extends an{

	
	
	c(String old, String name) {
		super(old, name);
		// TODO Auto-generated constructor stub
	}

	void hwo() {
		System.out.println("具克");
		System.out.println(this.old + this.name);
	}
}
public class Yea {
	public static void main(String[] args) {
		d dog = new d("22", "啊阑捞");
		c cat = new c("10", "俊福");
		
		dog.hwo();
		cat.hwo();
	}
}
