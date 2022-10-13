package lambdaExpression;

import java.util.function.BinaryOperator;

// BinaryOperator<T> �Լ��� �������̽��� minBy(), maxBy() ���� �޼��带 ����
// �� �޼���� �Ķ���Ͱ����� �����Ǵ� Comparator �� �̿��ؼ� �ִ� T�� �ּ� T�� ���
// BinaryOperator<T> �� �����Ѵ�.

// BinaryOperator<T> �Լ��� �������̽�
public class OperatorMinByMaxByExample {
    public static void main(String[] args) {

        // BinaryOperator ���� ����(Ÿ�� ���� Ŭ����)
        BinaryOperator<Fruit> binaryOperator;

        // ���� Ŭ���� ���� ����
        Fruit fruit;

        // BinaryOperator ������ min ���� �޼��� ���
        binaryOperator = BinaryOperator.minBy(
                // �� ���� ���� �Ķ���͸� �ѱ��.
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );
        // ���� Ŭ������ �ش� �� ����
        fruit = binaryOperator.apply(new Fruit("����", 6000),
                new Fruit("����", 9000));

        // �� ���� ���� �� �� ������ min �� ���� ���
        System.out.println(fruit.getName());

        // BinaryOperator ������ max ���� �޼��� ���
        binaryOperator = BinaryOperator.maxBy(
                // �� ���� ���� �Ķ���͸� �ѱ��.
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );

        // ���� Ŭ������ �ش� �� ����
        fruit = binaryOperator.apply(new Fruit("����", 15000),
                new Fruit("������", 7000));

        // �� ���� ���� �� �� ������ max �� ���� ���
        System.out.println(fruit.getName());


    }
}
