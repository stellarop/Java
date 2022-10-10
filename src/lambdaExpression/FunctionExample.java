package lambdaExpression;

// Function 함수적 인터페이스의 특징은 파라미터값과 리턴값이 있는 applyOOO 메서드를 가지고 있다.
// 이 메서드들은 파라미터값으로 매핑(타입 변환) 하는 역활을 한다.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

// Function 함수적 인터페이스
public class FunctionExample {
    private static List<Student> list = Arrays.asList(
        // 생성자 파라미터에 값 추가
        new Student("이연재", 90, 96),
        new Student("김세연", 88, 93)
    );

    // Function <T,R>  인터페이스를 타켓 타입으로 하는 람다식은 다음과 같이 작성한다.
    // apply() 메서드는 파라미터 값으로 T 객체를 하나 가지므로 람다식도 한 개의 파라미터를 사용한다.
    // apply() 메서드의 리턴 타입이 String 타입 t 파라미터 타입은 Student 클래스 이니
    // 람다식 중괄호의 리턴 값은 R 객체가 됨(String)
    // t.getName()은 Student 객체의 getName() 메서드를 호출해서 학생 이름을 얻는다
    // 람다식 타입 선언
    public static void printString(Function<Student, String> function) {
        // list에 저장된 항목 수만큼 돈다
        for(Student student : list){
            // [람다식 실행] String 타입(이름) 실행
            // 파라미터로 받은 이름 출력 apply()은 String
            System.out.println(function.apply(student) + "");
        }
        System.out.println();
    };

    // applyAsInt() 메서드는 파라미터값으로 T 객체를 하나 가지므로 람다식도 한 개의 파라미터 값을 갖는다.
    // applyAsInt() 메서드의 리턴 타입은 int 람다식 중괄호의 리턴값은 int가 됨.
    // T가 Student 타입이므로 t 파라미터 타입은 Student가 됨.
    // t.getScore() 메서드는 Student 객체에 getScore() 메서드를 호출해서 얻는다.
    public static void printInt(ToIntFunction<Student> function){
        // list에 저장된 항목 수만큼 돈다
        for(Student student : list){
            // [람다식 실행] int 타입(점수) 실행
            // 파라미터로 받은 점수 출력 applyAsInt()은 int
            System.out.println(function.applyAsInt(student) + "");
        }
        System.out.println();
    };

    public static void main(String[] args) {
        // return 만 있을 경우 중괄호{}, return 생략 가능
        System.out.println("학생 이름");
        // student 객체에 저장된 이름(String)값 해당 메서드 파라미터로 삽입
        printString( t -> t.getName());

        // student 객체에 저장된 점수(int)값 해당 메서드 파라미터로 삽입
        System.out.println("영어 점수");
        printInt( t -> t.getEnglishScore());

        System.out.println("수학 점수");
        printInt( t -> t.getMathScore());
    }
}
