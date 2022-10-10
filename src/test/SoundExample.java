package test;

public class SoundExample {
	private static void printSound(Sound sound) {
		System.out.println(sound.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
