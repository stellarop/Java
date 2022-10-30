package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// ����ó���� �� ���� �۾��� ���� �۾����� ������ ���� �۾����� �и��� �����忡��
// ���������� ó���ϴ� ��
// ���� ó�� ��Ʈ���� �̿��ϸ� ��Ÿ�� �� �ϳ��� �۾��� ���� �۾����� �ڵ����� ������
// ���� �۾��� ����� �ڵ����� �����ؼ� ���� �������  �����Ѵ�.

// �÷����� ��� �� �հ踦 ���Ҷ� ���� ó�� ��Ʈ���� �ϳ��� �����尡 ��ҵ��� ���������� �о�
// ���� �������� ���� ó�� ��Ʈ���� ���� ���� �����尡 ��ҵ��� �κ������� ���ϰ�
// �� �κ� ���� ���� �����ؼ� ��ü ���� �����Ѵ�.

// ����ó�� => �÷��� ��ҵ��� �ϳ��� �����ͼ� ���Ѵ�.
// ����ó�� => �÷��� ��ҵ��� ���� ���ؼ� �����´�.

// ����ó��, ����ó��
public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "�輼��", "�̿���", "�鼺��","������","������"
        );

        // ����ó��
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample :: print);

        System.out.println();

        // ����ó��
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
