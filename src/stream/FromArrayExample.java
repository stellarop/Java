package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// �迭�κ��� ��Ʈ�� ���
public class FromArrayExample {
    public static void main(String[] args) {
        // �迭 ����
        String[] strArr = {"�輼��","�̿���","�鼺��"};
        // Arrays.stream() �� �迭 �߰�
        Stream<String> strStream = Arrays.stream(strArr);
        // �迭�� ���̸�ŭ �ݺ� ���
        strStream.forEach(a-> System.out.print(a + ","));
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a-> System.out.print(a + ","));
    }
}
