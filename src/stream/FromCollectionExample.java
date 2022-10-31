package stream;

// 자바8에서 추가된 스트림 패키지에는 스트림 api 가 추가됨
// BaseStream 인터페이스에서는 모든 스트림에서 사용할 수 있는 공통 메서드들이 정의되어 있을뿐
// 코드에서 직접적으로 사용되진 않는다.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 컬렉션으로부터 스트림 얻기
public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("김세연", 10),
            new Student("이연재", 20),
            new Student("백성현", 30)
        );

        // studentList 객체 스트림으로 호출
        Stream<Student> stream = studentList.stream();

        // stream 에 저장된 객체 개수만큼 반복한다.
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
