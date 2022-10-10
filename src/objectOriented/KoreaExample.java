package objectOriented;

public class KoreaExample {
	public static void main(String[] args) {
		Korea k1 = new Korea("노도", "01033152455");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korea k2 = new Korea("대천", "01041127775");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
} 
