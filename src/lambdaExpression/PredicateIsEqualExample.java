package lambdaExpression;

// Predicate<T> �Լ��� �������̽��� and(), or(), negate() ����Ʈ �޼��� �� isEqual() �޼��带 ����
// isEqual() �޼���� test() �Ķ���Ͱ��� sourceObject �� isEqual() �� �Ķ���� ����
// targetObject �� Object Ŭ������ equals()�� �Ķ���Ͱ����� ����,
// equals(sourceObject, targetObject �� ���� ���� ��� ���ο� Predicate<T>�� ����

import java.util.function.Predicate;

// IsEqual() ���� �޼���
public class PredicateIsEqualExample {
    public static void main(String[] args) {

        // ���ٽ� ���� ����
        Predicate<String> predicate;

        // ���� �� ����
        predicate = Predicate.isEqual(null);
        // null �� null �� ���ڿ��� ���ٸ� true;
        System.out.println("null, null : " + predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        // null �� Java8 �� ���ڿ��� Ʋ���� false
        System.out.println("null, Java8 : " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("Java8, null : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8 : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java7, Java8 : " + predicate.test("Java7"));


    }
}
