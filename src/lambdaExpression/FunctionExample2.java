package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

// Function 함수적 인터페이스
public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            // 생성자 파라미터에 값 추가
            new Student("이연재", 90, 96),
            new Student("김세연", 88, 93)
    );

    // ToIntFunction 제네릭 타입 Student class 지정
    // Student class 에는 저장된 이름, 영어점수, 수학점수가 저장되있음.
    // 평균 값 메서드
    public static double avg(ToIntFunction<Student> function){
      int sum = 0;

      // student List 길이만큼 반복
      for(Student student : list){
          // student 객체에 저장된 int 타입을 모두 더한다.
        sum += function.applyAsInt(student);
      }
      // 점수 합계를 list 에 있는 값만큼 나눠서 값을 냄.
      // 점수 합계 / 2
      double avg = (double) sum / list.size();
      return avg;
    }

    public static void main(String[] args) {
        // student 에 저장된 영어 점수를 avg() 파라미터에 삽입 후 리턴 값 받음
        double englishAvg = avg( s-> s.getEnglishScore());
        System.out.println("영어 평균 점수 : " + englishAvg);

        // student 에 저장된 수학 점수를 avg() 파라미터에 삽입 후 리턴 값 받음
        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수 : " + mathAvg);
    }

}
