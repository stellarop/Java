package lambdaExpression;

import java.util.function.IntBinaryOperator;

// 람다식 확인 문제 1
public class LambdaExample1 {
    private static int[] scores = { 10, 50, 70 };

    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];

        for(int score : scores){

            result = operator.applyAsInt(result, score);

        }
        return result;
    }

    public static void main(String[] args) {

        int max = maxOrMin(
                (a,b)->{
                    if(a >= b){
                        return a;
                    }
                    return b;
                }
        );

        System.out.println("최대값 : " + max);

        int min = maxOrMin(
                (a,b)->{
                    if(a <= b){
                        return a;
                    }
                    return a;
                }
        );
        System.out.println("최소값 : " + min);
    }
}
