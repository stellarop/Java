package stream;

//스트림은 컬렉션의 요소에 대해 중간 처리와 최종 처리를 수행할 수 있는데
// 중간 처리에서는 매핑, 필터링, 정렬을 수행하고 최종처리에선 반복, 카운팅, 평균, 총합 등 집계를 처리한다.

// 학생 객체를 요소로 가지는 컬렉션이 있다면
// 중간 처리에서는 학생의 점수를 뽑아내고 최종 처리에선 점수의 평균값을 산출한다.

import java.util.Arrays;
import java.util.List;

// 스트림의 중간처리와 최종 처리
public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("김세연", 80),
                new Student("백성현", 87),
                new Student("이연재", 74)
        );

        // studentList 에 스트림을 더블 타입으로 지정.
        double avg = studentList.stream()
                // 중간처리(학생 객체를 점수로 매핑)
                .mapToInt(Student :: getScore)
                // 최종 처리(평균 점수)
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
    }
}
