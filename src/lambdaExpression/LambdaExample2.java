package lambdaExpression;


import java.util.function.ToIntFunction;

// 람다식 확인 문제2
public class LambdaExample2 {
    private static LambdaExample2St[] stdents = {
            new LambdaExample2St("김세연", 90, 96),
            new LambdaExample2St("이연재", 95, 93)
    };

    public static double avg(ToIntFunction<LambdaExample2St> function){
        int count = 0;
        int sum = 0;

        for(LambdaExample2St lambdaExample2St : stdents){
            count++;
           sum += function.applyAsInt(lambdaExample2St);
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        double es = avg( e ->e.getEs());
        System.out.println("영어 평균 점수 : " + es);

        double ms = avg( m-> m.getMs());
        System.out.println("수학 평균 점수 : " + ms);
    }

}
