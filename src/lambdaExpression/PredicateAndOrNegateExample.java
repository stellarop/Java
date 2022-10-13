package lambdaExpression;

// Predicate 종류의 함수적 인터페이스는 and(), or(), negate() 디폴트 메서드를 가짐
// 이 3 개의 메서드는 && || ! 과 같다
// and() 메서드는 두 Predicate 가 모두 true 를 리턴하면 최종적으로 true 를 리턴
// or() 메서드는 두 Predicate 중 하나만 true 를 리턴하면 최종적으로 true 를 리턴
// negate() 원래 Predicate 결과가 true 이면 false, false 이면 true 를 리턴하는 새로운
// Predicate 를 생성한다.

import java.util.function.IntPredicate;

// Predicate 간의 논리 연산
public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        // A를 담을 람다식
        IntPredicate predicateA = a -> a%2 == 0;
        // B를 담을 람다식
        IntPredicate predicateB = (a) -> a%3 == 0;

        // AB 선언
        IntPredicate predicateAB;
        // 리턴될 불 변수 선언
        boolean result;

        // A, B의 람다식을 비교 후 두 값 모두 true 일 시 true 리턴
        predicateAB = predicateA.and(predicateB);
        // A,B 람다식에 정수 저장 후 불 값 리턴 받음
        result = predicateAB.test(9);
        // 출력(A = false B = true == false)
        System.out.println("9는 2와 3의 배수인지 ? " + result);

        // A, B의 람다식을 비교 후 두 값 중 하나라도 true 일 시 true 리턴
        predicateAB = predicateA.or(predicateB);
        // A,B 람다식에 정수 저장 후 불 값 리턴 받음
        result = predicateAB.test(9);
        // 출력(A = false B = true == true)
        System.out.println("9는 2와 3의 배수인지 ? " + result);

        // 리턴 받은 값이 false 일 시 true 반환
        predicateAB = predicateA.negate();
        // A 람다식에 값 저장 후 불 값 리턴
        result = predicateAB.test(9);
        // 출력(A = false == true)
        System.out.println("9는 홀수인지 ? " + result);



    }
}
