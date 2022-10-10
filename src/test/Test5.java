package test;

public class Test5 {
    public static void main(String[] args) {
        boolean test1 = true;
        boolean test2 = false;

        boolean test3 = test1 && test2;
        boolean test4 = test1 && test1;

        System.out.println("true && false : " + test3);
        System.out.println("true && true : " + test4);
    }
}
