package lambdaExpression;


// Predicate 함수적 인터페이스는 파라미터와 boolean 리턴 값이 있는 testOOO 메서드를 가진다.
// 이 메서드는 파라미터 값을 조회 후 true, false 을 리턴한다.

import java.util.Arrays;
import java.util.List;

// Predicate 함수적 인터페이스
public class Predicate {
    // list 함수
    private static List<Student2> list = Arrays.asList(
            // Student2 class에 해당 값 저장
            new Student2("이연재", "남자", 24),
            new Student2("김세연", "여자", 21),
            new Student2("백소진", "여자", 28),
            new Student2("백성현", "남자", 25)
    );

    // 평균 메서드
    public static double avg(java.util.function.Predicate<Student2> predicate){
        // list 돈 횟수
        int count = 0;
        // 합계
        int sum = 0;

        // student2 list 만큼 돈다
        for(Student2 student2 : list){
            // list true 에 값일 시
            if(predicate.test(student2)){
                // 카운트 증가
                count++;
                // true 인 나이 더해준다
                sum += student2.getAge();
            }
        }
        // 합계 / list 돈 횟수
        return (double) sum / count;
    }

    public static void main(String[] args) {
        // test() 메서드는 파라미터 값으로 객체 하나를 가져서 람다식도 한 개의 파라미터 사용
        // test() 메서드의 리턴 타입이 boolean, 람다식의 리턴 값은 boolean 이 적용
        // 타입이 Student2 이므로 파라미터 타입은 Student2 가 된다.
        // t.getSex() 메서드는 Student2 객체의 getSex() 메서드를 호출해서 남자 / 여자를 얻는다
        // equals 를 이용하여 해당 성별만 true 로 리턴한다.
        double ageMan = avg( t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 나이 : " + ageMan);

        double ageWoman = avg(t-> t.getSex().equals("여자"));
        System.out.println("여자 평균 나이 : " + ageWoman);

    }


}
