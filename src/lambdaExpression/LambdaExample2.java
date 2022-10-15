package lambdaExpression;


import java.util.function.ToIntFunction;

// ���ٽ� Ȯ�� ����2
public class LambdaExample2 {
    private static LambdaExample2St[] stdents = {
            new LambdaExample2St("�輼��", 90, 96),
            new LambdaExample2St("�̿���", 95, 93)
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
        System.out.println("���� ��� ���� : " + es);

        double ms = avg( m-> m.getMs());
        System.out.println("���� ��� ���� : " + ms);
    }

}
