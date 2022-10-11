package lambdaExpression;

// Operator �Լ��� �������̽��� Function �Լ��� �����ϰ� �Ķ���Ϳ�
// ���� ���� �ִ� applyOOO()  �޼��带 ������ �ִ�.
// �� �޼������ �Ķ���Ͱ��� ���ϰ����� ����(Ÿ�� ��ȯ)�ϴ� ��Ȱ���ٴ�
// �Ķ���Ͱ��� �̿��ؼ� ������ ������ �� ������ Ÿ������ ���ϰ��� �����ϴ� ��Ȱ�� �Ѵ�.

import java.util.function.IntBinaryOperator;

// Operator �Լ��� �������̽�
public class Operator {
    // �迭�� ���� ����
    private static int[] scores = {92, 95, 87};

    // applyAsInt() �޼���� �Ķ���� ������ �� ���� int�� ������.
    // �׷��� ���ٽĵ� �� ���� int �Ķ���� a�� b�� ����Ѵ�.
    public static int maxOrMin(IntBinaryOperator operator) {
        // �迭 �ʱ�ȭ
        int result = scores[0];
        // �迭 ���̸�ŭ ����
        for (int score : scores) {
            // ���ٽ� ����
            // result �迭�� ���� �ֱٿ� ��� ��
            // score �� �迭�� ��
            // ���������� result �������� ���� �ֱٿ� ��� ���� ���Ӱ� ��� �� �� ���� ����ȴ�.
            result = operator.applyAsInt(result, score);
        }
        // �ֱٿ� ���� score �迭 ���� ����
        return result;
    }

    public static void main(String[] args) {

        int max = maxOrMin(

                (a, b) -> {
                    // ���� ���� �Ķ���� �� �� ��
                    if(a >= b){
                        // a�� �� ũ�ٸ� a ����
                        return a;
                    }else{
                        return b;
                    }
                 }
        );

        System.out.println("�ִ밪 : " + max);

        int min = maxOrMin(
                (a, b) -> {
                    // �� �� b�� ���� �� ũ�ٸ�
                   if(a <= b){
                       return a;
                   }else{
                       return b;
                   }
                }
        );

        System.out.println("�ּҰ� : " + min);
    }

}


