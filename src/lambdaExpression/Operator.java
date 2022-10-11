package lambdaExpression;

// Operator 함수적 인터페이스는 Function 함수와 동일하게 파라미터와
// 리턴 값이 있는 applyOOO()  메서드를 가지고 있다.
// 이 메서드들은 파라미터값을 리턴값으로 매핑(타입 변환)하는 역활보다는
// 파라미터값을 이용해서 연산을 수행한 후 동일한 타입으로 리턴값을 제공하는 역활을 한다.

import java.util.function.IntBinaryOperator;

// Operator 함수적 인터페이스
public class Operator {
    // 배열에 정수 저장
    private static int[] scores = {92, 95, 87};

    // applyAsInt() 메서드는 파라미터 값으로 두 개의 int를 가진다.
    // 그래서 람다식도 두 개의 int 파라미터 a와 b를 사용한다.
    public static int maxOrMin(IntBinaryOperator operator) {
        // 배열 초기화
        int result = scores[0];
        // 배열 길이만큼 돈다
        for (int score : scores) {
            // 람다식 실행
            // result 배열은 가장 최근에 담긴 값
            // score 는 배열에 값
            // 최종적으로 result 변수에는 가장 최근에 담긴 값과 새롭게 담긴 값 두 값이 저장된다.
            result = operator.applyAsInt(result, score);
        }
        // 최근에 담은 score 배열 값을 리턴
        return result;
    }

    public static void main(String[] args) {

        int max = maxOrMin(

                (a, b) -> {
                    // 리턴 받은 파라미터 두 값 비교
                    if(a >= b){
                        // a가 더 크다면 a 리턴
                        return a;
                    }else{
                        return b;
                    }
                 }
        );

        System.out.println("최대값 : " + max);

        int min = maxOrMin(
                (a, b) -> {
                    // 비교 후 b의 값이 더 크다면
                   if(a <= b){
                       return a;
                   }else{
                       return b;
                   }
                }
        );

        System.out.println("최소값 : " + min);
    }

}


