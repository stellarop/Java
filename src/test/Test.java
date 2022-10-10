package test;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void mod(int x) {
		System.out.println(x);

		if (x == 1) {
			System.out.println("Á¾·á");
		} else if (x % 2 == 0) {
			// Â¦¼ö
			mod(x / 2);
		} else {
			// È¦¼ö
			mod((3 * x) + 1);
		}
	}

	public static void main(String[] args) {
		Random ran = new Random();
		int target = ran.nextInt(100);
		mod(target);

	}
}
