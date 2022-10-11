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
        int count = 0;
        int sum = 0;

        for(Student2 student2 : list){
            System.out.println(student2.getName());
            if(predicate.test(student2)){
                count++;
                sum += student2.getAge();
            }
        }
        return (double) sum / count;
    }

    public static String name(java.util.function.Predicate<Student2> predicate){
        String a = null;
        String b = null;
        for(Student2 student2 : list){

              if("백".equals(a)){
                  return a;
              }else{
                  return a;
              }

        }
        return null;
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

        String name1 = name(t ->t.getAge() == 25);
        System.out.println("24살인 사람 : " + name1);

        String name2 = name(t-> t.getAge() == 25);
        System.out.println("25살인 사람 : " + name2);

    }


}
