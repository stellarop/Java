package homework;

public class UtilExample {
    public static void main(String[] args) {
        Pair2<String,Integer> pair = new Pair2<>("ȫ�浿", 30);

        Integer age1 = Util2.getValue1(pair,"ȫ�浿");
        Integer age2 = Util2.getValue2(pair,"�̿���");

        System.out.println("age1 : " + age1);
        System.out.println("age1 : " + age2);

        ChildPair<String, Integer> childPair = new ChildPair<>("�̿���", 24);
        Integer age3 = Util2.getValue1(childPair,"������");

        System.out.println("age3 : " + age3);

    }
}
