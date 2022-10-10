package homework;

public class UtilExample {
    public static void main(String[] args) {
        Pair2<String,Integer> pair = new Pair2<>("È«±æµ¿", 30);

        Integer age1 = Util2.getValue1(pair,"È«±æµ¿");
        Integer age2 = Util2.getValue2(pair,"ÀÌ¿¬Àç");

        System.out.println("age1 : " + age1);
        System.out.println("age1 : " + age2);

        ChildPair<String, Integer> childPair = new ChildPair<>("ÀÌ¿¬Àç", 24);
        Integer age3 = Util2.getValue1(childPair,"À§¼ºÈÆ");

        System.out.println("age3 : " + age3);

    }
}
