package lambdaExpression;

// Predicate<T> 함수적 인터페이스는 and(), or(), negate() 디폴트 메서드 외 isEqual() 메서드를 제공
// isEqual() 메서드는 test() 파라미터값인 sourceObject 와 isEqual() 의 파라미터 값인
// targetObject 를 Object 클래스의 equals()의 파라미터값으로 제공,
// equals(sourceObject, targetObject 의 리턴 값을 얻어 새로운 Predicate<T>를 생성

import java.util.function.Predicate;

// IsEqual() 정적 메서드
public class PredicateIsEqualExample {
    public static void main(String[] args) {

        // 람다식 변수 선언
        Predicate<String> predicate;

        // 비교할 값 저장
        predicate = Predicate.isEqual(null);
        // null 과 null 의 문자열이 같다면 true;
        System.out.println("null, null : " + predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        // null 과 Java8 의 문자열이 틀리면 false
        System.out.println("null, Java8 : " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("Java8, null : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8 : " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java7, Java8 : " + predicate.test("Java7"));


    }
}
