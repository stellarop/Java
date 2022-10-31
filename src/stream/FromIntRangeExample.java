package stream;

import java.util.stream.IntStream;

// ���� ������ �ҽ��� �ϴ� ��Ʈ��
public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        // rangeClosed() �޼���� ù ��° �Ű������� �� ��° �Ű������� ���������� �����ϴ�
        // IntStream �� �����Ѵ�.
        IntStream stream = IntStream.rangeClosed(1, 100);
        // 1���� 100���� ���� ���Ҷ����� �ݺ�
        stream.forEach(a-> sum+=a);

        System.out.println("1 ~ 100 ���� �� : " + sum);
    }
}
