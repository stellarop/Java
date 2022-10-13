package lambdaExpression;

import java.util.function.BinaryOperator;

// BinaryOperator<T> 함수적 인터페이스는 minBy(), maxBy() 정적 메서드를 제공
// 두 메서드는 파라미터값으로 제공되는 Comparator 를 이용해서 최대 T와 최소 T를 얻는
// BinaryOperator<T> 를 리턴한다.

// BinaryOperator<T> 함수적 인터페이스
public class OperatorMinByMaxByExample {
    public static void main(String[] args) {

        // BinaryOperator 변수 선언(타입 과일 클래스)
        BinaryOperator<Fruit> binaryOperator;

        // 과일 클래스 변수 선언
        Fruit fruit;

        // BinaryOperator 변수에 min 정적 메서드 사용
        binaryOperator = BinaryOperator.minBy(
                // 두 개의 가격 파라미터를 넘긴다.
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );
        // 과일 클래스에 해당 값 저장
        fruit = binaryOperator.apply(new Fruit("딸기", 6000),
                new Fruit("포도", 9000));

        // 두 과일 가격 비교 후 가격이 min 인 과일 출력
        System.out.println(fruit.getName());

        // BinaryOperator 변수에 max 정적 메서드 사용
        binaryOperator = BinaryOperator.maxBy(
                // 두 개의 가격 파라미터를 넘긴다.
                (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
        );

        // 과일 클래스에 해당 값 저장
        fruit = binaryOperator.apply(new Fruit("수박", 15000),
                new Fruit("복숭아", 7000));

        // 두 과일 가격 비교 후 가격이 max 인 과일 출력
        System.out.println(fruit.getName());


    }
}
