package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 스트림의 특징
// Stream 은 Iterator 와 비슷한 역활을 하는 반복자지만 람다식으로 요소 처리 코드를
// 제공하는 점과 내부 반복자를 사용하므로 병렬 처리가 쉽다는 점, 중간 처리와 최종 처리 작업을 수행
// 하는 점에서 많은 차이를 가지고 있다.

// 람다식으로 요소 처리 코드를 제공
// Stream 이 제공하는 대부분의 요소 처리 메서드는 함수적 인터페이스 매개 타입을 가지기 때문에
// 람다식, 메서드 참조를 이용해서 요소 처리 내용을 매개값으로 전달할 수 있다.

// 요소 처리를 위한 람다식
public class LambdaExpressionExample {
    public static void main(String[] args) {
        // 객체 저장
        List<Student> list = Arrays.asList(
                // Student 생성자에 해당 값 저장
                new Student("김세연", 21),
                new Student("이연재", 24)
        );

        // 스트림을 얻는다.
        Stream<Student> stream = list.stream();
        // list 컬렉션에서 Student 을 가져와 람다식의 매개값으로 제공한다.
        stream.forEach( s-> {
            // Student s에 담긴 객체를 꺼내서 출력.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
