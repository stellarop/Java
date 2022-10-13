package lambdaExpression;

// Predicate ������ �Լ��� �������̽��� and(), or(), negate() ����Ʈ �޼��带 ����
// �� 3 ���� �޼���� && || ! �� ����
// and() �޼���� �� Predicate �� ��� true �� �����ϸ� ���������� true �� ����
// or() �޼���� �� Predicate �� �ϳ��� true �� �����ϸ� ���������� true �� ����
// negate() ���� Predicate ����� true �̸� false, false �̸� true �� �����ϴ� ���ο�
// Predicate �� �����Ѵ�.

import java.util.function.IntPredicate;

// Predicate ���� �� ����
public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        // A�� ���� ���ٽ�
        IntPredicate predicateA = a -> a%2 == 0;
        // B�� ���� ���ٽ�
        IntPredicate predicateB = (a) -> a%3 == 0;

        // AB ����
        IntPredicate predicateAB;
        // ���ϵ� �� ���� ����
        boolean result;

        // A, B�� ���ٽ��� �� �� �� �� ��� true �� �� true ����
        predicateAB = predicateA.and(predicateB);
        // A,B ���ٽĿ� ���� ���� �� �� �� ���� ����
        result = predicateAB.test(9);
        // ���(A = false B = true == false)
        System.out.println("9�� 2�� 3�� ������� ? " + result);

        // A, B�� ���ٽ��� �� �� �� �� �� �ϳ��� true �� �� true ����
        predicateAB = predicateA.or(predicateB);
        // A,B ���ٽĿ� ���� ���� �� �� �� ���� ����
        result = predicateAB.test(9);
        // ���(A = false B = true == true)
        System.out.println("9�� 2�� 3�� ������� ? " + result);

        // ���� ���� ���� false �� �� true ��ȯ
        predicateAB = predicateA.negate();
        // A ���ٽĿ� �� ���� �� �� �� ����
        result = predicateAB.test(9);
        // ���(A = false == true)
        System.out.println("9�� Ȧ������ ? " + result);



    }
}
